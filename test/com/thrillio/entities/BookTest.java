package com.thrillio.entities;

import com.thrillio.constants.BookGenre;
import com.thrillio.constants.MovieGenre;
import com.thrillio.managers.BookmarkManager;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest extends Object {

    @Test
    public void isKidFriendlyEligible() {
        //Test 1 - Philosophy genre -- false
        Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY, 4.3);
        boolean isKidFriendlyEligible = book.isKidFriendlyEligible();

        assertFalse("For Philosophy genre - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

        //Test 2 - Self Help genre -- false
        book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[] {"Henry David Thoreau"}, BookGenre.SELF_HELP, 4.3);
        isKidFriendlyEligible = book.isKidFriendlyEligible();

        assertFalse("For Self Help genre - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
    }
}