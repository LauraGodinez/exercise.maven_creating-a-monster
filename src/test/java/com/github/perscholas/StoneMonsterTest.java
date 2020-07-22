package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

public class StoneMonsterTest {
    @Test
    public void testPolymorphism() {
        // given
        StoneMonster fireMonster = new StoneMonster();

        // when
        Boolean assertion = fireMonster instanceof Monster;

        // then
        Assert.assertTrue(assertion);
    }

    @Test
    public void testAttack() {
        // given
        StoneMonster fireMonster = new StoneMonster();
        Monster monster = (Monster) fireMonster;
        String expected = "Rock";

        // when
        String actual = monster.attack();

        // then
        Assert.assertEquals(expected, actual);
    }
}
