import configuration.SpringConfig;
import model.Product;
import model.ProductType;
import model.product_category.Dishwasher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.JpaService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Dishwasher dishwasher = new Dishwasher();
        dishwasher.setProductName("safsaf");
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
        jpaService.addProductIntoDB(dishwasher);



    }
}
