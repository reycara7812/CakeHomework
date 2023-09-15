package hw2;

public class BirthdayCake extends Cake{
    private boolean candles;

    public BirthdayCake(String flavor) {
        super(flavor);
    }

    public boolean isCandles() {
        return candles;
    }

    public void setCandles(boolean candles) {
        this.candles = candles;
    }



}
