package cn.xpbootcamp.gildedrose;

public enum CommodityType {
    AGED_BRIE("Aged Brie"),
    SULFURAS("Sulfuras"),
    BACKSTAGE_PASS("Backstage pass");

    private String commodityType;

    CommodityType(String commodityType) {
        this.commodityType = commodityType;
    }
}
