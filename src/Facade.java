import java.util.Scanner;

public class Facade {

	int UserType = -1;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	Scanner scan;

	Login login;

	public boolean login() {
		scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("------------------- [[ Welcome ]] --------------------");
		boolean validateLogin = false;
		while (!validateLogin) {
			while (UserType != 1 && UserType != 0) {
				System.out.println("Please select one of the following:");
				System.out.println("[0.] Login as buyer ");
				System.out.println("[1.] Login as seller");
				UserType = scan.nextInt();
				if (UserType != 1 && UserType != 0) {
					System.out.println("Please make a valid selection");
				}
			}
			System.out.println("Please enter your Username");
			String username = scan.next();
			System.out.println("Please enter your Password");
			String password = scan.next();
			login = new Login(UserType, username, password);
			validateLogin = login.validateLogin();
		}
		return false;
		//createUser(UserType);
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
