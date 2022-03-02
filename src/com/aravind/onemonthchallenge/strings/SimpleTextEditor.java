package com.aravind.onemonthchallenge.strings;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    public static void main(String[] args)
    {
        String S= "";
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());


        String[] ops = new String[q];
        int index = 0;
        while(index<q)
        {
            ops[index] = scanner.nextLine();
            index++;
        }

        Stack<String> operationsDone = new Stack<>();
        for(int i=0; i< ops.length; i++)
        {

            String operation = ops[i];
            //performOperation(S,operation,operationsDone);


            int operationInt = Integer.parseInt(operation.charAt(0) + "");
            switch (operationInt)
            {
                case 1:
                    S = S + operation.split(" ")[1];
                    operationsDone.push("2 " + operation.split(" ")[1].length());
                    break;
                case 2:
                    int charsToBeDeleted = Integer.parseInt(operation.split(" ")[1]);
                    String removedStr = S.substring(S.length()-charsToBeDeleted, S.length());
                    S = S.substring(0,S.length()-charsToBeDeleted);
                    operationsDone.push("1 " + removedStr);
                    break;
                case 3:
                    int charToBePrinted = Integer.parseInt(operation.split(" ")[1]);
                    System.out.println(S.charAt(charToBePrinted-1));
                    break;
                case 4:
                    S = performUndo(S,operationsDone.pop());
                    break;
            }
        }
    }

    public static String performUndo(String S, String operation)
    {
        int operationInt = Integer.parseInt(operation.charAt(0) + "");
        switch (operationInt)
        {
            case 1:
                S = S + operation.split(" ")[1];
                break;
            case 2:
                int appendLength =  Integer.parseInt(operation.split(" ")[1]);
                S = S.substring(0,S.length()-appendLength);
                break;
        }
        return S;
    }
}
