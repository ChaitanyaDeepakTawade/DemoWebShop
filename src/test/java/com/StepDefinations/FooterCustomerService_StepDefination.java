package com.StepDefinations;

import com.actions.FooterCustomerService_Actions;
import com.actions.Footer_Information_Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterCustomerService_StepDefination {
	FooterCustomerService_Actions objFooterCustomerService_Actions;
	
	@When("I click on Search")
	public void i_click_on_search() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.clickOnSearch();
	}

	@When("I enter Handycam as the keywords of the product to be searched")
	public void i_enter_handycam_as_the_keywords_of_the_product_to_be_searched() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.enterFooterSearchKeywords("Handycam");
	}

	@When("I click Search")
	public void i_click_search() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.clicksearchfooter();
	}

	@Then("I verify the relevant product Handycam is displayed in the search results")
	public void i_verify_the_relevant_product_handycam_is_displayed_in_the_search_results() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.assertfootersearch();
	}
	//News Footer
	@When("I have navigated to the news page or section")
	public void i_have_navigated_to_the_news_page_or_section() {
		System.out.println("--User On Home Page--");
	}

	@When("I click on News")
	public void i_click_on_news() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.clickOnNewsFooter();
	}

	@Then("I should be able to view and read the news related to the store on the news page")
	public void i_should_be_able_to_view_and_read_the_news_related_to_the_store_on_the_news_page() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.assertfooterNews();
	}
	//Blog Footer
	@When("I have navigated to the blog page or section")
	public void i_have_navigated_to_the_blog_page_or_section() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		System.out.println("--User On Home Page--");
	}

	@When("I click on Blog")
	public void i_click_on_blog() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.clickOnBlogFooter();
	}

	@Then("I should be able to view and read the blog posts related to the store on the blog page")
	public void i_should_be_able_to_view_and_read_the_blog_posts_related_to_the_store_on_the_blog_page() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.assertfooterBlog();
	}

	@When("I have recently viewed some products on the website")
	public void i_have_recently_viewed_some_products_on_the_website() {
	}

	@When("I click on Recently Viewed Products")
	public void i_click_on_recently_viewed_products() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.clickOnRecentlyViewedFooter();
	}

	@Then("I should see the list of recently viewed products on the webpage")
	public void i_should_see_the_list_of_recently_viewed_products_on_the_webpage() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.assertfooterRecentlyViewedProducts();
	}
	//Compare product List
	@When("I already have added products to the compare list on the website")
	public void i_already_have_added_products_to_the_compare_list_on_the_website() {
	}

	@When("I click on Compare Products List")
	public void i_click_on_compare_products_list() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.clickOnCompareProductListFooter();
	}

	@Then("I should see the list of products added for comparison on the webpage")
	public void i_should_see_the_list_of_products_added_for_comparison_on_the_webpage() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.assertCompareProductList();
	}

	//New Products Footer
	@When("I am on the webpage")
	public void i_am_on_the_webpage() {
	   System.out.println("--User is on Homepage");
	}

	@When("I click on New Products")
	public void i_click_on_new_products() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.clickOnNewProducts();
	}

	@Then("I should see the latest products added to the website in the New Products section")
	public void i_should_see_the_latest_products_added_to_the_website_in_the_new_products_section() {
		objFooterCustomerService_Actions = new FooterCustomerService_Actions();
		objFooterCustomerService_Actions.assertNewProducts();
	}

}
