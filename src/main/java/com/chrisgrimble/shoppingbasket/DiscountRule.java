package com.chrisgrimble.shoppingbasket;

import java.util.List;

public interface DiscountRule {
    int calculate(List<String> items);
}
