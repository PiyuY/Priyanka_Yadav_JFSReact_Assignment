package A8Lambda_Expression.Question2;

import java.util.ArrayList;
import java.util.List;

public class OrderMain {

	public static void main(String[] args) {

		List<Order> orderlist = new ArrayList<Order>();
		
		orderlist.add(new Order(1, 4000, Status.ACCEPTED));
		orderlist.add(new Order(2, 47000, Status.COMPLETED));
		orderlist.add(new Order(3, 25000, Status.REJECTED));
		orderlist.add(new Order(4, 6000, Status.PENDING));
		orderlist.add(new Order(5, 5000, Status.CANCELLED));
		orderlist.add(new Order(7, 12000, Status.ACCEPTED));
		orderlist.add(new Order(6, 18000, Status.REJECTED));
		
		
		orderlist.stream()
				.filter(o -> o.getPrice() > 10000)
				.filter(o -> o.getStatus()==Status.ACCEPTED || o.getStatus()==Status.COMPLETED)
				.forEach(o -> System.out.println(o));
		
	}

}
