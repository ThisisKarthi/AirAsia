$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/AirAsia/feature/AirAsia.feature");
formatter.feature({
  "line": 1,
  "name": "Book Tickets With User Data",
  "description": "",
  "id": "book-tickets-with-user-data",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Detials Page",
  "description": "",
  "id": "book-tickets-with-user-data;detials-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Can Launch The Browser And Book Tickets",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition_AA.user_Can_Launch_The_Browser_And_Book_Tickets()"
});
formatter.result({
  "duration": 15506072800,
  "status": "passed"
});
});