package by.it.novik.jd02_03.interfaces;

import by.it.novik.jd02_03.entities.Good;

import java.util.Map;

/**
 * Created by Kate Novik.
 */
public interface IBasket {

    /**
     * Положить товар в корзинку
     */
    void putGoodInBasket(Good good, int cost);

    /**
     * Выложить товар из корзинки
     */
    Map.Entry<Good,Integer> takeGoodFromBasket();
}
