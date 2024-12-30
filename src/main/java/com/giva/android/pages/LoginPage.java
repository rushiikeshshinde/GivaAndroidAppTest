package com.giva.android.pages;

import com.giva.android.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Cancel\"]")
    WebElement cancelButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Skip\"]")
    WebElement skipButton;

    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    public void userLogin() throws InterruptedException {
        cancelButton.click();
        Thread.sleep(1000);
        skipButton.click();
    }




}
