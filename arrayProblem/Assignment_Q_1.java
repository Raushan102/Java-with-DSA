package arrayProblem;

public record Assignment_Q_1() {
  public static void check(int arr[]) {
    int buyingPrice = Integer.MAX_VALUE;
    int maxProfit = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int sellingPrice = arr[i];
      if (buyingPrice > sellingPrice) {
        buyingPrice = sellingPrice;
      }
      if (buyingPrice < sellingPrice) {
        int profit = sellingPrice - buyingPrice < 0 ? 0 : sellingPrice - buyingPrice;
        if (profit > maxProfit) {
          maxProfit = profit;
        }
      }
    }
    System.out.println("maximum profit is  =" + maxProfit);
    System.out.println("lowest buying price is = " + buyingPrice);
  }

  public static void main(String[] args) {
    int array[] = { 7, 1, 5, 3, 6, 4 };

    check(array);

  }
}
