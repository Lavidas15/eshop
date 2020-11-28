import configuration.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.JpaService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        JpaService jpaService = context.getBean(JpaService.class);




    }
}
