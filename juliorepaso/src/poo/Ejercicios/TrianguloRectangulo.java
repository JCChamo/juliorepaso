package poo.Ejercicios;

public class TrianguloRectangulo {
    private int base;
    private int altura;
    private int hipotenusa;
    private double area;
    private int perimetro;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(int hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public static double devolverPerimetro(int base, int altura){
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return hipotenusa + base + altura;
    }

    public static double devolverArea(int base, int altura){
        return base * altura / 2;
    }

    public static double devolverHipotenusa(int base, int altura){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}
