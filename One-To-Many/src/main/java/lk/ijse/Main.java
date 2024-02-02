package lk.ijse;

import config.FactoryConfiguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    Laptop laptop=new Laptop();

    Student student=new Student();

    Laptop laptop=new Laptop();


    Session session= FactoryConfiguration.getInstance().getSession();
    Transaction transaction=session.beginTransaction();

    transaction commit();
    Session.close();





}