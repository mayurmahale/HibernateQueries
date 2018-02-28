package com.scp.hibernatequeries.hql.createquery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestCreateQuery {

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
		
		
		
		transaction = session.beginTransaction();
		
		
		/*select clause-
		 String hqlQuery = "from Employee";
		//List<Employee> employees = session.createQuery(hqlQuery).list();
		Query query = session.createQuery(hqlQuery);
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
		
		
		
		/*//where clause-
		String hqlQuery = "from Employee e where e.empId > 5";
		Query query = session.createQuery(hqlQuery);
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
		
		
		
		
		/*//order by clause-
		String hqlQuery = "from Employee e where e.empId > 5 order by e.empSalary desc";
		Query query = session.createQuery(hqlQuery);
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
		
		
		
		/*//order by clause with more than one property-
		String hqlQuery = "from Employee e where e.empId > 5 order by e.empName desc , e.empSalary desc";
		Query query = session.createQuery(hqlQuery);
		List<Employee> empList = query.list();
		
		for(Employee employee : empList)
		{
			System.out.println(employee);
		}
		
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		
		/*//group by clause-
		String hqlQuery = "select sum(e.empSalary), e.empName from Employee e group by e.empName";
		Query query = session.createQuery(hqlQuery);
		//List<Employee> empList = query.list();
		
		for(Iterator it = query.iterate(); it.hasNext();)
		{
			Object[] emp = (Object[]) it.next();
			System.out.println(emp[0]);
			System.out.println(emp[1]);
		}*/
		
		
		
		/*//Using Named Parameters
		
		String hqlQuery = "from Employee e where e.empId = :emp_id";
		Query query = session.createQuery(hqlQuery);
		//query.setLong("emp_id", 4);
		//??query.setLong(1, 4);    not working
		query.setParameter("emp_id",new Long(4));
		//??query.setParameter(0, new Long(4));    not working
		List<Employee> empList = query.list();
		for(Employee employee : empList)
		{
			System.out.println(employee);
		}
		
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		
		
		/*//update clause
		String hqlQuery = "update Employee set empSalary = :emp_salary where empId = :emp_id";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("emp_salary", new Double(60000.00));
		query.setParameter("emp_id", new Long(2));
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
		
		
		
		/*//delete clause
		String hqlQuery = "delete from Employee where empId = :emp_id";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("emp_id", new Long(2));
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
		
		
		
		
		//Pagination using Query
		 String hqlQuery = "from Employee";
		 Query query = session.createQuery(hqlQuery);
		 query.setFirstResult(1);
		 query.setMaxResults(7);
		 //It will display the record from 2nd to 8th record.
		 List<Employee> empList = query.list();
		 for(Employee employee: empList)
		 {
			System.out.println(employee);
		 }
			
		 Iterator<Employee> itr = empList.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
		
		
		
		transaction.commit();
		
		
		
		session.close();
		HibernateUtil.closeSessionFactory();
		
		
	}
}
