/**
 * 
 */
package PageObject;

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

	
}
