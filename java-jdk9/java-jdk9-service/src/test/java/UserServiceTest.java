import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.user.User;
import org.junit.Test;

public class UserServiceTest {



    @Test
    public  void test(){
        UserService userService = new UserServiceImpl();
        User user = new User();
        user.setUserName("user zhangsan");
        userService.save(user);
    }
}
