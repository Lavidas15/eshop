package service;

import configuration.JpaConfig;
import model.Product;
import model.ProductType;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    private EntityManager entityManager;

    public ProductService(JpaConfig jpaConfig) {
        entityManager = jpaConfig.getEntityManager();
    }

    public Product prepareProduct(String productName, int quantity, BigDecimal price, ProductType type, Map<String, String> map ){
        Product product = new Product();
        product.setProductName(productName);
        product.setQuantity(quantity);
        product.setPrice(price);
        product.setType(type);
        product.setProperties(map);
        return product;
    }

    public void addProductToDB(String productName, int quantity, BigDecimal price, ProductType type, Map<String, String> map ) {
        entityManager.getTransaction().begin();
        entityManager.persist(prepareProduct(productName, quantity, price, type, map));
        entityManager.getTransaction().commit();
    }

    public Map preparePropertiesMapForDishwasher(String dimensions, String colour, String temperatures, String energeticClass,
                                                 String capacity, String weight, String warranty, String producer){
        Map<String, String> map = new HashMap<String, String>()
        {
            {
                put("dimensions", dimensions);
                put("colour", colour);
                put("temperatures", temperatures);
                put("energetic_class", energeticClass);
                put("capacity", capacity);
                put("weighr", weight);
                put("warranty", warranty);
                put("producer", producer);

            }
        };
        return map;
    }
    
}
