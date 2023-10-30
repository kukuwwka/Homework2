public class TravelTime {
    public static void main(String[] args) {
        final int distance = 7;
        final double speed = 40.6;
        final double timeWithoutCoeff = distance / speed;
        final double eveningCoef = 1.33;
        final double timeWithCoef = timeWithoutCoeff * eveningCoef;
        System.out.println(timeWithCoef);
    }
}
