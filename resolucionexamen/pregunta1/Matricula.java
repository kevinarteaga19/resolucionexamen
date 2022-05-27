package pregunta1;

public class Matricula {

    private String nombre;

    private Semestre[] semestre;

    private int contador;

    public Matricula(String nombre) {
        this.nombre = nombre;

        this.contador = 0;

        this.semestre = new Semestre[1];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre[this.contador] = semestre;

        this.contador ++;
    }

    public Semestre[] getSemestre() {
        return semestre;
    }
}
