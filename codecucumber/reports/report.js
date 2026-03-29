$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/login.feature");
formatter.feature({
  "name": "BookCart application demo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login should be success",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the username as \"Admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterTheUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterThePasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClickTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be success",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginShouldBeSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should be fail",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the username as \"Admins\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterTheUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password as \"admin1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterThePasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClickTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be fail",
  "keyword": "But "
});
formatter.match({
  "location": "LoginSteps.loginShouldBeFail()"
});
formatter.result({
  "status": "passed"
});
});