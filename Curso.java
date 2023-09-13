public class Curso {
    private String codigo;
    private String nombre;
    private int periodosPorDia;
    private String[] diasDeLaSemana;
    private String horario;
    private int cantidadEstudiantes;
    private Profesor profesor;

    public Curso(String codigo, String nombre, int periodosPorDia, String[] diasDeLaSemana, String horario,
            int cantidadEstudiantes, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.periodosPorDia = periodosPorDia;
        this.diasDeLaSemana = diasDeLaSemana;
        this.horario = horario;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeriodosPorDia() {
        return periodosPorDia;
    }

    public String[] getDiasDeLaSemana() {
        return diasDeLaSemana;
    }

    public String getHorario() {
        return horario;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
