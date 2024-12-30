package com.giva.android.pages;

import com.giva.android.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CheckoutPage extends BasePage {

  @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Checkout Securely\"]/android.view.ViewGroup/android.view.View")
  WebElement checkoutBtn;

  @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
  WebElement fullNameField;

  @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
  WebElement addressField1;

  @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
  WebElement addressField2;

  @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText")
  WebElement pincodeField;


  @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
  WebElement phoneField;

  @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText")
  WebElement emailField;

  @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Cash on Delivery\"]/android.view.ViewGroup/android.widget.ImageView")
  WebElement cashOnDelieveryOpt;

  @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Place Order\"]/android.view.ViewGroup/android.view.View")
  WebElement placeOrderBtn;


  AddToCartPage addToCartPage = new AddToCartPage();

  public CheckoutPage() throws IOException {
      super();
       PageFactory.initElements(driver, this);
  }

  public void checkoutButtonClick() {
      checkoutBtn.click();
  }

  public void fullNameInput() {
      fullNameField.sendKeys(prop.getProperty("checkoutFullName"));
  }

  public void addressInput() throws InterruptedException {
      addressField1.sendKeys(prop.getProperty("addressField_1"));
      Thread.sleep(1000);
      addressField2.sendKeys(prop.getProperty("addressField_2"));
  }

  public void pincodeInput() {
      pincodeField.sendKeys(prop.getProperty("checkoutPinCode"));
  }

  public void phoneInput() {
      phoneField.sendKeys(prop.getProperty("checkoutPhone"));
  }

  public void emailInput() {
      emailField.sendKeys(prop.getProperty("checkoutEmail"));
  }

  public void cashOnDeliveryOpt() {
      cashOnDelieveryOpt.click();
  }
  public void placeOrderBtnClick() {
      placeOrderBtn.click();
  }

  public void orderNow() throws InterruptedException {

      addToCartPage.addToCart();
      checkoutButtonClick();
      Thread.sleep(10000);
      fullNameInput();
      Thread.sleep(1000);
      addressInput();
      Thread.sleep(1000);
      Thread.sleep(1000);
      pincodeInput();
      Thread.sleep(1000);
      addToCartPage.scrollDown();
      Thread.sleep(1000);
      addToCartPage.scrollDown();
      Thread.sleep(1000);
      phoneInput();
      Thread.sleep(1000);
      emailInput();
      Thread.sleep(1000);
      cashOnDeliveryOpt();
      Thread.sleep(1000);
      placeOrderBtnClick();
      Thread.sleep(10000);

  }





}
