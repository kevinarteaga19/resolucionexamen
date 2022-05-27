package pregunta1;

public class Semestre {

    private String nombre;

    private Curso[] curso;

    private int contador;

    public Semestre(String nombre) {

        this.nombre = nombre;

        this.contador = 0;

        this.curso = new Curso[1];
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setCurso(Curso curso) {
        this.curso[this.contador] = curso;

        this.contador ++;
    }

    public Curso[] getCurso() {
        return curso;
    }
}
