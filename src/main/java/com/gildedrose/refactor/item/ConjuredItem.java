package com.gildedrose.refactor.item;

import com.gildedrose.refactor.Item;

/**
 * @author leo
 * @date 2021/6/16
 */
public class ConjuredItem extends Item {
    public ConjuredItem(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        if (quality > 0) {
            quality = quality - 2;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            if (quality > 0) {
                quality = quality - 2;
            }
        }

    }
}
