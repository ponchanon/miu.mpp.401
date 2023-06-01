package lesson9.labsolns.prob8_old;

import java.util.Optional;

public class Product {
	private String productId;
	private String productName;
	private double unitPrice;
	public Product(String prodId, String prodName, double price) {
		this.productId = prodId;
		this.productName = prodName;
		this.unitPrice = price;
	}
	public Optional<String> getProductId() {
		return Optional.of(productId);
	}
	public Optional<String> getProductName() {
		return Optional.of(productName);
	}
	public Optional<Double> getUnitPrice() {
		return Optional.of(unitPrice);
	}
}
