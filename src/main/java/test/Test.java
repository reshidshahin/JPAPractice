package test;

import model.Contact;
import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction entityTransaction = manager.getTransaction();


        User user = new User("Shahin","Rashidbayli",25,"800",new Contact("reshidshahin@gmail.com","055555555"));

        entityTransaction.begin();
        manager.persist(user);
        entityTransaction.commit();



    }
}
