package poo;

class Numeros {
    int hola = 23;
    public Numeros() {
        System.out.println("Creando número");
    }

    public Numeros(int hola) {
        this.hola = hola;
    }

    Numeros(int valor1, int valor2) {
        System.out.println("Creando numero: "+valor1+valor2);
    }

    public int getHola() {
        return hola;
    }

    public void setHola(int hola) {
        this.hola = hola;
    }
}

public class EjemploNumeros {
    public static void main(String[] args) {
        new Numeros();
        Numeros n = new Numeros(40);
        System.out.println(n.getHola());
        n.setHola(19);
        System.out.println(n.getHola());
        new Numeros(1, 2);
    }
}

