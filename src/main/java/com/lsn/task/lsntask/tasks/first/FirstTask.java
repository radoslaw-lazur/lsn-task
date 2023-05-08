package com.lsn.task.lsntask.tasks.first;

import lombok.val;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FirstTask {

    //    FIXME: use Slf4j instead for printing
    public static void executeFirstTask(List<Integer> ints) {
        val values = Optional.ofNullable(ints).orElse(List.of());
        val intsNoDuplicated = parseIntsForNoDuplications(values);
        val intsSortedNoDuplicated = getSortedIntegers(intsNoDuplicated);
        val firstLine = concatSortedInts(intsSortedNoDuplicated);
        System.out.println(firstLine);
        System.out.printf("count: %s%n", values.size());
        System.out.printf("distinct: %s%n", getDistinct(values));
        System.out.printf("min: %s%n", getMinValue(values));
        System.out.printf("max: %s%n", getMaxValue(values));
    }

    private static List<Integer> parseIntsForNoDuplications(List<Integer> ints) {
        return new HashSet<>(ints).stream()
                .toList();
    }

    private static String concatSortedInts(List<Integer> ints) {
        return StringUtils.collectionToDelimitedString(getSortedIntegers(ints), " ");
    }

    private static List<Integer> getSortedIntegers(List<Integer> ints) {
        return ints.stream()
                .sorted()
                .toList();
    }

    private static int getMinValue(List<Integer> ints) {
        return CollectionUtils.isEmpty(ints) ? 0 : Collections.min(ints);
    }

    private static int getMaxValue(List<Integer> ints) {
        return CollectionUtils.isEmpty(ints) ? 0 : Collections.max(ints);
    }

    private static Integer getDistinct(List<Integer> list) {
        return list.stream()
                .distinct()
                .toList()
                .size();
    }


}
