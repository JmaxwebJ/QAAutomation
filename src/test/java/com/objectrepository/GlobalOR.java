package com.objectrepository;

import org.openqa.selenium.By;

public class GlobalOR {

	// Landing page menu objects
	public static final By ELEMENTS = By
			.cssSelector(".category-cards div:first-child div:first-child div:nth-of-type(2) svg");

	public static final By BOOK_STORE = By.cssSelector(".category-cards div:nth-of-type(6) svg");

	public static final By FORMS = By.cssSelector(".category-cards div.card:nth-of-type(2) svg");
	public static final By ALERTS_FRAME = By.cssSelector(".category-cards div:nth-of-type(3) svg");

	public static final By WIDGETS = By.cssSelector(".category-cards div:nth-of-type(4) svg");

	public static final By INTRACTIONS = By.cssSelector(".category-cards div:nth-of-type(5) svg");

	// Elements and inside objects
// Elements - Text Box and inside Objects
	public final static By ELEMENTS_TEXTBOX_OPTION = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-0");
	public final static By ELEMENTS_TEXTBOX_FULL_NAME = By.id("userName");
	public static final By ELEMENTS_TEXTBOX_EMAIL = By.id("userEmail");
	public static final By ELEMENTS_TEXTBOX_CURRENT_ADDRESS = By.id("currentAddress");
	public static final By ELEMENTS_TEXTBOX_PARMANANT_ADDRESS = By.id("permanentAddress");
	public static final By ELEMENTS_TEXTBOX_SUBMIT = By.id("submit");

	// Elements - CheckBox - Inside Objects
	public final static By ELEMENTS_CHECKBOX_OPTION = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-1");

	public final static By ELEMENTS_HOME_CHECKBOX_EXPAND = By.cssSelector("#tree-node .rct-collapse-btn");

	public final static By ELEMENTS_HOME_CHECKBOX = By.className("rct-icon-uncheck");

	public final static By ELEMENTS_DESKTOP_EXPAND = By
			.cssSelector("ol li.rct-node-collapsed:nth-of-type(1) .rct-collapse-btn");
	public final static By ELEMENTS_DESKTOP_CHECKBOX = By
			.cssSelector("li.rct-node label[for='tree-node-desktop'] .rct-checkbox");
	public final static By ELEMENTS_DOCUMENT_EXPAND = By
			.cssSelector("ol li.rct-node-collapsed:nth-of-type(2) .rct-collapse-btn");
	public final static By ELEMENTS_DOCUMENT_CHECKBOX = By.cssSelector("li.rct-node li:nth-of-type(2) .rct-checkbox");
	public final static By ELEMENTS_DOWNLOAD_EXPAND = By
			.cssSelector("ol li.rct-node-collapsed:nth-of-type(3) .rct-collapse-btn");
	public final static By ELEMENTS_DOWNLOAD_CHECKBOX = By.cssSelector("li.rct-node li:nth-of-type(3) .rct-checkbox");
	public final static By ELEMENTS_CHECKBOX_RESULTS = By.cssSelector("#result span");
	// Elements - RadioButton - Inside Objects
	public final static By ELEMENTS_RADIO_BUTTON = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-2");
	public final static By ELEMENTS_YES_RADIO = By.id("yesRadio");
	public final static By ELEMENTS_IMPRESSIVE_RADIO = By.id("impressiveRadio");
	public final static By ELEMENTS_NO_RADIO = By.id("noRadio");
	public final static By ELEMENTS_RESULT_RADIO = By.className("mt-3");
	// Elements - WebTable - Inside Objects
	public final static By ELEMENTS_WEB_TABLE = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-3");
	public final static By ELEMENTS_ADD_RECORD = By.id("addNewRecordButton");

	public final static By ELEMENTS_EDIT_RECORD = By.cssSelector(".action-buttons .mr-2 svg");

