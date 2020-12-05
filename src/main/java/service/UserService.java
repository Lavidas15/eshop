package service;

import configuration.JpaConfig;
import model.Address;
import model.Customer;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class UserService {

    private EntityManager entityManager;

    public UserService(JpaConfig jpaConfig) {
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

    public void addCustomer(String name, String surname, String email, String password,
                                  String country, String zipCode, String city, String street, String buldingNumber) {
        entityManager.getTransaction().begin();
        entityManager.persist(prepareCustomer(name, surname, email, password, country, zipCode, city, street, buldingNumber));
        entityManager.getTransaction().commit();
    }
}
