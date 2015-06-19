Feature: User Story: Basic login

  ###########################################
  # Testspec:
  ###########################################
  # valid user/password: admin/admin, validUser/validUser
  # invalid user: invalidUser, ..., and everything else
  # invalid password: invalidPassword, ..., and everything else
  # Title Login Page: "Login Page"
  # Title Home Page: "Home Page"
  #
  #
  Scenario: login with valid user jumps to the LoginPage
    Given navigate to "Home Page"
    And validate Page loaded "HomePage"
    When login as user "validUser" and password "validUserPassword"
    Then validate Page loaded "Login Page"

    Scenario: login with valid user jum
    Given navigate to "Home Page"
    And validate Page loaded "HomePage"
    When login as user "validUser" and password "validUserPassword"
    Then validate Page loaded "Login Page"