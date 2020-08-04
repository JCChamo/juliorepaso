package Stringbuilder;

public class StringBuilderPrueba {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //no me deja llamar a métodos de la clase StringBuilder
        sb.append("hola");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        sb.append("cb", 0, 2);
        System.out.println(sb);
        sb.append(2);
        System.out.println(sb);
        sb.append("paco");
        System.out.println(sb);
        sb.delete(4, sb.length());
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.insert(0, "paco", 0, 4);
        System.out.println(sb);
        System.out.println(sb.insert(5, "rr"));
        System.out.println(sb.insert(3, 12.3f));
        System.out.println(sb.replace(0, 1, "ao"));
        StringBuilder sb3 = new StringBuilder();
        //sb3.append("monja");
        //System.out.println(sb3.reverse());
        sb.setCharAt(0, 'z');
        System.out.println(sb);
        sb3.append("Welcome to HTML and Java");
        System.out.println(sb3.delete(8, 11));
        System.out.println(sb3.deleteCharAt(8));
        sb3.setCharAt(0, 'e');
        System.out.println(sb3);
        System.out.println(sb3.toString());
        String str = sb3.toString();
        sb3.append("sgdeertyughgdfy"); //16 -> 34 -> 70 (capacidad)
        System.out.println(sb3.capacity());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("a");
        System.out.println(sb4.capacity());
    }
}
