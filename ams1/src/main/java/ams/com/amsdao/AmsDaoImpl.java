package ams.com.amsdao;

import java.util.List;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ams.com.pojo.UserInfo;

@Repository
public class AmsDaoImpl implements AmsDao {
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Autowired
	private SessionFactory sessionFactory;
	public List getUserList() {
		Session sesion = sessionFactory.openSession();
		List list = sesion.createCriteria(UserInfo.class).list();
		sesion.close();
		return list;
	}
	public void saveUser(UserInfo userInfo) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(userInfo);
		tx.commit();
		session.close();
	}
	
	
}
