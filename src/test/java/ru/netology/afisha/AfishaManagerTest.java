package ru.netology.afisha;

import org.junit.jupiter.api.Test;
import ru.netology.afisha.domain.Afisha;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    void findLast() {
        var manager = new AfishaManager(4);
        for (int i = 1; i < 10; i++) {
            manager.add(new Afisha(i, "Test " + i, 2022 -i));
        }
        Afisha[] actual = manager.findLast();
        System.out.println(Arrays.toString(actual));
        assertEquals(4,actual.length);

    }
}