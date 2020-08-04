package poo.Ejercicios;

public class TestPalabra {
    public static void main(String[] args) {
        Palabra p = new Palabra("silla");
        System.out.println(p.getContenido());
        System.out.println(p.devolverPalabraEnMayuscula());
        System.out.println(p.devolverPalabraEnMinuscula());
        System.out.println(p.devolverNumeroLetras());
        System.out.println(p.reemplazarCaracterPorOtro('a', 'o'));
        System.out.println(p.devolverParteDeLaCadena(2, 3));
        System.out.println(p.devolverUltimaLetraEnMayuscula());

    }
}
