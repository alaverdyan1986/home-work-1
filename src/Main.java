public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //задача1
        byte red=3;
        short white=7;
        int green=9;
        long blue=3L;
        float black=3.5f;
        double yellow=12;
        boolean greenBig=green>11;
        char pink=44;
        //задача2
        float weightFirst=78.2f;
        float weightSecond=82.7f;
        float weihgtTotal=weightFirst+weightSecond;
        System.out.println("общий вес"+weihgtTotal+"кг");
        float weightDifference=weightSecond-weightFirst;
        System.out.println("разница весов"+weightDifference+"кг");
        //задача3
        byte weight1Banana=80;
        byte weight1Milk=105;
        byte weight1IceCream=100;
        byte weight1Egg=70;
        byte numberBanans=5;
        byte numberMilk=200/100;
        byte nuberIceCream=2;
        byte numberEggs=4;
        int weightBanans=weight1Banana*numberBanans;
        int weightMilk=weight1Milk*numberMilk;
        int weightIceCream=weight1IceCream*nuberIceCream;
        int weightEggs=weight1Egg*numberEggs;
        int weightBreakfast=weightBanans+weightMilk+weightIceCream+weightEggs;
        System.out.println("вес завтрака"+weightBreakfast+"грамм");
        float weightBreakfastKg=weightBreakfast/1000f;
        System.out.println("вес завтрака в кг"+weightBreakfastKg+"кг");
        //задача4
        int weightExcess=7*1000;
        short weightLose1=250;
        int numberDays1=weightExcess/weightLose1;
        System.out.println("уйдет"+numberDays1+"дней");
        short weightLose2=500;
        int numberDays2=weightExcess/weightLose2;
        System.out.println("уйдет"+numberDays2+"дней");
        //задача5
        int salaryMasha=67760;
        int salaryDenis=83690;
        int salaryKristina=76230;

        int increasedSalaryMasha=salaryMasha+salaryMasha*10/100;
        int increasedSalaryDenis=salaryDenis+salaryDenis*10/100;
        int increasedSalaryKristina=salaryKristina+salaryKristina*10/100;

        int diffSalaryMasha=increasedSalaryMasha-salaryMasha;
        int diffSalaryDenis=increasedSalaryDenis-salaryDenis;
        int diffSalaryKristina=increasedSalaryKristina-salaryKristina;
        System.out.println("Маша будет получать"+increasedSalaryMasha+"рублей");
        System.out.println("Денис будет получать"+increasedSalaryDenis+"рублей");
        System.out.println("Кристина будет получать"+increasedSalaryKristina+"рублей");
        int yearIncomeMasha=diffSalaryMasha*12;
        int yearIncomeDenis=diffSalaryDenis*12;
        int yearIncomeKristina=diffSalaryKristina*12;
        System.out.println("Маша годовой доход вырос"+yearIncomeMasha+"рублей");
        System.out.println("Денис годовой доход вырос"+yearIncomeDenis+"рублей");
        System.out.println("Кристина годовой доход вырос"+yearIncomeKristina+"рублей");









    }
}