import java.util.Arrays;
import java.util.logging.Logger;

public class AccountantFirm implements Company{

    private int[] incomes;

    static Logger logger
            = Logger.getLogger(
            AccountantFirm.class.getName());

    @Override
    public void assignSalaries(int[] salaries){
        logger.info("Class AccountantFirm: Enter assign Salaries method");
        this.incomes=salaries;
        System.out.println("Incomes of accountants credited");
        logger.info("Class AccountantFirm: Exit assign Salaries method");
    }

    @Override
    public void averageSalary()
    {
        logger.info("Class AccountantFirm: Enter average salary method");

        double average=(Arrays.stream(incomes).sum())/(incomes.length*1.0);
        System.out.printf("Average Salary of accountants is %.2f\n",average);

        logger.info("Class AccountantFirm: Exit average salary method, Average Salary: "+average);
    }

    @Override
    public void maxSalary()
    {
        logger.info("Class AccountantFirm: Enter maxSalary method");

        int max= Arrays.stream(incomes).max().getAsInt();
        System.out.println("Maximum Salary amongst accountants is "+max);

        logger.info("Class AccountantFirm: Exit maxSalary method, Maximum Salary: "+max);
    }

    @Override
    public void minSalary(){
        logger.info("Class AccountantFirm: Enter min Salary method ");
        int min=Arrays.stream(incomes).min().getAsInt();
        System.out.println("Minimum Salary amongst accountants is "+min);
        logger.info("Class AccountantFirm: Enter min Salary method ");
    }
}
