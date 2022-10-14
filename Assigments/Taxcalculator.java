//Developers need to develop a tax calculator for calculating tax using
 //arithmetic, relational and logical operators.
import java.util.Scanner;
class TaxCalculator{
    float basicSalary;// test case 2
    boolean citizenship;//taking boolean variable
    float tax;
    void CalculateTax(float basicSalary){////method for calculating tax
        this.basicSalary=basicSalary;
        tax = 30*basicSalary/100; //given logic of calculation of tax ,
        System.out.println("The tax of the employee for the "+(int)basicSalary+" is "+(int)tax);///typecasting to convert float to int
    }
    void deductTax(){ //2nd method to get nettsalary
        float nettSalary;
        nettSalary = basicSalary-tax;
        System.out.println("THe nett salary of the employee "+(int)nettSalary); ////typecasting to convert float to int
    }
    void validateSalary(){ ////method for checking citizenship eligibility
        if(basicSalary>100000){
            citizenship=true;
        }
        else{
            citizenship=false;
        }
        System.out.println("The salary and citizenship eligibility : "+citizenship);
    }
}
class EmployeeTax { //new class for invoking the methods
    public static void main(String[] args) {
        TaxCalculator obj = new TaxCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Basic Salary : ");
        float b = sc.nextFloat();
        obj.CalculateTax(b);//invoking 1st method
        obj.deductTax(); //invoking 2nd method
        obj.validateSalary();//invoking 3rd method
    }
}