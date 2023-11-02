package MainTasks.Mortgage;

public class Mortgage {
    public static void main(String[] args) {
        final int apartmentCost = 4567890;
        final double initialFee = 0.133;
        final double downPaymentAmount = apartmentCost * initialFee;

        System.out.println("Первоначальный взнос по ипотеке составляет " + downPaymentAmount + " рублей");
    }
}
