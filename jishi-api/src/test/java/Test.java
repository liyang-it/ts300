import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

/**
 * <h2></h2>
 * <p>
 *
 * </p>
 *
 * @author Evan
 * @since 2022年04月20日 17:53
 */
@SpringBootTest
public class Test {
    @org.junit.Test
    public void  test(){
        Random r = new Random();
        for(int i = 0; i < 50; i ++){
            System.out.println(r.nextInt());
        }
    }
}
