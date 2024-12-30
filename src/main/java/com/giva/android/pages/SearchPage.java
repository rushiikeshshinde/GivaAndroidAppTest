package com.giva.android.pages;

import com.giva.android.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"search_input_HOME_SCREEN\"]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup")
    WebElement searchBoxBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
    WebElement searchBoxInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Rings\"]")
    WebElement firstSearchSuggestion;

    public SearchPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    LoginPage login = new LoginPage();

    public void searchBoxButton(){
        searchBoxBtn.click();
    }

    public void inputSearchText() throws InterruptedException {
        searchBoxInput.click();
        Thread.sleep(2000);
        searchBoxInput.sendKeys(prop.getProperty("searchInput"));
    }

    public void clickFirstSearchSuggestion(){
        firstSearchSuggestion.click();
    }

    public void search() throws InterruptedException {
        login.userLogin();
        Thread.sleep(5000);
        searchBoxButton();
        Thread.sleep(1000);
        inputSearchText();
        Thread.sleep(1000);
        clickFirstSearchSuggestion();

    }

}
