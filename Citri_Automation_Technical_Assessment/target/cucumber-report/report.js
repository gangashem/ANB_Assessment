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
  "duration": 39424056107,
  "status": "passed"
});
formatter.match({
  "location": "Login.iEnterTheUsername()"
});
formatter.result({
  "duration": 3628047704,
  "status": "passed"
});
formatter.match({
  "location": "Login.iEnterThePassword()"
});
formatter.result({
  "duration": 2227427885,
  "status": "passed"
});
formatter.match({
  "location": "Login.iClickOnLoginButton()"
});
formatter.result({
  "duration": 4853942520,
  "status": "passed"
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
  "duration": 2927139801,
  "status": "passed"
});
formatter.match({
  "location": "Login.iClickOnTheCloseBrowserButton()"
});
formatter.result({
  "duration": 10045314660,
  "status": "passed"
});
});