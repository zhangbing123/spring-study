import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description: java类作用描述
 * @Author: wangzx
 * @CreateDate: 2019/12/9 14:48
 */
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.zb.study"})
@Configuration
public class Config {

}
