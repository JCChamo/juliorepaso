package Coleccionesii;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PruebaMap {
    public static void main(String[] args) {
        Map<Integer, String> diccionario = new HashMap<>();
        diccionario.put(0, "patata");
        diccionario.put(1, "patatados");
        diccionario.put(2, "patatatres");
        diccionario.put(3, "patatacua");
        diccionario.put(4, "patatacinco");
        diccionario.put(5, "patataseis");
        diccionario.put(6, "patatasiete");
        diccionario.put(7, "patataocho");
        diccionario.put(8, "patatanueve");
        diccionario.put(8, "patatadiez");

        System.out.println(diccionario.toString());
        System.out.println(diccionario.get(5));
        System.out.println(diccionario.containsKey(4));
        System.out.println(diccionario.containsKey(20));
        System.out.println(diccionario.containsValue("patataocho"));
        System.out.println(diccionario.containsValue("pataocho"));
        System.out.println("----------");
        System.out.println(diccionario.isEmpty());
        //diccionario.clear();
        System.out.println("----------");
        System.out.println(diccionario.size());
        System.out.println(diccionario.remove(3));
        System.out.println(diccionario.remove("patatatres"));
        System.out.println("----------");
        System.out.println(diccionario.isEmpty());
        System.out.println(diccionario.size());
        System.out.println(diccionario.values());
        System.out.println(diccionario.keySet());
        System.out.println("----------");

        Map<String, String> diccionario2 = new TreeMap<>();
        diccionario2.put("hola", "patata");
        diccionario2.put("que", "patatados");
        diccionario2.put("tal", "patatatres");
        diccionario2.put("muy", "patatacua");
        diccionario2.put("bien", "patatacinco");
        diccionario2.put("y", "patataseis");
        diccionario2.put("tu", "patatasiete");
        diccionario2.put("que", "patataocho");
        diccionario2.put("tal", "patatanueve");
        diccionario2.put("estás", "patatadiez");
        System.out.println(diccionario2.values());
        System.out.println(diccionario2.keySet());

    }

//    public Interface Comparable<T> {
//        public int compareTo(T o);
//    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
