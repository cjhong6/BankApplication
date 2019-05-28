# BankApplication
Scenario: I am a Backend developer and need to create an application to handle new customer bank account request.
The application do the following:
- Read .CSV file of names, social security number, account type, and inital deposit
- Use Linked List to hold all these accounts.
- Both Checking and Savings share deposite(), withdraw(), transfer(), showInfo()
- Generate 11 digits account number(generate with the following process: 1 or 2 depending on Savings or Checking, last 2 digits of SSN, unique 5 digits number, and random 3 digits number.
- Savings Account holders are given a Safety Deposite Box, identify by a 3 digits number and accessed with 4 digits code.
- Checking Account holders are assigned a Debit Card with 12 digits number and 4 digits PIN.
- Both account will use an interface that determine the interest rate.
- The showInfo() will print account information as well as information specific to the Checking and Savings account.
