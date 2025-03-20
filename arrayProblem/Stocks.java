package arrayProblem;

public class Stocks {
  public static void calculateStocks(int arr[]) {
    int buying_price = arr[0];
    int max_profit = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (buying_price < arr[i]) {
        int profit = arr[i] - buying_price < 0 ? 0 : arr[i] - buying_price;

        if (profit > max_profit) {
          max_profit = profit;
        }
      }
      if (buying_price >= arr[i]) {
        buying_price = arr[i];
      }

    }
    System.out.println("max_profit is =" + max_profit + "at stack " + buying_price);
  }

  public static void main(String[] args) {
    int array []= { 7, 1, 5, 3, 6, 4 };
     calculateStocks(array);

  }

}
