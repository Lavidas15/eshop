package service;

import configuration.JpaConfig;
import model.Address;
import model.Customer;
import model.Product;
import model.ProductType;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JpaService {

    private EntityManager entityManager;

    public JpaService(JpaConfig jpaConfig) {
        entityManager = jpaConfig.getEntityManager();
    }

//    public void addProductIntoDB(Product product) {
//        entityManager.getTransaction().begin();
//        entityManager.persist(product);
//        entityManager.getTransaction().commit();
//    }



    public void addCustomerIntoDB(String name, String surname, String email, String password,
                                  String country, String zipCode, String city, String street, String buldingNumber) {
        entityManager.getTransaction().begin();
        entityManager.persist(prepareCustomer(name, surname, email, password, country, zipCode, city, street, buldingNumber));
        entityManager.getTransaction().commit();
    }

    public Address prepareAddress(String country, String zipCode, String city, String street, String buldingNumber){
        Address address = new Address();
        address.setCountry(country);
        address.setZipCode(zipCode);
        address.setCity(city);
        address.setStreet(street);
        address.setBuldingNumber(buldingNumber);

        return address;
    }


    public Customer prepareCustomer(String name, String surname, String email, String password,
                                    String country, String zipCode, String city, String street, String buldingNumber){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setSurname(surname);
        customer.setEmail(email);
        customer.setPassword(password);
        customer.setAdmin(false);
        customer.setAddress(prepareAddress(country, zipCode, city, street, buldingNumber));

        return customer;
    }

        public void addProductIntoDB(String productName, int quantity, BigDecimal price, ProductType type, Map<String,String> properties) {
        entityManager.getTransaction().begin();
        entityManager.persist(prepareProduct(productName, quantity, price, type));
        entityManager.getTransaction().commit();
    }

    public Map preparePropertiesMap(){
        Map<String, String> map = new HashMap<String, String>()
        {
            {
                put("key1", "value1");
                put("key2", "value2");
            }
        };
        return map;
    }


    public Product prepareProduct(String productName, int quantity, BigDecimal price, ProductType type ){
        Product product = new Product();
        product.setProduct_name(productName);
        product.setQuantity(quantity);
        product.setPrice(price);
        product.setType(type);
        product.setProperties(preparePropertiesMap());
        return product;
    }






}
