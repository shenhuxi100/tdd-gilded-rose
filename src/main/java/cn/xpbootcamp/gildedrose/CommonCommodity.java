package cn.xpbootcamp.gildedrose;


import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
class CommonCommodity extends Commodity{
    public CommonCommodity(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public void oneDayPassed() {
        sellIn--;
        if (sellIn > 0)
            quality--;
        else
            quality-=2;
        quality=Math.max(0, quality);
    }
}
