package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int sum = 0;
        int averageSalesMonth = 0;
        for (int sale : sales) {
            sum += sale;
        }
        averageSalesMonth = sum / sales.length;
        return averageSalesMonth;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageMonth(int[] sales) {
        int numberOfMonths = 0;
        for (int averageSalesMonth : sales) {
            if (averageSalesMonth > averageSalesAmount(sales)) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }

    public int aboveAverageMonth(int[] sales) {
        int numberOfMonth = 0;
        for (int averageSalesMonth : sales) {
            if (averageSalesMonth < averageSalesAmount(sales)) {
                numberOfMonth += 1;
            }
        }
        return numberOfMonth;
    }
}