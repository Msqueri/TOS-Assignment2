package it.unipd.tos.business;

import it.unipd.tos.model.MenuItem;
import it.unipd.tos.business.exception.RestaurantBillException;
import java.util.List;

public class BellaNapoli implements RestaurantBill {
	//metodo per calcolare il totale
	private double gettotal(List<MenuItem> items){
		return items.stream().mapToDouble(MenuItem::getPrice).sum();
		}
	
	public double getOrderPrice(List<MenuItem> itemsOrdered) throws RestaurantBillException {
		return 0;	
	}
}
