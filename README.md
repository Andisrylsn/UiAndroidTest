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

![image](https://github.com/user-attachments/assets/af385619-1bdf-402a-ac5e-334fe52b4297)



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

