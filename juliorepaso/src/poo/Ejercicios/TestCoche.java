package poo.Ejercicios;

public class TestCoche {
    public static void main(String[] args) {
        Coche c1 = new Coche();
        c1.setCantidadCombustible(c1.getCantidadCombustible() + 5);
        Coche c2 = new Coche();
        c2.setCantidadCombustible(c2.getCantidadCombustible() + 5);
        System.out.println(c1.getCantidadCombustible() + "\n" + c1.getConsumoALosCien());
        System.out.println(c2.getCantidadCombustible() + "\n" + c2.getConsumoALosCien());


    }
}
