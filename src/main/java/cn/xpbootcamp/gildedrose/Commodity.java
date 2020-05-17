package cn.xpbootcamp.gildedrose;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@Builder
public class Commodity {
    private int sellIn;
    private long quality;
    private int initialQuality;
    private LocalDate createDay;
    private CommodityType commodityType;

    public boolean validQuality() {
        return quality <= 50 && quality > 0;
    }

    public LocalDate getExpireDay() {
        return createDay.plus(sellIn, ChronoUnit.DAYS);
    }
}
