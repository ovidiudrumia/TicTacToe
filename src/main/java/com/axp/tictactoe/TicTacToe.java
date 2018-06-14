package com.axp.tictactoe;

import java.util.Scanner;
public class TicTacToe {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


   O | O | O
  -----------
   O | O | O
  -----------
   O | O | O


 */





        /**
         * @param args the command line arguments
         * @throws java.lang.InterruptedException
         */
        public static void main(String[] args) throws InterruptedException {
            Scanner input = new Scanner(System.in);
            //initialize the board
            String a1 = "1";
            String a2 = "2";
            String a3 = "3";
            String a4 = "4";
            String a5 = "5";
            String a6 = "6";
            String a7 = "7";
            String a8 = "8";
            String a9 = "9";
            int inO;
            int inX = 0;
            boolean winner = false;
            PrintBoard(a1,a2,a3,a4,a5,a6,a7,a8,a9);
            System.out.printf("How to play - wait for your turn and when it comes write the number of the field that you want to draw in (from 1 to 9)\n");
            System.out.printf("Player O's turn: ");
            inO = input.nextInt();
            //Start the game
            while (true) {
                switch (inO) {
                    //mark 0
                    case 1:
                        if (a1 == "1") {
                            a1 = "O";
                        }
                        break; //if user selects 1
                    case 2:
                        if (a2 == "2") {
                            a2 = "O";
                        }
                        break; //if user selects 2
                    case 3:
                        if (a3 == "3") {
                            a3 = "O";
                        }
                        break; //if user selects 3
                    case 4:
                        if (a4 == "4") {
                            a4 = "O";
                        }
                        break; //if user selects 5
                    case 5:
                        if (a5 == "5") {
                            a5 = "O";
                        }
                        break;
                    case 6:
                        if (a6 == "6") {
                            a6 = "O";
                        }
                        break; //if user selects 6
                    case 7:
                        if (a7 == "7") {
                            a7 = "O";
                        }
                        break; //if user selects 7
                    case 8:
                        if (a8 == "8") {
                            a8 = "O";
                        }
                        break;
                    case 9:
                        if (a9 == "9") {
                            a9 = "O";
                        }
                        break; //if user selects 9
                    default:
                        //not supposed to be here
                        System.out.printf("An error occured. Please accept it politely and restart the game.");
                        break;
                } // while
//                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if (null != Winners(a1,a2,a3,a4,a5,a6,a7,a8,a9))switch (Winners(a1,a2,a3,a4,a5,a6,a7,a8,a9)) {
                    case "NONE":
                        if (a1 != "1" && a2 != "2" && a3 != "3" && a4 != "4" && a5 != "5" && a6 != "6" && a7 != "7" && a8 != "8" && a9 != "9") {
                            winner = true;
                            System.out.println("DRAW!");
                            Thread.sleep(3000);
                            break;
                        } else {
                            PrintBoard(a1,a2,a3,a4,a5,a6,a7,a8,a9);
                            System.out.printf("Player X's turn: ");
                            inX = input.nextInt();
                            break;
                        }
                    case "X":
                        winner = true;
                        System.out.println("X HAS WON!!!");
                        Thread.sleep(3000);
                        break;
                    case "O":
                        winner = true;
                        System.out.printf("O HAS WON!!!");
                        Thread.sleep(3000);
                        break;
                    default:
                        break;
                }
                if (winner) {
                    break;
                }
                switch (inX) {
                    case 1:
                        //mark X
                        if (a1 == "1") {
                            a1 = "X"; // mark 1 X
                        }
                        break;
                    case 2:
                        if (a2 == "2") {
                            a2 = "X";
                        }
                        break; // mark 2 X
                    case 3:
                        if (a3 == "3") {
                            a3 = "X";
                        }
                        break; // mark 3 X
                    case 4:
                        if (a4 == "4") {
                            a4 = "X";
                        }
                        break; // mark 4 X
                    case 5:
                        if (a5 == "5") {
                            a5 = "X";
                        }
                        break; // mark 5 X
                    case 6:
                        if (a6 == "6") {
                            a6 = "X";
                        }
                        break; // mark 1 X
                    case 7:
                        if (a7 == "7") {
                            a7 = "X";
                        }
                        break; // mark 7 X
                    case 8:
                        if (a8 == "8") {
                            a8 = "X";
                        }
                        break; // mark 8 X
                    case 9:
                        if (a9 == "9") {
                            a9 = "X";
                        }
                        break; // mark 9 X
                    default:
                        System.out.printf("An error occured. Please accept it politely and restart the game.");
                        break;
                }
//                System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if (null != Winners(a1,a2,a3,a4,a5,a6,a7,a8,a9))switch (Winners(a1,a2,a3,a4,a5,a6,a7,a8,a9)) {
                    case "NONE":
                        if (a1 != "1" && a2 != "2" && a3 != "3" && a4 != "4" && a5 != "5" && a6 != "6" && a7 != "7" && a8 != "8" && a9 != "9") {
                            winner = true;
                            System.out.println("DRAW!");
                            Thread.sleep(3000);
                            break;
                        } else {
                            PrintBoard(a1,a2,a3,a4,a5,a6,a7,a8,a9);
                            System.out.printf("Player O's turn: ");
                            inO = input.nextInt();
                            break;
                        }
                    case "X":
                        winner = true;
                        System.out.println("X HAS WON!!!");
                        Thread.sleep(3000);
                        break;
                    case "O":
                        winner = true;
                        System.out.println("O HAS WON!!!");
                        Thread.sleep(3000);
                        break;
                    default:
                        break;
                }
                if (winner) {
                    break;
                }
            }
        }

        public static void PrintBoard(String f1, String f2, String f3, String f4, String f5, String f6, String f7, String f8, String f9) {
            System.out.printf("   %s | %s | %s \n",f1,f2,f3);
            System.out.printf("  ----------- \n");
            System.out.printf("   %s | %s | %s \n",f4,f5,f6);
            System.out.printf("  ----------- \n");
            System.out.printf("   %s | %s | %s \n",f7,f8,f9);
            System.out.printf(" \n");
//            System.out.printf(" Next move: ");
        }

        //Prints our board given an input of strings
        public static String Winners(String f1, String f2, String f3, String f4, String f5, String f6, String f7, String f8, String f9) {
            //check if X has won
            if (f1 == f2 && f2 == f3 && f3 == "O") {
                return "O";
            } else if (f4 == f5 && f5 == f6 && f6 == "O") {
                return "O";
            } else if (f7 == f8 && f8 == f9 && f9 == "O") {
                return "O";
            } else if (f1 == f4 && f4 == f7 && f7 == "O") {
                return "O";
            } else if (f2 == f5 && f5 == f8 && f8 == "O") {
                return "O";
            } else if (f3 == f6 && f6 == f9 && f9 == "O") {
                return "O";
            } else if (f1 == f5 && f5 == f9 && f9 == "O") {
                return "O";
            } else if (f3 == f5 && f5 == f7 && f7 == "O") {
                return "O";
            } else if (f1 == f2 && f2 == f3 && f3 == "X") {
                return "X";
            } else if (f4 == f5 && f5 == f6 && f6 == "X") {
                return "X";
            } else if (f7 == f8 && f8 == f9 && f9 == "X") {
                return "X";
            } else if (f1 == f4 && f4 == f7 && f7 == "X") {
                return "X";
            } else if (f2 == f5 && f5 == f8 && f8 == "X") {
                return "X";
            } else if (f3 == f6 && f6 == f9 && f9 == "X") {
                return "X";
            } else if (f1 == f5 && f5 == f9 && f9 == "X") {
                return "X";
            } else if (f3 == f5 && f5 == f7 && f7 == "X") {
                return "X";
            } else {
                return "NONE";
            }
        }

}
