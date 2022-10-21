import java.util.*;
public class MeatProductMenu implements ProductMenu {

	private Product[] products;

	private int productType;

	private List<String> meatProducts = new ArrayList<String>();

	int i =1;

	public MeatProductMenu(int productType) {
		this.productType = productType;
	}

	public MeatProductMenu(int productType, Product[] products) {
		this.productType = productType;
		this.products = products;
	}

	public List<String> getMeatProduct() {
		for (Product p : this.products) {
			if (p.getProductType() == 0) {
				meatProducts.add(p.getProductName());
			}
		}
		return meatProducts;
	}


	public void showMenu(){
			System.out.println("You have selected Meat Menu");
			for( String meatItem : meatProducts){
				System.out.println(i+ ". " +meatItem);
				i++;
			}

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComBoxes() {

	}

}

