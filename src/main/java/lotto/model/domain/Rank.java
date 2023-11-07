package lotto.model.domain;

public enum Rank {
    FIRST(1, 2_000_000_000, 6),
    SECOND(2, 30_000_000, 5),
    THIRD(3, 1_500_000, 5),
    FOURTH(4, 50_000, 4),
    FIFTH(5, 5_000, 3);

    private final int rank;
    private final long reward;
    private final long hitCount;

    Rank(int rank, long reward, long hitCount) {
        this.rank = rank;
        this.reward = reward;
        this.hitCount = hitCount;
    }

    public int getRank() {
        return rank;
    }

    public long getReward() {
        return reward;
    }

    public long getHitCount() {
        return hitCount;
    }
}
