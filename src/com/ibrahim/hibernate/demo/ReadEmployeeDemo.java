package com.ibrahim.hibernate.demo;

import com.ibrahim.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class ReadEmployeeDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try (factory) {
            Session session = factory.getCurrentSession();


            // begin transaction
            session.beginTransaction();

            // save object
            List<Employee> theEmployees = session.createQuery("from Employee").getResultList();

            for (Employee employee : theEmployees) {
                System.out.println(employee.toString());
            }

            //commit transaction
            session.getTransaction().commit();

        }

    }
}
