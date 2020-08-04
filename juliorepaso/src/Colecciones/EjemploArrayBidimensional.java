package Colecciones;

public class EjemploArrayBidimensional {

    public static void main(String[] args) {
        String[][] datos = {{"hola", "que", "tal"},
                {"estoy", "muy", "bien"},
                {"y", "tu", "estas"},
                {"me", "llamo", "manolo"}};
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println(datos[i][j]);
            }
        }
    }
}
