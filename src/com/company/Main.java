package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main
    {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Scanner numscan = new Scanner(System.in);
            String realOperation;
            double num1;
            double num2;
            double realAnswer = 0.0;
            String fakeOperator = "";
            double fakeAnswer = 0.0;
            Random rand = new Random();
            int random;
            String YN;
            System.out.println("What operation would you like to conduct?\n/ for division.\n* for multiplication\n- for subtraction\n+ for addition");
            realOperation = scan.nextLine();
            if (!(realOperation.equals("/") || realOperation.equals("*") || realOperation.equals("-") || realOperation.equals("+")))
                {
                    System.out.println("INVALID INPUT!");
                    System.exit(0);
                }
            System.out.println("Input first number.");
            num1 = numscan.nextDouble();
            System.out.println("Input second number.");
            num2 = numscan.nextDouble();

            switch (realOperation)
                {
                    case "/":
                        realAnswer = num1 / num2;
                    break;
                    case "*":
                        realAnswer = num1 * num2;
                    break;
                    case "-":
                        realAnswer = num1 - num2;
                    break;
                    case "+":
                        realAnswer = num1 + num2;
                    break;
                    default:
                        //HOW DOES THIS EVEN HAPPEN?!?!?
                    break;
                }
            random = rand.nextInt(3);
            switch (random)
                {
                    case 0:
                        //sqrt
                        fakeOperator = "sqrt";
                        fakeAnswer = Math.sqrt(realAnswer);
                    break;
                    case 1:
                        //log
                        fakeOperator = "log";
                        fakeAnswer = Math.log(realAnswer);
                    break;
                    case 2:
                        //exp
                        fakeOperator = "exp";
                        fakeAnswer = Math.exp(realAnswer);
                    break;
                    default:
                        //How in the hell would this happen?!
                    break;
                }
            System.out.println("The answer to your problem is " + fakeAnswer +". \nAre you satisfied?\nY for yes and N for no");
            YN = scan.nextLine();
            switch (YN)
                {
                    case "Y":
                        System.out.println("Ok\nBye");
                        System.exit(0);
                    break;
                    case "N":
                        System.out.println("Identify what math class method I ran the real answer through?");
                        YN = scan.nextLine();
                        if (YN.equals(fakeOperator))
                            {
                                System.out.println("You guessed it.");
                            }
                        else
                            {
                                System.out.println("Nope.");
                            }
                        System.out.println("Goodbye Forever.");
                        System.exit(0);
                    break;
                    default:
                        System.out.println("INVALID RESPONSE!");
                        System.exit(0);
                    break;
                }
            }
    }
