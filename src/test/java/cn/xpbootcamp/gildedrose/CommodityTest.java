package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


class CommodityTest {
    @Test
    void should_return_false_given_quality_is_less_equals_than_0_and_more_than_50() {
        Commodity commodity = Commodity.builder().quality(0).build();
        assertFalse(commodity.validQuality());

        commodity.setQuality(51);
        assertFalse(commodity.validQuality());
    }

    @Test
    void should_return_true_given_quality_between_1_and_50() {
        Commodity commodity = Commodity.builder().quality(5).build();
        assertTrue(commodity.validQuality());
    }

    @Test
    void should_return_expire_day_given_a_expire_commodity() {
        Commodity commodity = Commodity.builder().createDay(LocalDate.of(2019, 5, 10)).sellIn(365).build();
        assertTrue(LocalDate.now().isAfter(commodity.getExpireDay()));
    }


}