package com.masai.dao;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Seller;

public interface AdminDAO
{
	public List<Buyer> getBuyer();
	
	public List<Seller> getSeller();
}
