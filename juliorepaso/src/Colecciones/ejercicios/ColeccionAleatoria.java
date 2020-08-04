package Colecciones.ejercicios;

import java.util.Arrays;

public class ColeccionAleatoria {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++)
            a[i] = (int)(Math.random() * 101);
        System.out.println(Arrays.toString(a));

        double valorMedio = devolverValorMedio(a);
        System.out.println(valorMedio);

        double desviacionTipica = devolverDesviacionTipica(a);
        System.out.printf("%.3f%n", desviacionTipica);

        int[] arrayOrdenado = devolverArrayOrdenado(a);
        System.out.println(Arrays.toString(arrayOrdenado));
        System.out.println(arrayOrdenado.length);

        //Modifica el array original (a) y te aparecen los pares ordenados
        //Si quieres que salgan desordenados, el método de ordenar debe trabajar con una copia del array a.
        int[] arrayValoresPares = devolverPares(a);
        System.out.println(Arrays.toString(arrayValoresPares));
        System.out.println(devolverMinimo(a));
        System.out.println(devolverMaximo(a));


    }

    public static double devolverValorMedio(int[] a){
        double valormedio = 0.0;
        double suma = 0.0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        valormedio = suma / a.length;
        return valormedio;
    }

    public static double devolverDesviacionTipica(int[] a){
        double valormedio = 0.0;
        double suma = 0.0;
        for (int i = 0; i < a.length; i++)
            suma += Math.sqrt(Math.pow(a[i] - devolverValorMedio(a), 2));
        //suma += Math.pow(coleccionValores[i] - calcularValorMedio(), 2);
        valormedio = suma / a.length;
        return valormedio;
    }

    public static int[] devolverArrayOrdenado(int[]a){
        int[] arrayOrdenado = new int[a.length];
        int n = 0;
        for (int i = 0; i < a.length -1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    n = a[i];
                    a[i] = a[j];
                    a[j] = n;
                }
                arrayOrdenado[i] = a[i];
            }
        }
        return arrayOrdenado;
    }

    public static int[] devolverPares(int[]a){
        int[] arrayPares = new int[a.length];
//        int i = 0, cont = 0;
//        for (int numeroPar:a) {
//            if (a[i] % 2 == 0){
//                arrayPares[cont] = numeroPar;
//                cont++;
//            }
//            i++;
//        }
        int cont = 0;
        int numeroPar = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0){
                arrayPares[cont] = a[i];
                cont++;
            }
        }
        return arrayPares;
    }

    public static int devolverMinimo(int[]a){
        int valorMinimo = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++)
            if (a[i] < valorMinimo)
                valorMinimo = a[i];

        return valorMinimo;
    }

    public static int devolverMaximo(int[]a){
        int valorMaximo = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
            if (a[i] > valorMaximo)
                valorMaximo = a[i];

        return valorMaximo;
    }
}