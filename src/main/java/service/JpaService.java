package service;

import configuration.JpaConfig;
import model.*;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class JpaService {

    private EntityManager entityManager;

    public JpaService(JpaConfig jpaConfig) {
        entityManager = jpaConfig.getEntityManager();
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

    public void addCustomerIntoDB(String name, String surname, String email, String password,
                                  String country, String zipCode, String city, String street, String buldingNumber) {
        entityManager.getTransaction().begin();
        entityManager.persist(prepareCustomer(name, surname, email, password, country, zipCode, city, street, buldingNumber));
        entityManager.getTransaction().commit();
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
