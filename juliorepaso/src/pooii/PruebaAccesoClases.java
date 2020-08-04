package pooii;

public class PruebaAccesoClases {

    private double jamon;
    private static double ensaimada;
    public int numeroCuenta;
    public static String nombre;

    public PruebaAccesoClases(double jamon, int numeroCuenta) {
        this.jamon = jamon;
        this.numeroCuenta = numeroCuenta;
    }

    public double getJamon() {
        return jamon;
    }

    public void setJamon(double jamon) {
        this.jamon = jamon;
    }

    public static double getEnsaimada() {
        return ensaimada;
    }

    public static void setEnsaimada(double ensaimada) {
        PruebaAccesoClases.ensaimada = ensaimada;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        PruebaAccesoClases.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("%f, %d, %f,%s", jamon, numeroCuenta, ensaimada, nombre);
    }

    public boolean cocinarJamon(){
        return true;
    }

    public double devolverDoble(){
        int n = 1;
        return n;
    }

}
