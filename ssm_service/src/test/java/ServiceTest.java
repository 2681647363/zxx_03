import com.zxx.pojo.Items;
import com.zxx.service.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ServiceTest {


    @Test
    public void text(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-service.xml");

        ItemsService bean = context.getBean(ItemsService.class);

        System.out.println(bean.findAll());

    }
}
