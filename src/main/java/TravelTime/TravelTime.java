package TravelTime;

public class TravelTime {
    public static void main(String[] args) {
        final int distance = 7;
        final double speed = 40.6;
        final double timeWithoutCoeff = distance / speed;
        final double eveningCoef = 1.33;
        final double timeWithCoef = timeWithoutCoeff * eveningCoef;

        System.out.println("Без трафика тестировщик добирается от дома до офиса за " + timeWithoutCoeff + " часов");
        System.out.println("С трафиком тестировщик добирается от дома до офиса за " + timeWithCoef + " часов");
    }
}
