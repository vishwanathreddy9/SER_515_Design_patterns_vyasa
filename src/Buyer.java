import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Buyer extends Person {

	//private Seller seller;

	private Person person;
	private ProductMenu productMenu;

	private UserInfoItem userInfoItem;

	private  Product[] products;
	public Buyer(UserInfoItem userInfoItem, Product[] products) {
		this.userInfoItem = userInfoItem;
		this.products = products;
	}

	public Buyer(UserInfoItem userInfoItem) {
		this.userInfoItem = userInfoItem;
	}

	public void showMenu() {
		System.out.println("Buyer Menu");

	}

	@Override
	public void showComBoxes() {

	}

	/**
	 *  
	 */
	public Product[] CreateProductMenu(int productType) {
		ClassProductList classProductList = new ClassProductList();
		List<Product> productsList = classProductList.getProductInfoList();
		List<Product> productsListNew = productsList.stream().filter(e -> e.getProductType()==productType).collect(Collectors.toList());
		int size = productsListNew.size();
		int i=0;
		Product[] productArray = new Product[size];
		//Implementing iterator pattern here
		Iterator<Product> itr = productsListNew.listIterator();
		while(itr.hasNext()){
			productArray[i] = itr.next();
			i++;
		}
		classProductList.printProductList(productArray);
		return productArray;
	}

}
