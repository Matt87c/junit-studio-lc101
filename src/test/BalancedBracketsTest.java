package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void inversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlySquaredBracketsMatter() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
    }

    @Test
    public void textAroundBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("dsf[dsasd,.asdf]d"));
    }

    @Test
    public void nestingBracketsCorrectlyReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void nestingBracketsInCorrectlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[][]][]]]"));
    }

    @Test
    public void adjacentPairsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void specialWithBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("&*@##@%$_+=[%$#]^^$"));
    }

    @Test
    public void oneOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void textWithNoBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("this is text with no brackets"));
    }

    @Test
    public void balancedBracketsWithNewLineInBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\n]"));
    }

}
