package cheng.config;

import cheng.Beans.X;
import cheng.Beans.Y;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author create by NianCheng on 2020-06-01 17:12
 */
@Configuration
@Component
public class MyConfig {
	@Bean
	public X getX(){
		return new X();
	}

	@Bean
	public Y getY(){
		return new Y();
	}
}
