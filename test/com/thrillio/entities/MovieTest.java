package com.thrillio.entities;

import com.thrillio.constants.MovieGenre;
import com.thrillio.managers.BookmarkManager;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest extends Object {

    @Test
    public void isKidFriendlyEligible() {
        //Test 1 - Genre: Horror -- false
        Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane"," " ,1941, new String[] {"Orson Welles", "Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.HORROR,8.5);
        boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();

        assertFalse("For Horror genre - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

        //Test 2 - porn in title -- false
        movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane"," " ,1941, new String[] {"Orson Welles", "Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.THRILLERS,8.5);
        isKidFriendlyEligible = movie.isKidFriendlyEligible();

        assertFalse("For Thrillers genre - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
    }
}