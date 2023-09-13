import java.util.ArrayList;

public class Laboratorio {
    private Curso[][] horario;
    private int capacidad;
    private ArrayList<Curso> cursos;
    private ArrayList<Profesor> profesores;

    public Laboratorio(int capacidad) {
        this.capacidad = capacidad;
        this.horario = new Curso[5][14];
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean existeElProfesor(String nombre) {
        for (Profesor profesor : profesores) {
            if (profesor.getNombre().equals(nombre)) {
                return false;
            }
        }
        return true;
    }

    public boolean existeElCurso(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return false;
            }
        }
        return true;
    }

    public int convertirDia(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes": {
                return 0;
            }
            case "martes": {
                return 1;
            }
            case "miercoles": {
                return 2;
            }
            case "jueves": {
                return 3;
            }
            case "viernes": {
                return 4;
            }
            default: {
                return 5;
            }
        }
    }

    public int convertirHora(String hora) {
        switch (hora) {
            case "07:00": {
                return 0;
            }
            case "08:00": {
                return 1;
            }
            case "09:00": {
                return 2;
            }
            case "10:00": {
                return 3;
            }
            case "11:00": {
                return 4;
            }
            case "12:00": {
                return 5;
            }
            case "13:00": {
                return 6;
            }
            case "14:00": {
                return 7;
            }
            case "15:00": {
                return 8;
            }
            case "16:00": {
                return 9;
            }
            case "17:00": {
                return 10;
            }
            case "18:00": {
                return 11;
            }
            case "19:00": {
                return 12;
            }
            case "20:00": {
                return 13;
            }
            case "21:00": {
                return 14;
            }
            default: {
                return 15;
            }
        }
    }

    public String asignarCurso(Curso curso, String dia, String hora) {
        int numDia = convertirDia(dia);
        int numHora = convertirHora(hora);
        if (curso.getCantidadEstudiantes() <= capacidad) {
            horario[numDia][numHora] = curso;
            return "hola";
        } else {
            System.out.println("El curso tiene demasiados estudiantes para este laboratorio.");
        }
    }
}
