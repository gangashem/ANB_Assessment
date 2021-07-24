$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Login feature that describe the login scenario and steps"
    }
  ],
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login to Citrii",
  "description": "",
  "id": "login;login-to-citrii",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Login_scenario"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I launch the citrii browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i enter the username",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i enter the password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.Ilaunchthecitriibrowser()"
});
formatter.result({
  "duration": 10520091141,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinitions.Login.Ilaunchthecitriibrowser(Login.java:25)\r\n\tat ✽.Given I launch the citrii browser(src/test/java/Features/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.iEnterTheUsername()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.iEnterThePassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.iClickOnLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Close Browser",
  "description": "",
  "id": "login;close-browser",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Close_Browser"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I verified the error message",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on the close browser button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.iVerifiedTheErrorMessage()"
});
formatter.result({
  "duration": 1988565187,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinitions.ReusableMethods.ValidateTextOnPage(ReusableMethods.java:75)\r\n\tat StepDefinitions.Login.iVerifiedTheErrorMessage(Login.java:57)\r\n\tat ✽.Given I verified the error message(src/test/java/Features/Login.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.iClickOnTheCloseBrowserButton()"
});
formatter.result({
  "status": "skipped"
});
});