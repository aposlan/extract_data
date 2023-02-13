import java.io.Serializable;
import java.util.Random;

public abstract class Product implements Serializable{
	
	private static final long serialVersionUID = 1;
	protected double price;
	protected int count;
	private String barCode = "";
	
	Product(){
		
	}
	
	Product(double price, int count) {
		Random code = new Random();
		this.price = price;
		this.count = count;
		barCode += code.nextInt(99999999);
	}

	public double getPrice() {
		return price;
	}
	
	public double getCount() {
		return count;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBarCode() {
		return barCode;
	}
	
	public abstract double discount();
	public abstract double discount(int discount);
	
}
