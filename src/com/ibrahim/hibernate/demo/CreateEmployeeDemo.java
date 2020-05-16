package com.ibrahim.hibernate.demo;

import com.ibrahim.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateEmployeeDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            // create object to hold data
            Employee tempEmployee = new Employee("Toye", "Jimoh", "Apple");

            // begin transaction
            session.beginTransaction();

            // save object
            session.save(tempEmployee);

            //commit transaction
            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
