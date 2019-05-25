package net.kzn.shoppingbackend.dao;

import net.kzn.shoppingbackend.dto.Cart;
import net.kzn.shoppingbackend.dto.Payment;

public interface PaymentDAO {
	
	boolean addCardNo(Payment payment);
	boolean addCardPwd(Payment payment);
	boolean addExpDate(Payment payment);
	
	
	boolean addAmount(Cart grandTotal);
	
	Cart getGrandTotal(double grandTotal);
	
	
	
	
	
	
}
