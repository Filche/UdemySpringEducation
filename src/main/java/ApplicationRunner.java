import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // clazz -> String -> Map<String, Object>
        ConnectionPool pool1 = context.getBean("pool1", ConnectionPool.class);
        System.out.println(pool1);
        CompanyRepository companyRepository = context.getBean("companyRepository", CompanyRepository.class);
    }
}
