package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArrayTest {

    @Test
    @DisplayName("To test method Add")
    void testAdd() {
        String one = "First";
        String two = "Second";
        String three = "Third";

        String[] array = new String[]{one, two, three};
        List<String> list = new ArrayList<>(Arrays.asList(array));

        Simple<String> strings = new SimpleArray<>();
        strings.add(one);
        strings.add(two);
        strings.add(three);
        Assertions.assertAll(
                () -> assertEquals(strings.get(0), list.get(0)),
                () -> assertEquals(strings.get(1), list.get(1)),
                () -> assertEquals(strings.get(2), list.get(2)),
                () -> assertEquals(strings.size(), list.size()));
    }

    @Test
    @DisplayName("To test method delete")
    void delete() {
        String one = "First";
        String two = "Second";
        String three = "Third";
        String four = "Four";

        List<String> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.remove(two);
        list.set(1, four);

        Simple<String> strings = new SimpleArray<>();
        strings.add(one);
        strings.add(two);
        strings.add(three);
        strings.delete(1);
        strings.update(1, four);

        Assertions.assertAll(
                () -> assertEquals(strings.get(0), list.get(0)),
                () -> assertEquals(strings.get(1), list.get(1)),
                () -> assertEquals(strings.size(), list.size()));
    }
}
