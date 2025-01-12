package ru.netology.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StatsServiceTest {

    @ParameterizedTest
    @MethodSource("ru.netology.stats.service.DataForTests#getDataForSumSales")
    public void sumSalesTest(int[] sales, int expectedSum) {

        StatsService service = new StatsService();
        int sumSales = service.sumSales(sales);

        Assertions.assertEquals(sumSales, expectedSum);
    }

    @ParameterizedTest
    @MethodSource("ru.netology.stats.service.DataForTests#getDataForAvgSales")
    public void avgSalesTest(int[] sales, int expectedAvg) {
        StatsService service = new StatsService();
        int avgSales = service.avgSales(sales);

        Assertions.assertEquals(avgSales, expectedAvg);
    }

    @ParameterizedTest
    @MethodSource("ru.netology.stats.service.DataForTests#getDataForNumberMonthMaxSales")
    public void numberMonthMaxSalesTest(int[] sales, int expectedNumber) {
        StatsService service = new StatsService();
        int numberMonth = service.numberMonthMaxSales(sales);

        Assertions.assertEquals(numberMonth, expectedNumber);
    }

    @ParameterizedTest
    @MethodSource("ru.netology.stats.service.DataForTests#getDataForNumberMonthMinSales")
    public void numberMonthMinSalesTest(int[] sales, int expectedNumber) {
        StatsService service = new StatsService();
        int numberMonth = service.numberMonthMinSales(sales);

        Assertions.assertEquals(numberMonth, expectedNumber);
    }

    @ParameterizedTest
    @MethodSource("ru.netology.stats.service.DataForTests#getDataForCountMonthsMinSales")
    public void countMonthsMinSalesTest(int[] sales, int expectedCounter) {
        StatsService service = new StatsService();
        int counterOfMonths = service.countMonthsMinSales(sales);

        Assertions.assertEquals(counterOfMonths, expectedCounter);
    }

    @ParameterizedTest
    @MethodSource("ru.netology.stats.service.DataForTests#getDataForCountMonthsMaxSales")
    public void countMonthsMaxSalesTest(int[] sales, int expectedCounter) {
        StatsService service = new StatsService();
        int counterOfMonth = service.countMonthsMaxSales(sales);

        Assertions.assertEquals(counterOfMonth, expectedCounter);
    }
}



