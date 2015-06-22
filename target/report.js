$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login_Feature.feature");
formatter.feature({
  "id": "user-story:-basic-login",
  "description": "",
  "name": "User Story: Basic login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "user-story:-basic-login;login-with-valid-user-jumps-to-the-loginpage",
  "tags": [
    {
      "name": "@login",
      "line": 13
    }
  ],
  "description": "",
  "name": "login with valid user jumps to the LoginPage",
  "keyword": "Scenario",
  "line": 14,
  "type": "scenario",
  "comments": [
    {
      "value": "###########################################",
      "line": 3
    },
    {
      "value": "# Testspec:",
      "line": 4
    },
    {
      "value": "###########################################",
      "line": 5
    },
    {
      "value": "# valid user/password: admin/admin, validUser/validUser",
      "line": 6
    },
    {
      "value": "# invalid user: invalidUser, ..., and everything else",
      "line": 7
    },
    {
      "value": "# invalid password: invalidPassword, ..., and everything else",
      "line": 8
    },
    {
      "value": "# Title Login Page: \"Login Page\"",
      "line": 9
    },
    {
      "value": "# Title Home Page: \"Home Page\"",
      "line": 10
    },
    {
      "value": "#",
      "line": 11
    },
    {
      "value": "#",
      "line": 12
    }
  ]
});
formatter.step({
  "name": "Landing Page is loaded",
  "keyword": "Given ",
  "line": 15
});
formatter.step({
  "name": "Link exists \"Home\"",
  "keyword": "Then ",
  "line": 16
});
formatter.match({
  "location": "LoginTests.Landing_Page_is_loaded()"
});
formatter.result({
  "duration": 9998485554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 13
    }
  ],
  "location": "LoginTests.Link_exists(String)"
});
formatter.result({
  "duration": 1734180751,
  "status": "passed"
});
});