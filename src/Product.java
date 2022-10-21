public class Product {

	private Trading trading;

	private ClassProductList classProductList;

	private String productName;

	private int productType;

	public Product(String productName, int productType) {
		this.productName = productName;
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductType() {
		return productType;
	}
}
