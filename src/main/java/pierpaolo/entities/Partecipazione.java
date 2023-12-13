package pierpaolo.entities;

public class Partecipazione {
    private long id;
    private Persona persona;
    private Evento evento;
    private StatoType tipoStato;

    public Partecipazione() {
    }
    public Partecipazione(Persona persona, Evento evento, StatoType tipoStato) {
        this.persona = persona;
        this.evento = evento;
        this.tipoStato = tipoStato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public StatoType getTipoStato() {
        return tipoStato;
    }

    public void setTipoStato(StatoType tipoStato) {
        this.tipoStato = tipoStato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", tipoStato=" + tipoStato +
                '}';
    }
}
