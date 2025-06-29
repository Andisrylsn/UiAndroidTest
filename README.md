# UiAndroidTest
TestingUiWithAppium

Automated UI testing project for the **MyDemoApp Android** application using **Appium**, **Cucumber**, and **Java**.

| Tool                  | Required Version    | Purpose                            |
|-----------------------|---------------------|------------------------------------|
| Java Development Kit  | 11 or higher        | To build and run the project       |
| Apache Maven          | 3.6+                | Dependency & test management       |
| Node.js               | Latest LTS          | Required for Appium server         |
| Appium Server         | 2.x (CLI or Desktop)| Mobile automation engine           |
| Android Studio        | Latest              | Emulator/device & SDK management   |
| Appium Inspector      | (Optional)          | For element inspection             |
| AVD (Emulator)        | Android 14 (API 34) | Run the Android app                |

---

project-root/
├── src/
│ ├── main/java/utility/DriverManager.java # Appium driver setup
│ ├── test/java/features/ # Feature files
│ ├── test/java/pages/ # Page Object classes
│ ├── test/java/stepDefinition/ # Step Definitions
│ └── test/java/runner/TestRunner.java # Cucumber test runner
├── pom.xml # Maven config
└── README.md # This documentation


Step:
1. Install Java
java -version

2. Install Maven
mvn -version

3. Install Node.js & Appium
npm install -g appium

4. Start Appium Server
appium

5. Clone the Repository
git clone https://github.com/Andisrylsn/UiAndroidTest
cd UiAndroidTest
Build the Project (dont forget to reload maven)
mvn clean install

Run the Tests
1. Run from TestRunner Java Class
After test execution, reports are generated here:
target/cucumber-reports.html
Open the HTML file in a browser to view detailed results.

