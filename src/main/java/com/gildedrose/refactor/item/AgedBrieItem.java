package com.gildedrose.refactor.item;

import com.gildedrose.refactor.Item;

/**
 * @author leo
 * @date 2021/6/16
 */
public class AgedBrieItem extends Item {
    public AgedBrieItem(int sellIn, int quality) {
        super("Aged Brie",sellIn,quality);
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;

        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }
}
