package pregunta1;

public class Curso {

    private String nombre;

    private Docente[] docente;

    private int contador;

    public Curso(String nombre) {
        this.nombre = nombre;

        this.contador = 0;

        this.docente = new Docente[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocente(Docente docente) {
        this.docente[this.contador] = docente;

        this.contador ++;
    }

    public Docente[] getDocente() {
        return docente;
    }
}
