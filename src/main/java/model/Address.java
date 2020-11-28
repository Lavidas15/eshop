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

}
