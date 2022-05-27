package pregunta1;

import javax.print.Doc;

public class Main {

    public static void main(String[] args) {

        Docente docente1 = new Docente("Freddy Vigilio Arratea");
        Docente docente2 = new Docente("Juan Huapaya Garcia");
        Docente docente3 = new Docente("Walter Baldeon  Canchaya");

        Curso curso1 = new Curso("Programacion Orientada a Objetos");
        curso1.setDocente(docente1);
        curso1.setDocente(docente2);
        curso1.setDocente(docente3);

        Semestre semestre = new Semestre("2022-1");
        System.out.println("Semestre: "+semestre.getNombre());

        semestre.setCurso(curso1);

        Matricula matricula = new Matricula("10001");
        System.out.println("Matricula: "+matricula.getNombre());

        matricula.setSemestre(semestre);

        Estudiante estudiante = new Estudiante("Kevin Arteaga Cabra");
        System.out.println("Alumno: "+estudiante.getNombre());

        estudiante.setMatricula(matricula);

        for (Matricula m: estudiante.getMatricula())
        {
            System.out.println("Alumno: "+m.getNombre());

            for (Semestre s: matricula.getSemestre())
            {
                System.out.println("Semestre: "+ s.getNombre());

                for (Curso c: semestre.getCurso())
                {
                    System.out.println("CURSO: "+c.getNombre());

                    for (Docente d:curso1.getDocente())
                    {
                        System.out.println("DOCENTE: "+d.getNombre());
                    }
                }
            }
        }
    }
}

