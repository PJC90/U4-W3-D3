package pierpaolo;

import pierpaolo.dao.EventoDAO;
import pierpaolo.entities.Evento;
import pierpaolo.entities.EventoType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d2jpa");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);

        Evento battesimo = new Evento("Pippo", LocalDate.of(2023, 5,25),"Battesimo", EventoType.PUBBLICO,200);
        Evento cresima = new Evento("Aldo",LocalDate.of(2023,12,31),"Ci credo", EventoType.PRIVATO,3);
//--------------------------------------------------------------------------------------------------------------------SAVE
//        ed.save(battesimo);
//        ed.save(cresima);
// ----------------------------------------------------------------------------------------------FIND BY ID
        long id = 3;
        Evento battesimoFindById = ed.findById(id);
        if(battesimoFindById != null){
            System.out.println(battesimoFindById);
        } else {
            System.out.println("Evento di ID " + id + " non trovato");
        }
// ---------------------------------------------------------------------------------DELETE
        ed.findByIdAndDelete(14);

        // ---------------A fine programma è sempre bene ricordarsi di chiudere entitymanager e entitymanagerfactory
        em.close();
        emf.close();
    }
}
