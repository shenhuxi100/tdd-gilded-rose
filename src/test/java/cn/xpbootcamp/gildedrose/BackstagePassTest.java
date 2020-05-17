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

    @Test
    public void should_return_sellIn_9_quality_47_when_backstagePass_pass_1_day_given_sellIn_10_quality_45(){
        BackstagePass backstagePass = new BackstagePass(10,45);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(9);
        assertThat(backstagePass.getQuality()).isEqualTo(47);
    }

    @Test
    public void should_return_sellIn_8_quality_47_when_backstagePass_pass_1_day_given_sellIn_9_quality_45(){
        BackstagePass backstagePass = new BackstagePass(9,45);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(8);
        assertThat(backstagePass.getQuality()).isEqualTo(47);
    }

    @Test
    public void should_return_sellIn_9_quality_50_when_backstagePass_pass_1_day_given_sellIn_10_quality_49(){
        BackstagePass backstagePass = new BackstagePass(10,49);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(9);
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }

    @Test
    public void should_return_sellIn_9_quality_50_when_backstagePass_pass_1_day_given_sellIn_10_quality_50(){
        BackstagePass backstagePass = new BackstagePass(10,50);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(9);
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }
}