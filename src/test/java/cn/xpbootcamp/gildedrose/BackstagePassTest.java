package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BackstagePassTest {
    @Test
    public void should_return_sellIn_14_quality_21_when_backstagePass_pass_1_day_given_sellIn_15_quality_20(){
        BackstagePass backstagePass = new BackstagePass(15,20);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(14);
        assertThat(backstagePass.getQuality()).isEqualTo(21);
    }
}