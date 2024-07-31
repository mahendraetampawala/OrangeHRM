/**
 * 
 */
package PageObject;

import PageFactory.UserManagementFactory;
import Utility.WebDriverHelper;
import Utility.propertyFileHandler;

/**
 * @author mahen
 *
 */
public class UserManagementPO {
	
	public static UserManagementPO UserManagement;
	public static UserManagementPO getUserManagement() {
		if(UserManagement==null) {
			UserManagement=new UserManagementPO();
		}
		return UserManagement;
	}

	
	public void AdminButtonClick() {
		
		System.out.println("Started executing");
		
		WebDriverHelper.getWebDriverHelper().implicitwait();
		UserManagementFactory.UMF.AdminNavButton.click();
	}
	
	public void expandingFilters() {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		UserManagementFactory.UMF.searchExpand.click();
	}
	
	public void EnterUsername(String user) {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		UserManagementFactory.UMF.UsernameTxt.sendKeys(propertyFileHandler.readProperty(user));
	}
	
	public boolean verificationOfDirectionToUserManagement() {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		if(UserManagementFactory.UMF.AdminSectionName.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public void selectUserRole(String user_role) {
		//WebDriverHelper.getWebDriverHelper().waitPageLoad(U);
		WebDriverHelper.getWebDriverHelper().implicitwait();
		UserManagementFactory.UMF.UserRole.click();
		UserManagementFactory.UMF.UserRole.sendKeys(user_role);
	}
	
	
	
}
