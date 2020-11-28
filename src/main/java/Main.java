import configuration.SpringConfig;
import model.Address;
import model.Customer;
import model.ProductType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.JpaService;

import java.math.BigDecimal;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        JpaService jpaService = context.getBean(JpaService.class);
        jpaService.addCustomerIntoDB("jan", "kowalski", "asfa@.pl", "123ddd", "POLska",
                "123-23", "krk", "asdae", "3f");
//        jpaService.addProductIntoDB("Samsung 123", 31, new BigDecimal(300), ProductType.PRINTER, new Map<String, String>() {
//        });


    }
}
