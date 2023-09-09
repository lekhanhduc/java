package view;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayView {
    public double inputDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số thập phân dương: ");
        return scanner.nextDouble();
    }

    public int getMenuChoice() {
    	Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice < 1 || choice > 3) {
            System.out.println("Chọn thuật toán sắp xếp:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Thoát");
            System.out.print("Chọn (1/2/3): ");
            choice = sc.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Lựa chọn không hợp lệ. Hãy chọn từ 1 đến 3.");
            }
        }
        return choice;
    }

    public void displayArray(int[] arr) {
        System.out.println("Mảng: " + Arrays.toString(arr));
    }

    public void displaySortedArray(int[] arr) {
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}
