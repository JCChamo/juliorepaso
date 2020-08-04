package pooii.ejercicios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TarjetaCredito {

    private String numeroTarjeta;
    private String titular;
    private LocalDate fechaCreacion = LocalDate.now();

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return String.format("La tarjeta %d con titular %s tiene fecha " +
                "de creacion %s", numeroTarjeta, titular, fechaCreacion);
    }

    public static boolean validarTarjeta (String numeroTarjeta) { // 1,2 .... 16 cifras
        class NumeroTarjeta {  //cifra 16 es la de control
            private String numeroTarjetaSinDC;  // 1,2, .. 15 (sin dígito de control)

            public NumeroTarjeta(String numeroTarjetaSinDC) {
                this.numeroTarjetaSinDC = numeroTarjetaSinDC;
            }
            public String obtenerTarjetaConDC() {
                //código calcular el DC
                int suma = 0;
                for (int i= 0; i < numeroTarjetaSinDC.length(); i++ ){
                    if (i % 2 == 0) {
                        int tmp = Integer.parseInt(numeroTarjetaSinDC.charAt(i) + "") * 2;
                        if (tmp >= 10)
                            suma +=  tmp - 9;
                        else
                            suma += tmp;
                    }
                    else
                        suma += Integer.parseInt(
                                numeroTarjetaSinDC.charAt(i) + "");
                }

                String digitoControl = (suma % 10) + "";
                return numeroTarjetaSinDC + digitoControl;   // 1, 2, ... 16 con DC
            }
        }
        if (!numeroTarjeta.matches("[0-9]{16}"))
            return false;  //no son 16 dígitos que es lo que forma una tarjeta
        NumeroTarjeta nTarjeta = new NumeroTarjeta(
                numeroTarjeta.substring(0, numeroTarjeta.length() - 1));
        return numeroTarjeta.equals(nTarjeta.obtenerTarjetaConDC());
    }
}
