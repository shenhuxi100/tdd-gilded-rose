package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CommodityTest {
    @Test
    public void should_return_sellIn_9_quality_19_when_normal_product_pass_1_day_given_sellIn_10_quality_20(){
        Commodity normalCommodity = new CommonCommodity(10, 20);
        normalCommodity.oneDayPassed();
        assertEquals(normalCommodity.getSellIn(), 9);
        assertEquals(normalCommodity.getQuality(), 19);
    }

    @Test
    public void should_return_sellIn_0_quality_0_when_normal_product_pass_1_day_given_sellIn_1_quality_0(){
        Commodity commonCommodity = new CommonCommodity(1,0);
        commonCommodity.oneDayPassed();
        assertEquals(commonCommodity.getSellIn(), 0);
        assertEquals(commonCommodity.getQuality(), 0);
    }
}