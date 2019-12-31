import com.zb.study.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-10 11:58
 **/
public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		String[] beanDefinitionNames = configApplicationContext.getBeanDefinitionNames();
		CarService carService = (CarService) configApplicationContext.getBean("carServiceImpl");
		carService.getCar("奔驰");
		configApplicationContext.close();

	}
}
