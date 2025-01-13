package ru.netology.stats.service;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumOfSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumOfSales += sales[i];
        }
        return sumOfSales;
    }

    public long avgSales(long[] sales) {
        long sumOfSales = 0;
        int lengthOfSales = sales.length;
        for (int i = 0; i < lengthOfSales; i++) {
            sumOfSales += sales[i];
        }
        long avgOfSales = sumOfSales / lengthOfSales;
        return avgOfSales;
    }

    public int numberMonthMaxSales(long[] sales) {
        long maxOfSales = 0;
        int numberOfMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            long sale = sales[i];
            if (sale >= maxOfSales) {
                maxOfSales = sale;
                numberOfMonth = i + 1;
            }
        }
        return numberOfMonth;
    }

    public int numberMonthMinSales(long[] sales) {
        long minOfSales = sales[0];
        int numberOfMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            long sale = sales[i];
            if (sale <= minOfSales) {
                minOfSales = sale;
                numberOfMonth = i + 1;
            }
        }
        return numberOfMonth;
    }

    public int countMonthsMinSales(long[] sales) {
        long avgOfSales = avgSales(sales);
        int counterOfMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgOfSales) {
                counterOfMonths += 1;
            }
        }
        return  counterOfMonths;
    }

    public int countMonthsMaxSales(long[] sales) {
        long avgOfSales = avgSales(sales);
        int counterOfMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgOfSales) {
                counterOfMonths += 1;
            }
        }
        return counterOfMonths;
    }
}





