package EstructurasDeControl.ejercicios;

public class SolucionEcuacionLineal {

    public static boolean esResoluble(double valorX1, double valorX2, double valorY1, double valorY2){
        if ((valorX1 * valorY2 - valorY1 * valorX2) != 0)
            return true;
        else
            return false;
    }

    public static double devolverValorX(double terminoIndependiente1,double terminoIndependiente2, double valorX1, double valorX2, double valorY1, double valorY2){
        double x = (terminoIndependiente1 * valorY1 - valorY1 * terminoIndependiente2) / (valorX1 * valorY2 - valorY1 * valorX2);
        return x;
    }

    public static double devolverValorY(double terminoIndependiente1,double terminoIndependiente2, double valorX1, double valorX2, double valorY1, double valorY2){
        double y = (valorX1 * terminoIndependiente2 - terminoIndependiente1 * valorX2) / (valorX1 * valorY2 - valorY1 * valorX2);
        return y;
    }


}
