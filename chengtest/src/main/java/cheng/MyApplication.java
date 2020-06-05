package cheng;

import cheng.Beans.X;
import cheng.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author create by NianCheng on 2020-06-01 17:11
 */
public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//		context.refresh();
		X x = context.getBean(X.class);
		System.out.println(x);
	}
}
