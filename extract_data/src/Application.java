import java.io.*;
import java.util.*;

public class Application {

	public static void main(String[] args) {

		List<Product> clothes = new ArrayList<>();

		readAndStoreData(clothes);
		
	}
	
	public static void readAndStoreData(List<Product> clothes) {
		ObjectInputStream reader = null;

		Product p;
		
		try {
			reader = new ObjectInputStream(new FileInputStream("C:\\Users\\FoxMulder\\eclipse-workspace\\save_data\\src\\data.ser"));
			while ((p = (Product) reader.readObject()) != null) {
				if (p instanceof Shirt) {
					clothes.add((Shirt) p);
					System.out.println("Success!");
					System.out.println((Shirt) p);
				}
				else if (p instanceof TShirt) {
					clothes.add((TShirt) p);
					System.out.println("Success!");
					System.out.println((TShirt) p);
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
