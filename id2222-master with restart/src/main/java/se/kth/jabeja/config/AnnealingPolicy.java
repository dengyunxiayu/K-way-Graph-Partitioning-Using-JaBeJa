package se.kth.jabeja.config;


public enum AnnealingPolicy {

    /**
     * Use standard mechanism explained in the paper.
     */
    STANDARD("STANDARD"),
    /**
     * Use Acceptance Probability mechanism described here:
     * http://katrinaeg.com/simulated-annealing.html
     */
    EXP("EXP"),

    CUSTOM("CUSTOM");

    String name;

    AnnealingPolicy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
