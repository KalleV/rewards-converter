public class RewardValue {
    /**
     * The cash value
     */
    private final double cashValue;
    /**
     * The miles value
     */
    private final double milesValue;

    /**
     * The conversion rate from cash to miles
     */
    private final static double conversationRate = 0.0035;

    /**
     * Create a reward value with cash
     * @param cashValue the cash value
     */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / conversationRate;
    }

    /**
     * Create a reward value with miles
     * @param milesValue the miles value
     */
    public RewardValue(long milesValue) {
        this.cashValue = milesValue * conversationRate;
        this.milesValue = milesValue;
    }

    /**
     * Get the miles value
     * @return the miles value
     */
    public double getMilesValue() {
        return milesValue;
    }

    /**
     * Get the cash value
     * @return the cash value
     */
    public double getCashValue() {
        return cashValue;
    }
}
