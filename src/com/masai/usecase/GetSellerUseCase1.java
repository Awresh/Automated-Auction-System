package com.masai.usecase;

import java.util.List;

import com.masai.bean.Seller;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminDAOImpl;

public class GetSellerUseCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDAO ad = new AdminDAOImpl();
		
		List<Seller> s = ad.getSeller();
		
		if(s != null) {
			for(int i=0;i<s.size();i++) {
				System.out.println("============================================");
				System.out.println("Seller Name :- "+s.get(i).getName());
				System.out.println("Seller Email :- "+s.get(i).getEmail());
				System.out.println("Seller ID :- "+s.get(i).getId());
				System.out.println("Seller Password :- "+s.get(i).getPassword());
				System.out.println("============================================");
			}
		}
			
		else
			System.out.println("No record Found");
	}

}
