$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TC01 loginintoApp.feature");
formatter.feature({
  "line": 1,
  "name": "login in to application.",
  "description": "",
  "id": "login-in-to-application.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login in to application with browser",
  "description": "",
  "id": "login-in-to-application.;login-in-to-application-with-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open the browser and launch application",
  "rows": [
    {
      "cells": [
        "Broser",
        "UTL"
      ],
      "line": 6
    },
    {
      "cells": [
        "Chrome",
        "https://www.redbus.in/"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "give user name and password",
  "rows": [
    {
      "cells": [
        "Username",
        "passwoerd"
      ],
      "line": 9
    },
    {
      "cells": [
        "demouser",
        "Demopasswored"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login_stp_def.open_the_browser_and_launch_application(DataTable)"
});
formatter.result({
  "duration": 21791045702,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});