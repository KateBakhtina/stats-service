package ru.netology.stats.service;

public class StatsService {

    public int sumSales(int[] sales) {
        int sumOfSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumOfSales += sales[i];
        }
        return sumOfSales;
    }

    public int avgSales(int[] sales) {
        int sumOfSales = 0;
        int lengthOfSales = sales.length;
        for (int i = 0; i < lengthOfSales; i++) {
            sumOfSales += sales[i];
        }
        int avgOfSales = sumOfSales / lengthOfSales;
        return avgOfSales;
    }

    public int numberMonthMaxSales(int[] sales) {
        int maxOfSales = 0;
        int numberOfMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (sale >= maxOfSales) {
                maxOfSales = sale;
                numberOfMonth = i + 1;
            }
        }
        return numberOfMonth;
    }

    public int numberMonthMinSales(int[] sales) {
        int minOfSales = sales[0];
        int numberOfMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (sale <= minOfSales) {
                minOfSales = sale;
                numberOfMonth = i + 1;
            }
        }
        return numberOfMonth;
    }

    public int countMonthsMinSales(int[] sales) {
        int avgOfSales = avgSales(sales);
        int counterOfMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgOfSales) {
                counterOfMonths += 1;
            }
        }
        return  counterOfMonths;
    }

    public int countMonthsMaxSales(int[] sales) {
        int avgOfSales = avgSales(sales);
        int counterOfMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgOfSales) {
                counterOfMonths += 1;
            }
        }
        return counterOfMonths;
    }
}





