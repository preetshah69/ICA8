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

    public void openFile(String path) {
        throws IOException {
            try {
                urinals alpha = new urinals();
                File fe = new File(path);
                while (fe == null) {
                    throw new IOException();
                }
                File closefl = new File("src/data");
                while (closefl == null) {
                    throw new IOException();
                }
                Scanner c = new Scanner(closefl);
                int data = Integer.parseInt(c.nextLine());

                String openFl = "src/main/rule.txt";
                if (data != 0)
                    openFl = "src/main/rule" + data + ".txt";
            } catch (IOException e) {
                System.out.println("error");
                e.printStackTrace();
            }

        }
    }

    private void writeToFile(String openFl, int free) {

    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Choose Input:");
        System.out.println("Enter 1 for Keyboard");
        System.out.println("Enter 2 to input values from file");
        int input = ip.nextInt();
        switch (input) {
            case 1:
                Scanner str = new Scanner(System.in);
                System.out.println("Enter any Binary digit string:");
                String a=str.next();
                urinals ur=new urinals();
                System.out.println(ur.goodString(a));
                break;
            case 2:
                urinals ur1=new urinals();
                System.out.println(ur1.openFile("C:/Users/Preet/IdeaProjects/ICA8_final/Data/urinal.dat"));
                break;
            default:
                System.out.println("Not good Choice");
        }

    }

}