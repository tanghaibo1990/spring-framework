import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PeopleDaoAnotherProxy implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("StartTime=[" + System.currentTimeMillis() + "]");
		methodProxy.invokeSuper(o, objects);
		System.out.println("EndTime=[" + System.currentTimeMillis() + "]");
		return o;
	}
}
