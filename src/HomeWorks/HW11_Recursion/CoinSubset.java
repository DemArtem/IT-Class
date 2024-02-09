package HomeWorks.HW11_Recursion;
//В кошельке есть набор монет. Вывести перебором все возможные подмножества монет для оплаты заданной суммы.

import java.util.ArrayList;
import java.util.List;

public class CoinSubset {
    public static void main(String[] args) {
        double[] coins = {0.1, 0.2, 0.5, 1, 2};
        double targetSum = 2.2;

        List<Double> subset = new ArrayList<>();
        findCoinSubset(coins, targetSum, subset, 0);
    }

    public static void findCoinSubset(double[] coins, double remainingSum, List<Double> subset, int startIndex) {
        if (remainingSum == 0) {
            System.out.println(subset);
        } else if (remainingSum > 0) {
            for (int i = startIndex; i < coins.length; i++) {
                subset.add(coins[i]);
                findCoinSubset(coins, remainingSum - coins[i], subset, i);
                subset.remove(subset.size() - 1);
            }
        }
    }
}
