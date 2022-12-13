# Tetiana_Alokhina

Откройте https://opensource-demo.orangehrmlive.com/.

  Ваш скрипт должен выполнить вход на сайт с учетными данными, указанными чуть выше
форма входа (вход чуствительный к регистру - при присутствии пробелов).

Сценарий:

1. Add new job: Student or Intern (Go to Admin -> Job - Job Titles -> Click on the Add button)
           Add job title
           Add Job Description: free text up to 20 chars
           Add note
           Save changes
2. Check that your changes are visible on the Job Title page
3. Select your field, click the 

Delete Selected button and make sure your field is removed.




**To run the tests:**
```
mvn clean test
```
**To generate a report into temp folder**
```
mvn allure:serve
```
**To generate a report into temp folder and open it in web server**
```
mvn allure:report
```
