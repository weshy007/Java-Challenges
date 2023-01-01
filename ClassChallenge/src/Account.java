public class Account {
        private String accountNumber;
        private double accountBalance;
        private String customerName;
        private String customerEmail;
        private String phoneNumber;

        public Account() {
            this("56789", 2.50, "Default name",
                    "Default address", "Default phoneNumber");
            System.out.println("Empty constructor");
        }

        public Account(String number, double accountBalance, String customerName,
                       String customerEmail, String phoneNumber) {
            System.out.println("Account constructor with parameters called");
            this.accountNumber = number;
            this.accountBalance = accountBalance;
            this.customerName = customerName;
            customerEmail = customerEmail;
            phoneNumber= phoneNumber;
        }


        public void depositFunds(double depositAmount) {
            accountBalance += depositAmount;
            System.out.println("Deposit of KSH " + depositAmount + " made. New " +
                    "balance is KSH " + accountBalance);
        }

        public void withdrawFunds(double withdrawalAmount) {
            if(accountBalance - withdrawalAmount < 0) {
                System.out.println("Insufficient Funds! You only have KSH " + accountBalance +
                " in your account.");
            } else {
                accountBalance -= withdrawalAmount;
                System.out.println("Withdrawal of KSH " + withdrawalAmount +
                        " processed. Remaining balance is KSH " + accountBalance);
            }
        }


        public double getAccountBalance() {
            return accountBalance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void setAccountBalance(int accountBalance) {
            this.accountBalance = accountBalance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getEmail() {
            return customerEmail;
        }

        public void setEmail(String email) {
            this.customerEmail = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


}

