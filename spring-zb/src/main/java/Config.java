import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description: java类作用描述
 * @Author: zhangbing
 * @CreateDate: 2019/12/9 14:48
 */
@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy = true) //底层是@Import注解
@ComponentScan(basePackages = {"com.zb.study"})
public class Config {

}
