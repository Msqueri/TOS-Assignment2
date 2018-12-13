package it.unipd.tos.business;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.itemType;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellaNapoliTest {
	
	//inizializzo i parametri per i test
	private BellaNapoli bill= new BellaNapoli();
	private MenuItem Item1=  new MenuItem(itemType.PIZZA, "primo", 5);
	private MenuItem Item2=  new MenuItem(itemType.PRIMO, "secondo", 19.5);
	private MenuItem Item3=  new MenuItem(itemType.PIZZA, "terzo", 15.5);
	private MenuItem Item4=  new MenuItem(itemType.PRIMO, "quarto", 30);
	private MenuItem Item5=  new MenuItem(itemType.PIZZA, "quinto", 1);
	
	@Test
	public void emptyTest() throws RestaurantBillException {
		List<MenuItem> empty = new ArrayList<>();
        assertEquals(0, bill.getOrderPrice(empty),0);
	}
	
	@Test
	public void gettotalTest() throws RestaurantBillException {
		List<MenuItem> BillList = new ArrayList<>(Arrays.asList(Item1, Item2, Item3, Item4, Item5));
        assertEquals(61, bill.getOrderPrice(BillList),0);
	}

}