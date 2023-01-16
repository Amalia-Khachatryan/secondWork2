public class Main {
    public static void main(String[] args) {

        int initialInvoiceAmount = 100;
        int replenishmentAmount = 1100;
        int amountOfReplenishedRubForOneBonus = 100;
        int bonusRub;

//        int bonusRub = replenishmentAmount > 1000 ? replenishmentAmount / amountOfReplenishedRubForOneBonus : 0;

        if (replenishmentAmount > 1000) {
            bonusRub = replenishmentAmount / amountOfReplenishedRubForOneBonus;
        } else {
            bonusRub = 0;
        }

        int finalBalance = initialInvoiceAmount + replenishmentAmount + bonusRub;

        System.out.println("Итоговая сумма на счету: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonusRub);
    }
}
