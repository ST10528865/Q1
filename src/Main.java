public class Question1{
public static void main(String[] args) {
    // Single-dimensional array for city names
    String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
    };
    // Single-dimensional array for console types
    String[] consoles = {
            "PS5", "XBOX", "SWITCH"
    };
    // Two-dimensional arrays for console sales
    int[][] sales = {
            {100,200, 300},
            {2000,3000, 4000},
            {1500, 1100, 1200}
    };
    int[] cityTotal = new int[cities.length];
      int highestSales = 0;
      String highestSales = "";
      // Display the gaming console report
    System.out.println("------------------------");
    System.out.println("   GAMING CONSOLE   ");
    System.out.println("------------------------");
    System.out.printf("%-20s %10s %10s %10s %10s%n");
    System.out.println("-----------------------------");
    // Display sales and calculate city totals
    for (int i = 0; i < cities.length; i++){
        System.out.printf("%-20", cities[i]);
        int total = 0;
        for (int j = 0; j < consoles.length; j++){
            System.out.printf("%10d", sales[i][j]);
        }
        System.out.println();
        cityTotals[i] = total;
        // Display the city with the highest sales
        if (i == 0 || total > highestSales){
            highestSales = total;
            highestCity = cities[i];
        }
    }
    // Display total console sales for each city
    System.out.println();
    System.out.println("--------------------------");
    System.out.println("  CONSOLE SALES TOTALS IN ALL THE CITIES");
    System.out.println("--------------------------");
    }
}
