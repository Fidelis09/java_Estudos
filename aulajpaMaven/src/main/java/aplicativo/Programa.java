package aplicativo;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 1);

        System.out.println(p);

        System.out.println("Pronto!");
        em.close();
/*
        Pessoa p1 = new Pessoa("Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa("Maria da Cruz", "maria@gmail.com");
        Pessoa p3 = new Pessoa("João da Silva", "joao@gmail.com");

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

 */
    }
}
