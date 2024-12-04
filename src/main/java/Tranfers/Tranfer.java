package Tranfers;

public class Tranfer {
    private String accNo;
    private long mobileNumber;
    private double amt;

    public Tranfer(String accNo, long mobileNumber, double amt) {
        this.accNo = accNo;
        this.mobileNumber = mobileNumber;
        this.amt = amt;
    }

    public String getAccNo() {
        return accNo;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public double getAmt() {
        return amt;
    }
}
