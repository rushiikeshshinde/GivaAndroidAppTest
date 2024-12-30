package com.giva.android.testcases;

import com.giva.android.pages.AddToCartPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddToCartPageTest extends AddToCartPage {

    AddToCartPage addToCartPage;

    public AddToCartPageTest() throws IOException {
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        addToCartPage = new AddToCartPage();
    }

    @Test
    public void addToCartTest() throws InterruptedException {
        addToCartPage.addToCart();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        closeDriver();
    }
}
