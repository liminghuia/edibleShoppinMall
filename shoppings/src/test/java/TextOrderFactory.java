import com.shoppings.util.OrderCodeFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TextOrderFactory {

    @Test
    public void textOrder(){
             int i = 20;
             long l = 20;
        String orderCode = OrderCodeFactory.getOrderCode(i);
        System.out.println(orderCode);


    }

}
