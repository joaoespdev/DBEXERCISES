package VetoresMatrizes;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random random = new Random();

        //int array[] =  random.nextInt(100);
        int[] array = new int[100];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9);
        }

        bubbleSort(array);

        for(int i : array) {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int array[]) {

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    }

