package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalGoodsTest {
    @Test
    void should_get_sellIn_is_9_quantity_is_19_when_pass_one_day_given_a_normal_goods_with_sellIn_is_10_quantity_is_20() {
        NormalGoods normalGoods = new NormalGoods(10, 20);
        normalGoods.passOneDay();
        assertEquals(9, normalGoods.getSellIn());
        assertEquals(19, normalGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_n1_quantity_is_18_when_pass_one_day_given_a_normal_goods_with_sellIn_is_0_quantity_is_20() {
        NormalGoods normalGoods = new NormalGoods(0, 20);
        normalGoods.passOneDay();
        assertEquals(-1, normalGoods.getSellIn());
        assertEquals(18, normalGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_n2_quantity_is_18_when_pass_one_day_given_a_normal_goods_with_sellIn_is_n1_quantity_is_20() {
        NormalGoods normalGoods = new NormalGoods(-1, 20);
        normalGoods.passOneDay();
        assertEquals(-2, normalGoods.getSellIn());
        assertEquals(18, normalGoods.getQuantity());
    }
}
