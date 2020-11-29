import configuration.SpringConfig;
import model.Address;
import model.Customer;
import model.ProductType;
import model.Status;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.JpaService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        JpaService jpaService = context.getBean(JpaService.class);
        jpaService.addCustomerIntoDB("jan", "kowalski", "asfa@.pl", "123ddd", "POLska",
                "123-23", "krk", "asdae", "3f");

        Map<String,String> map = jpaService.preparePropertiesMapForDishwasher("40cm x 30cm x 60cm", "black", "40, 60, 75", "A++",
                "60L", "45kg", "24m", "Samsung");
//
//        jpaService.addMapToDatabase(map);

        jpaService.addProductToDB("Samsung 123", 31, new BigDecimal(300), ProductType.PRINTER, map);
//        jpaService.addProductToDB("Samsung 123", 31, new BigDecimal(300), ProductType.PRINTER);
//        jpaService.addProductToDB("Samsung 123", 31, new BigDecimal(300), ProductType.PRINTER);



    }
}
