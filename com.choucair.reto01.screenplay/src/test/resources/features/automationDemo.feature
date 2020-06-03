#Author: ygonzalezg@choucairtesting.com

@stories
Feature: Academy Choucair
  As a user, I want to automate in screenplay the registration on the page web with the automation course
  @scenario1
  Scenario: Search fot a automation course
    Given than Carlos wants to access at the web automation demo site
    When he performs the registration on the page
      |firstName|lastName	|address	                            |email	        |phone	    |languages	  |skills   |country  |sCountry   |year	|month  |day  |password1    |password2  |
      |Carla	|Castrilla	|P. Sherman, calle Wallaby, 42, Sydney	|valor1@mail.com|1233211231 |Spanish      |Android  |Panama	  |Japan	  |1967	|May    |17	  |Valor2   	|Valor2     |
    Then he verifies that the screen loads with text - Double Click on Edit Icon to EDIT the Table Row.
