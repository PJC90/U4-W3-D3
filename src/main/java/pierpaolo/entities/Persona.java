package pierpaolo.entities;

import java.time.LocalDate;

public class Persona {
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate data_di_nascita;
    private Sessotype tipoSesso;
    private Partecipazione partecipazione;

    public Persona() {

    }
    public Persona(String nome, String cognome, String email, LocalDate data_di_nascita, Sessotype tipoSesso, Partecipazione partecipazione) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.data_di_nascita = data_di_nascita;
        this.tipoSesso = tipoSesso;
        this.partecipazione = partecipazione;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData_di_nascita() {
        return data_di_nascita;
    }

    public void setData_di_nascita(LocalDate data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }

    public Sessotype getTipoSesso() {
        return tipoSesso;
    }

    public void setTipoSesso(Sessotype tipoSesso) {
        this.tipoSesso = tipoSesso;
    }

    public Partecipazione getPartecipazione() {
        return partecipazione;
    }

    public void setPartecipazione(Partecipazione partecipazione) {
        this.partecipazione = partecipazione;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", data_di_nascita=" + data_di_nascita +
                ", tipoSesso=" + tipoSesso +
                ", partecipazione=" + partecipazione +
                '}';
    }
}
