////////////////////////////////////////////////////////////////////
// Matteo Squeri 1143140
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import it.unipd.tos.model.MenuItem;
import it.unipd.tos.business.exception.RestaurantBillException;
import java.util.List;
import java.util.OptionalDouble;

public class BellaNapoli implements RestaurantBill {
   
    //metodo per calcolare il totale
    private double gettotal(List<MenuItem> items){
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }
    
    //metodo per contare le pizze presenti
    private double getpizzanumber(List<MenuItem> items){
        double pizzanumber= items.stream()
                .filter(MenuItem::isPizza)
                .count();
        return pizzanumber;
        
    }
    
    //metodo per trovare la pizza meno costosa
    private double getlowest(List<MenuItem> items){
        OptionalDouble lowest= items.stream()
                .filter(MenuItem::isPizza)
                .mapToDouble(MenuItem::getPrice).min();
        if (lowest.isPresent()) { return lowest.getAsDouble(); }
        else { return 0; }
    }
    public double getOrderPrice(List<MenuItem> itemsOrdered) 
            throws RestaurantBillException {
        double total= gettotal(itemsOrdered);
        if(getpizzanumber(itemsOrdered)>10) {
            return total - getlowest(itemsOrdered);
        }
        else { return total; }
        
    }
}
