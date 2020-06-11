import java.util.Arrays;
public class Main {
    private static int[] rotateLeft(int[] input, int length, int numOfRotations) {
        for (int i = 0; i < numOfRotations; i++) {
             int temp = input[0];
             for (int j = 0; j < length - 1; j++) {
                  input[j] = input[j + 1];
             }
             input[length - 1] = temp;
        }
        return input;
    }

    public static void main(String[] args){
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 }; int k = 4;
        int[] rotatedArray = rotateLeft(input, input.length, k);
        System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
        }
    }

