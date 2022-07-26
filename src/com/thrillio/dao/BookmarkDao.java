package com.thrillio.dao;

import com.thrillio.DataStore;
import com.thrillio.entities.Bookmark;
import com.thrillio.entities.UserBookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmarks() {
        return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        DataStore.add(userBookmark);
    }
}