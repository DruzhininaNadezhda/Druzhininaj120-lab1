package phoneNumber;

public class Number {
    private int regionCode;
    private int localNumber;

    public Number(int regionCode, int localNumber) {
        setRegionCode(regionCode);
        setLocalNumber(localNumber);
    }
    public int getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(int regionCode) throws IllegalArgumentException {
            if (regionCode <= 9999 && regionCode > 0) {
                this.regionCode = regionCode;
            } else{throw new IllegalArgumentException();}
    }
    public int getLocalNumber() {
        return localNumber;
    }
    public void setLocalNumber(int localNumber) throws IllegalArgumentException{
                if (localNumber <= 999999999 && localNumber > 0) {
                    this.localNumber = localNumber;
                } else {throw new IllegalArgumentException();}
            }
    @Override
    public String toString() {
        StringBuilder k = new StringBuilder();
        while (localNumber > 0) {
                k.append((localNumber%100)%10)
                 .append((localNumber%100)/10 == 0 && (localNumber%100) !=0 ? "" : (localNumber%100)/10)
                 .append(localNumber -(localNumber%100)==0 || (localNumber%1000) == (localNumber%10000) ? "" : "-");
        localNumber/= 100;}
        return "(" + getRegionCode() + ")" + k.reverse().toString();
    }
}
