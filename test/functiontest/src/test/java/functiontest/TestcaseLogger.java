//package functiontest;
//
//import java.util.Iterator;
//import java.util.List;
//
//import org.hibernate.Hibernate;
//import org.hibernate.Query;
//import org.hibernate.type.Type;
//import org.junit.Test;
//
//import com.av.podmgmt.dao.factory.GetEntityIdFactory;
//import com.av.podmgmt.dao.handler.PodmgmtDbHandler;
//import com.av.podmgmt.dao.util.PodmgmtEnum;
//import com.av.podmgmt.user.entity.PodmgmtUser;
//import com.av.podmgmt.user.handler.PodmgmtUserHandler;
//
//public class TestcaseLogger {
//
//	@Test
//	public void testListDbHandler() {
//		System.out.println("testing DBHandler....");
//
//		try {
//			PodmgmtDbHandler podmgmtdbhandler = new PodmgmtDbHandler();
//			List podmgmtUsers = podmgmtdbhandler.listEntity(PodmgmtUser.class);
//			
//			for (Iterator iterator = podmgmtUsers.iterator(); iterator.hasNext();) {
//				PodmgmtUser podmgmtUser = (PodmgmtUser) iterator.next();
//				System.out.print("User Name: " + podmgmtUser.getmUserid());
//				System.out.print("Password: " + podmgmtUser.getmPassword());
//				System.out.print("Email: " + podmgmtUser.getmEmail());
//				System.out.println("Mobile No: " + podmgmtUser.getmMobileNo());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void testListWithWhereDbHandler() {
//		System.out.println("testing DBHandler....");
//
//		try {
//			PodmgmtDbHandler podmgmtdbhandler = new PodmgmtDbHandler();
//			List podmgmtUsers = podmgmtdbhandler.listEntity(PodmgmtUser.class, "where ID=1");
//			
//			for (Iterator iterator = podmgmtUsers.iterator(); iterator.hasNext();) {
//				PodmgmtUser podmgmtUser = (PodmgmtUser) iterator.next();
//				System.out.print("User Name: " + podmgmtUser.getmUserid());
//				System.out.print("Password: " + podmgmtUser.getmPassword());
//				System.out.print("Email: " + podmgmtUser.getmEmail());
//				System.out.println("Mobile No: " + podmgmtUser.getmMobileNo());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test 
//	public void testUpdateByIdDbHandler(){
//			System.out.println("testing DBHandle....");
//			try{
//				PodmgmtDbHandler podmgmtdbhandler = new PodmgmtDbHandler();
//				podmgmtdbhandler.init();
//				
//				List podmgmtusers = podmgmtdbhandler.listEntity(PodmgmtUser.class, "where userid= 'abcd'");
//				int id = GetEntityIdFactory.getId(PodmgmtEnum.PodmgmtUser, podmgmtusers);
//				
//				PodmgmtUser poduser = (PodmgmtUser)podmgmtdbhandler.getById(PodmgmtUser.class, id);
//				poduser.setmPassword("NewPassword1");
//				
//				podmgmtdbhandler.doUpdate(poduser);
//				
//			}catch (Exception e){
//				
//			}
//	}
//	
//	@Test
//	public void testUpdateDbHandler() {
//		System.out.println("testing DBHandler....");
//
//		try {
//			PodmgmtDbHandler podmgmtdbhandler = new PodmgmtDbHandler();
//			
//
//			Query query = podmgmtdbhandler
//					.getQuery("update PodmgmtUser set password = :password where userid=:userid");
//			System.out.println("query" + query);
//			query.setParameter("password",  new String("DIALOG1"));
//			query.setParameter("userid", new String("abcd"));
//			int rowsAffected = query.executeUpdate();
//			if (rowsAffected > 0) {
//				System.out.println(rowsAffected + "(s) were inserted");
//			} else {
//				System.out.println("Record Not inserted : " + rowsAffected);
//			}
//			query.setComment(null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testDeleteDbHandler() {
//		System.out.println("testing DBHandler....");
//
//		try {
//			PodmgmtDbHandler podmgmtdbhandler = new PodmgmtDbHandler();
//			podmgmtdbhandler.init();
//
//			Query query = podmgmtdbhandler.getQuery("delete PodmgmtUser where mUserid=:mUserid");
//			query.setParameter("mUserid", "abcd");
//
//			int rowsAffected = query.executeUpdate();
//			if (rowsAffected > 0) {
//				System.out.println(rowsAffected + "(s) were inserted");
//			} else {
//				System.out.println("Record Not inserted : " + rowsAffected);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testInsertDbHandler() {
//		System.out.println("Inside test insert db Handler");
////		String hql = " insert into PodmgmtUser (mUserid, mPassword, mLastlogin, mMobileNo, mEmail) SELECT firstName, lastName, salary FROM old_employee ('abhishek','kumar','12222','mobile','a@a.com')";
//		PodmgmtUser poduser = new PodmgmtUser();
//		poduser.setmUserid("abhiseh");
//		poduser.setmEmail("dfdfd");
//		poduser.setmLastlogin("43334");
//		poduser.setmPassword("fdfd");
//		poduser.setmMobileNo("e4ere343");
//		
//		try {
//			PodmgmtDbHandler podmgmtdbhandler = new PodmgmtDbHandler();
//			podmgmtdbhandler.init();
//			if (podmgmtdbhandler.doInsert(poduser)) {
//				System.out.println("Record were inserted");
//			} else {
//				System.out.println("Record Not inserted : ");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//	
//	@Test
//	public void testdoRegistration() {
//		System.out.println("Inside test do registration");
////		String hql = " insert into PodmgmtUser (mUserid, mPassword, mLastlogin, mMobileNo, mEmail) SELECT firstName, lastName, salary FROM old_employee ('abhishek','kumar','12222','mobile','a@a.com')";
//		PodmgmtUser poduser = new PodmgmtUser();
//		poduser.setmUserid("Kumar");
//		poduser.setmEmail("a@b.com");
//		poduser.setmLastlogin("43334");
//		poduser.setmPassword("fdfd");
//		poduser.setmMobileNo("e4ere343");
//		
//		PodmgmtUserHandler obj = new PodmgmtUserHandler();
//		System.out.println("do Registration result: " + obj.doUserRegistration(poduser));
//
//	}
//	
//	@Test
//	public void testdoDeleteUser() {
//		System.out.println("Inside test delete user");
//		PodmgmtUserHandler obj = new PodmgmtUserHandler();
//		System.out.println("do Registration result: " + obj.doDeleteUser("abhiseh"));
//	}
//	
//	@Test
//	public void testdoUpdatePassword(){
//		System.out.println("Inside test update password");
//		PodmgmtUserHandler obj = new PodmgmtUserHandler();
//		System.out.println("do Registration result: " + obj.doUpdatePassword("Kumar", "fdfd", "abhi"));
//	}
//	
//	@Test 
//	public void testdoLogin(){
//		System.out.println("Inside test login ");
//		PodmgmtUserHandler obj = new PodmgmtUserHandler();
//		System.out.println("do Registration result: " + obj.doLogin("Kumar", "abhi"));
//	}
//	
//}
