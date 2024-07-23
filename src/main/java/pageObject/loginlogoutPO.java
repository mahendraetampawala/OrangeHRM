/**
 * 
 */
package pageObject;

import pageFactory.LoginFactory;

/**
 * @author mahen
 *
 */
public class loginlogoutPO {
	
	public static loginlogoutPO LoginLogout;
	public static loginlogoutPO getLoginLogoutPO() {
		if(LoginLogout==null) {
			LoginLogout=new loginlogoutPO();
		}
		return LoginLogout;
	}
	
	public void clickonLoginButton() {
		LoginFactory.pf.clickOnLoginBtn.click();
	}
	
	

}
