import org.junit.Test;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class CglibTest {

	@Test
	public void testCglib() {

		PeopleDaoProxy daoProxy = new PeopleDaoProxy();
		PeopleDaoAnotherProxy daoAnotherProxy = new PeopleDaoAnotherProxy();

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(PeopleDao.class);
		enhancer.setCallbacks(new Callback[]{daoProxy, daoAnotherProxy, NoOp.INSTANCE});
		enhancer.setCallbackFilter(new PeopleDaoFilter());

		PeopleDao dao = (PeopleDao)enhancer.create();
		dao.update();
		dao.select();
	}
}
