package com.lsn.task.lsntask.tasks.second;

import lombok.val;

import java.util.List;
import java.util.Optional;

public class SecondTask {

    public static void findPairs(List<Integer> ints, int toBeEqual) {
        val values = Optional.ofNullable(ints).orElse(List.of());

        val valuesUnderMax = values.stream()
                .filter(v -> v <= toBeEqual)
                .toList();

        val pairs = new Pairs();

        valuesUnderMax.forEach(x -> valuesUnderMax
                .forEach(y -> pairs.combinePair(toBeEqual, x, y)));

        pairs.printPairs();
    }

}
