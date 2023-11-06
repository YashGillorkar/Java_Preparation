package interviewQ.Character_Class_Programs;

public class CharacterSortingWithoutArrays {
    public static void main(String[] args) {
        // Define an array of characters to be sorted
        char[] charArray = {'b', 'C', 'A', 'd', 'E'};

        // Sort the array in alphabetical order (case-sensitive) using Bubble Sort
        bubbleSort(charArray);

        // Print the sorted characters
        System.out.println("Sorted characters: " + new String(charArray));
    }

    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    char temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
