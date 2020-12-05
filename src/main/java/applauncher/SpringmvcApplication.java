package applauncher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringmvcApplication.class, args);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserService userService = context.getBean(UserService.class);
//        ProductService productService = context.getBean(ProductService.class);
//        userService.addCustomer("jan", "kowalski", "asfa@.pl", "123ddd", "POLska",
//                "123-23", "krk", "asdae", "3f");
//
//        Map<String,String> map = productService.preparePropertiesMapForDishwasher("40cm x 30cm x 60cm", "black", "40, 60, 75", "A++",
//                "60L", "45kg", "24m", "Samsung");
//        productService.addProductToDB("Samsung 123", 31, new BigDecimal(300), ProductType.PRINTER, map);
////        jpaService.addProductToDB("Samsung 123", 31, new BigDecimal(300), ProductType.PRINTER);
////        jpaService.addProductToDB("Samsung 123", 31, new BigDecimal(300), ProductType.PRINTER);
//
//
//
  }
}
