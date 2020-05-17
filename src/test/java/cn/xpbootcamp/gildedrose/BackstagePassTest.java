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

    @Test
    public void should_return_sellIn_4_quality_50_when_backstagePass_pass_1_day_given_sellIn_5_quality_49(){
        BackstagePass backstagePass = new BackstagePass(5,49);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(4);
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }

    @Test
    public void should_return_sellIn_4_quality_48_when_backstagePass_pass_1_day_given_sellIn_5_quality_45(){
        BackstagePass backstagePass = new BackstagePass(5,45);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(4);
        assertThat(backstagePass.getQuality()).isEqualTo(48);
    }

    @Test
    public void should_return_sellIn_0_quality_23_when_backstagePass_pass_1_day_given_sellIn_1_quality_20(){
        BackstagePass backstagePass = new BackstagePass(1,20);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(0);
        assertThat(backstagePass.getQuality()).isEqualTo(23);
    }

    @Test
    public void should_return_sellIn_n1_quality_0_when_backstagePass_pass_1_day_given_sellIn_0_quality_20(){
        BackstagePass backstagePass = new BackstagePass(0,20);
        backstagePass.oneDayPassed();
        assertThat(backstagePass.getSellIn()).isEqualTo(-1);
        assertThat(backstagePass.getQuality()).isEqualTo(0);
    }
}