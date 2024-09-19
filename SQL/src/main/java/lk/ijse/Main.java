package lk.ijse;


import lk.ijse.Entity.Address;
import lk.ijse.Entity.Customer;
import lk.ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

         NativeQuery query =session.createNativeQuery("select * from Customer");
        query.addEntity(Customer.class);
        List<Customer> list = query.getResultList();
        for (Customer customer : list){
            System.out.println(customer.getId());
        }

/*
         insert--------------------------------------------------------------------------------------

        NativeQuery query1 = session.createNativeQuery("INSERT INTO Customer (id,name) VALUES (?1, ?2)");
        query1.setParameter(1, 1);
        query1.setParameter(2, "Vishan");
        query1.executeUpdate();
*/

 /*     update-----------------------------------------------------------------------------------

         NativeQuery query1 = session.createNativeQuery("UPDATE Customer SET name = ?1 WHERE id = ?2");
         query1.setParameter(1, "Vish");
         query1.setParameter(2,1);
         query1.executeUpdate();
*/

/*

         delete-----------------------------------------------------------------------------------

         NativeQuery query = session.createNativeQuery("DELETE FROM Customer WHERE no = ?1");
         query.setParameter(1, 1);
         query.executeUpdate();



         search-----------------------------------------------------------------------------------

         NativeQuery query = session.createNativeQuery("SELECT * FROM Customer WHERE name = ?1", Customer.class);
         query.setParameter(1, "Vish");
         List<Customer> list = query.getResultList();
         for (Customer cuList : list) {
            System.out.println(cuList.getNo() + " " + cuList.getName() + " " + cuList.getMarks());
         }




        joinQuery-----------------------------------------------------------------------------------------

        Query query = session.createQuery("SELECT c.id, s.name  FROM Customer c INNER JOIN Address a ON s.no = a.id");
        List<Object[]> results = query.list();
        for (Object[] result : results) {
            Integer addressID = (Integer) result[0];
            String AddressStreet = (String) result[1];
            String AddressCity = (String) result[2];

            System.out.println(addressID + " " + AddressCity );
        }
*/

        transaction.commit();
        session.close();
    }
}