## 🚀 Selenium Automation – Integrated ExtentReports for Rich HTML Reporting
As part of enhancing my Selenium + Java + TestNG framework, I’ve successfully integrated ExtentReports with ITestListener into my hands-on project to provide visually detailed, real-time test execution reports.

---

### ✅ What I Achieved with ExtentReports:
1. Interactive HTML test reports with pass/fail/skip status
2. Timestamped test steps and logs
3. Screenshot attachments for failed tests
4. System and environment info in the report
5. Report generation for each test run

---
### 🗂 Project Structure
<img width="476" height="827" alt="01_ProjectStructure" src="https://github.com/user-attachments/assets/a99542fa-48c6-4b04-ba8f-8fdfdf4a758e" />

---

### 🛠 What I Implemented
1. Added ExtentReports dependency in pom.xml  
    - Integrated the latest ExtentReports library using Maven
      <img width="1396" height="180" alt="02_Added_Dependency" src="https://github.com/user-attachments/assets/2ef4c596-991d-4678-9918-654d7039cae6" />

2. Created a custom ExtentReportManager class  
    - Responsible for initializing and configuring the ExtentReport (theme, title, report name, etc.)
      <img width="1444" height="532" alt="03_ExtentReportManager" src="https://github.com/user-attachments/assets/04946c58-ef07-45dc-8b14-281b1ab0c00d" />

3. Developed a ReportListener class implementing ITestListener
    - Hooked into test lifecycle events to log test start, pass, fail, and skip statuses
      <img width="1034" height="1289" alt="04_ReportListeners" src="https://github.com/user-attachments/assets/5df54951-8e60-4a4e-bc79-298d6e28b0fe" />

4. Captured screenshots automatically on test failures
    - Used a reusable utility method (ScreenshotUtil) and attached images to the report
      <img width="1444" height="407" alt="05_ScreenshotUtil" src="https://github.com/user-attachments/assets/584e01a7-743f-4e32-9590-e14b414ff811" />

5. Injected system and environment info into the report
    - Included details like OS name, tester name, browser info using ExtentReports API
      <img width="1920" height="1032" alt="08_ExtentReport6" src="https://github.com/user-attachments/assets/be94eca2-7485-4ff8-ae61-1a412e1a4794" />

6. Integrated listener with TestNG  
    - Registered the ReportListener in testng.xml for seamless report generation on test execution
      <img width="1396" height="301" alt="06_Testng_xml" src="https://github.com/user-attachments/assets/d1d94659-21c7-40db-9c5b-0d11811d3abc" />

7. Usage in Test & Page Classes  
    - Report steps logged directly in page methods
      <img width="1034" height="1419" alt="07_LoginPage" src="https://github.com/user-attachments/assets/ca3a7577-d481-4227-8cf9-824a5c23094b" />  

      <img width="1034" height="985" alt="07_ProductPage" src="https://github.com/user-attachments/assets/cadfbf1f-7f48-42fc-9b8e-32adfef90319" />  

### 📄 Sample Reports
<img width="1920" height="1032" alt="08_ExtentReport1" src="https://github.com/user-attachments/assets/80e7c8ff-7321-47ff-87bf-10dbe3810d57" />  
<img width="1920" height="1032" alt="08_ExtentReport2" src="https://github.com/user-attachments/assets/ba820d82-96c2-4cfe-a275-b3ae058cfa46" />  
<img width="1920" height="1032" alt="08_ExtentReport3" src="https://github.com/user-attachments/assets/75766642-e5bf-4952-b70e-ae8af2380c26" />  
<img width="1920" height="1032" alt="08_ExtentReport4" src="https://github.com/user-attachments/assets/824b6242-e5fe-4aae-bea2-cbcc2cfd2b33" />  
<img width="1920" height="1032" alt="08_ExtentReport5" src="https://github.com/user-attachments/assets/d83dcbd9-6606-4d52-b106-a4b26f2f1d4d" />  
<img width="1920" height="1032" alt="08_ExtentReport6" src="https://github.com/user-attachments/assets/68b06897-c65f-497c-9ce4-93de7d2aa999" />  

---

### ▶️ Steps to Run This Project
1. Create and Clone the project to selenium-automation-generating-reports-using-extentreports folder
```
git clone https://github.com/amulsinfal/selenium-automation-generating-reports-using-extentreports.git
```

2. Go to the folder selenium-automation-generating-reports-using-extentreports containing the testng.xml file.
```
cd selenium-automation-generating-reports-using-extentreports
```

3. Open command prompt from this location and Run maven command in command prompt.
```
mvn test
```

<img width="1080" height="1872" alt="09_mvn_test" src="https://github.com/user-attachments/assets/95c11db7-615c-4bf3-af58-d3572d309306" />

---

### 🎯 Key Benefits
1. Structured and visually intuitive reports
2. Easy debugging with attached failure screenshots
3. Team-ready output (shareable HTML reports)
4. Enhances overall test reporting clarity

---

### 📌 Conclusion
Integrating ExtentReports with Selenium + Java + TestNG has significantly enhanced the quality and clarity of test reporting. With detailed logs, visual feedback through screenshots, and system metadata all in one place, debugging becomes faster and sharing results becomes easier. This implementation not only helps in monitoring execution flow in real-time but also It’s great for debugging, presenting to teams, and showcasing to all stakesholders.

**Note:** This setup is currently intended for sequential execution. For parallel testing, it would require enhancements like ThreadLocal<ExtentTest> to ensure thread-safe report logging across concurrent threads. I am enhancing my skills on parallel testing topics as well.
