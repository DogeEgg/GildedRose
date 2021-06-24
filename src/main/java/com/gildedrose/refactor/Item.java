package com.gildedrose.refactor;

import com.gildedrose.refactor.item.AgedBrieItem;
import com.gildedrose.refactor.item.BackstageItem;
import com.gildedrose.refactor.item.ConjuredItem;
import com.gildedrose.refactor.item.SulfurasItem;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item switchItem(String name, int sellIn, int quality){
        if ("Aged Brie".equals(name)) {
            return new AgedBrieItem(sellIn, quality);
        }
        if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            return new BackstageItem(sellIn, quality);
        }
        if ("Sulfuras, Hand of Ragnaros".equals(name)) {
            return new SulfurasItem(sellIn, quality);
        }
        if("Conjured Mana Cake".equals(name)){
            return new ConjuredItem(sellIn,quality);
        }
        return new Item(name, sellIn, quality);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected void updateQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }
}
