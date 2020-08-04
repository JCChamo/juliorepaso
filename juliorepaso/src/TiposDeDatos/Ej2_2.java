package TiposDeDatos;

/**
 * Esta clase define objetos que contienen
 * un atributo denominado número
 * y posee un método para devolver
 * el valor doble
 * @author: Manuel Molino
 * @version: 1.0
 */
public class Ej2_2 {
    private int numero; //propiedad de los objetos.
    /**
     * Constructor: es un método que tiene
     * el mismo nombre que la clase y se
     * usa para crear objetos
     * @param n parámetro para inicializar el objeto
     * se usa para inicializar los objetos
     * de tipo número
     */
    public Ej2_2(int n){
        this.numero=n;
    }
    /**
     * método que devuelve el valor doble
     * @return el valor doble del atributo
     * número de dicho objeto.
     */
    public int cacularDoble(){
        return this.numero*2;
    }
}
    //clase para comprobar el funcionamiento de la
    //clase anterior
        class TestNumeros {
    public static void main(String[] arg){
        //Creo uno objeto de tipo Número
        Ej2_2 n1 = new Ej2_2(4);
        //Imprimo su valor doble
        System.out.println("Valor doble: "+n1.cacularDoble());
    }
}


