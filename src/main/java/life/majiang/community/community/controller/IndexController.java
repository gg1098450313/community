package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    /**
     *
     * @return 返回的index就是templates下的index.html
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
