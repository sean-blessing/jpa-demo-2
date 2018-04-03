package com.test.jpademo.business;

import javax.persistence.EntityManager;

import com.test.jpademo.db.DBUtil;

public class UserDB {
	public static User getUserById(int userID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			User user = em.find(User.class, userID);
			
			return user;
		}
		finally {
			em.close();
			DBUtil.closeEMF();
		}
		
	}
}
