package pages;

import components.NavigationPanel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartConfirmPage {

    NavigationPanel navigationPanel;

    public AddToCartConfirmPage(){
        super();
        navigationPanel = new NavigationPanel();
    }

    @FindBy(xpath = "//*[@id=\"huc-v2-order-row-confirm-text\"]/h1")
    private WebElement CONFIRM_LABEL;

    public String getConfirmString(){
        return CONFIRM_LABEL.getText();
    }

}
