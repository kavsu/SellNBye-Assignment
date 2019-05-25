package net.kzn.shoppingbackend.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.PaymentDAO;
import net.kzn.shoppingbackend.dto.Cart;
import net.kzn.shoppingbackend.dto.Payment;

@Repository("paymentDAO")
@Transactional
public class PaymentDAOImpl implements PaymentDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Cart getGrandTotal(double grandTotal) {
		return sessionFactory.getCurrentSession().get(Cart.class, Double.valueOf(grandTotal));
	}

	@Override
	public boolean addCardNo(Payment payment) {
		
		try {
				sessionFactory.getCurrentSession().persist(payment);
				return true;
		}
			catch(Exception ex) {
				ex.printStackTrace();
				return false;
			}
			
		
		
	}

	@Override
	public boolean addCardPwd(Payment payment) {
		
		try {
			sessionFactory.getCurrentSession().persist(payment);
			return true;
	}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addExpDate(Payment payment) {
		try {
			sessionFactory.getCurrentSession().persist(payment);
			return true;
	}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addAmount(Cart grandTotal) {
	   	try {
			/*sessionFactory.getCurrentSession().persist();*/
			return true;
	}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	

}
