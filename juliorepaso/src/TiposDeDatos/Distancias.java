package TiposDeDatos;

public class Distancias {
    public static void main(String[] args) {
        float millasRecorridas = 100F;
        final float MILLAS_POR_KILOMETRO = 1609;
        double kilometrosRealizados = millasRecorridas * MILLAS_POR_KILOMETRO;
        System.out.println(kilometrosRealizados);
        //System.out.printf("km realizados: %.0f", kilometrosRealizados);

    }
}
