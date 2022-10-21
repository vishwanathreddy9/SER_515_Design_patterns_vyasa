import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Facade {

	int UserType = -1;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	Product[] productArray;

	Scanner scan;

	Login login;

	private List<String> sellerItems = new ArrayList<String>();

	private UserInfoItem userInfoItem;

	private List<String> meatItems;

	private  List<String> produceItems;

	public boolean login() {
		scan = new Scanner(System.in);
		System.out.println("Hi There!");
		System.out.println("Welcome to the login page");
		boolean validateLogin = false;
		while (!validateLogin) {
			while (UserType != 1 && UserType != 0) {
				System.out.println("Please select an option");
				System.out.println("0 To Login as a buyer ");
				System.out.println("1 To Login as a seller");
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
			this.userInfoItem = new UserInfoItem(username,UserType);
		}
		return false;

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

	public void createUser() {
			if (this.UserType == 0){
				thePerson = new Buyer(this.userInfoItem);

			} else if (this.UserType == 1){
				thePerson = new Seller(this.userInfoItem);

			}
		}


	public void createProductList() {
		System.out.println("Select Which Type of Food Menu to Display");
		System.out.println("0 - Meat");
		System.out.println("1 - Produce");
		int productType = scan.nextInt();
		if (productType != 1 && productType != 0) {
			System.out.println("Please make a valid selection");
		}
		this.productArray =  (UserType==1) ? this.thePerson.CreateProductMenu(productType):this.thePerson.CreateProductMenu(productType);
	}

	public void Buyer() {


	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

		System.out.println("Select Which Food You want to Buy/Sell");
		int buyingOrSellingProduct = scan.nextInt();
		if (buyingOrSellingProduct >= this.productArray.length || buyingOrSellingProduct<=0) {
			System.out.println("Please make a selection only from the above list");
		}
		System.out.println(this.productArray[buyingOrSellingProduct-1].getProductName());
	}

	public void productOperation() {

	}

}
