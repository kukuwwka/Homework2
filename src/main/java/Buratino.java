public class Buratino {
    public static void main(String[] args) {
        final int appBuratino = 214;
        final int appKarabas = 123;
        final int karabasVor = appBuratino - appKarabas;

        String buratino = "У Буратино осталось яблок";
        String words[] = buratino.split(",");
        for (String word : words) {
            System.out.println(word);
            System.out.println(karabasVor);
        }
    }
}
