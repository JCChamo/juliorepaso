package EstructurasDeControl;

public class EjemploIfElse {
    public static void main(String[] args) {
            int n = 6;
    //        if (n % 2 == 0)
    //            System.out.println(n + " es par");
    //        else if (n % 3 == 0)
    //            System.out.println(n + " es impar");

            String mensaje = (n%2 == 0) ? "Es par" : "Es impar";
            System.out.println(mensaje);
            // condicion ? valorCierto : valorFalso
            //String mensaje = (numero % 2 ==0) ? ”Es par”: ”Es impar”;
    }


}
