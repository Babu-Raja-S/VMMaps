package com.WebPageLocatorsElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.utilities.UtilityClass;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class SignupPageHtmlLocators extends UtilityClass {

	public SignupPageHtmlLocators() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "login-email")
	private WebElement Login_Page_Email_Address_Text_Box;

	@FindBy(id = "login-password")
	private WebElement Login_Page_PassWord_Text_Box;

	@FindBy(id = "loginSubmit")
	private WebElement Login_Page_Submit_Button;

	@FindBy(id = "Forgot-Password")
	private WebElement Login_Page_Forget_Password_Text_Link;

	@FindBy(id = "signupToggle")
	private WebElement Login_Page_Sign_UP_Popup;

	@FindBy(id = "signup-username")
	private WebElement Sign_Up_Page_User_Name;

	@FindBy(id = "signup-email")
	private WebElement Sign_Up_Page_Email;

	@FindBy(id = "signup-mobile")
	private WebElement Sign_Up_Page_Mobile;

	@FindBy(id = "signup-password")
	private WebElement Sign_Up_Page_Password;

	@FindBy(id = "signup-confirmPassword")
	private WebElement Sign_Up_Page_Confirm_Password;

	@FindBy(id = "terms-vms-policy")
	private WebElement Sign_Up_Page_PrivacyPolicy_Check_Box;

	@FindBy(id = "newsLetter")
	private WebElement Sign_Up_Page_Newsletter_Check_Box;

	@FindBy(id = "signup-submit-text")
	private WebElement Sign_Up_Page_Submit_Button;

	@FindBy(id = "verify-otp-text")
	private WebElement Sign_Up_OTP_Page_Verify_Button;

	@FindBy(id = "firstOTP")
	private WebElement Sign_Up_OTP_Page_First_OTP_Box;

	@FindBy(id = "secondOTP")
	private WebElement Sign_Up_OTP_Page_Second_OTP_Box;

	@FindBy(id = "thirdOTP")
	private WebElement Sign_Up_OTP_Page_Third_OTP_Box;

	@FindBy(id = "fourthOTP")
	private WebElement Sign_Up_OTP_Page_Fourth_OTP_Box;

	@FindBy(id = "fifthOTP")
	private WebElement Sign_Up_OTP_Page_Fifth_OTP_Box;

	@FindBy(id = "sixthOTP")
	private WebElement Sign_Up_OTP_Page_Sixth_OTP_Box;

	@FindBy(id = "reset-login-otp-text")
	private WebElement Forget_Password_Change_BUtton;

	@FindBy(id = "Resetpassword")
	private WebElement Forget_Password_Password_TextBox;

	public WebElement getForget_Password_Change_BUtton() {
		return Forget_Password_Change_BUtton;
	}

	public WebElement getForget_Password_Password_TextBox() {
		return Forget_Password_Password_TextBox;
	}

	public WebElement getLogin_Page_Email_Address_Text_Box() {
		return Login_Page_Email_Address_Text_Box;
	}

	public WebElement getLogin_Page_PassWord_Text_Box() {
		return Login_Page_PassWord_Text_Box;
	}

	public WebElement getLogin_Page_Submit_Button() {
		return Login_Page_Submit_Button;
	}

	public WebElement getLogin_Page_Forget_Password_Text_Link() {
		return Login_Page_Forget_Password_Text_Link;
	}

	public WebElement getLogin_Page_Sign_UP_Popup() {
		return Login_Page_Sign_UP_Popup;
	}

	public WebElement getSign_Up_Page_User_Name() {
		return Sign_Up_Page_User_Name;
	}

	public WebElement getSign_Up_Page_Email() {
		return Sign_Up_Page_Email;
	}

	public WebElement getSign_Up_Page_Mobile() {
		return Sign_Up_Page_Mobile;
	}

	public WebElement getSign_Up_Page_Password() {
		return Sign_Up_Page_Password;
	}

	public WebElement getSign_Up_Page_Confirm_Password() {
		return Sign_Up_Page_Confirm_Password;
	}

	public WebElement getSign_Up_Page_PrivacyPolicy_Check_Box() {
		return Sign_Up_Page_PrivacyPolicy_Check_Box;
	}

	public WebElement getSign_Up_Page_Newsletter_Check_Box() {
		return Sign_Up_Page_Newsletter_Check_Box;
	}

	public WebElement getSign_Up_Page_Submit_Button() {
		return Sign_Up_Page_Submit_Button;
	}

	public WebElement getSign_Up_OTP_Page_Verify_Button() {
		return Sign_Up_OTP_Page_Verify_Button;
	}

	public WebElement getSign_Up_OTP_Page_First_OTP_Box() {
		return Sign_Up_OTP_Page_First_OTP_Box;
	}

	public WebElement getSign_Up_OTP_Page_Second_OTP_Box() {
		return Sign_Up_OTP_Page_Second_OTP_Box;
	}

	public WebElement getSign_Up_OTP_Page_Third_OTP_Box() {
		return Sign_Up_OTP_Page_Third_OTP_Box;
	}

	public WebElement getSign_Up_OTP_Page_Fourth_OTP_Box() {
		return Sign_Up_OTP_Page_Fourth_OTP_Box;
	}

	public WebElement getSign_Up_OTP_Page_Fifth_OTP_Box() {
		return Sign_Up_OTP_Page_Fifth_OTP_Box;
	}

	public WebElement getSign_Up_OTP_Page_Sixth_OTP_Box() {
		return Sign_Up_OTP_Page_Sixth_OTP_Box;
	}

}
