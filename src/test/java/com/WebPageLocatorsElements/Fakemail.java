package com.WebPageLocatorsElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fakemail {

	@FindBy(id = "email")
	private WebElement Fake_Email_ID;

	public WebElement getFake_Email_ID() {
		return Fake_Email_ID;
	}

}
