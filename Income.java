package stia1123_test2;
/**
 *
 * @author Amirul Luqman
 */
public class Income {
    private String incomeType;
    private double amount;
    private double tax;
    private double totaltax;
    
    Income(){
    }
    Income(String incomeType, double amount, double tax){
        this.incomeType = incomeType;
        this.amount = amount;
        this.tax = tax;
        this.totaltax = (tax/100) * this.amount;
        
    }
    String getIncomeType(){
        return incomeType;
    }
    double getAmount(){
        return amount;
    }
    double getTax(){
        return tax;
    }
    double getTotalTax(){
        return totaltax;
    }
}
