package com.gildedrose.refactor.item;

import com.gildedrose.refactor.Item;

/**
 * @author leo
 * @date 2021/6/16
 */
public class SulfurasItem extends Item {
    public SulfurasItem(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    protected void updateQuality() {

    }
}
