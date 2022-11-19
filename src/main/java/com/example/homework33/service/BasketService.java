package com.example.homework33.service;

import com.example.homework33.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class BasketService {

    private final List<Basket> baskets = new ArrayList<>();

    public List<Basket> getAllBaskets() {
        return this.baskets;
    }

    public void addBasket(List<Integer> id) {
        for (Integer number : id) {
            Basket basket = new Basket(number);
            this.baskets.add(basket);
        }
    }
}
