package final_practice;

public class Product implements Cloneable{
	
	private String productId;
	private String description;
	private String manufacturer;
	private double price;
	
	public Product(String productId, String description, String manufacturer, double price) {
		super();
		this.productId = productId;
		this.description = description;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", description=" + description + ", manufacturer=" + manufacturer
				+ ", price=" + price + "]";
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Product copy = (Product)super.clone();
		return copy;
	}

}
