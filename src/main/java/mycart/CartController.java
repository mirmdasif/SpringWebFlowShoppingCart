package mycart;

/**
 * @author asif.hossain
 * @since 1/20/15
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {

    @RequestMapping("/home.do")
    public void doHome() {
    }
}
