package MainTasks.Sale;

public class Sale {
    public static void main(String[] args) {
        final int shirtWithoutSale = 1500;                                                                             // цена без скидки
        final int amountOfSelShirt = 4;                                                                                // кол-во выбранных рубашек
        final int amountShirtToGetDisc = 5;                                                                            // кол-во рубашек, которые надо купить, чтобы получить скидку
        final int toGetDiscount = amountShirtToGetDisc - amountOfSelShirt;                                             // кол-во рубашек, которые надо докупить для получения скиидки
        final int priceOfSelShirtsWithoutDisc = shirtWithoutSale * amountOfSelShirt;                                   // общая цена уже выбранных рубашек без скидки
        final int priceOfAmountOfSelShirt = toGetDiscount * shirtWithoutSale;                                          // общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку
        final double discount = 0.3;
        final double totalPriceWithDisc = amountShirtToGetDisc * (shirtWithoutSale - (discount * shirtWithoutSale));   // цена всех рубашек со скидкой
        final double shirtWithSale = shirtWithoutSale - (shirtWithoutSale * discount);                                 // цена одной рубашки со скидкой
        final double economy = priceOfSelShirtsWithoutDisc + (shirtWithoutSale * toGetDiscount) - totalPriceWithDisc;
        final double freebie = economy / shirtWithoutSale;

        System.out.println("цена без скидки " + shirtWithoutSale);
        System.out.println("кол-во выбранных рубашек " + amountOfSelShirt);
        System.out.println("кол-во рубашек, которые надо купить, чтобы получить скидку " + amountShirtToGetDisc);
        System.out.println("кол-во рубашек, которые надо докупить для получения скиидки " + toGetDiscount);
        System.out.println("общая цена уже выбранных рубашек без скидки " + priceOfSelShirtsWithoutDisc);
        System.out.println("общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку — " + priceOfAmountOfSelShirt);
        System.out.println("Скидка " + discount * 100 + "%");
        System.out.println("цена всех рубашек со скидкой " + totalPriceWithDisc);
        System.out.println("цена одной рубашки со скидкой " + shirtWithSale);
        System.out.println("Экономия составляет " + economy + " рублей");
        System.out.println("На халяву рубашек получено " + freebie);

        /*Вывод:
        цена без скидки 1500
        кол-во выбранных рубашек 4
        кол-во рубашек, которые надо купить, чтобы получить скидку 5
        кол-во рубашек, которые надо докупить для получения скиидки 1
        общая цена уже выбранных рубашек без скидки 6000
        общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку — 1500
        Скидка 30.0%
        цена всех рубашек со скидкой 5250.0
        цена одной рубашки со скидкой 1050.0
        Экономия составляет 2250.0 рублей
        На халяву рубашек получено 1.5
         */
    }
}
