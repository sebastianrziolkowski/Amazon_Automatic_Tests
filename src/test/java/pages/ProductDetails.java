package pages;

import components.NavigationPanel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails {

    NavigationPanel navigationPanel;


    public ProductDetails() {
        super();
        navigationPanel = new NavigationPanel();
    }


    @FindBy(css = "#title > span:first-of-type")
    private WebElement PRODUCT_TITLE;

    @FindBy(id = "add-to-cart-button")
    private WebElement ADD_TO_CART_BUTTON;

    @FindBy(id = "one-click-button")
    private WebElement ONE_CLICK_BUTTON;


    public String getItemTitle(){
        return ONE_CLICK_BUTTON.getText();
    }

    public AddToCartConfirmPage clickAddtoCartButton(){
        if(ONE_CLICK_BUTTON.isDisplayed())
            ONE_CLICK_BUTTON.click();
        else
            ADD_TO_CART_BUTTON.click();
        return new AddToCartConfirmPage();
    }



}
