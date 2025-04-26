# Selenium Automation Tests

This project contains automation tests using **Selenium WebDriver** for different functionalities on the [Formy Project](https://formy-project.herokuapp.com/) website.

## Project Overview

The project includes:
- **Keyboard and Mouse Input Automation**: Interacting with form elements using the keyboard and mouse.
- **File Upload Automation**: Automating file upload functionality.
- **Radio Button Automation**: Automating interaction with radio buttons.
- **Form Submission Automation**: Filling out and submitting a form.
- **Window Switching Automation**: Handling browser window switching.

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    ```

2. **Install dependencies**:
    - Ensure you have **Java** and **Maven** set up.
    - Install **Selenium WebDriver** and **WebDriverManager**:
      - Add the necessary dependencies in your `pom.xml` (if you're using Maven).
      
      Example Maven dependencies:
      ```xml
      <dependencies>
          <dependency>
              <groupId>org.seleniumhq.selenium</groupId>
              <artifactId>selenium-java</artifactId>
              <version>3.141.59</version>
          </dependency>
          <dependency>
              <groupId>io.github.bonigarcia</groupId>
              <artifactId>webdrivermanager</artifactId>
              <version>5.0.3</version>
          </dependency>
      </dependencies>
      ```

3. **Run the tests**:
    - In **Spring Tool Suite (STS)** or your preferred IDE, right-click the test file (e.g., `KeyboardMouseInput.java`, `FormTest.java`, etc.).
    - Select **Run As** → **Java Application**.
    - You can also run the tests from the command line using Maven:
    ```bash
    mvn test
    ```

4. **Test Details**:
    - **Keyboard and Mouse Input**: The test will visit the "Keyboard and Mouse Input" page, interact with the input field, type in "Raygun", and click a button.
    - **File Upload**: Upload a file through the file upload form.
    - **Radio Button**: Automates clicking on radio buttons.
    - **Form Submission**: Fills out a form, selects radio buttons, checkboxes, dropdowns, and submits it.
    - **Window Switching**: Opens a new window and switches between the original window and the new one.

## License

This project is licensed under the MIT License.

## Acknowledgements

- **Selenium WebDriver** for browser automation.
- **WebDriverManager** for automatic management of driver binaries.
- [Formy Project](https://formy-project.herokuapp.com/) for providing a variety of interactive elements to automate.
