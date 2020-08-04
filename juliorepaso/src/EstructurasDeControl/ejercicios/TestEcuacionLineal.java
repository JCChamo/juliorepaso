package EstructurasDeControl.ejercicios;

public class TestEcuacionLineal {
    public static void main(String[] args) {

        double valorX1 = 1;
        double valorY1 = 1;
        double valorX2 = 2;
        double valorY2 = 2;
        int terminoIndependiente1 = 1;
        int terminoIndependiente2 = 2;
        boolean good = SolucionEcuacionLineal.esResoluble(valorX1, valorX2, valorY1, valorY2);
        System.out.println(good);

        double x = SolucionEcuacionLineal.devolverValorX(valorX1, valorX2, valorY1, valorY2, terminoIndependiente1, terminoIndependiente2);
        System.out.println(x);

        double y = SolucionEcuacionLineal.devolverValorY(valorX1, valorX2, valorY1, valorY2, terminoIndependiente1, terminoIndependiente2);
        System.out.println(y);


        double valorX12 = 2;
        double valorY12 = 1;
        double valorX22 = -1;
        double valorY22 = 2;
        int terminoIndependiente12 = 7;
        int terminoIndependiente22 = -1;
        boolean good2 = SolucionEcuacionLineal.esResoluble(valorX12, valorX22, valorY12, valorY22);
        System.out.println(good);

        double x2 = SolucionEcuacionLineal.devolverValorX(valorX12, valorX22, valorY12, valorY22, terminoIndependiente12, terminoIndependiente22);
        System.out.println(x);

        double y2 = SolucionEcuacionLineal.devolverValorY(valorX12, valorX22, valorY12, valorY22, terminoIndependiente12, terminoIndependiente22);
        System.out.println(y);
    }
}
