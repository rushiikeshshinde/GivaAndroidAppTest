package com.giva.android.testcases;

import com.giva.android.pages.SearchPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchPageTest extends SearchPage {
    SearchPage searchPage;

    public SearchPageTest() throws IOException {
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        searchPage = new SearchPage();

    }

    @Test
    public void searchTest() throws InterruptedException {
        searchPage.search();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        closeDriver();
    }

}
