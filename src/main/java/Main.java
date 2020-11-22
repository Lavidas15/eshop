import configuration.SpringConfig;
import model.Product;
import model.ProductType;
import model.product_category.Cooker;
import model.product_category.Dishwasher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.JpaService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Dishwasher dishwasher = new Dishwasher();
        dishwasher.setProductName("safsaf");
        dishwasher.setQuantity(30);
        dishwasher.setPrice(new BigDecimal(12));
        dishwasher.setDiscount(1);
        dishwasher.setType(ProductType.DISHWASHER);
        dishwasher.setDimensions("60x70x100");
        dishwasher.setColour("black");
        dishwasher.setTemperatures("50 70 85");
        dishwasher.setHalfLoad(true);
        dishwasher.setBuiltIn(false);
        dishwasher.setEnergeticClass("B+");
        dishwasher.setCapacity(14.2f);
        dishwasher.setWeight(14.4f);
        dishwasher.setEquipment("wszystko co można sobie wymarzyć");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        JpaService jpaService = context.getBean(JpaService.class);
//        jpaService.addProductIntoDB(dishwasher);

        Cooker cooker = new Cooker();
        cooker.setProductName("a");
        cooker.setQuantity(14);
        cooker.setPrice(new BigDecimal(700));
        cooker.setDiscount(1);
        cooker.setType(ProductType.COOKER);
        cooker.setDimensions("60x50x80");
        cooker.setColour("red");
        jpaService.addProductIntoDB(cooker);



    }
}
