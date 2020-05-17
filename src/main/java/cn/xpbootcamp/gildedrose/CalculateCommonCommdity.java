package cn.xpbootcamp.gildedrose;

public class CalculateCommonCommdity implements CalculateCommodityQuality{
    @Override
    public CommodityType getCommodityType() {
        return CommodityType.COMMON;
    }

    @Override
    public void CalculateCommodityQuality(Commodity commodity) {
        int sellIn = commodity.getSellIn();
        int quality = commodity.getQuality();

        if (sellIn > 0)
            quality--;
        else
            quality-=2;
        quality=Math.max(0, quality);

        commodity.setSellIn(--sellIn);
        commodity.setQuality(quality);
    }
}
