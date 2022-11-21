Feature: Verify Login API for talktojit.com

	Scenario: TC01_Login API_ Valid credentials
    Given Request base url is "https://www.talktojit.com"
    And Request body format is "application/json"
    And Request body is "{\"email\":\"abc@gmail.com\",\"password\":\"abc@gmail.com\"}"
    When the POST request is sent to path "/api/token"
    Then Response status should be 200
    And Response body should have field "token" with length 36
    And Response body should have null field "error" 
    
	Scenario: TC02_Login API_ Invalid credentials
    Given Request base url is "https://www.talktojit.com"
    And Request body format is "application/json"
    And Request body is "{\"email\":\"abc@gmail.com\",\"password\":\"def@gmail.com\"}"
    When the POST request is sent to path "/api/token"
    Then Response status should be 200
    And Response body should have null field "token" 
    And Response body should have field "error" with value "Invalid User credentials!!! Please try again..."
    