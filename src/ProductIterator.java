import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	private int i;

	List<Product> productList = new ArrayList<>();

	public ProductIterator(List<Product> productList, int i) throws Exception {
		this.productList = productList;
		this.i = i;
	}

	public boolean hasNext() {
		if(this.i > productList.size()){
			return false;
		}
		return true;
	}

	public Product next() {
		return productList.get(this.i++);
	}

	public void remove() {
		productList.remove(this.i);
	}

	public boolean hasPrevious() {
		return false;
	}

	public Object previous() {
		return null;
	}

	public int nextIndex() {
		return 0;
	}

	public int previousIndex() {
		return 0;
	}

	public void set(Object o) {

	}

	public void add(Object o) {

	}
}