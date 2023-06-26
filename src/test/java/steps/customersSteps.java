package steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class customersSteps {
    Properties prop=new Properties();
    FileInputStream file;
    {
        try
        {
            file = new FileInputStream("./src/test/resources/config.properties");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    RequestSpecification request;
    Response response;

    @Given("^Login API is provided$")
    public void login_API_is_provided() throws Exception {
        prop.load(file);
        RestAssured.baseURI  = prop.getProperty("baseUrl");
        request = RestAssured.given();
    }

    @When("^User call login API$")
    public void user_call_login_API() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^a token will be generated$")
    public void a_token_will_be_generated() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^Customer list API is provided$")
    public void customer_list_API_is_provided() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User call customer list API$")
    public void user_call_customer_list_API() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Customer list will be shown$")
    public void customer_list_will_be_shown() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Customer get API is provided$")
    public void customer_get_API_is_provided() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User call customer get API$")
    public void user_call_customer_get_API() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Specific customer info will be shown$")
    public void specific_customer_info_will_be_shown() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }
}
