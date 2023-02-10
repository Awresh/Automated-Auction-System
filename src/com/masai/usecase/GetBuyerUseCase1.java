package com.masai.usecase;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminDAOImpl;

public class GetBuyerUseCase1 {

	public static void main(String[] args) {

		AdminDAO ad = new AdminDAOImpl();

		List<Buyer> b = ad.getBuyer();

		if (b != null) {
			System.out.println("============================================");
			for (int i = 0; i < b.size(); i++) {
				System.out.println("Buyer Name :- " + b.get(i).getName());
				System.out.println("Buyer Email :- " + b.get(i).getEmail());
				System.out.println("Buyer ID :- " + b.get(i).getId());
				System.out.println("Buyer Password :- " + b.get(i).getPassword());
				System.out.println("============================================");
			}
		} else
			System.out.println("Currently We don't have Any Buyer");
	}
}
