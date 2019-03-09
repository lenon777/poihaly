package com.example.poihaly.controllers;

import com.example.poihaly.entity.HotSet;
import com.example.poihaly.entity.HotTour;
import com.example.poihaly.service.HotTourService;
import com.example.poihaly.service.impl.HotTourServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
@Autowired
HotTourService hotTourService;

@Autowired
JavaMailSender sender;

    @GetMapping("/")
    public String main(Model model) {
        List<HotTour> hotTours1 = hotTourService.findAll();
        List<HotSet> hotTours = new ArrayList<>();
        int x =-1;

        for (int i=0;i<hotTours1.size()/3;i++) {
            HotTour tour1 = hotTours1.get(++x);
            HotTour tour2 = hotTours1.get(++x);
            HotTour tour3 = hotTours1.get(++x);
            hotTours.add(new HotSet(tour1, tour2, tour3));
        }

        model.addAttribute("hotTours",hotTours);
        System.out.println(hotTours);
        return "main";
    }


    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/setting")
    public String admin(Model model) {

        List<HotTour> hotTours = hotTourService.findAll();
        model.addAttribute("hotTours",hotTours);
        return "admin";
    }
    @GetMapping("/hot")
    public String hot(Model model){
        List<HotTour> hotTours = hotTourService.findAll();
        model.addAttribute("hotTours",hotTours);

        return "hot";
    }

    @PostMapping("/hot/create")
    public String saveHot(
            @RequestParam String photo,
            @RequestParam String country,
            @RequestParam String hotel,
            @RequestParam String date,
            @RequestParam String food,
            @RequestParam int price ) {
        HotTour hotTour= new HotTour(photo,country,hotel,date,food,price);
        hotTourService.save(hotTour);
        System.out.println(hotTour);
        return "admin";


    }
    @PostMapping("/hot/delete/{id}")
    public String deleteHot(@PathVariable int id){
    hotTourService.deleteById(id);

        return "admin";
    }
    @PostMapping("/send")
    public String send(
            @RequestParam String name,
            @RequestParam String phoneNumber
    ){
        sendMail("amytsak90@gmail.com",name, phoneNumber);
        System.out.println(phoneNumber+name);
        return "zapyt";
    }

    private void sendMail(String email,String name, String phoneNumber) {
        MimeMessage mimeMessage = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

        try {
            helper.setText("Ви отримали заявку на індивідуальну пропозицію від: "+name+" номер телефону: "+phoneNumber,true);
            helper.setSubject("Індивідуальна пропозиція");
            helper.setTo(email);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        sender.send(mimeMessage);


    }


}