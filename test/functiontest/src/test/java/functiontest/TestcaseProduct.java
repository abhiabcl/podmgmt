package functiontest;

import org.junit.Test;

import com.av.podmgmt.dao.entity.Product;
import com.av.podmgmt.product.handler.ProductHandler;

public class TestcaseProduct {

	@Test
	public void testAddProduct() {
		System.out.println("Inside test do registration");
//		String hql = " insert into PodmgmtUser (mUserid, mPassword, mLastlogin, mMobileNo, mEmail) SELECT firstName, lastName, salary FROM old_employee ('abhishek','kumar','12222','mobile','a@a.com')";
		
		Product product = new Product();
		ProductHandler obj;
		try {
			product.setmProductName("A-Product");
			product.setmProductPrice("120");
			product.setmProductQty(200);
			
			obj = new ProductHandler();
			System.out.println("do Registration result: " + obj.doAddProduct(product));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
}
