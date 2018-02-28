package com.scp.hibernatequeries.sql.createsqlquery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.hibernatequeries.sql.createsqlquery.Employee;
import com.scp.hibernatequeries.sql.createsqlquery.HibernateUtil;

public class TestCreateSqlQuery
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
		
		
		//select clause-
		/* String hqlQuery = "select * from Employee";
		//List<Employee> employees = session.createSQLQuery(hqlQuery).list();
		 SQLQuery sqlQuery = session.createSQLQuery(hqlQuery);
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		 
		
		
		//where clause-
		/*String hqlQuery = "select * from employee e where e.emp_id > 5";
		SQLQuery sqlQuery = session.createSQLQuery(hqlQuery);
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		
		
		
		
		//order by clause-
		/*String hqlQuery = "select * from employee e where e.emp_id > 5 order by e.emp_salary desc";
		SQLQuery sqlQuery = session.createSQLQuery(hqlQuery);
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		
		
		//order by clause with more than one property-
		/*String hqlQuery = "select * from employee e where e.emp_id > 5 order by e.emp_name desc , e.emp_salary desc";
		SQLQuery sqlQuery = session.createSQLQuery(hqlQuery);
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		
		
		//group by clause-
		/*String hqlQuery = "select sum(e.emp_salary), e.emp_name from employee e group by e.emp_name";
		SQLQuery sqlQuery = session.createSQLQuery(hqlQuery);
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		
		
		//Using Named Parameters
		/*String hqlQuery = "select * from employee e where e.emp_id = :emp_id";
		SQLQuery sqlQuery = session.createSQLQuery(hqlQuery);
		//query.setLong("emp_id", 4);
		//??query.setLong(1, 4);    not working
		sqlQuery.setParameter("emp_id",new Long(4));
		//??query.setParameter(0, new Long(4));    not working
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		
		
		
		//update clause
		/*String hqlQuery = "update Employee set emp_salary = :emp_salary where emp_id = :emp_id";
		SQLQuery sqlQuery = session.createSQLQuery(hqlQuery);
		sqlQuery.setParameter("emp_salary", new Double(60000.00));
		sqlQuery.setParameter("emp_id", new Long(2));
		int result = sqlQuery.executeUpdate();
		session.flush();
		
		System.out.println(result + " row(s) affected....");
		
		sqlQuery = session.createSQLQuery("select * from employee");
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		
		
		
		
		/*//insert clause-   not working
		String hqlQuery = "insert into Employee(empName, age, empsalary) select e.empName, e.age, e.empsalary from Employee e where e.empId=:emp_id";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("emp_id", 3);
		int result = query.executeUpdate();
		
		System.out.println(result + " row(s) affected....");
		
		query = session.createQuery("from Employee");
		
		List<Employee> empList = query.list();
		
		for(Employee employee: empList)
		{
			System.out.println(employee);
		}
		
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		
		
		//delete clause
		/*String query = "delete from employee where emp_id = :emp_id";
		SQLQuery sqlQuery = session.createSQLQuery(query);
		sqlQuery.setParameter("emp_id", new Long(2));
		int result = sqlQuery.executeUpdate();
		session.flush();
		
		System.out.println(result + " row(s) affected....");
		
		sqlQuery = session.createSQLQuery("select * from employee");
		
		List<Object[]> empLists = sqlQuery.list();
		for(Object[] empList : empLists)
		{
			for(Object emp :empList)
			{
				System.out.print(emp);
			}
			System.out.println();
		}*/
		
		
		
		
		//Pagination using SQLQuery
		 String query = "select * from employee";
		 SQLQuery sqlQuery = session.createSQLQuery(query);
		 sqlQuery.setFirstResult(1);
		 sqlQuery.setMaxResults(7);
		 //It will display the record from 2nd to 8th record.
		 
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
