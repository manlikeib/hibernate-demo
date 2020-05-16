package com.ibrahim.hibernate.demo;

import com.ibrahim.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployeeDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Employee tempEmployee = session.get(Employee.class, 3);
            session.delete(tempEmployee);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }


}
