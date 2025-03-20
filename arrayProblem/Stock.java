package arrayProblem;

public class Stock {

  public static void calculatingBestStock(int arr[]) {
    int buyingPrice = Integer.MAX_VALUE;
    int sellingPrice = 0;
    int maxProfit = Integer.MIN_VALUE;

    for (int price = 0; price < arr.length; price++) {
      sellingPrice = arr[price];

      if (buyingPrice < sellingPrice) {
        int profit = sellingPrice - buyingPrice < 0 ? 0 : sellingPrice - buyingPrice;

        if (maxProfit < profit) {
          maxProfit = profit;
        }
      }
      if (buyingPrice > sellingPrice) {
        buyingPrice = sellingPrice;
      }

    }
    System.out.println("buying price" + buyingPrice);
    System.out.println("maximum profit " + maxProfit);
  }

  public static void main(String[] args) {
    int price[] = { 7, 1, 5, 3, 6, 4 };
    calculatingBestStock(price);
  }
}
