package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CommodityTest {
    @Test
    public void should_return_sellIn_9_quality_19_when_normal_product_pass_1_day_given_sellIn_10_quality_20(){
        Commodity normalCommodity = new CommonCommodity(10, 20);
        normalCommodity.oneDayPassed();
        assertEquals(normalCommodity.getSellIn(), 9);
        Assert.assertEquals(normalCommodity.getQuality(), 19);
    }

}