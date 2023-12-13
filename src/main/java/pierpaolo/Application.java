package pierpaolo;

import pierpaolo.dao.EventoDAO;
import pierpaolo.dao.LocationDAO;
import pierpaolo.entities.Evento;
import pierpaolo.entities.EventoType;
import pierpaolo.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d2jpa");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);
        LocationDAO ld = new LocationDAO(em);

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

        //---------------------------------------------------------------------    1 to 1
//        Evento vm = new Evento("Svelti",LocalDate.of(2023,2,3),"Esaltiamoci",EventoType.PRIVATO,200);
//        ed.save(vm);
    Location villaMaiella = new Location("Lions", "Guardiagrele");
    ld.save(villaMaiella);






        // ---------------A fine programma è sempre bene ricordarsi di chiudere entitymanager e entitymanagerfactory
        em.close();
        emf.close();
    }

}
