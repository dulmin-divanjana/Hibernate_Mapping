package lk.ijse;

import config.FactoryConfiguration;
import entity.Laptop;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    Session session = FactoryConfiguration.getInstance().getSession();
    Transaction transaction= session.beginTransaction();
    Transaction transaction=session.beginTransaction();

    Laptop laptop=new Laptop();
}