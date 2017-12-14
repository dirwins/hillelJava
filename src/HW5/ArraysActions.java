package HW5;

public class ArraysActions {
    private static int[] array = {7, 1, 2, 3, 8};
    private static int[] arrayMemory = {5, 6, 9, 4};

    public int[] getArrayMemory() {

        return arrayMemory;
    }

    public void setArrayMemory(int[] arrayMemory) {
        this.arrayMemory = arrayMemory;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public static int[] addElement(int[] newArray, int element) {

        int[] array = new int[newArray.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                array[array.length - 1] = element;
            } else {
                array[i] = newArray[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void getIndex(int index) {
        index = arrayMemory[index];
        System.out.println(index);
    }

    public static void contains(int element) {
        for (int i = 0; i < arrayMemory.length; i++) {
            if (arrayMemory[i] == element) {
                System.out.println("Contains");
                break;
            } else {
                System.out.println("Not contains");
                break;
            }
        }
    }

    public static void addAllElements() {
        int[] arraySum = new int[arrayMemory.length + array.length];
        for (int i = 0; i < arraySum.length; i++) {

            if (i < array.length) {
                arraySum[i] = array[i];
            } else {
                arraySum[i] = arrayMemory[i];
            }
        }
        for (int i = 0; i < arraySum.length; i++) {
            System.out.print(arraySum[i] + " ");
        }
    }


}
