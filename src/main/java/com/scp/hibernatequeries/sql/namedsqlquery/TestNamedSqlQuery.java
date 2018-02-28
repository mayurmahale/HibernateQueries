package com.scp.hibernatequeries.sql.namedsqlquery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestNamedSqlQuery
{
	public static void main(String[] args)
	{
		
		Employee e1 = new Employee("a", 21, 21000.00);
		Employee e2 = new Employee("b", 22, 22000.00);
		Employee e3 = new Employee("c", 23, 23000.00);
		Employee e4 = new Employee("d", 24, 24000.00);
		Employee e5 = new Employee("e", 25, 25000.00);
		Employee e6 = new Employee("f", 26, 26000.00);
		Employee e7 = new Employee("g", 27, 27000.00);
		Employee e8 = new Employee("h", 28, 28000.00);
		Employee e9 = new Employee("i", 29, 29000.00);
		Employee e10 = new Employee("j", 30, 30000.00);
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(e6);
		session.save(e7);
		session.save(e8);
		session.save(e9);
		session.save(e10);
		
		transaction.commit();
		System.out.println("All employee records inserted into database successfully....");
		session.close();
		
		
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
		/*SQLQuery sqlQuery = session.getNamedSQLQuery("sql_get_emp");
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		
		
		
		SQLQuery sqlQuery = session.getNamedSQLQuery("sql_get_emp_by_id");
		sqlQuery.setParameter("emp_id", new Long(4));
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}
		
		
		
		transaction.commit();
		
		
		
		session.close();
		HibernateUtil.closeSessionFactory();
		
		
	}

}
