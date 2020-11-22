package model.product_category;

import model.Product;
import model.ProductType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "gramophone")
public class Gramophone extends Product {
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

    private String drive;

    private String speeds;

    @Column(name = "aux_input")
    private boolean auxInput;

    @Column(name = "rca_output")
    private boolean rcaOutput;

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

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getSpeeds() {
        return speeds;
    }

    public void setSpeeds(String speeds) {
        this.speeds = speeds;
    }

    public boolean isAuxInput() {
        return auxInput;
    }

    public void setAuxInput(boolean auxInput) {
        this.auxInput = auxInput;
    }

    public boolean isRcaOutput() {
        return rcaOutput;
    }

    public void setRcaOutput(boolean rcaOutput) {
        this.rcaOutput = rcaOutput;
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
