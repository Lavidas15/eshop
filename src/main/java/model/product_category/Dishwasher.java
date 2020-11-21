package model.product_category;


import model.Product;
import model.ProductType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "dishwasher")
public class Dishwasher extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    private BigDecimal price;

    private float discount;

    private ProductType type;

    private String dimensions;

    private String colour;

    private String temperatures;

    private boolean display;

    @Column(name = "half_load")
    private boolean halfLoad;

    @Column(name = "built_in")
    private boolean builtIn;

    @Column(name = "energetic_class")
    private String energeticClass;

    private float capacity;

    private float weight;

    private String equipment;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(String temperatures) {
        this.temperatures = temperatures;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public boolean isHalfLoad() {
        return halfLoad;
    }

    public void setHalfLoad(boolean halfLoad) {
        this.halfLoad = halfLoad;
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    public String getEnergeticClass() {
        return energeticClass;
    }

    public void setEnergeticClass(String energeticClass) {
        this.energeticClass = energeticClass;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}



