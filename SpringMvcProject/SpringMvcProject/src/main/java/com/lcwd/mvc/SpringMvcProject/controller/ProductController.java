package com.lcwd.mvc.SpringMvcProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    /*
   Query Parameters  @RequestParam
   localhost:8080/getProduct?productId=123&productName=MobilePhone&productRating=4
    */

    @GetMapping("/getProduct")
    public String getProduct(
            @RequestParam("productName") String productName,
            @RequestParam(value = "productRating",defaultValue ="0",required = true) int productRating,
            @RequestParam("productId") int productId

    ){

//        System.out.println("Product Id : "+productId);
//        System.out.println("Product Name : " + productName);
//        System.out.println("Product Rating "+productRating);

        // using logger

        logger.error("ProductName : {} {}",productName, "testing argument");
        logger.warn("ProductId : " + productId);
        logger.info("Product Rating : " + productRating);
        logger.debug("This is testing for debug");

        return "This is testing product url";
    }


    /*
       localhost:8080/getProduct/13132/productName/productRating

      uri path variable :  @Pathvariable
     */

    @RequestMapping("/checkProduct/{productId}/{productName}/{productRating}")
    public String checkProduct(
            @PathVariable("productId") int productId,
            @PathVariable("productName") String productName,
            @PathVariable(value="productRating") int productRating
    ){


//        System.out.println("Product Id : "+productId);
//        System.out.println("Product Name : " + productName);
//        System.out.println("Product Rating "+productRating);


        logger.error("ProductName : {} {}",productName, "testing argument");
        logger.warn("ProductId : " + productId);
        logger.info("Product Rating : " + productRating);
        logger.debug("This is testing for debugging check product");

        return "this is checking the concept of path variable";
    }




}
