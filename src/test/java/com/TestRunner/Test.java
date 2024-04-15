package com.TestRunner;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.text.html.HTML;

import org.testng.annotations.BeforeTest;


import com.WebPageLocatorsElements.Fakemail;
import com.WebPageLocatorsElements.SignupPageHtmlLocators;
import com.utilities.UtilityClass;

public class Test extends UtilityClass {

	public static String Email;

	@BeforeTest
	public void browserLaunchonSysytem() {

		browserLaunch();

	}

	@org.testng.annotations.Test(priority = 2)
	public void Signup() throws InterruptedException {

		String url = "https://accounts.vmmaps.com/";
		String Username = "UserName1";
		String Password = "Test@123";
		String Email = "BabuSabanayagam@gmail.com";
		String ConfirmPassword = "Test@123";
		String MobileNumber = "87654387654";

		url(url);
		Thread.sleep(5000);

		SignupPageHtmlLocators htmlLocators = new SignupPageHtmlLocators();

		click(htmlLocators.getLogin_Page_Sign_UP_Popup());
		sendKeys(htmlLocators.getSign_Up_Page_User_Name(), Username);
		sendKeys(htmlLocators.getSign_Up_Page_Email(), Email);
		sendKeys(htmlLocators.getSign_Up_Page_Mobile(), MobileNumber);
		sendKeys(htmlLocators.getSign_Up_Page_Password(), Password);
		sendKeys(htmlLocators.getSign_Up_Page_Confirm_Password(), ConfirmPassword);
		click(htmlLocators.getSign_Up_Page_PrivacyPolicy_Check_Box());
		click(htmlLocators.getSign_Up_Page_Submit_Button());

		Thread.sleep(10000);

		click(htmlLocators.getSign_Up_OTP_Page_Verify_Button());

	}

	@org.testng.annotations.Test(priority = 3)
	public void LogIn() throws InterruptedException {
		String Email = "BabuSabanayagam@gmail.com";
		String Password = "Test@123";

		SignupPageHtmlLocators htmlLocators = new SignupPageHtmlLocators();

		sendKeys(htmlLocators.getLogin_Page_Email_Address_Text_Box(), Email);
		sendKeys(htmlLocators.getLogin_Page_PassWord_Text_Box(), Password);
		click(htmlLocators.getLogin_Page_Submit_Button());

	}

	@org.testng.annotations.Test
	public void forgetpassword() throws InterruptedException {

		browserLaunch();
		String url = "https://accounts.vmmaps.com/";
		url(url);
		Thread.sleep(5000);

		String Email = "BabuSabanayagam@gmail.com";
		String Password = "Test@123";

		SignupPageHtmlLocators htmlLocators = new SignupPageHtmlLocators();

		sendKeys(htmlLocators.getLogin_Page_Email_Address_Text_Box(), Email);
		click(htmlLocators.getLogin_Page_Forget_Password_Text_Link());

		Thread.sleep(5000);

		sendKeys(htmlLocators.getForget_Password_Password_TextBox(), Password);
		click(htmlLocators.getForget_Password_Change_BUtton());

	}

}