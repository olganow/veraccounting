package ru.ya.olganow;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> { // на месте T - класс Item

    @Override
    public int compare(Item item1, Item item2) {

        // сравниваем товары — более дорогой должен быть дальше в списке
        if (item1.price > item2.price) {
            return 1;

            // более дешёвый — ближе к началу списка
        } else if (item1.price < item2.price) {
            return -1;

            // если стоимость равна, нужно вернуть 0
        } else {
            return 0;
        }
    }
}

//Небольшой лайфхак: при реализации int compare(T,T) важен только знак возвращаемого целого числа. Другими словами,
// -20 и -1 интерпретируются одинаково. В нашем примере это значит, что если цена первого товара больше второго,
// то результат их вычитания будет положительным числом, если меньше — отрицательным, если цены равны — нулём.
// Зная это, код переопределяемого метода можно значительно упростить:
//import java.util.Comparator;
//
//public class ItemPriceComparator implements Comparator<Item> {
//
//    @Override
//    public int compare(Item item1, Item item2) {
//        return item1.price - item2.price;
//        /* Если положительный результат => первый товар дороже второго.
//        Если ноль => цены равны.
//        Если отрицательный результат => первый товар дешевле второго. */
//    }
//}