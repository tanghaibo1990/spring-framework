import org.springframework.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class PeopleDaoFilter implements CallbackFilter {
	@Override
	public int accept(Method method) {
		if ("select".equals(method.getName())) {
			return 0;
		}
		return 1;
	}
}
