package com.gildedrose.refactor;

import java.util.Arrays;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(Item::updateQuality);
    }
}
