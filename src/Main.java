public class Main {

    public static void main(String[] args) {
        int initialAccountSum = 100;
        int replenishment = 10001;
        int minReplenishmentForBonuses = 1000;
        int bonusCost = 100;

        int bonusAmount = replenishment > minReplenishmentForBonuses ? replenishment / bonusCost : 0;
        int totalAmount = initialAccountSum + replenishment + bonusAmount;

        System.out.println("Total balance: " + totalAmount + "₽");
        System.out.println(bonusAmount + "₽ " + "bonuses included");
    }

}