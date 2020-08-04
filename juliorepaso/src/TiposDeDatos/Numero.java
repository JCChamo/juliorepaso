package TiposDatos;

/**
 * Esta clase define objetos que contienen
 * un atributo denominado n´umero
 * y posee un m´etodo para devolver
 * el valor doble
 * @author Manuel Molino
 * @version 1.0
 */
public class Numero{
    private int numero; //propiedad de los objetos.
    /**
     * Constructor: es un m´etodo que tiene
     * el mismo nombre que la clase y se
     * usa para crear objetos
     * @param n par´ametro para inicializar el objeto
     * se usa para inicializar los objetos
     * de tipo n´umero
     */
    public Numero(int n){
        this.numero=n;
    }
    /**
     * m´etodo que devuelve el valor doble
     * @return el valor doble del atributo
     * numero de dicho objeto.
     */
    public int cacularDoble(){
        return this.numero*2;
    }

    /**
     * método que devuelve el valor triple
     * @return el valor triple del atributo
     * numero de dicho objeto.
     */
    public int cacularTriple(){
        return this.numero*3;
    }

    /**
     * método que devuelve la mitad del valor
     * @return la mitad del valor del atributo
     * numero de dicho objeto.
     */
    public int cacularMitad(){
        return this.numero/2;
    }
}
//clase para comprobar el funcionamiento de la
//clase anterior
class TestNumeros {
    public static void main(String[] arg){
//Creo uno objeto de tipo N´umero
        Numero n1 = new Numero(4);
//Imprimo su valor doble
        System.out.println("Valor doble: "+n1.cacularDoble());
        //Imprimo su valor triple
        System.out.println("Valor doble: "+n1.cacularTriple());
        //Imprimo la mitad del valor
        System.out.println("Valor doble: "+n1.cacularMitad());
    }
}

