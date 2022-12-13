Feature: OrangeHRM

  Background: I am logged into my account
    Given I am logged into my account

  Scenario: Add a new job
    Given I am on https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveJobTitle
    When I filled in "Job Title", "Job Description" and "Note" fields
    And click on the "Save" button
    Then I should see a new field with added job

  Scenario: Delete a job
    Given I am on https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewJobTitleList
    When I click on the "Delete" button
    And click on the "Yes,Delete" button
    Then I can't see this field
