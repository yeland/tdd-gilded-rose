package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassTest {
    @Test
    void should_get_sellIn_is_14_quantity_is_21_when_pass_one_day_given_a_Backstage_pass_with_sellIn_is_15_quantity_is_20() {
        BackstagePass backstagePass = new BackstagePass(15, 20);
        backstagePass.passOneDay();
        assertEquals(14, backstagePass.getSellIn());
        assertEquals(21, backstagePass.getQuantity());
    }

    @Test
    void should_get_sellIn_is_9_quantity_is_22_when_pass_one_day_given_a_Backstage_pass_with_sellIn_is_10_quantity_is_20() {
        BackstagePass backstagePass = new BackstagePass(10, 20);
        backstagePass.passOneDay();
        assertEquals(9, backstagePass.getSellIn());
        assertEquals(22, backstagePass.getQuantity());
    }

    @Test
    void should_get_sellIn_is_9_quantity_is_50_when_pass_one_day_given_a_Backstage_pass_with_sellIn_is_10_quantity_is_49() {
        BackstagePass backstagePass = new BackstagePass(10, 49);
        backstagePass.passOneDay();
        assertEquals(9, backstagePass.getSellIn());
        assertEquals(50, backstagePass.getQuantity());
    }

    @Test
    void should_get_sellIn_is_8_quantity_is_22_when_pass_one_day_given_a_Backstage_pass_with_sellIn_is_9_quantity_is_20() {
        BackstagePass backstagePass = new BackstagePass(9, 20);
        backstagePass.passOneDay();
        assertEquals(8, backstagePass.getSellIn());
        assertEquals(22, backstagePass.getQuantity());
    }

    @Test
    void should_get_sellIn_is_4_quantity_is_23_when_pass_one_day_given_a_Backstage_pass_with_sellIn_is_5_quantity_is_20() {
        BackstagePass backstagePass = new BackstagePass(5, 20);
        backstagePass.passOneDay();
        assertEquals(4, backstagePass.getSellIn());
        assertEquals(23, backstagePass.getQuantity());
    }

    @Test
    void should_get_sellIn_is_3_quantity_is_50_when_pass_one_day_given_a_Backstage_pass_with_sellIn_is_4_quantity_is_48() {
        BackstagePass backstagePass = new BackstagePass(4, 48);
        backstagePass.passOneDay();
        assertEquals(3, backstagePass.getSellIn());
        assertEquals(50, backstagePass.getQuantity());
    }

    @Test
    void should_get_sellIn_is_0_quantity_is_23_when_pass_one_day_given_a_Backstage_pass_with_sellIn_is_1_quantity_is_20() {
        BackstagePass backstagePass = new BackstagePass(1, 20);
        backstagePass.passOneDay();
        assertEquals(0, backstagePass.getSellIn());
        assertEquals(23, backstagePass.getQuantity());
    }
}
