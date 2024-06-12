import java.util.Scanner;

public class SearchAndSortApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose an operation:");
            System.out.println("1. Search Algorithms");
            System.out.println("2. Sort Algorithms");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Implement search algorithms
                System.out.println("Enter the list of integers separated by spaces:");
                String input = scanner.next();
                String[] values = input.split(" ");
                int[] list = new int[values.length];
                for (int i = 0; i < values.length; i++) {
                    list[i] = Integer.parseInt(values[i]);
                }
                // Prompt user for list and search value
                System.out.println("Enter the value to search for:");
                int searchValue = scanner.nextInt();
                 // Linear search algorithm
                long startTime = System.nanoTime();
                int index = -1;
                for (int i = 0; i < list.length; i++) {
                if (list[i] == searchValue) {
                index = i;
                break;
                    }
                }
                long endTime = System.nanoTime();
                long runningTime = endTime - startTime;
   
                if (index == -1) {
                System.out.println("Value not found in the list.");
                } else {
                System.out.println("Value found at index " + index);
                 }
                System.out.println("Running time: " + runningTime + " nanoseconds");}
                
                else if (choice == 2) {
                    // Implement sorting algorithms
                   System.out.println("Enter the list of integers separated by spaces:");
                   String input = scanner.next();
                   String[] values = input.split(" ");
                   int[] list = new int[values.length];
   
                   // Convert input strings to integers
                   for (int i = 0; i < values.length; i++) {
                       list[i] = Integer.parseInt(values[i]);
                   }
   
                    int n = list.length;
                    for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                   if (list[j] > list[j + 1]) {
                       // Swap list[j] and list[j+1]
                       int temp = list[j];
                       list[j] = list[j + 1];
                       list[j + 1] = temp;
                       System.out.println("Sorted list:");
                       for (int num : list) {
                           System.out.print(num + " ");
                       }
                       System.out.println("\nRunning time: " + input + " nanoseconds");
                   }
               }
      }}
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }
}

