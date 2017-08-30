package com.lotus.web.controller;

import com.lotus.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */
@Controller
public class DemoController {

    @GetMapping("/demo")
    public String demo(ModelMap map, HttpSession session) {

        map.put("now", new Date());
        map.put("message", "<b>Welcome to BeiJing!</b>");
        List<String> cities = new ArrayList<String>();
        cities.add("北京");
        cities.add("上海");
        cities.add("深圳");
        cities.add("广州");
        map.put("cities", cities);
        map.put("location", "ShenZhen");

        session.setAttribute("user", new User("Kobe", "Male", 35));

        return "demo";
    }
}
