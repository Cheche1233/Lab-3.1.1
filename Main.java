// Clase Padre
class Vehiculo {
    // Atributos de la clase padre
    private String marca;
    private String modelo;
    private int año;
    private double velocidadMaxima;

    // Constructor de la clase padre
    public Vehiculo(String marca, String modelo, int año, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

// Clase Hija
class Automovil extends Vehiculo {
    // Atributos de la clase hija
    private int numeroDePuertas;
    private String tipoDeCombustible;
    private boolean esAutomatico;

    // Constructor de la clase hija
    public Automovil(String marca, String modelo, int año, double velocidadMaxima, int numeroDePuertas, String tipoDeCombustible, boolean esAutomatico) {
        super(marca, modelo, año, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
        this.tipoDeCombustible = tipoDeCombustible;
        this.esAutomatico = esAutomatico;
    }

    // Getters y Setters
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    // Método para mostrar información del automóvil
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Puertas: " + numeroDePuertas + ", Tipo de Combustible: " + tipoDeCombustible + ", Es Automático: " + esAutomatico);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020, 180.0);
        System.out.println("Información del Vehículo:");
        vehiculo.mostrarInfo();
        
        // Crear un objeto de la clase Automovil
        Automovil automovil = new Automovil("Honda", "Civic", 2021, 200.0, 4, "Gasolina", true);
        System.out.println("\nInformación del Automóvil:");
        automovil.mostrarInfo();
    }
}

