# BankingManagmentSystem
This is a simple console-based banking system implemented in Java. The system provides basic functionalities like deposit, withdrawal, and balance inquiry. Below are brief descriptions of the classes included in this system.

Classes
1. Main
Description: The main class of the banking system that contains the entry point (main method) for the program.
Responsibility: It handles user input, password verification, and invokes the necessary classes based on user choices.
Usage: Run this class to start the banking system.
2. Deposit
Description: Represents the deposit operation in the banking system.
Responsibility: Accepts the deposit amount from the user and updates the account balance.
Usage: Called when the user selects the deposit option in the main menu.
3. Withdrawal
Description: Represents the withdrawal operation in the banking system.
Responsibility: Accepts the withdrawal amount from the user, checks if sufficient funds are available, and updates the account balance.
Usage: Called when the user selects the withdrawal option in the main menu.
4. BalanceEnquiry
Description: Represents the balance inquiry operation in the banking system.
Responsibility: Displays the current account balance to the user.
Usage: Called when the user selects the balance inquiry option in the main menu.
Password Management
The system uses a simple password mechanism to secure access to banking operations.
The password is stored in a file (password.txt).
If the password file does not exist, the system prompts the user to set a new password.
During subsequent runs, the system verifies the entered password with the stored password before allowing access to banking operations.
Usage
Run the Main class to start the banking system.
Follow the on-screen instructions to perform deposit, withdrawal, or balance inquiry.
The system verifies the password before allowing access to banking operations.
Note: This is a basic console application for educational purposes. In a real-world scenario, more sophisticated security measures and user interfaces would be necessary.
