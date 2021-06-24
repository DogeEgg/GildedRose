package com.gildedrose;

import com.gildedrose.refactor.GildedRose;
import com.gildedrose.refactor.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TextTestFixture {
    public static void main(String[] args) {
        System.out.println(generateBaselineOutput());
    }

    public static String generateBaselineOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        printStream.println("OMGHAI!");

        Item[] items = new Item[]{
                Item.switchItem("+5 Dexterity Vest", 10, 20), //
                Item.switchItem("Aged Brie", 2, 0), //
                Item.switchItem("Elixir of the Mongoose", 5, 7), //
                Item.switchItem("Sulfuras, Hand of Ragnaros", 0, 80), //
                Item.switchItem("Sulfuras, Hand of Ragnaros", -1, 80),
                Item.switchItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                Item.switchItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                Item.switchItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                Item.switchItem("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                // this conjured item does not work properly yet
                Item.switchItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 3; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.updateQuality();
        }

        return outputStream.toString();
    }

}
