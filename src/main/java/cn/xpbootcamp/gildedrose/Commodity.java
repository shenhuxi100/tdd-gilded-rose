package cn.xpbootcamp.gildedrose;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Commodity {
    protected int sellIn;
    protected int quality;

    public boolean validQuality() {
        return quality <= 50 && quality > 0;
    }

    protected abstract void oneDayPassed();
}
