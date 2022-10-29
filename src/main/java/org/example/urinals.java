//Author: Preet Shah
// ASU ID: 1224761200

package org.example;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class urinals {
    boolean goodString(String str) {
        String[] a=str.split("");
        boolean isApproved=true;
        int len = a.length;
        for (int x = 0; x < a.length-1; x++)
        {
            int y=Integer.parseInt(String.valueOf(a[x]));
            int z=Integer.parseInt(String.valueOf(a[x+1]));
            if (y==1 && z==1)
            {
                isApproved = false;
                break;
            }
        }
        return isApproved;
    }
    public int countUrinals(String str) {

        return 0;
    }

    public void openFile(String path){

    }

    private void writeToFile(String openFl, int free) {

    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Choose Input:");
        System.out.println("Enter 1 for Keyboard");
        int input = ip.nextInt();
        switch (input) {
            case 1:
                Scanner str = new Scanner(System.in);
                System.out.println("Enter any Binary digit string:");
                String a=str.next();
                urinals ur=new urinals();
                System.out.println(ur.goodString(a));
                break;
        }

    }

}