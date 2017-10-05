package my;

import org.hibernate.Session;
import my.HibernateUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Maven+ HBM + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        DBUser dbUser = new DBUser();



        session.save(dbUser);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
