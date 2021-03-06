package com.mkm.springmvc;
import com.mkm.springmvc.model.Alien;
import com.mkm.springmvc.model.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class HomeController {


    @ModelAttribute // This method will called first and available in all the controller view
    public void modelData(Model m){
        m.addAttribute("name", "Aliens");
    }

    @Autowired
    AlienRepo repo;

    @RequestMapping("/") // to map the url
    public String home()
    {
        System.out.println("Home page requested .. !!");
        return "index";
    }




//    @PostMapping(value = "/addAlien", consumes = "application/json")
//    public Alien addAlien(@RequestBody Alien a){
//        System.out.println("In add alien request");
//        repo.save(a);
//        return a;
//    }

//    @GetMapping(value = "/aliens", produces = "application/json")
//    public List<Alien> getAliens(){
//        List<Alien> aliens = repo.findAll();
//        System.out.println(aliens);
//        return aliens;
//    }
//
//    @GetMapping("/alien/{id}")
//    public Alien getAlien(@PathVariable("id") Long id){
//        System.out.println("helloooooooooooo  ");
//        System.out.println("In add alien request" + id);
//        Alien a = repo.findById(id).orElse(new Alien(0L,"",0));
//        return a;
//    }


    @RequestMapping("/getAlienByName")
    public String getAlienByName(@RequestParam String name, Model m){
        System.out.println("In add alien request 111 " + name + " " + repo.name(name));
        m.addAttribute("aliens", repo.name(name));
        return "showAliens";
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
