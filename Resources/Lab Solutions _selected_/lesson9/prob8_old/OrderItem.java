package lesson9.labsolns.prob8_old;

import java.util.Optional;

public class OrderItem {
	private Product product;
	private int quantityRequested;
	private double totalPrice;
	//package level constructor
	OrderItem(Product product, int quantity) {
		this.product = product;
		this.quantityRequested = quantity;
		totalPrice = product.getUnitPrice().get() * quantity;
	}
	@Override
	public String toString() {
		return "   " + product.getProductId() + ": " + quantityRequested + ", " + product.getUnitPrice();
	}
	public Optional<Product> getProduct() {
		return Optional.of(product);
	}
	public Optional<Integer> getQuantityRequested() {
		return Optional.of(quantityRequested);
	}
	public Optional<Double> getTotalPrice() {
		return Optional.of(totalPrice);
	}
	
}
