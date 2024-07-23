/**
 * 
 */
package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import Utility.WebDriverHelper;

/**
 * @author mahen
 *
 */
public class LoginFactory {

	
	public static LoginFactory pf= PageFactory.initElements(WebDriverHelper.getDriver(), LoginFactory.class);
	
	@FindBy(how = How.XPATH, using="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement clickOnLoginBtn;
}
