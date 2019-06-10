package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User in on landing page$")
    public void user_in_on_landing_page() throws Throwable {
    //code to navigate
    	System.out.println("This is the homepage");
    }

    @When("^User log into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_log_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
    //code to log in username and password and login
    	System.out.println(arg1);
    	System.out.println(arg2);
    	
    }

    @Then("^Home page is populated$")	
    public void home_page_is_populated() throws Throwable {
    // homepage validation
    	System.out.println("Homepage validated");
    }

    @Then("^Cards \"([^\"]*)\" displayed$")
    public void cards_displayed(String arg1) throws Throwable { 
    //validating cards and balances
    	System.out.println("Cards "+ arg1+ " displayed");
    }

}