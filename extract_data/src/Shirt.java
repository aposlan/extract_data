import java.awt.Color;

public class Shirt extends Product {

	@Override
	public String toString() {
		return "Shirt [price =" + price + ", count=" + count + ", title=" + title + ", color=" + color + ", size=" + size + ", sleeveLength=" + sleeveLength
				+ ", collarType=" + collarType + ", gender=" + gender + "]\n";
	}

	private static final long serialVersionUID = 1;
	
	private String title;
	private Color color;
	private ShirtSize size;
	private String sleeveLength;
	private String collarType;
	private char gender;
	
	public Shirt(double price, int count, String title, Color color, ShirtSize size, String sleeveLength, String collarType, char gender) throws Exception {
		super(price, count);
		if((price < 0) || (count < 0)) {
			throw new Exception("INVALID PRICE OR STOCK COUNT | MUST BE MORE THAN ZERO");
		}
		this.title = title;
		this.color = color;
		this.size = size;
		this.sleeveLength = sleeveLength;
		this.collarType = collarType;
		this.gender = gender;
	}
	
	public String getTitle() {
		return title;
	}

	public Color getColor() {
		return color;
	}

	public ShirtSize getSize() {
		return size;
	}

	public String getSleeveLength() {
		return sleeveLength;
	}
	
	public String getCollarType() {
		return collarType;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public double discount() {
		return getPrice()-getPrice()*0.15;
	}

	@Override
	public double discount(int discount) {
		return getPrice()-getPrice()*(discount/100);
	}
	
	
	
}
