package com.example.demo.entity.order29;



import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Product {
    //private int productNum = 10;
    //private int idx;
    //private int productPrice;

    //int[] product = new int[productNum];
    //String[]productName = new int[]productPrice;
    //String[]product = new String[productName];
    //String[] productName = new String[]{"아이폰13프로", "아이폰13", "아이폰13미니", "맥북프로", "맥북에어M1", "애플워치7", "LG그램", "레노버씽크패드", "한성노트북", "삼성노트북"};
   //int[] productPrice = new int[]{1249000, 1168500, 1035000, 2590000, 1134100, 499000, 2299000, 2449000, 1699000, 1960000};
    //상품과 해당 가격을 어떻게 매칭시켜야 할까....
    //productName[] = productPrice[];
    //String randomProductName;
    //int randomProductPrice;
    private String 추천상품;
    private int 상품가격;

    //private final int MAXIDX = productNum - 1;
    //final int MINIDX = 0;
    //final int RANGEIDX = MAXIDX - MINIDX + 1;

    //private int randomIdx;

    //RecommendedProduct rp = new RecommendedProduct();
    //rp.recommendedProduct();
    public Product() {
        int randomIdx = takeRandom();

        추천상품 = ProductList.productName[randomIdx];
        상품가격 = ProductList.productPrice[randomIdx];
        //randomIdx = recommendedProduct();
        //randomProductName = productName[randomIdx];
        //randomProductPrice = productPrice[randomIdx];
    }

    public int takeRandom(){
        int limit = ProductList.productPrice.length;
        return (int)(Math.random() * limit);

    }


    /*public int recommendedProduct() {

        randomIdx = (int) (Math.random() * RANGEIDX + MINIDX);
        return randomIdx;
    }*/
        //System.out.printf("randomIdx = %d\n", randomIdx);


        //System.out.printf("추천 상품 = %s\n", productName[randomIdx]);
        //System.out.printf("상품 가격 = %d원\n", productPrice[randomIdx]);
        //return randomIdx;
        //this.productName = productName;
        // this.productPrice = productPrice;
        //return productName[randomIdx];
        //return productPrice[randomIdx];

        //randomProductName = productName[randomIdx];
        //randomProductPrice = productPrice[randomIdx];

        //return randomProductName;
        //return randomProductPrice;


        //String randomProductName = productName[randomIdx];
        //int randomProductPrice = productPrice[randomIdx];


    @Override
    public String toString() {
        return "Product{" +
                "추천상품='" + 추천상품 + '\'' +
                ", 상품가격=" + 상품가격 +
                '}';
    }
}
