package com.masai.main;

import java.util.Scanner;

import com.masai.colour.colour;
import com.masai.usecase.AddProduct;
import com.masai.usecase.BuyItem;
import com.masai.usecase.DeleteProduct;
import com.masai.usecase.GetBuyerUseCase1;
import com.masai.usecase.GetSellerUseCase1;
import com.masai.usecase.ProductList;
import com.masai.usecase.RegisterBuyer;
import com.masai.usecase.RegisterSeller;
import com.masai.usecase.SellerByCategory;
import com.masai.usecase.SoldHistory;
import com.masai.usecase.UpdateProduct;
import com.masai.usecase.ViewItemBycategory;

public class Main {

	public static void main(String[] args) {
		System.out.println(colour.ANSI_YELLOW+"Welcome to Automated Auction System"+colour.ANSI_RESET);
		
		String admin_Login = "Awresh";
		String password = "12345";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(
					"	+------------------------------+\n"
					+ "	|  Option  | 	    Type       |\n"
					+ "	+----------+-------------------+\n"
					+ "	|	1  |  "+colour.ANSI_blue+"  Administrator "+colour.ANSI_RESET+" |\n"
					+ "	|	2  |  "+colour.ANSI_blue+"  Seller  "+colour.ANSI_RESET+"       |\n"
					+ "	|	3  | "+colour.ANSI_blue+"   Buyer "+colour.ANSI_RESET+" 	       |\n"
					+ "	|	4  |  "+colour.ANSI_Red+"  Exit "+colour.ANSI_RESET+"          |\n"
					+ "	+----------+-------------------+");
//			System.out.println("2. Seller");
//			System.out.println("3. Buyer");
//			System.out.println("4. Exit");
			
			System.out.println(colour.ANSI_YELLOW+"Enter Option"+colour.ANSI_RESET);
			int c = sc.nextInt();
			
			if(c==1)
			{
				System.out.println("Enter Admin Login ID");
				String login = sc.next();
				
				System.out.println("Enter Admin Password");
				String pass = sc.next();
				
				if(login.equals(admin_Login) && pass.equals(password)) 
				{
					System.out.println(colour.ANSI_YELLOW+"Login Success"+colour.ANSI_RESET);
					while(true) {
						System.out.println(
								"	+------------------------------+\n"
								+ "	|  Option  | 	    Type       |\n"
								+ "	+----------+-------------------+\n"
								+ "	|	1  |  View Buyer List  |\n"
								+ "	|	2  |  View Seller List |\n"
								+ "	|	3  |  "+colour.ANSI_Red+" Exit  "+colour.ANSI_RESET+"  	       |\n"
								+ "	+----------+-------------------+");
//						System.out.println("1. View Buyer List");
//						System.out.println("2. View Seller List");
//						System.out.println("3. Exit");
						
						System.out.println(colour.ANSI_YELLOW+"Enter option"+colour.ANSI_RESET);
						int c3 = sc.nextInt();
						
						if(c3==1) 
							new GetBuyerUseCase1().main(args);
						else if(c3==2)
							new GetSellerUseCase1().main(args);
						else if (c3==3) {
							System.out.println("Thanks For visit");
							break;
						}else {
							System.out.print(colour.ANSI_Red+"Invalid Option Pleas Try again"+colour.ANSI_RESET);
						}
					}
				}else {
					System.out.println("Please Check Your ID or Password");
				}
			}
			else if(c==2)
			{
				while(true) {
					System.out.println(
							"	+-----------------------------------------------+\n"
							+ "	|  Option  | 	            Type                |\n"
							+ "	+----------+------------------------------------+\n"
							+ "	|	1  |  Register as seller.               |\n"
							+ "	|	2  |  Create list of items to sell      |\n"
							+ "	|	3  |  Update Item price, quantity, etc. |\n"
							+ "	|	4  |  Add new Item in the list.         |\n"
							+ "	|	5  |  Remove items from the list.       |\n"
							+ "	|	6  |  View the sold Item history.       |\n"
							+ "	|	7  |  "+colour.ANSI_Red+"Exit."+colour.ANSI_RESET+"                             |\n"
							+ "	+----------+------------------------------------+");
					
					System.out.println(colour.ANSI_YELLOW+"Enter option"+colour.ANSI_RESET);
					int c4 = sc.nextInt();
					
					if(c4==1)
						new RegisterSeller().main(args);
					else if(c4==2)
						new ProductList().main(args);
					else if(c4==3)
						new UpdateProduct().main(args);
					else if(c4==4)
						new AddProduct().main(args);
					else if(c4==5)
						new DeleteProduct().main(args);
					else if(c4 == 6)
						new SoldHistory().main(args);
					else if(c4==7) {
						System.out.println("Thanks For visit");
						break;
					}
						
					else
						System.out.println(colour.ANSI_Red+"Invalid Option Pleas Try again"+colour.ANSI_RESET);
				}
			}
			else if (c==3)
			{
				
				while(true) {
					System.out.println(
							"	+-----------------------------------------------+\n"
							+ "	|  Option  | 	            Type                |\n"
							+ "	+----------+------------------------------------+\n"
							+ "	|	1  |  Register as Buyer.                |\n"
							+ "	|	2  |  Search and view Items by category |\n"
							+ "	|	3  |  Select and view all the seller and|\n"
							+ "	|	   |  also their Items category wise.   |\n"
							+ "	|	4  |  Selects Items to buy.             |\n"
							+ "	|	5  |  "+colour.ANSI_Red+"Exit."+colour.ANSI_RESET+"                             |\n"
							+ "	+----------+------------------------------------+");
					
//					System.out.println("1. Register as Buyer.");
//					System.out.println("2. Search and view Items by category.");
//					System.out.println("3. Select and view all the seller and also their Items category wise.");
//					System.out.println("4. Selects Items to buy.");
					
					System.out.println(colour.ANSI_YELLOW+"Enter option"+colour.ANSI_RESET);
					int c5 = sc.nextInt();
					
					if(c5==1)
						new RegisterBuyer().main(args);
					else if(c5==2)
						new ViewItemBycategory().main(args);
					else if(c5==3)
						new SellerByCategory().main(args);
					else if(c5==4)
						new BuyItem().main(args);
					else if(c5==5) {
						System.out.println("Thanks For visit");
						break;
					}
					else 
						System.out.println(colour.ANSI_Red+"Invalid Option Pleas Try again"+colour.ANSI_RESET);
				}
			}
			else if( c==4) {
				System.out.println("Thanks for visit");
				break;
			};
		}
		
		
	}
}