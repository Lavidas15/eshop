package model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private BigDecimal price;

    private int quantity;

    private ProductType type;

    @ElementCollection
    @CollectionTable(name = "properties",
            joinColumns = {@JoinColumn(name = "product_id"
                    ,referencedColumnName = "id"
            )})
    @MapKeyColumn(name = "key")
    @Column(name = "value")
    private Map<String,String> properties;

    @ManyToMany(mappedBy = "products")
    private List<Order> orders;

    public String getProduct_name() {
        return productName;
    }

    public void setProduct_name(String product_name) {
        this.productName = product_name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
