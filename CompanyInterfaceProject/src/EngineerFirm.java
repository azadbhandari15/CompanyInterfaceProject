import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Logger;

public class EngineerFirm implements Company{

    static Logger logger
            = Logger.getLogger(
            EngineerFirm.class.getName());

    private int[] incomes;

    @Override
    public void assignSalaries(int[] salaries) {
        logger.info("Class EngineerFirm: Enter assign Salaries method");

        this.incomes=salaries;
        System.out.println("Incomes of engineers credited");

        logger.info("Class EngineerFirm: Exit assign Salaries method");
    }

    @Override
    public void averageSalary()
    {
        logger.info("Class EngineerFirm: Enter average salary method");

        double ans=(Arrays.stream(incomes).sum())/(incomes.length*1.0);
        System.out.printf("Average Salary of engineers is %.2f\n",ans);

        logger.info("Class EngineerFirm: Exit average salary method, Average Salary: "+ans);
    }

    @Override
    public void maxSalary()
    {
        logger.info("Class EngineerFirm: Enter maxSalary method");

        int max=Arrays.stream(incomes).max().getAsInt();
        System.out.println("Maximum Salary amongst engineer is "+max);
        logger.info("Class EngineerFirm: Exit maxSalary method, Maximum Salary: "+max);
    }

    @Override
    public void minSalary(){

        logger.info("Class EngineerFirm: Enter min Salary method ");

        int min= Arrays.stream(incomes).min().getAsInt();
        System.out.println("Minimum Salary amongst engineer is "+min);

        logger.info("Class EngineerFirm: Exit min Salary method, Minimum Salary: "+min);

    }
}
