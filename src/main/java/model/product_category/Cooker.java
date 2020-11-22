package model.product_category;


import model.Product;
import model.ProductType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cooker")
public class Cooker extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    private int quantity;

    private BigDecimal price;

    private float discount;

    private ProductType type;

    private String dimensions;

    private String colour;

    @Column(name = "energetic_class")
    private String energeticClass;

    private int hotplates;

    @Column(name = "oven_type")
    private String ovenType;

    @Column(name = "oven_capacity")
    private float ovenCapacity;

    private float weight;

    private String equipment;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getEnergeticClass() {
        return energeticClass;
    }

    public void setEnergeticClass(String energeticClass) {
        this.energeticClass = energeticClass;
    }

    public int getHotplates() {
        return hotplates;
    }

    public void setHotplates(int hotplates) {
        this.hotplates = hotplates;
    }

    public String getOvenType() {
        return ovenType;
    }

    public void setOvenType(String ovenType) {
        this.ovenType = ovenType;
    }

    public float getOvenCapacity() {
        return ovenCapacity;
    }

    public void setOvenCapacity(float ovenCapacity) {
        this.ovenCapacity = ovenCapacity;
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
