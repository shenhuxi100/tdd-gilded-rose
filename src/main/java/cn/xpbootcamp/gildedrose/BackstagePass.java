package cn.xpbootcamp.gildedrose;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class BackstagePass extends Commodity {
    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    protected void oneDayPassed() {
        if (sellIn >10)
            quality++;
        else if (sellIn <=0)
            quality =0;
        else if (sellIn <=5)
            quality +=3;
        else if (sellIn <= 10)
            quality +=2;

        sellIn--;
        quality=Math.min(50,quality);
    }
}
