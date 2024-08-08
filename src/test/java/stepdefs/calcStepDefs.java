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
    double actual_result;double actal_bill;
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
    @When("Subtract those two numbers")
    public void substract_those_two_numbers() {
        actual_result= num1-num2;
    }
    @When("Divide those two numbers")
    public void divide_those_two_numbers()
    {
        actual_result= num1/num2;
    }
    @When("Add those numbers")
    public void add_those_numbers() {actual_result= num1+num2;}


    @Given("I have below numbers")
    public void i_have_below_numbers(List<Double> Lst1)
    {
        this.numbers=Lst1;
    }

    @When("I add above numbers")
    public void i_add_above_numbers() {
        for (double num : numbers) {
            actual_result = actual_result + num;
        }
    }

    @Then("Result should be {double}")
    public void resultShouldBe(double exp_result)
    {
        Assert.assertEquals(Double.valueOf(exp_result), actual_result, .01);
    }

}
