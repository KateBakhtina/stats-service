package ru.netology.stats.service;

import com.sun.jdi.event.StepEvent;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class DataForTests {

    private static Stream<Arguments> getDataForSumSales() {

         return Stream.of(
                Arguments.of(new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 78),
                Arguments.of(new long[]{2, 0, 89, 54, 120, 457, 568, 5989, 2145, 569, 154, 2356}, 12503),
                Arguments.of(new long[]{785321, 458786, 568978, 12364589, 12326589, 125486, 56989325, 7896546, 5689324, 4598795, 265974, 4545662}, 106615375)
            );
        }

    private static Stream<Arguments> getDataForAvgSales() {
        return Stream.of(
                Arguments.of(new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 6),
                Arguments.of(new long[]{2, 0, 89, 54, 120, 457, 568, 5989, 2145, 569, 154, 2356}, 1041),
                Arguments.of(new long[]{785321, 458786, 568978, 12364589, 12326589, 125486, 56989325, 7896546, 5689324, 4598795, 265974, 4545662}, 8884614)
        );
    }

    private static Stream<Arguments> getDataForNumberMonthMaxSales() {
       return Stream.of(
               Arguments.of(new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 12),
               Arguments.of(new long[]{13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 1),
               Arguments.of(new long[]{1, 2, 3, 4, 5, 6, 24, 8, 9, 10, 11, 12}, 7),
               Arguments.of(new long[]{1, 2, 3, 4, 5, 6, 6, 8, 9, 10, 12, 12}, 12)
       );
    }

    private static Stream<Arguments> getDataForNumberMonthMinSales() {
        return Stream.of(
                Arguments.of(new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 1),
                Arguments.of(new long[]{13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1}, 12),
                Arguments.of(new long[]{1, 1, 3, 4, 5, 6, 24, 8, 9, 10, 11, 12}, 2),
                Arguments.of(new long[]{1, 1, 3, 4, 0, 6, 24, 8, 9, 10, 11, 12}, 5)
        );
    }

    private static Stream<Arguments> getDataForCountMonthsMinSales() {
        return Stream.of(
                Arguments.of(new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 5),
                Arguments.of(new long[]{785321, 458786, 568978, 12364589, 12326589, 125486, 56989325, 7896546, 5689324, 4598795, 265974, 4545662}, 9)
        );
    }

    private static Stream<Arguments> getDataForCountMonthsMaxSales() {
        return Stream.of(
                Arguments.of(new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 6),
                Arguments.of(new long[]{785321, 458786, 568978, 12364589, 12326589, 125486, 56989325, 7896546, 5689324, 4598795, 265974, 4545662}, 3)
        );
    }
}


