package lk.ijse;

import lk.ijse.Entity.Customer;
import lk.ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

/*
      Query query =  session.createQuery("from Customer");
        List<Customer> customerlist = query.list();
        for (Customer customer : customerlist){
            System.out.println(customer.getId());
        }


        Query query =  session.createQuery("from Customer where id = 1");
        List<Customer> customerlist = query.list();
        for (Customer customer : customerlist){
            System.out.println(customer.getId());
        }

        Query query1 =  session.createQuery("from Customer where id = (?,?)");
        query1.setParameter(1,2);
        List<Customer> customerlist = query1.list();
        for (Customer customer : customerlist){
            System.out.println(customer.getId());
        }*/
        /* --------------------------------------------------------------------------------*/


        /*HQL does not have direct insert query*/
/*
       NativeQuery query = session.createNativeQuery("INSERT INTO Customer (id, name) VALUES (:1,:2)");
        query.setParameter("1", 4);
        query.setParameter("2", "Vishan_4");
        query.executeUpdate();


        /* --------------------------------------------------------------------------------*/


        /*update*//*

        Query query = session.createQuery("UPDATE Customer SET name = :name WHERE id = :id");
        query.setParameter("name","halaya");
        query.setParameter("id",5);
        query.executeUpdate();



        /* --------------------------------------------------------------------------------*/
//        delete

       /* Query query = session.createQuery("DELETE FROM Customer where id =:id");
        query.setParameter("id",3);
        query.executeUpdate();
*/
        /* --------------------------------------------------------------------------------*/

        /* search*/

        /*select one column*/
       /* Query query = session.createQuery("SELECT c.id, c.name FROM Customer c WHERE c.id = :id");
        query.setParameter("id", 1);
        List<Object[]> results = query.list();

        for (Object[] result : results) {
            Integer id = (Integer) result[0];
            String name = (String) result[1];

            System.out.println("Student no: " + id + ", Name: " + name);
        }*/

        /* -----------------------select all column---------------------------------------------------------*/

       /* Query query = session.createQuery("select c.id ,c.name from Customer c");
        List<Object[]> result = query.list();

        for (Object[] result1 : result) {
            Integer id = (Integer) result1[0];
            String name = (String) result1[1];

            System.out.println("customer id: " + id + ", Name: " + name );


        }*/


        transaction.commit();
        session.close();


    }
}