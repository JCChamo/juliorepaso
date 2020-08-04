package poo.Ejercicios;

public class MetodosClaseString {

    public static void main(String[] args) {
        String a = "alpargata";
        String b = "   ";
        String c = "ABCDEFG";
        System.out.println(a.contains("par"));

        System.out.println(a.endsWith("gata"));

        System.out.println(a.equalsIgnoreCase("alparGATa"));

        System.out.println(b.isEmpty());

        System.out.println(b.isBlank());

        System.out.println(a.charAt(7));

        System.out.println(a.length());

        System.out.println(a.replace('a', 'o'));

        System.out.println(a.substring(0,8) + 'o');

        System.out.println(a.toUpperCase());

        System.out.println(c.toLowerCase());

        System.out.println(a.substring(1, 4));


    }
}
