import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-10 11:58
 **/
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		String[] beanDefinitionNames = configApplicationContext.getBeanDefinitionNames();
		Object carDao = configApplicationContext.getBean("carDao");
		System.out.println(carDao);
		configApplicationContext.close();
	}
}
