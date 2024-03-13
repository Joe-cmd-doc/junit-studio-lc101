package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    @Test
    public void nestedBracketsAreAllowed() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void bracketsMustFollowOpenCloseOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }

    @Test
    public void emptyInputShouldReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singlePairOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
    }

    @Test
    public void multiplePairsOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("({})"));
    }

    @Test
    public void mismatchedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[)}"));
    }

    @Test
    public void mixedCharactersWithBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[b]c{d}e(f)g"));
    }

    @Test
    public void bracketsWithOtherCharactersInBetween() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc{def}ghi]"));
    }

    @Test
    public void longerExpressionWithBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("((())){{{}}}[[]]"));
    }

    @Test
    public void longerExpressionWithMismatchedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("((())){{}[]}[[[]]"));
    }


}
