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
}
