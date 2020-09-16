Account List Enquiry and Account Transaction Enquiry -

Main features-
A SpringBoot application is developed including JPA and H2 database
Data insertion queries are stored in data.sql inside resources folder

Modules-
The two functionalities Account List Enquiry and Account Transaction Enquiry are implemented using SpringBoot REST APIs

REST API URLs-
1. To view account list
http://localhost:8080/accounts/user/123

2. To view account transactions
http://localhost:8080/transactions/account/1

Assumptions-
When ever a transaction is made, balance is calculated and updated in the USER_ACCOUNTS table
