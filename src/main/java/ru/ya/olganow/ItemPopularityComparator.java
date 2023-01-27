package ru.ya.olganow;

import java.util.Comparator;

public class ItemPopularityComparator  implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        // Напишите правильное сравнение.
        if (item1.popularity > item2.popularity) {
            return 1;

            // более дешёвый — ближе к началу списка
        } else if (item1.popularity < item2.popularity) {
            return -1;

            // если стоимость равна, нужно вернуть 0
        } else {
            return 0;
        }

    }


}