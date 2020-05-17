package cn.xpbootcamp.gildedrose;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Commodity {
    private int sellIn;
    private int quality;

    public boolean validQuality() {
        return quality <= 50 && quality > 0;
    }
}
