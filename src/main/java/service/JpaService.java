package service;

import configuration.JpaConfig;
import model.Product;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class JpaService {

    private EntityManager entityManager;

    public JpaService(JpaConfig jpaConfig) {
        entityManager = jpaConfig.getEntityManager();
    }

    public void addProductIntoDB(Product product) {
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
    }
}
