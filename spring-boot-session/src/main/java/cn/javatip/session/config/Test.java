package cn.javatip.session.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2021-05-06 22:09
 */
@RestController
public class Test {

    @GetMapping("get")
    public String sessionTest(HttpServletRequest request){

        HttpSession session = request.getSession();
        session.setAttribute("key","value");
        return session.getAttribute("key").toString();
    }
}
