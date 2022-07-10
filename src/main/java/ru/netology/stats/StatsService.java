package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageMonth(long[] sales) {
        long average = average(sales);
        int numberOfMonths = 0;
        for (long sale : sales) {
            if (sale < average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int aboveAverageMonth(long[] sales) {
        long average = average(sales);
        int numberOfMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }
}