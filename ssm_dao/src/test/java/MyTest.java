import com.zxx.pojo.Items;
import com.zxx.dao.ItemsMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    /*@Test
    public void testDao() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsMapper itemsMapper = applicationContext.getBean("itemsMapper", ItemsMapper.class);
        System.out.println("商品列表：：："+itemsMapper.findAll());

        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsMapper.save(items);
    }*/
}
