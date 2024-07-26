/**
 * 
 */
package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utility.WebDriverHelper;

/**
 * @author mahen
 *
 */
public class LoginLogoutFactory {

	
	public static LoginLogoutFactory pf= PageFactory.initElements(WebDriverHelper.getDriver(), LoginLogoutFactory.class);
	
	@FindBy(how =How.XPATH, using="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginbutton;
	
	@FindBy(how = How.XPATH, using="//input[@class='oxd-input oxd-input--active oxd-input--error' and @placeholder='Username']")
	public WebElement ErrorUsername;
	
	@FindBy(how = How.XPATH, using="//input[@class='oxd-input oxd-input--active oxd-input--error' and @placeholder='Password']")
	public WebElement ErrorPassword;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Password']")
	public WebElement PasswordField;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
	public WebElement usernameField;
	
	@FindBy(how=How.XPATH, using="//p[@class='oxd-text oxd-text--p oxd-alert-content-text' and text()='Invalid credentials']")
	public WebElement LoginErrorMessage;
	
	@FindBy(how=How.XPATH,using="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public WebElement DashboardModuleIcone;
	
}
