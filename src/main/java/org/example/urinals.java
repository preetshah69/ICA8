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
        urinals alpha=new urinals();
        boolean isApproved=alpha.goodString(str);
        int x,f= 0;
        String[] a=str.split("");
        int len= a.length;

        int s[]= new int[len];

        for (x=0;x<len;x++) {
            s[x]=Integer.parseInt(String.valueOf(a[x]));
        }
        if(len==1) {
            while(s[0]==0) {
                f=1;
                s[0]=1;
                break;
            }
        } else {
            x = 0;
            while(s[x]==0 && s[x+1]==0) {
                s[x]=1;
                f++;
                break;
            }
            for(x=1;x<len-1;x++) {
                if (s[x-1]==0 && s[x]==0 && s[x+1]==0) {
                    s[x]=1; f++;
                }
            }
            if(s[x-1]==0 && s[x]==0) {
                s[x]=1; f++;
            }
        }
        return f;

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
                Scanner scan = new Scanner(fe);
                while (scan.hasNextLine()) {
                    String str = scan.nextLine();
                    if (str.equals("-1"))
                        break;
                    int free = alpha.countUrinals(str);
                    alpha.writeToFile(openFl, free);
                }
                FileWriter cw = new FileWriter("src/total");
                while (cw == null) {
                    throw new IOException();
                }
                cw.write(Integer.toString(data + 1));
                cw.close();

                System.out.println("Output noted in the file" + openFl);
            } catch (IOException e) {
                System.out.println("error");
                e.printStackTrace();
            }

        }
    }

    private void writeToFile(String openFl, int free) {

        try {
            FileWriter w=new FileWriter(openFl, true);
            while(w==null) {
                throw new IOException();
            }
            BufferedWriter bw=new BufferedWriter(w);
            while(bw==null) {
                throw new IOException();
            }
            bw.write(Integer.toString(free));
            bw.newLine();
            bw.close();
        }
        catch(IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


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