	public final static By ELEMENTS_WEBTABLE_FIRST_NAME = By.id("firstName");
	public final static By ELEMENTS_WEBTABLE_LAST_NAME = By.id("lastName");
	public final static By ELEMENTS_WEBTABLE_EMAIL = By.id("userEmail");
	public final static By ELEMENTS_WEBTABLE_AGE = By.id("age");
	public final static By ELEMENTS_WEBTABLE_SALARY = By.id("salary");
	public final static By ELEMENTS_WEBTABLE_DEPARTMENT = By.id("department");
	public final static By ELEMENTS_WEBTABLE_SUBMIT = By.id("submit");
	public final static By ELEMENTS_WEBTABLE_CLOSE = By.cssSelector(".modal-header .close span[aria-hidden='true']");

	public final static By ELEMENTS_DELETE_RECORD = By.cssSelector(".action-buttons [title='Delete']");

	// Elements - Buttons - Inside Objects
	public final static By ELEMENTS_BUTTONS = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-4");
	public final static By ELEMENTS_BUTTONS_DOUBLE_CLICK = By.id("doubleClickBtn");
	public final static By ELEMENTS_BUTTONS_RIGHT_CLICK = By.id("rightClickBtn");
	public final static By ELEMENTS_BUTTONS_DYNAMIC_CLICK = By.cssSelector(".col-md-6 .mt-4:nth-of-type(3) .btn");

	// Elements -> Links - Inside Objects
	public final static By ELEMENTS_LINKS = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-5");

	// Following links will send an api call
	public final static By ELEMENTS_LINKS_CREATED = By.id("created");
	public final static By ELEMENTS_LINKS_NO_CONTENT = By.id("no-content");
	public final static By ELEMENTS_LINKS_MOVED = By.id("moved");
	public final static By ELEMENTS_LINKS_BAD_REQUEST = By.id("bad-request");
	public final static By ELEMENTS_LINKS_FORBIDDEN = By.id("unauthorized");
	public final static By ELEMENTS_LINKS_NOT_FOUND = By.id("invalid-url");

	// Elements -> BrokenLinks-Images

	public final static By ELEMENTS_LINKS_BORKEN_LINKS = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-6");

	public final static By ELEMENTS_LINKS_BORKEN_VALID_IMAGE = By
			.cssSelector("div.col-md-6 img[src='/images/Toolsqa.jpg']");
	public final static By ELEMENTS_LINKS_BORKEN_INVALID_IMAGE = By
			.cssSelector("div.col-md-6 img[src='/images/Toolsqa_1.jpg']");

	public final static By ELEMENTS_LINKS_BORKEN_VALID_LINK = By
			.cssSelector("div.col-md-6 a[href='http://demoqa.com']");

	public final static By ELEMENTS_LINKS_BORKEN_INVALID_LINK = By
			.cssSelector("div.col-md-6 a[href='http://the-internet.herokuapp.com/status_codes/500']");

	// Elements - Upload Download - DOWNLOAD BUTTON

	public final static By ELEMENTS_UPLOAD_DOWNLOAD = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-7");

	public final static By ELEMENTS_UPLOAD_DOWNLOAD_DOWNLOAD_BUTTON = By.id("downloadButton");
	public final static By ELEMENTS_UPLOAD_DOWNLOAD_UPLOAD_BUTTON = By.id("uploadFile");
	// Elements - DynamicProperty

	public final static By ELEMENTS_DYNAMIC_PROPERTIES = By
			.cssSelector(".element-group:first-child .element-list .menu-list #item-8");

	public final static By ELEMENTS_DYNAMIC_PROPERTIES_ENABLE_AFETR = By.id("uploadFile");
	public final static By ELEMENTS_DYNAMIC_PROPERTIES_COLOR_CHANGE = By.id("colorChange");
	public final static By ELEMENTS_DYNAMIC_PROPERTIES_VISIBLE_AFTER = By.id("visibleAfter");

}
