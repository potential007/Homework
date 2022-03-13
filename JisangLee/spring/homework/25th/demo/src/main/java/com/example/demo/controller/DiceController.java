package com.example.demo.controller;

import com.example.demo.utility.Dice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class DiceController {
    private static final Logger logger = LoggerFactory.getLogger(DiceController.class);

    @RequestMapping("/homework1")
    public String homework1(Model model) {
        logger.info("client entered /homework1");

        Dice dice = new Dice();
        dice.rollDice();

        model.addAttribute("number", dice.getDiceNum());

        return "25th/homework1";
    }


}














