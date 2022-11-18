package com.example.homework33.service;

import com.example.homework33.model.Basket;
import com.example.homework33.record.BasketRequest;
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

    public Basket addBasket(BasketRequest basketRequest) {
        Basket basket = new Basket (basketRequest.getId());
        this.baskets.add(basket);
        return basket;
    }
}
