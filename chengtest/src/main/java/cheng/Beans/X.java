package cheng.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author create by NianCheng on 2020-06-01 17:13
 */
@Component
public class X {
	@Autowired
	private Y y;
}
