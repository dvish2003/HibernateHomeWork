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

        //SELECT------------------------------------------------

              /*  Query query = session.createQuery("select c from Customer c");
                List<Customer> cuList = query.getResultList();

                for (Customer customer : cuList){
                    System.out.println(customer.getId() + customer.getName() );
                }*/

        //UPDATE--------------------------------------------------------

   /*     Query query1 = session.createQuery("update Customer  c set  c.name = :name  where c.id = :Id");

        query1.setParameter("name","sanduni");
        query1.setParameter("Id",2);
        query1.executeUpdate();
*/

        //DELETE-------------------------------------------------------

     /*   Query query2 = session.createQuery("delete from Customer c where c.id = :Id");
        query2.setParameter("Id",2);
        query2.executeUpdate();
*/

        //SEARCH BY ID----------------------------------------------------

   /*     Query query3 = session.createQuery("select s from Customer s where s.no = :Id");
        query3.setParameter("Id",3);
        List<Customer> stList = query3.getResultList();

        for (Customer customer: stList){
            System.out.println(customer.getId());
        }
*/


    }
}