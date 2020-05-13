package cn.xpbootcamp.gildedrose;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
@Builder
public class Commodity {
    private int sellIn;
    private int quality;
    private int initialQuality;
    private LocalDate createDay;
    private CommodityType commodityType;

    public boolean validQuality() {
        return quality <= 50 && quality > 0;
    }
}
