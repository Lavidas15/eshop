package model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product_name;

    private BigDecimal price;

    private int quantity;

    private ProductType type;

    @ElementCollection
    @CollectionTable(name = "properties",
            joinColumns = {@JoinColumn(name = "product_id"
//                    ,referencedColumnName = "id"
            )})
    @MapKeyColumn(name = "key")
    @Column(name = "value")
    private Map<String,String> properties;

    @ManyToMany(mappedBy = "products")
    private List<Order> orders;






}
