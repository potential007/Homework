package com.example.demo.controller.order29;


import com.example.demo.entity.order29.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th")
public class Bank9n29thController {
    //private Product recommendedProducts;

    //private RecommendedProduct recommendedProduct;
    //private com.example.demo.utility.RecommendedProduct RecommendedProduct;

    //private String RecommendedProduct;
    //private com.example.demo.utility.RecommendedProduct recommendedProduct;

    @GetMapping("/homework1")
    //Product 클래스를 만들어보자
    //Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.
    //오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
    //오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고
    //추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자!

    //먼저 Product 클래스를 만들고
    //배열을 활용하여 10가지 정도의 상품과 가격을 집어 넣어 본다
    //랜덤 함수를 이용하여 1 ~ 10까지의 숫자 중 하나를 선택하게 만들고
    //추천 상품을 누르면 랜덤함수를 통해서 10가지 상품 중에 하나를 선택하게 하면 되는걸까?

    public String bank9Homework1(Model model) {
        log.info("client entered /homework1");
        //logger.info("client entered /homework1");
        //Product product = new Product();
        //product.recommendedProduct();

        //model.addAttribute("recommendedProduct", product.getProductName());

        return "29th/homework1";


    }

    //@ResponseBody
    /*@PostMapping("/recommendedProducts")
    public String recommendedProducts(Model model) {
        log.info("recommendedProducts ()");
        Product product = new Product();
        product.recommendedProduct();

        model.addAttribute("recommendedProduct", product.getRandomProductName());
        model.addAttribute("recommendedPrice", product.getRandomProductPrice());
        return "29th/recommendedProducts";
    }*/
    @ResponseBody
    @PostMapping("/view-info")
    public Product viewInfo() {
        log.info("viewInfo()");

        Product product = new Product();
        //product.recommendedProduct();
        //model.addAttribute("recommendedProduct", product.getRandomProductName());
        //model.addAttribute("recommendedPrice", product.getRandomProductPrice());

        //RecommendedProduct rp = new RecommendedProduct();
        //rp.recommendedProduct();

        //return product;


        //return product.getRandomProductName();
        //return product.getRandomProductPrice();
        return product;
        //return product.getRandomProductPrice();


    }

}

