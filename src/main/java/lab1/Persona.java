package lab1;

public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private String ciudad;
    private String fecha_nacimiento;
    private float peso;
    private int direccion_ip;

    public Persona(String nombre, String apellido, String email, String ciudad, String fecha_nacimiento, float peso, int direccion_ip) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ciudad = ciudad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.peso = peso;
        this.direccion_ip = direccion_ip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getDireccion_ip() {
        return direccion_ip;
    }

    public void setDireccion_ip(int direccion_ip) {
        this.direccion_ip = direccion_ip;
    }
}
