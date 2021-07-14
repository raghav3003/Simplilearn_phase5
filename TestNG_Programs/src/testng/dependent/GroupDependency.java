package testng.dependent;

import org.testng.annotations.Test;

public class GroupDependency
{
    @Test(groups = { "viewaccount" })
    public void ViewAcc() {
        System.out.println("View Your Dashboardd");
    }
 
    @Test (groups = { "openbrowser" })
    public void OpenBrowser() {
        System.out.println("Browser Opened Successfully");
    }
 
    @Test(groups = { "login" })
    public void LogIn() {
        System.out.println("Login Into The Account");
    }
    
    @Test(groups = {"logout"})
    public void CloseAccount() {
     System.out.println("Closing The Account");
    }
}