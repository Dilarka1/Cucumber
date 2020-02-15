package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.*;

public class TopMenuStepDefinitions {

    LoginPage loginPage = new LoginPage();

    // And user navigates to "Dashboards" then to "Manage Dashboards"
    @Then("user navigates to {string} then to {string}")
    public void user_navigates_to_then_to(String module, String submodule) {
        loginPage.navigateTo(module, submodule);
    }

    @Then("user click on {string} button")
    public void user_click_on_button(String string) {

    }

    @Then("user adds new car information:")
    public void user_adds_new_car_information(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

}
