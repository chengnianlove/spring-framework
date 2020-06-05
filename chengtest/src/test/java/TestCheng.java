import cheng.Beans.X;
import cheng.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author create by NianCheng on 2020-06-01 17:16
 */
public class TestCheng {
	@Test
	public void test(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		X x = applicationContext.getBean(X.class);
		System.out.println(x);
		System.out.println("ok");
	}
}
