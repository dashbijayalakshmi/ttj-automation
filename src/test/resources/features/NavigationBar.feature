Feature: Verify NavigationBar for talktojit.com

Scenario: TC01_Navigation bar Home
  Given Edge browser is launched
  When User go to url "https://www.talktojit.com"
  Then Home link should display "Home"

Scenario: TC02_Navigation bar Services
  Given Edge browser is launched
  When User go to url "https://www.talktojit.com"
  Then Services link should display "Services"  
  
Scenario: TC03_Navigation bar Products
   Given Edge browser is launched
   When User go to url "https://www.talktojit.com" 
   Then Products link should display "Products"
   
Scenario: TC04_Navination bar About Us
   Given Edge browser is launched
   When User go to url "https://www.talktojit.com"
   Then About Us link should display "About us"
   
Scenario: TC05_navination bar Login/SignUp 
   Given Edge browser is launched
   When User go to url "https://www.talktojit.com"
   Then Login link should display "Login/SignUp"   
   