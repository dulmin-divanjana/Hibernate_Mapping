package lk.ijse;

import config.FactoryConfiguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Laptop laptop=new Laptop();
        laptop.setId(1);
        laptop.setModel("Asus");

        Student student=new Student();
        student.setId(1);
        student.setName("Dulmin");
        student.setAddress("Panadura");

       Session session = FactoryConfiguration.getInstance().getSession();
       Transaction transaction= session.beginTransaction();

        session.save(student);
        session.save(laptop);

                transaction.commit();
                session.close();
    }
}