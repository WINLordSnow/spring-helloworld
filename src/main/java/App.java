import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanH1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanH2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanH1 == beanH2);

        Cat beanCat1 = (Cat) applicationContext.getBean("MyCat");
        Cat beanCat2 = (Cat) applicationContext.getBean("MyCat");
        System.out.println(beanCat1 == beanCat2);

        System.out.println(beanH1.getMessage());
        System.out.println(beanCat1.getName());
    }
}