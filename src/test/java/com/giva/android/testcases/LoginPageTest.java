package com.giva.android.testcases;

import com.giva.android.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends LoginPage {

    LoginPage loginPage;

    public LoginPageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void guestLoginTest() throws InterruptedException {
        loginPage.userLogin();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        closeDriver();
    }

}
