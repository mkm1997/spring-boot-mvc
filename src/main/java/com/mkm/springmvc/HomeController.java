package com.mkm.springmvc;
import com.mkm.springmvc.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class HomeController {

    @RequestMapping("/") // to map the url
    public String home()
    {
        System.out.println("Home page requested .. !!");
        return "index";
    }

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute Alien a){
        System.out.println("In add alien request");
        return "result";
    }

//    @RequestMapping("/addAlien")
//    public String addAlien(@RequestParam("aid")int aid, @RequestParam("aname")String aname, Model m){
//
//        System.out.println("In add alien request");
//        Alien obj = new Alien();
//        obj.setAid(aid);
//        obj.setAname(aname);
//        m.addAttribute("alien", obj.toString());
//        return "result";
//    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m){

        System.out.println("First number is: " + i + " Second number is: " + j);
        int result = i + j;
        m.addAttribute("num", result);
        return "result";
    }




//    @RequestMapping("/add")
//    public String add(HttpServletRequest req){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        System.out.println("First number is: " + num1 + "Second number is: " + num2);
//
//        int result = num1 + num2;
//        HttpSession session = req.getSession();
//        session.setAttribute("num", result);
//        return "result.jsp";
//    }
}
