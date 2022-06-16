Feature: OrangeHRM

Scenario Outline: Valid Login into OrangeHRM

Given User enters into LoginPage
When User enters <username> and <password>
And Click on LoginBtn
Then User lands on HomePage

Examples:
						|username|password|
						|admin|admin123|
						|Admin|admin1234|