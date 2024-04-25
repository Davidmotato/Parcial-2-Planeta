public class Planeta {
    // Atributos
    private String nombre;
    private int cantidadSatelites;
    private double masa; // en kg
    private double volumen; // en m^3
    private double diametro; // en km
    private double distanciaAlSol; // en km
    private boolean esObservable;

    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    // Método para imprimir los valores de los atributos
    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " m^3");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaAlSol + " km");
        System.out.println("Es observable: " + (esObservable ? "Sí" : "No"));
    }

    // Método para calcular la densidad del planeta (masa / volumen)
    public double calcularDensidad() {
        return masa / volumen;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 150_000_00, true);
        tierra.imprimirInfo();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad() + " kg/m^3");

        Planeta jupiter = new Planeta("Júpiter", 1, 1.899e27, 1.4313e15, 139820, 750_000_00, true);
        jupiter.imprimirInfo();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad() + " kg/m^3");
    }
}