package starter.stepdefinitions;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import starter.search.LookUp;
import starter.search.SearchPage;
//import starter.search.SeeInfo;

public class SearchSteps {

	@Managed
	WebDriver driver;
	
	@Steps
	SearchPage searchpage;
	LookUp lookup;

	
	
	@Given("^User is on Home Page$")
	public void he_looks_up_cucumber() {
	    // Write code here that turns the phrase above into concrete actions
		searchpage.search();  
	}
	
	@When("^He added and deleted user (.*)$")
	public void he_looks_up(String FirstName,String LastName,String UserName,String Password,String Email,String CellPhone) {
	    // Write code here that turns the phrase above into concrete actions
	    lookup.add();
	    lookup.del();
	}
	
	@Then("^he should be able to see added User (.*)$")
	public void he_should_see(String term) {
	    // Write code here that turns the phrase above into concrete actions
	    //seeinfo.seeinfo(term);
	}
}
