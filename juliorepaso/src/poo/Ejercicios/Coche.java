package poo.Ejercicios;

public class Coche {
    private double cantidadCombustible= 5;
    private double consumoALosCien = 7;

    public double getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(double cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public double getConsumoALosCien() {
        return consumoALosCien;
    }

    public void setConsumoALosCien(double consumoALosCien) {
        this.consumoALosCien = consumoALosCien;
    }

    public static double DevolverKmQuePuedesRecorrer(double consumoALosCien, double cantidadCombustible){
        return Math.pow(consumoALosCien, -1) * cantidadCombustible;
    }
}
