package stia1123_test2;
/**
 *
 * @author Amiful Luqman
 */
public class Staff {
    private String name, id;
    private Income income;
    
    Staff(){       
    }
    Staff(String name, String id, Income income){
        this.name = name;
        this.id = id;
        this.income = income;
    }
    String getname(){
        return name;
    }
    String getid(){
        return id;
    }
    public double calculateNetIncome(){
        return income.getAmount()-income.getTotalTax();
    }
    void displayStaffInfo(){
        System.out.println("<<<< STAFF INFO >>>>>");
        System.out.println("Name: "+ this.name);
        System.out.println("ID: " + this.id);
        System.out.println("");
    }
    void displayIncomeInfo(){
        System.out.println("<<<< INCOME INFO >>>>");
        System.out.println("Income amount: RM " + income.getAmount());
        System.out.println("Tax: RM " + income.getTax());
        System.out.println("Total Tax Paid: RM " + income.getTotalTax());
        System.out.println("Total Net Income: RM " + calculateNetIncome());
        System.out.println("Income type: " + income.getIncomeType());
    }
}
