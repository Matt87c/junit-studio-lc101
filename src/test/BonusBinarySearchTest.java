package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    int [] genericNumArr = {1,3,4,5,6,7,8,9};
    int [] duplicateArr = {1,1,1,1,1,1};
    @Test
    public void returnsIndexOnSuccessfulSearch() {
        assertEquals(3,BonusBinarySearch.binarySearch(genericNumArr,4));
    }

    @Test
    public void unsuccessfulSearch() {
        assertEquals(-1,BonusBinarySearch.binarySearch(genericNumArr,2));
    }

    @Test
    public void unsuccessfulSearchWithHighNum() {
        assertEquals(-1,BonusBinarySearch.binarySearch(genericNumArr,2));
    }

    @Test
    public void arrayWithDuplicateReturnsFirstIndexToMatch() {
        assertEquals(0,BonusBinarySearch.binarySearch(duplicateArr,1));
    }


}
