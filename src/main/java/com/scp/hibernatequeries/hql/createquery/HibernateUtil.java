package com.scp.hibernatequeries.hql.createquery;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory()
	{
		try
		{
			if(sessionFactory == null)
			{
				sessionFactory = new Configuration().configure().buildSessionFactory();
				System.out.println("SessionFactory object created....");
			}
			
			return sessionFactory;
		}
		catch(Throwable ex)
		{
			System.out.println("Failed to create SessionFactroy....");
			ex.printStackTrace();
			System.out.println("Returning null....");
			return sessionFactory;
			
		}
		
	}
	
	public static void closeSessionFactory()
	{
		try
		{
			sessionFactory.close();
			System.out.println("SessionFactory closed....");
		}
		catch(Throwable ex)
		{
			System.out.println("failed to close SessionFactory....");
			ex.printStackTrace();
		}
	}

}
