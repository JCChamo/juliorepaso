package poo.Ejercicios;

import javax.swing.*;

public class TestTrianguloRectangulo {
    public static void main(String[] args) {
        TrianguloRectangulo t  = new TrianguloRectangulo();
        int base  = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base"));
        t.setBase(base);
        int altura  = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la altura"));
        t.setAltura(altura);
        double area = t.devolverArea(base, altura);
        double perimetro = t.devolverPerimetro(base, altura);
        double hipotenusa = t.devolverHipotenusa(base, altura);
        JOptionPane.showMessageDialog(null, "El área del triángulo rectángulo es: " + area);
        JOptionPane.showMessageDialog(null, "El perímetro del triángulo rectángulo es: " + perimetro);
        JOptionPane.showMessageDialog(null, "La hipotenusa del triángulo rectángulo es: " + hipotenusa);



    }
}
