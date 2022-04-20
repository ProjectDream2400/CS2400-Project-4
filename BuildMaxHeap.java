import java.util.Scanner;

import java.io.*;

public class BuildMaxHeap {
    public static void main(String args[]) throws FileNotFoundException{
        // Random data, sequential
        MaxHeap maxHeap1 = new MaxHeap<Integer>(100);
        Scanner scantext1 = new Scanner(new File("data_random.txt"));
        while (scantext1.hasNextInt()){
            maxHeap1.add(scantext1.nextInt());
        }

        System.out.print("Heap built using sequential insertions: ");
        for (int index = 1; index <= 10; index++){
            System.out.print(maxHeap1.heap[index] + " ");
        }
        System.out.print("\nNumber of swaps in the heap creation: " + maxHeap1.heapSwaps(maxHeap1.swaps));
        for (int index = 1; index <= 10; index++){
            maxHeap1.removeMax();
        }
        System.out.print("\nHeap after 10 removals: ");
        for (int index = 1; index <= 10; index++){
            System.out.print(maxHeap1.heap[index] + " ");
        }

        // Sorted data, sequential
        MaxHeap maxHeap2 = new MaxHeap<Integer>(100);
        Scanner scantext2 = new Scanner(new File("data_sorted.txt"));
        while (scantext2.hasNextInt()){
            maxHeap2.add(scantext2.nextInt());
        }

        System.out.print("\n\nHeap built using sequential insertions: ");
        for (int index = 1; index <= 10; index++){
            System.out.print(maxHeap2.heap[index] + " ");
        }
        System.out.print("\nNumber of swaps in the heap creation: " + maxHeap2.heapSwaps(maxHeap2.swaps));
        for (int index = 1; index <= 10; index++){
            maxHeap2.removeMax();
        }
        System.out.print("\nHeap after 10 removals: ");
        for (int index = 1; index <= 10; index++){
            System.out.print(maxHeap2.heap[index] + " ");
        }

        // Random data, optimized
        Scanner scantext3 = new Scanner(new File("data_random.txt"));
        Integer[] entries3 = new Integer[100];
        for (int index = 0; scantext3.hasNextInt(); index++){
            entries3[index]=scantext3.nextInt();
        }
        MaxHeap maxHeap3 = new MaxHeap<Integer>(entries3);

        System.out.print("\n\nHeap built using sequential insertions: ");
        for (int index = 1; index <= 10; index++){
            System.out.print(maxHeap3.heap[index] + " ");
        }
        System.out.print("\nNumber of swaps in the heap creation: " + maxHeap3.heapSwaps(maxHeap3.swaps));
        for (int index = 1; index <= 10; index++){
            maxHeap3.removeMax();
        }
        System.out.print("\nHeap after 10 removals: ");
        for (int index = 1; index <= 10; index++){
            System.out.print(maxHeap3.heap[index] + " ");
        }

        // Sorted data, optimized
        Scanner scantext4 = new Scanner(new File("data_sorted.txt"));
        Integer[] entries4 = new Integer[100];
        for (int index = 0; scantext4.hasNextInt(); index++){
            entries4[index]=scantext4.nextInt();
        }
        MaxHeap maxHeap4 = new MaxHeap<Integer>(entries4);

        System.out.print("\n\nHeap built using sequential insertions: ");
        for (int index = 1; index <= 10; index++){
            System.out.print(maxHeap4.heap[index] + " ");
        }
        System.out.print("\nNumber of swaps in the heap creation: " + maxHeap4.heapSwaps(maxHeap4.swaps));
        for (int index = 1; index <= 10; index++){
            maxHeap4.removeMax();
        }
        System.out.print("\nHeap after 10 removals: ");
        for (int index = 1; index <= 10; index++){
            System.out.print(maxHeap4.heap[index] + " ");
        }
    }
}
