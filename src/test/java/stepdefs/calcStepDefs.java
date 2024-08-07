package stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class calcStepDefs
{
    double num1,num2;
    double actual_result;int actal_bill;
    List<Double> numbers;
    Map<String,Double> items;
    Map<String,Integer> cart;io.cucumber.datatable.DataTable dtable;

    @Given("Two numbers {double} and {double}")
    public void two_numbers_and(double int1, double int2) {num1= int1;num2= int2; }

    @When("Add those two numbers")
    public void add_those_two_numbers()
    {
        actual_result= num1+num2;
    }

    @Then("Result should be  {double}")
    public void resultShouldBe(Double exp_result)
    {
        Assert.assertEquals(exp_result, actual_result, .01);
    }
}
