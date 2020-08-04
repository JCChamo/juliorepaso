package pooii;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploClaseInterna {

    private String tomate;

    public class EjemploClaseInterna2 {
        private String lechuga;
        private String zanahoria;

        public EjemploClaseInterna2(String lechuga, String zanahoria) {
            this.lechuga = lechuga;
            this.zanahoria = zanahoria;
        }

        public EjemploClaseInterna2() {

        }


            public String getLechuga() {
            return lechuga;
        }

        public void setLechuga(String lechuga) {
            this.lechuga = lechuga;
        }

        public String getZanahoria() {
            return zanahoria;
        }

        public void setZanahoria(String zanahoria) {
            this.zanahoria = zanahoria;
        }

        public String devolverEnsalada(String tomate, String lechuga, String zanahoria) {
            return tomate + lechuga + zanahoria;
        }
    }

    public static String devolverMediaZanahoria(String zanahoria) {
        return zanahoria.substring(0, 4);
    }

    public static void main(String[] args) {
        //EjemploClaseInterna2 ej = new EjemploClaseInterna2();
        EjemploClaseInterna.EjemploClaseInterna2 eje;
        eje = (new EjemploClaseInterna()).new EjemploClaseInterna2();
    }

    //Clase interna anónima
    ActionListener click = new ActionListener() {
        public int numero=2;
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Hola "+this.numero);
        }
    };

}


