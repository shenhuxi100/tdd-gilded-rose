package cn.xpbootcamp.gildedrose;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class Sulfuras extends Commodity {
    public Sulfuras(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    protected void oneDayPassed() {
        sellIn=sellIn;
        quality=quality;
    }
}
