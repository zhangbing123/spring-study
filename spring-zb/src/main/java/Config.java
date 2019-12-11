import com.zb.study.dao.CarDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: java类作用描述
 * @Author: wangzx
 * @CreateDate: 2019/12/9 14:48
 */
@ComponentScan(basePackages = {"com.zb.study"})
@Configuration
public class Config {

	@Bean
	public CarDao carDao() {
		return new CarDao();
	}
}
