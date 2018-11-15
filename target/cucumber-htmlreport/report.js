$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test1.feature");
formatter.feature({
  "line": 2,
  "name": "Test1",
  "description": "",
  "id": "test1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Scenario1",
  "description": "",
  "id": "test1;scenario1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I start test",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I see result",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iStartTest()"
});
formatter.result({
  "duration": 146647232,
  "error_message": "java.lang.NullPointerException\n\tat com.steps.MyStepdefs.iStartTest(MyStepdefs.java:16)\n\tat ✽.Given I start test(Test1.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.iSeeResult()"
});
formatter.result({
  "status": "skipped"
});
});