package com.example.homework33.controller;

import com.example.homework33.model.Basket;
import com.example.homework33.service.BasketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/store/order/get")
    public List<Basket> getOrder() {
        return this.basketService.getAllBaskets();
    }

    @GetMapping("/store/order/add")
    @ResponseBody
    public String addBasket(@RequestParam List<Integer> item) {
            this.basketService.addBasket(item);
        return "Корзины добавлены успешно";
    }

}
