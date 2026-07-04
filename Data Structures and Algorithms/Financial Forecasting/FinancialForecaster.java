import java.util.Arrays;

public class FinancialForecaster {

    /**
     * Recursively calculates the future value of an investment.
     * 
     * @param initialValue The starting principal value
     * @param growthRates  Array of historical growth rates (e.g., 0.05 for 5%)
     * @param years        Number of years into the future to forecast
     * @return The predicted future value
     */
    public static double predictFutureValue(double initialValue, double[] growthRates, int years) {
        if (years <= 0) {
            return initialValue;
        }

        int rateIndex = (years - 1) % growthRates.length;
        double currentGrowthRate = growthRates[rateIndex];


        double previousYearValue = predictFutureValue(initialValue, growthRates, years - 1);
        
        return previousYearValue * (1 + currentGrowthRate);
    }

    public static void main(String[] args) {
        double startingPrincipal = 10000.0;
        double[] historicalRates = {0.07, 0.04, -0.02, 0.09};
        int forecastPeriod = 5;

        double finalForecast = predictFutureValue(startingPrincipal, historicalRates, forecastPeriod);

        System.out.println("--- Financial Forecast Setup ---");
        System.out.println("Starting Principal: $" + startingPrincipal);
        System.out.println("Historical Rates: " + Arrays.toString(historicalRates));
        System.out.println("Forecast Period: " + forecastPeriod + " years");
        System.out.printf("\nPredicted Future Value: $%.2f\n", finalForecast);
    }
}