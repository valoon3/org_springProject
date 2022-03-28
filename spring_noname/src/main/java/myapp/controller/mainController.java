package myapp.controller;

import myapp.dao.TestDao;
import myapp.dto.Dto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class mainController {

    @Autowired
    TestDao testDao;


    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index(Model model) {

        List<Dto> list = testDao.select();
        System.out.println(list.get(0).getAge());
        System.out.println(list.get(1).getAge());
        model.addAttribute("list", list);

        return "index";
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test";
    }


}
