package pooii;

public class TestPruebaAccesoClases {
    public static void main(String[] args) {
        PruebaAccesoClases p1 = new PruebaAccesoClases(4, 345);
        System.out.println(PruebaAccesoClases.getNombre());
        PruebaAccesoClases.setNombre("Paco");
        System.out.println(PruebaAccesoClases.getNombre());
        //System.out.println(p1.devolverDoble());
    }
}
