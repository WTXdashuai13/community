package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//自动识别扫描当前类，把它作为Spring的一个bean，并将它作为一个controller，允许这个类去接收前端的请求
public class HelloController {
    @GetMapping("/hello")
public String hello(@RequestParam(name="name") String name, Model model){//name指定key，String 指定value，Model使得呈现在网页上
        //没有把我们浏览记录传过来的这个值去放到我们的model里，所以它也不会传到下文去
        model.addAttribute("name",name);//"name"是key，name是value
        return "hello"; //自动去找src.main.resources.templates中找hello.html这个模板


    }
}
