package functiontest;

import java.util.HashMap;

import org.junit.Test;

import com.av.podmgmt.common.constant.EEntityType;
import com.av.podmgmt.common.constant.EFactoryChoice;
import com.av.podmgmt.common.constant.EPodmgmtuser;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.controller.handler.FrontController;
import com.av.podmgmt.controller.handler.factory.FactoryProducer;
import com.av.podmgmt.dao.entity.PodmgmtUser;
import com.av.podmgmt.user.factory.PodmgmtUserProducer;
import com.av.podmgmt.user.handler.impl.PodmgmtUserHandler;

public class TestcasePodmgmtuser {

	@Test
	public void testdoRegistration() {
		System.out.println("Inside test do registration");
//		String hql = " insert into PodmgmtUser (mUserid, mPassword, mLastlogin, mMobileNo, mEmail) SELECT firstName, lastName, salary FROM old_employee ('abhishek','kumar','12222','mobile','a@a.com')";
		
		PodmgmtUser poduser;
		PodmgmtUserHandler obj;
		try {
			poduser =  PodmgmtUserProducer.getUser().getUser("admin").getUser();
			poduser.setmUserid("Kumar");
			poduser.setmEmail("a@b.com");
			poduser.setmLastlogin("43334");
			poduser.setmPassword("fdfd");
			poduser.setmMobileNo("e4ere343");
			poduser.setmRole("admin");
			
			obj = new PodmgmtUserHandler();
			System.out.println("do Registration result: " + obj.doUserRegistration(poduser));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	@Test
	public void testdoUpdatePassword() throws PodMgmException{
		System.out.println("Inside test update password");
		PodmgmtUserHandler obj = new PodmgmtUserHandler();
		PodmgmtUser poduser = new PodmgmtUser();
		poduser.setmUserid("Kumar");
		poduser.setmPassword("fdfd");
		System.out.println("do Registration result: " + obj.doUpdatePassword(poduser, "abhi"));
	}
	
	@Test 
	public void testdoLogin(){
		System.out.println("Inside test login ");
		PodmgmtUserHandler obj = new PodmgmtUserHandler();
		try {
			PodmgmtUser poduser = new PodmgmtUser();
			poduser.setmUserid("Kumar");
			poduser.setmPassword("abhi");
			System.out.println("do Registration result: " + obj.doLogin(poduser));
		} catch (PodMgmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test 
	public void testdoLoginUsingController() throws PodMgmException{
		System.out.println("Inside testdoLoginUsingController ");
		HashMap<EPodmgmtuser, String> userData = new HashMap<EPodmgmtuser, String>();
		userData.put(EPodmgmtuser.USERID, "Kumar");
		userData.put(EPodmgmtuser.PASSWORD, "abhi");
		
		
		PodmgmtUser poduser = (PodmgmtUser) FactoryProducer.getFactory(EFactoryChoice.ENTITY).getEntity(userData, EEntityType.USER);
		
		FrontController.init();
		FrontController.performAction(poduser, EEntityType.USER, EPodmgmtuser.EAction.LOGIN);
		
		System.out.println("out...............");
	}
}
