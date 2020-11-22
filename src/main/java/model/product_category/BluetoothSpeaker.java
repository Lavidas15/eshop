package model.product_category;

import model.Product;
import model.ProductType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "bluetooth_speaker")
public class BluetoothSpeaker extends Product {

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

    private int power;

    @Column(name = "charging_conector")
    private String chargingConector;

    @Column(name = "aux_input")
    private boolean auxInput;

    @Column(name = "work_time")
    private float workTime;

    @Column(name = "dust_water_resistance")
    private String dustAndWaterResistance;

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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getChargingConector() {
        return chargingConector;
    }

    public void setChargingConector(String chargingConector) {
        this.chargingConector = chargingConector;
    }

    public boolean isAuxInput() {
        return auxInput;
    }

    public void setAuxInput(boolean auxInput) {
        this.auxInput = auxInput;
    }

    public float getWorkTime() {
        return workTime;
    }

    public void setWorkTime(float workTime) {
        this.workTime = workTime;
    }

    public String getDustAndWaterResistance() {
        return dustAndWaterResistance;
    }

    public void setDustAndWaterResistance(String dustAndWaterResistance) {
        this.dustAndWaterResistance = dustAndWaterResistance;
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
