import java.util.Scanner;

public class CalculateDeposit{
   public static void main(String[] args)
    {
        new CalculateDeposit().doImportantJob();
    }
   double calculateComplexPercentFunction(double doubleAmount, double doubleYearRate, int depositPeriod) {
       double pay = doubleAmount * Math.pow((1 + doubleYearRate / 12), 12 * depositPeriod);
       return rnd(pay, 2);
   }

   double calculateSimplePercentFunction( double doubleAmount, double doubleYearRate, int depositPeriod ) {
       return rnd(doubleAmount + doubleAmount * doubleYearRate * depositPeriod, 2);
   }

   double rnd(double value, int places) {
       double ScaLe= Math.pow(10, places);
       return Math.round(value * ScaLe) / ScaLe;
   }

    void doImportantJob() {
        int period;
        int action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:") ;
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:") ;
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double outDoubleVar = 0;
        if (action ==1) outDoubleVar = calculateSimplePercentFunction(amount, 0.06, period);
        else if (action == 2){
            outDoubleVar = calculateSimplePercentFunction(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
   }
}
