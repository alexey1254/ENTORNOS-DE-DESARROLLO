/**
 * En esta clase se crea una cuenta de banco
 * @author Alex
 */
public class Cuenta {

    private String titular;
    private double cantidad;
    /**
     * Crea una cuenta donde se le pasa el titular y la cantidad
     * @param titular Quien vaya a usar la cuenta
     * @param cantidad La cantidad que se le pone al titular
     */
    public Cuenta(String titular, double cantidad) {
        this.titular=titular;
        this.cantidad=cantidad;
    }
    /**
     * Constructor donde solo se le pasa el titular, la cantidad
     * se inicializa a cero.
     * @param titular 
     */
    public Cuenta(String titular) {
        this.titular=titular;
        this.cantidad = 0;
    }

    /**
     * Metodo ToString
     * @Override
     * @return Una representacion de este objeto (Cuenta) en String
     */
    public String toString() {
        return "Titular: " + this.titular + "\nDinero: " + this.cantidad;
    }

    /**
     * Metodo ingresar cantidad, no deja ingresar un valor negativo o un cero.
     * @param cantidad Cantidad que se quiere retirar de la cuenta
     * @throws Exception Si se ingresa un valor negativo o cero crea una excepción
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
        else {
            throw new Exception("No se puede ingresar una cantidad negativa o un cero");
        }
    }

    /**
     * 
     * @param cantidad
     * @return La cantidad de dinero retirada del banco
     * @throws Exception Si se quiere retirar una cantidad mayor a la que se tiene
     * en la cuenta crea una excepcion
     */
    public double retirar(double cantidad) throws Exception {
        if (cantidad > this.cantidad) {
            throw new Exception("No se puede retirar una cantidad mayor a la que se tiene en la cuenta");
        }
        else {
            this.cantidad -= cantidad;
            return cantidad;
        }
    }

    /**
     * 
     * @return Titular
     */
    public String getTitular() {
        return titular;
    }
    /**
     * 
     * @param titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }
    /**
     * 
     * @return Cantidad
     */
    public double getCantidad() {
        return cantidad;
    }
    /**
     * 
     * @param cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}