package com.giva.android.testcases;

import com.giva.android.pages.CheckoutPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckoutPageTest extends CheckoutPage {

    CheckoutPage checkoutPage;

    public CheckoutPageTest() throws IOException {
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        checkoutPage = new CheckoutPage();
    }

    @Test
    public void placeOrderTest() throws InterruptedException {
        checkoutPage.orderNow();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        closeDriver();
    }

}
