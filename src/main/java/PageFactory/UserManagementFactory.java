/**
 * 
 */
package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WebDriverHelper;

/**
 * @author mahen
 *
 */
public class UserManagementFactory {

	public static UserManagementFactory UMF=PageFactory.initElements(WebDriverHelper.getDriver(), UserManagementFactory.class);
	
	
	/*---------------------------------------------   User Search -------------------------------------------------------   */
	@FindBy(how =How.XPATH, using="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	public WebElement AdminNavButton;
	
	@FindBy(how=How.XPATH, using="//i[@class='oxd-icon bi-caret-up-fill']")
	public WebElement searchExpand;
	
	@FindBy(how=How.XPATH, using="//div[@class='' and input[@class='oxd-input oxd-input--active']]")
	public WebElement UsernameTxt;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type for hints...']")
	public WebElement EmployeeNameTxt;
	
	@FindBy(how=How.XPATH,using="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")//Indexing - Used when there are elements with same contents
	public WebElement UserRole;
	
	@FindBy(how=How.XPATH,using="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")//Indexing - Used when there are elements with same contents
	public WebElement Status;
	
	@FindBy(how=How.XPATH,using="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	public WebElement ResetBtn;
	
	
	/*---------------------------------------------   User Adding -------------------------------------------------------   */
}
