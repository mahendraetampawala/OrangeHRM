/**
 * 
 */
package PageObject;

import java.io.IOException;

import org.testng.Assert;

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
		WebDriverHelper.getWebDriverHelper().waitForPageLoad();
		UserManagementFactory.UMF.UsernameTxt.sendKeys(propertyFileHandler.readProperty(user));
	}
	
	public boolean verificationOfDirectionToUserManagement() {
		System.out.println("Verification Executed");
		WebDriverHelper.getWebDriverHelper().implicitwait();
		
		try{
				if(UserManagementFactory.UMF.AdminSectionName.isDisplayed()) {
				return true;
			}
			//return false;
		}catch(Exception VerificationFaild ) {
			System.out.print("Verification faild");
		}
		return false;
		
		
		
		
		
	}
	
	public void selectUserRole(String user_role) throws IOException {
		//WebDriverHelper.getWebDriverHelper().waitPageLoad(U);
		try{WebDriverHelper.getWebDriverHelper().implicitwait();
		UserManagementFactory.UMF.UserRole.click();
		WebDriverHelper.getWebDriverHelper().waitForPageLoad();
		UserManagementFactory.UMF.setUserRole.click();}
		catch(Exception FailedToSelectUserRole) {
			WebDriverHelper.getWebDriverHelper().takescreenshot(user_role);
		}
		//UserManagementFactory.UMF.UserRole.sendKeys(user_role);
	}
	
	public void SetEmployeeName(String EmployeeName) throws IOException {
		
		try{UserManagementFactory.UMF.EmployeeNameTxt.sendKeys(propertyFileHandler.readProperty(EmployeeName));
		}catch(Exception FailedToEnter) {
			
			WebDriverHelper.getWebDriverHelper().takescreenshot(EmployeeName);
		}
		
	}
	
	/*-----------------------Adding Users--------------------------------------*/
	
	public void ClickOnAddButton() {
		UserManagementFactory.UMF.AddButton.click();
	}
	
	public boolean VerificationOfAddUserPage() {
		WebDriverHelper.getWebDriverHelper().implicitwait();
		
		try {
			if(UserManagementFactory.UMF.AddUserText.isDisplayed()) {
				return true;
			}
		}catch(Exception verificationFaild) {
			System.out.println("User is not directed to the 'Add User' page");
		}
		return false;
		
	}
	
	public void selectUserRole() {
		
		UserManagementFactory.UMF.AddUserRole.click();
		WebDriverHelper.getWebDriverHelper().implicitwait();
		UserManagementFactory.UMF.UserRoleAdmin.click();
	}
	
	
}
