package labwork14.labwork142;

public class MyTestMethod {
    public static <T> int calculateNumber(T[] array, T maxElement) {
        int counter = 0;

        if (maxElement instanceof Byte) {
            for (T t : array) {
                if ((Byte) t > (Byte) maxElement) {
                    counter++;
                }
            }
        }


        if (maxElement instanceof Short) {
            for (T t : array) {
                if ((Short) t > (Short) maxElement) {
                    counter++;
                }
            }
        }


        if (maxElement instanceof Integer) {
            for (T t : array) {
                if ((Integer) t > (Integer) maxElement) {
                    counter++;
                }
            }
        }

        if (maxElement instanceof Long) {
            for (T t : array) {
                if ((Long) t > (Long) maxElement) {
                    counter++;
                }
            }
        }

        if (maxElement instanceof Double) {
            for (T t : array) {
                if ((Double) t > (Double) maxElement) {
                    counter++;
                }
            }
        }
        if (maxElement instanceof Float) {
            for (T t : array) {
                if ((Float) t > (Float) maxElement) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
