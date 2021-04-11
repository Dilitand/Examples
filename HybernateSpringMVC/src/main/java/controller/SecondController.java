package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/secondController")
public class SecondController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView modelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("secondView");
        return modelAndView;
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public @ResponseBody
    String test(){
        return "test string";
    }

    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String test2(){
        return "test string";
    }
}
