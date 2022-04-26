package starter.search;

import net.serenitybdd.core.pages.PageObject;

public class SearchPage extends PageObject{
	
	public void search()
	{
		getDriver().get("http://www.way2automation.com/angularjs-protractor/webtables/ ");
	}

}
