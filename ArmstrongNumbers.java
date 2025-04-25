public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are as shown:");
        for (int num = 1; num <= 1000; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int original = number;
        int result = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }

        return result == original;
    }
}
