public class Lab8_1{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PowerCalculator <x> <y>");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (y < 0) {
                System.out.println("Exponent y must be a non-negative integer.");
                return;
            }

            long result = power(x, y);
            System.out.println(x + "^" + y + " = " + result);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid integer format for x or y.");
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static long power(int x, int y) throws IllegalArgumentException {
        if (x == 0 && y == 0) {
            throw new IllegalArgumentException("0^0 is undefined.");
        }

        if (y < 0) {
            throw new IllegalArgumentException("Exponent y must be a non-negative integer.");
        }

        long result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}