package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {
    @Test
    void should_get_sellIn_is_10_quantity_is_20_when_pass_one_day_given_a_Sulfuras_with_sellIn_is_10_quantity_is_20() {
        Sulfuras sulfuras = new Sulfuras(10, 20);
        sulfuras.passOneDay();
        assertEquals(10, sulfuras.getSellIn());
        assertEquals(20, sulfuras.getQuantity());
    }

    @Test
    void should_get_sellIn_is_n1_quantity_is_50_when_pass_one_day_given_a_Sulfuras_with_sellIn_is_n1_quantity_is_50() {
        Sulfuras sulfuras = new Sulfuras(-1, 50);
        sulfuras.passOneDay();
        assertEquals(-1, sulfuras.getSellIn());
        assertEquals(50, sulfuras.getQuantity());
    }
}

