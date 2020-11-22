package model.product_category;

import model.ProductType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "washing_machine")
public class WashingMachine {

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

    @Column(name = "max_speed")
    private int maxSpeed;

    private boolean display;

    private float capacity;

    private float weight;

    private String equipment;

}
