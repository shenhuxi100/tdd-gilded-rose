package cn.xpbootcamp.gildedrose;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class AgedBrie extends Commodity {

    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    protected void oneDayPassed() {
        if (sellIn>0)
            quality++;
        else
            quality+=2;

        sellIn--;
        quality=Math.min(50,quality);
    }
}
