////////////////////////////////////////////////////////////////////
// Matteo Squeri 1143140
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

public class RestaurantBillException extends Exception {
    private String error;
    public RestaurantBillException() {
        error="non si possono avere più di 20 ordinazioni";
    }
    public String geterror() { return error; }

}
