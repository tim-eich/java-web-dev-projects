package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyMismatchedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void multipleClosedSetsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }

    @Test
    public void closedSetsSeparatedBySpacesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] []    []   [] "));
    }

    @Test
    public void unorderedSetsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }

    @Test
    public void matchingBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("aBksfl37[al;dkj;lkcx[lkdj[lkjdsfs[klfd]897987(&^%]hihihi] the ]"));
    }

    @Test
    public void mismatchedBracketsWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("aBksfl37[al;dkj;lkcx[lkdj[lkjdsfs[klfd]897]]987(&^%]hihihi] the ]"));
    }

    @Test
    public void throwsExceptionForBlankString() {
        assertThrows(IllegalArgumentException.class, () ->
                BalancedBrackets.hasBalancedBrackets(""), "Provided argument contains no characters");
    }

    @Test
    public void throwsExceptionForNullValue() {
        assertThrows(IllegalArgumentException.class, () ->
                BalancedBrackets.hasBalancedBrackets(null), "Provided argument is null");
    }

    @Test
    public void throwsExceptionIfArgHasNoBrackets() {
        assertThrows(IllegalArgumentException.class, () ->
                BalancedBrackets.hasBalancedBrackets("abcdefg"), "Provided argument contains no brackets");
    }
}