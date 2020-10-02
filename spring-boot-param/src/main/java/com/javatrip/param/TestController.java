package com.javatrip.param;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-08-17 10:59
 */
@RestController
@RequestMapping("param")
public class TestController {

    @GetMapping("{id}")
    public String getPathVariable(@PathVariable String id){
        return "id="+id;
    }

    @GetMapping("getParam")
    public String getRequestParam(@RequestParam("myId") String id){
        return "id="+id;
    }

    @GetMapping("getString")
    public String getString(String id){
        return "id="+id;
    }

    @GetMapping("getRequest")
    public String getRequest(HttpServletRequest request){
        String id = request.getParameter("id");
        return "id="+id;
    }

    @PostMapping("getBody")
    public String getBody(@RequestBody String id){
        return "id="+id;
    }

    @PostMapping("getHeader")
    public String getHeader(@RequestHeader String id){
        return "id="+id;
    }
}
