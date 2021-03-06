package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CommonCommodityTest {
    @Test
    public void should_return_sellIn_9_quality_19_when_normal_product_pass_1_day_given_sellIn_10_quality_20() {
        Commodity normalCommodity = new CommonCommodity(10, 20);
        normalCommodity.oneDayPassed();
        assertEquals(normalCommodity.getSellIn(), 9);
        assertEquals(normalCommodity.getQuality(), 19);
    }

    @Test
    public void should_return_sellIn_0_quality_0_when_normal_product_pass_1_day_given_sellIn_1_quality_0() {
        Commodity commonCommodity = new CommonCommodity(1, 0);
        commonCommodity.oneDayPassed();
        assertEquals(commonCommodity.getSellIn(), 0);
        assertEquals(commonCommodity.getQuality(), 0);
    }

    @Test
    public void should_return_sellIn_2_quality_5_when_normal_product_pass_1_day_given_sellIn_3_quality_6() {
        Commodity normalCommodity = new CommonCommodity(3, 6);
        normalCommodity.oneDayPassed();
        assertEquals(normalCommodity.getSellIn(), 2);
        assertEquals(normalCommodity.getQuality(), 5);
    }

    @Test
    public void should_return_sellIn_2_quality_50_when_normal_product_pass_1_day_given_sellIn_3_quality_51() {
        Commodity commonCommodity = new CommonCommodity(3, 51);
        commonCommodity.oneDayPassed();
        assertEquals(commonCommodity.getSellIn(), 2);
        assertEquals(commonCommodity.getQuality(), 50);
    }

    @Test
    public void should_return_sellIn_n1_quality_4_when_normal_product_pass_1_day_given_sellIn_0_quality_6(){
        Commodity commonCommodity = new CommonCommodity(0,6);
        commonCommodity.oneDayPassed();
        assertEquals(commonCommodity.getSellIn(), -1);
        assertEquals(commonCommodity.getQuality(), 4);
    }

    @Test
    public void should_return_sellIn_n2_quality_4_when_normal_product_pass_1_day_given_sellIn_n1_quality_6(){
        Commodity commonCommodity = new CommonCommodity(-1,6);
        commonCommodity.oneDayPassed();
        assertEquals(commonCommodity.getSellIn(), -2);
        assertEquals(commonCommodity.getQuality(), 4);
    }
}