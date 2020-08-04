package poo;

public class TestFecha {
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setDia(12);
        f.setMes(7);
        f.setAno(2009);

        System.out.println(f.toString());

        System.out.println(f.getDia() + " del " + f.getMes() + " del " + f.getAno());
    }
}
