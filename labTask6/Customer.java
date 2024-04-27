public class Customer {
    int nid;
    String name;
    SavingAccount savingAccounts[];
    FixedAccount fixedAccounts[];

    public Customer() {

    }

    public Customer(int nid, String name, int size1, int size2) {
        this.nid = nid;
        this.name = name;
        savingAccounts = new SavingAccount[size1];
        fixedAccounts = new FixedAccount[size2];
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNid() {
        return nid;
    }

    public String getName() {
        return name;
    }

    public void addSavingAccount(SavingAccount sa) {
        for (int i = 0; i < savingAccounts.length; i++) {
            if (savingAccounts[i] == null) {
                savingAccounts[i] = sa;
                break;
            }
        }
    }

    public void removeSavingAccount(SavingAccount sa) {
        for (int i = 0; i < savingAccounts.length; i++) {
            if (savingAccounts[i] == sa) {
                savingAccounts[i] = null;
                break;
            }
        }
    }

    public void showAllSavingAccounts() {
        for (int i = 0; i < savingAccounts.length; i++) {
            if (savingAccounts[i] != null) {
                System.out.println("Account No: " + savingAccounts[i].getAccountNo());
                System.out.println("Balance: " + savingAccounts[i].getBalance());
                System.out.println("Interest Rate: " + savingAccounts[i].getInterestRate());
            }
        }
    }

    public void addFixedAccount(FixedAccount fa) {
        for (int i = 0; i < fixedAccounts.length; i++) {
            if (fixedAccounts[i] == null) {
                fixedAccounts[i] = fa;
                break;
            }
        }
    }

    public void removeFixedAccount(FixedAccount fa) {
        for (int i = 0; i < fixedAccounts.length; i++) {
            if (fixedAccounts[i] == fa) {
                fixedAccounts[i] = null;
                break;
            }
        }
    }


    public void showAllFixedAccounts() {
        for (int i = 0; i < fixedAccounts.length; i++) {
            if (fixedAccounts[i] != null) {
                System.out.println("Account No: " + fixedAccounts[i].getAccountNo());
                System.out.println("Balance: " + fixedAccounts[i].getBalance());
                System.out.println("Tenure Year: " + fixedAccounts[i].getTenureYear());
            }
        }
    }
}