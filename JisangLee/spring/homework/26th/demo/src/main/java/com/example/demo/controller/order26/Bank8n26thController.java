package com.example.demo.controller.order26;


import com.example.demo.utility.series.GeometricSequence;
import com.example.demo.utility.school.Student;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class Bank8n26thController {

    private final static Logger logger =
            LoggerFactory.getLogger(Bank8n26thController.class);

    @RequestMapping("/homework1")
    public String bank8Homework1(Model model) {
        logger.info("client entered /homework1");
        GeometricSequence gs = new GeometricSequence();
        //gs.inputIndex();
        gs.sequenceGenerator();

        //model.addAttribute("selnum", gs.getIdx());
        model.addAttribute("seqarr", gs.getTmp());

        return "26th/homework1";
    }

    @RequestMapping("/homework2")
    public String bank8Homework2(Model model) {
        logger.info("client entered /homework2");
        Student student = new Student();
        student.score();
        student.average();

        model.addAttribute("stuscore",student.getSum());
        model.addAttribute("average", student.getAverage());

        return "26th/homework2";
    }


}
