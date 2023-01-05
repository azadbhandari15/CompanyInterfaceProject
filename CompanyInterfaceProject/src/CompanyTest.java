import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompanyTest {


    static Logger logger
            = Logger.getLogger(
            CompanyTest.class.getName());

    public static void main(String[] args)
    {
        logger.info("Enter main method");
        Scanner sc=new Scanner(System.in);
        int numberOfEngineers=sc.nextInt();
        int numberOfAccountants=sc.nextInt();

        int[] engineersSalary=new int[numberOfEngineers];
        int[] accountantSalary=new int[numberOfAccountants];

        for(int i=0;i<numberOfEngineers+numberOfAccountants;i++)
        {
            if(i<numberOfEngineers) {
                engineersSalary[i] = sc.nextInt();
            }
            else
            {
                accountantSalary[i-numberOfEngineers]=sc.nextInt();
            }
        }

        EngineerFirm engineerFirm=new EngineerFirm();
        AccountantFirm accountantFirm=new AccountantFirm();

        engineerFirm.assignSalaries(engineersSalary);
        accountantFirm.assignSalaries(accountantSalary);

        engineerFirm.averageSalary();
        engineerFirm.maxSalary();
        engineerFirm.minSalary();

        accountantFirm.averageSalary();
        accountantFirm.maxSalary();
        accountantFirm.minSalary();

        logger.info("Exit main method");
    }
}
