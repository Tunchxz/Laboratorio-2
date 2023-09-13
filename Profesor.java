public class Profesor {
    private String nombre;
    private String carne;
    private String correo;
    private String telefono;
    private int vecesACargo;

    public Profesor(String nombre, String carne, String correo, String telefono) {
        this.nombre = nombre;
        this.carne = carne;
        this.correo = correo;
        this.telefono = telefono;
        this.vecesACargo = 0;
    }

    public void setVecesACargo(int vecesACargo) {
        this.vecesACargo = vecesACargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarne() {
        return carne;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getVecesACargo() {
        return vecesACargo;
    }
}
