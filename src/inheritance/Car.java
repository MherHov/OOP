package inheritance;

import java.util.Arrays;

public class Car {
    int passengerCount;
    String engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount > 2) {
            this.passengerCount = passengerCount;
        }
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(char[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append(args);
        for (int i = 0;i< args.length;i++){
            if (sb.charAt(i)>='a' && sb.charAt(i)<='z'||sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
                this.engineType = Arrays.toString(args);
            }
        }
    }
}
