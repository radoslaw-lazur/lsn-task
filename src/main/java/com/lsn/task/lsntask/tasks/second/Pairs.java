package com.lsn.task.lsntask.tasks.second;

import java.util.ArrayList;
import java.util.List;

public final class Pairs {

    private final List<Pair> pairs = new ArrayList<>();

    private static Pair createPair(int x, int y) {
        return new Pair(x, y);
    }

    void combinePair(int toBeEqual, int x, int y) {
        if (isPairEligible(toBeEqual, x, y)) {
            addPair(x, y);
        }
    }

    //    FIXME: use Slf4j instead for printing
    void printPairs() {
        pairs.forEach(System.out::println);
    }

    private boolean isPairEligible(int toBeEqual, int x, int y) {
        return x + y == toBeEqual && !isPairAlreadyPlaced(x, y);
    }

    private void addPair(int x, int y) {
        pairs.add(createPair(x, y));
    }

    private boolean isPairAlreadyPlaced(int x, int y) {
        return !pairs.stream()
                .filter(pair -> (pair.x() == y && pair.y() == x))
                .toList()
                .isEmpty();
    }

    private record Pair(int x, int y) {

        @Override
        public String toString() {
            return y + " " + x;
        }
    }
}
