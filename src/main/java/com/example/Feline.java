package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public Integer getKittens() {
        return getKittens(1);
    }

    public Integer getKittens(int kittensCount) {
        return kittensCount;
    }

}
