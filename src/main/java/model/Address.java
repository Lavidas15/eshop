package model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    @Column(name = "zip_code")
    private String zipCode;

    private String city;

    private String street;

    @Column(name = "bulding_number")
    private String buldingNumber;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuldingNumber() {
        return buldingNumber;
    }

    public void setBuldingNumber(String buldingNumber) {
        this.buldingNumber = buldingNumber;
    }
}
