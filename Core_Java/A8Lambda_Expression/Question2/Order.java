package A8Lambda_Expression.Question2;

public class Order {
	private int orderId;
	private double price;
	private Status status;
	
	public Order(int orderId, double price, Status status) {
		this.orderId = orderId;
		this.price = price;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", price=" + price + ", status=" + status + "]";
	}
	
}
