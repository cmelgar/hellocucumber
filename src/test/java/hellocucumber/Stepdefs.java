package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

class IsItFriday{
    static String isItFriday(String today){
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class Stepdefs {

    private String today;
    private String actualAnswer;

    @Given("^today is \"([^\"]*)\"$")
    public void today_is_Sunday(String today) {
        // Write code here that turns the phrase above into concrete actions
        this.today = today;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("^today is Friday$")
    public void today_is_Friday() {
        this.today = "Friday";
    }
}
