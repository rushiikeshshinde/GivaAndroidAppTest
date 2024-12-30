package com.giva.android.pages;

import com.giva.android.base.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.time.Duration;

public class AddToCartPage extends BasePage {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"product_card_add_to_cart_5\"]/android.view.ViewGroup/android.view.View")
    WebElement addToCartBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"header_cart_SearchPage\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
    WebElement cart;

    SearchPage searchPage = new SearchPage();

    public AddToCartPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    public void scrollDown() {
        int screenWidth = driver.manage().window().getSize().width;
        int screenHeight = driver.manage().window().getSize().height;

        int startX = screenWidth / 2;
        int startY = (int) (screenHeight * 0.7);
        int endY = (int) (screenHeight * 0.3);

        new TouchAction<>(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public void addToCartButton() {
        addToCartBtn.click();
    }

    public void openCart() {
        cart.click();
    }

    public void addToCart() throws InterruptedException {
        searchPage.search();
        Thread.sleep(3000);
        scrollDown();
        Thread.sleep(1000);
        addToCartButton();
        Thread.sleep(2000);
        openCart();
        Thread.sleep(2000);
    }
}
