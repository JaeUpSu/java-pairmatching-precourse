package pairmatching.domain;

import java.util.List;

public class Pair {
    private final List<Crew> pair;

    Pair(List<Crew> pair) {
        this.pair = pair;
    }

    public boolean visited(Pair otherPair) {
        if (pair.equals(otherPair)) {
            return true;
        }
        return false;
    }
}
