import java.io.*;
import java.util.*;

public class Seller extends Person {

	private Buyer buyer;

	private ProductMenu productMenu;

	private UserInfoItem userInfoItem;

	private List<String> sellerItems;

	public Seller(UserInfoItem userInfoItem) {
		this.userInfoItem = userInfoItem;
	}

	public Seller(UserInfoItem userInfoItem, List<String> sellerItems) {
		this.userInfoItem = userInfoItem;
		this.sellerItems = sellerItems;
	}

	/*public Seller(UserInfoItem userInfoItem, Product[] productArray) {
		super();
	}*/

	public void showMenu() {
		System.out.println("Seller Menu");
		if (sellerItems.size() != 0){
			System.out.println("Selling Items");
			int i = 1;
			for(String item : sellerItems) {
				System.out.println(i+". "+item);
				i++;
			}
		} else {
			System.out.println("Empty bag");
		}

	}

	@Override
	public void showComBoxes() {

	}

	public Product[] CreateProductMenu(int productType) {
		ClassProductList classProductList = new ClassProductList();
		List<Product> totalProductsList = classProductList.getProductInfoList();
		Map<String,Integer> productToTypeMap = productListToMap(totalProductsList);
		List<Product> productsList = new ArrayList<>();
		File file = new File("./src/UserProduct.txt");
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
				if(productsArray[0].equalsIgnoreCase(userInfoItem.getUserName())
						&& productToTypeMap.get(productsArray[1])==productType){
					productsList.add(new Product(productsArray[1],productType));
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading file");
		}
		int size = productsList.size();
		int i=0;
		Product[] productArray = new Product[size];
		//Implementing iterator pattern here
		Iterator<Product> itr = productsList.listIterator();
		while(itr.hasNext()){
			productArray[i] = itr.next();
			i++;
		}
		classProductList.printProductList(productArray);
		return productArray;
	}

	private Map<String, Integer> productListToMap(List<Product> totalProductsList) {
		Map<String,Integer> ProductToTypeMap = new HashMap<>();
		for(Product p : totalProductsList){
			ProductToTypeMap.put(p.getProductName(),p.getProductType());
		}
		return ProductToTypeMap;
	}

}
