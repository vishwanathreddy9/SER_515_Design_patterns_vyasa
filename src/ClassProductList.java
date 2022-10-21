import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassProductList {

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private ProductIterator productIterator;

	public void accept(NodeVisitor visitor) {

	}

	public List<Product> getProductInfoList() {
		List<Product> productsList = new ArrayList<>();
		File file = new File("./src/ProductInfo.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("File not found in given location");
		}
		String str;
		try {
			while ((str = br.readLine()) != null) {
				String[] productsArray = str.split(":");
				if(productsArray[0].equalsIgnoreCase("Meat")){
					productsList.add(new Product(productsArray[1],0));
				} else if (productsArray[0].equalsIgnoreCase("Produce")) {
					productsList.add(new Product(productsArray[1],1));

				}


			}
		} catch (IOException e) {
			System.out.println("Error reading file");
		}
		return productsList;
	}

	public void printProductList(Product[] productArray) {
		for(int i = 0; i< productArray.length; i++){
			System.out.println(i+1 +". "+productArray[i].getProductName());
		}
	}

}