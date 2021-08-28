 Feature: Eligibility Checker
 
 Scenario: Checking Eligibility with valid age group
 
 Given User Launch Browser
 And opens URL "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs"
 When  click on Start Now
 When  User Selects Wales 
 And click on Next
 When User Provide valid eligibile DOB
 And  click Next
 When User Select partner
 And click Next
 When User Select Benifit or Tax claims
 And click Next
 When User Select pregnent or not
 And click Next
 When User Select Injury or Illness in  armed forces
 And  click Next
 When User Select Diabetes 
 And  click Next
 When User Select glaucoma
 And  click Next
 When User Select live in care home
 And click Next
 When User Select savings
 And click Next
 Then User Should see result displaying what help he will get
  

  Scenario Outline: checking Eligibility with various age groups
  
  Given User Launch Browser
 And opens URL "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs"
 When  click on Start Now
 When  User Selects Wales 
 And click on Next
 When User Provide various eligible DOB "<Day>" "<Month>" "<Year>"
 And  click Next
 When User Select partner
 And click Next
 When User Select Benifit or Tax claims
 And click Next
 When User Select pregnent or not
 And click Next
 When User Select Injury or Illness in  armed forces
 And  click Next
 When User Select Diabetes 
 And  click Next
 When User Select glaucoma
 And  click Next
 When User Select live in care home
 And click Next
 When User Select savings
 And click Next
 Then User Should see result displaying what help he will get
  
  
      Examples:
      | Day | Month | Year  |
      | 15  | 08    | 2008  |
      | 25  | 06    | 1992  |
      | 16  | 05    | 1959  |