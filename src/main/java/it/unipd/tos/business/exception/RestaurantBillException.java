package it.unipd.tos.business.exception;

public class RestaurantBillException extends Exception {
	private String error;
	public RestaurantBillException() {
		error="errore";
	}

}
