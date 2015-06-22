Feature: User Story: Basic login

  ###########################################
  # Testspec:
  ###########################################
  # valid user/password: admin/admin, validUser/validUser
  # invalid user: invalidUser, ..., and everything else
  # invalid password: invalidPassword, ..., and everything else
  # Title Login Page: "Login Page"
  # Title Home Page: "Home Page"
  # Test
  #
  @login
  Scenario: login with valid user jumps to the LoginPage
    Given Landing Page is loaded
    Then Link exists "Home"


