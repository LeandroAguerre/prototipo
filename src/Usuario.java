public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private int valorA;
    private int valorB;
    private int valorC;

    public Usuario(String nombre, String apellido, int valorA, int valorB, int valorC) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public int getValorC() {
        return valorC;
    }

    public void setValorC(int valorC) {
        this.valorC = valorC;
    }
}
