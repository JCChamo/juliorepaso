package poo.Ejercicios;

public class Palabra {
    private String contenido;

    public Palabra(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public String devolverPalabraEnMayuscula(){
        return contenido.toUpperCase();
    }

    public String devolverPalabraEnMinuscula(){
        return contenido.toLowerCase();
    }

    public int devolverNumeroLetras(){
        return contenido.length();
    }

    public String reemplazarCaracterPorOtro(char a, char b){
        return contenido.replace(a, b);
    }

    public String devolverParteDeLaCadena (int pos1, int pos2){
        return contenido.substring(pos1, pos2);
    }

    public String devolverUltimaLetraEnMayuscula(){
        return contenido.toUpperCase().substring(contenido.length()-1, contenido.length());
    }
}
