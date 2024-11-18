## Allure Report Setup Guide

### 1. Serve Allure Report
- Run the following command to start the Allure server and view the report:
  ```bash
  allure serve
  ```

### 2. Generate and Open Allure Report Locally
- **Step-by-Step Instructions**:
    1. Run tests to generate the `allure-results` folder.
    2. Copy the `history` folder from `allure-report` to `allure-results` to retain history in the new report:
       ```bash
       cp -r allure-report/history allure-results
       ```
    3. Delete the existing `allure-report` folder:
       ```bash
       rm -rf allure-report
       ```
    4. Generate a new Allure report:
       ```bash
       allure generate
       ```
    5. Open the newly generated Allure report:
       ```bash
       allure open
       ```

### Notes
- Ensure that the Allure CLI is properly installed and available in the system PATH.
