package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {
    @Test
    void should_get_sellIn_is_9_quantity_is_21_when_pass_one_day_given_a_Aged_Brie_with_sellIn_is_10_quantity_is_20() {
        AgedBrie agedBrie = new AgedBrie(10, 20);
        agedBrie.passOneDay();
        assertEquals(9, agedBrie.getSellIn());
        assertEquals(21, agedBrie.getQuantity());
    }
}