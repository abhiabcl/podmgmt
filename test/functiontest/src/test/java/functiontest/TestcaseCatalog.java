package functiontest;

import java.util.HashMap;

import org.junit.Test;

import com.av.podmgmt.catlog.handler.impl.CatalogHandler;
import com.av.podmgmt.common.constant.ECataog;
import com.av.podmgmt.common.constant.EEntityType;
import com.av.podmgmt.common.constant.EFactoryChoice;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.controller.handler.FrontController;
import com.av.podmgmt.controller.handler.factory.FactoryProducer;
import com.av.podmgmt.dao.entity.Catalog;

public class TestcaseCatalog {

	@Test
	public void testAddCatalog() {
		System.out.println("Inside test do registration");
//		String hql = " insert into PodmgmtUser (mUserid, mPassword, mLastlogin, mMobileNo, mEmail) SELECT firstName, lastName, salary FROM old_employee ('abhishek','kumar','12222','mobile','a@a.com')";
		
		Catalog catalog = new Catalog();
		try {
			catalog.setmCatalogName("A-Product");
			
			CatalogHandler obj = new CatalogHandler();
			System.out.println("do Registration result: " + obj.doAddCatalog(catalog));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddCatalogUsingController() throws PodMgmException{
		System.out.println("inside testAddCatalogUsingController");
		
		HashMap<ECataog, String> catData = new HashMap<ECataog, String>();
		catData.put(ECataog.CATALOGNAME, "B-Product");
		
		
		Catalog catalog = (Catalog) FactoryProducer.getFactory(EFactoryChoice.ENTITY).getEntity(catData, EEntityType.CATALOG);
		
		FrontController.init();
		FrontController.performAction(catalog, EEntityType.CATALOG, ECataog.EAction.DELETE);
		
		System.out.println("out.....");
	}
	
	
}
