package Colecciones;

public class TestArrayList
{
    public static void main (String[]args)
    {
//Creamos una lista
        java.util.ArrayList cityList = new java.util.ArrayList ();
//A~nadimos objetos de tipo String
        cityList.add ("Londres");
        cityList.add ("Madrid");
        cityList.add ("Paris");
        cityList.add ("New York");
        cityList.add ("Berlin");
//Miramos si esta Madrid
        System.out.println ("Esta Madrid? " + cityList.contains ("Madrid"));
//A~nadimos otra ciudad
        cityList.add ("Caracas");
//A~nadimos otra ciudad en la posicion 2
        cityList.add (2, "Roma");
//Localizacion de Madrid en la lista
        System.out.println ("Posicion de Madrid " + cityList.indexOf ("Madrid"));
//Indicamos el numero de objetos de la lista
        System.out.println ("Tama~no de la lista: " + cityList.size ());
//Vemos el contenido de la lista
        cityList.add(7, "España");
        for (int i = 0; i < 20; i++) {
            cityList.add("ciudad");
        }
        System.out.println (cityList.toString ());
        System.out.println(cityList.size());
        for (int i = 8; i < cityList.size();) { //si pones i++, hay que poner al final del bucle i--

            System.out.println(cityList.get(i));
            System.out.println(i);
            cityList.remove(cityList.get(i));
        }
        System.out.println(cityList.toString());
    }
}