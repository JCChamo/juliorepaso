package Paquetes.ejercicios.matematicas;

public class Geometria {

    //Área de un triángulo, cuadrado, pentágono y hexágono

    public static double devolverAreaTriangulo(double base, double altura){
        return base * altura / 2;
    }

    public static double devolverAreaCuadrado(double lado){
        return lado * lado;
    }

    public static double devolverAreaPentagono(double lado){
        return 1.72 * lado * lado;
    }

    public static double devolverAreaHexagono(double lado){
        return 2.6 * lado * lado;
    }
}
