import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static boolean[] isBrokenNumber;

    public static void main(String[] args) throws IOException {
        final int MAX_CHANNEL = 1000000;
        final int MIN_CHANNEL = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int targetChannel = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        isBrokenNumber = new boolean[10];
        if (n != 0) {
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                int index = Integer.parseInt(input[i]);
                isBrokenNumber[index] = true;
            }
        }

        int upperChannel = MAX_CHANNEL;
        for (int i = targetChannel; i <= MAX_CHANNEL; i++) {
            if (isAvailableChannel(i)) {
                upperChannel = i;
                break;
            }
        }

        int lowerChannel = MAX_CHANNEL;
        for (int i = targetChannel; i >= MIN_CHANNEL; i--) {
            if (isAvailableChannel(i)) {
                lowerChannel = i;
                break;
            }
        }
        int upperChannelDistance = Math.abs(upperChannel - targetChannel);
        int upperChannelSize = getLength(upperChannel);
        int countFromUpperChannel = upperChannelSize + upperChannelDistance;

        int lowerChannelDistance = Math.abs(targetChannel - lowerChannel);
        int lowerChannelSize = getLength(lowerChannel);
        int countFromLowerChannel = lowerChannelSize + lowerChannelDistance;

        int countFromBaseChannel = Math.abs(100 - targetChannel);

        int result = Math.min(countFromUpperChannel, countFromLowerChannel);
        result = Math.min(result, countFromBaseChannel);

        System.out.println(result);
    }

    public static boolean isAvailableChannel(int channel) {
        if (channel == 0) {
            return !isBrokenNumber[0];
        }
        while (channel > 0) {
            if (isBrokenNumber[channel % 10]) {
                return false;
            }
            channel /= 10;
        }

        return true;
    }

    public static int getLength(int number) {
        int count = 1;
        while(number/10 >= 1) {
            count++;
            number /= 10;
        }
        return count;
    }
}