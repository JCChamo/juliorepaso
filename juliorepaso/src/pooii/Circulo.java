package pooii;

public class Circulo {

    private double radio;
    private double area;

    public Circulo(double area) {
        this.radio = radio;
        //this.area = area;
    }

    public Circulo() {
        this(1.0);
        //this(4.0);
    }

    public double getArea() {
        return this.radio * this.radio * Math.PI;
    }
}
