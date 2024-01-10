package lesson35.test;

import lesson35.CustomList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomListTest {

    @Test
    void testAddToFull() {
        CustomList customList = new CustomList(new int[]{3, 5, 8});
        customList.add(13);
        Assertions.assertArrayEquals(new int[]{3, 5, 8, 13}, customList.toArray());
    }

    @Test
    void testAddToEmpty() {
        CustomList customList = new CustomList(new int[0]);
        customList.add(5);
        Assertions.assertArrayEquals(new int[]{5}, customList.toArray());
    }

    @Test
    void testRemoveSuccess() {
        CustomList customList = new CustomList(new int[]{3, 5, 8});
        customList.remove(5);
        Assertions.assertArrayEquals(new int[]{3, 8}, customList.toArray());
    }

    @Test
    void testRemoveFail() {
        CustomList customList = new CustomList(new int[]{3, 5, 8});
        customList.remove(15);
        Assertions.assertArrayEquals(new int[]{3, 5, 8}, customList.toArray());
    }

    @Test
    void testRemoveAllManyCases() {
        CustomList customList = new CustomList(new int[]{15, 3, 5, 8, 15});
        customList.removeAll(15);
        Assertions.assertArrayEquals(new int[]{3, 5, 8}, customList.toArray());
    }

    @Test
    void testRemoveAllOneCase() {
        CustomList customList = new CustomList(new int[]{15, 3, 5, 8});
        customList.removeAll(15);
        Assertions.assertArrayEquals(new int[]{3, 5, 8}, customList.toArray());
    }

    @Test
    void testRemoveAllNoCases() {
        CustomList customList = new CustomList(new int[]{15, 3, 5, 8, 15});
        customList.removeAll(18);
        Assertions.assertArrayEquals(new int[]{15, 3, 5, 8, 15}, customList.toArray());
    }

    @Test
    void testIndexOfExisting() {
        CustomList customList = new CustomList(new int[]{15, 3, 5, 8, 15});
        int index = customList.indexOf(5);
        Assertions.assertEquals(2, index);
    }

    @Test
    void testIndexOfNonExisting() {
        CustomList customList = new CustomList(new int[]{15, 3, 5, 8, 15});
        int index = customList.indexOf(555);
        Assertions.assertEquals(-1, index);
    }
}