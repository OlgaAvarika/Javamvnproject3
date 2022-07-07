package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.salesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonthSales = 8;
        int actualMaxMonthSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonthSales = 9;
        int actualMinMonthSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonthSales, actualMinMonthSales);
    }

    @Test
    public void shouldFindBelowAverageMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverageMonth = 5;
        int actualBelowAverageMonth = service.belowAverageMonth(sales);

        Assertions.assertEquals(expectedBelowAverageMonth, actualBelowAverageMonth);
    }

    @Test
    public void shouldFindAboveAverageMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverageMonth = 5;
        int actualAboveAverageMonth = service.aboveAverageMonth(sales);

        Assertions.assertEquals(expectedAboveAverageMonth, actualAboveAverageMonth);
    }
}
