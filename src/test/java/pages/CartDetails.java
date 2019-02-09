package pages;

import components.NavigationPanel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartDetails {

    NavigationPanel navigationPanel;

    public CartDetails(){
        super();
        navigationPanel = new NavigationPanel();
    }

    @FindBy(css = ".sc-list-body.sc-java-remote-feature > .sc-list-item:first-of-type .a-size-medium.sc-product-title.a-text-bold")
    private WebElement FIRST_CART_ITEM;


    public String getFirstItemTitle(){
        return FIRST_CART_ITEM.getText();
    }
}
