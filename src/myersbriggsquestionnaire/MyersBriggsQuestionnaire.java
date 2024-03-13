package myersbriggsquestionnaire;

import java.util.Scanner;
public class MyersBriggsQuestionnaire {
    public static void main(String[] args) {
        questionnaire();
        questionnaireResult();
    }
     public static Scanner input = new Scanner(System.in);
    private static int countA1 = 0;
    private static int countB1 = 0;
    private static int countA2 = 0;
    private static int countB2 = 0;
    private static int countA3 = 0;
    private static int countB3 = 0;
    private static int countA4 = 0;
    private static int countB4 = 0;

    private static void questionnaire(){
        for (int i = 1; i <= 20; i++){
            System.out.println("Choose either A or B");
            String userInput;
            switch (i) {
                case 1 -> {
                    System.out.println("""
                            Question 1.

                            A. Expend energy, enjoy groups
                            B. Conserve energy, enjoy one-one
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    } else
                        countB1++;
                }
                case 2 -> {
                    System.out.println("""
                            Question 2.
                            A. interpret literally,
                            B. look for meaning and possibilities""");
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    } else
                        countB2++;
                }
                case 3 -> {
                    System.out.println("""
                            Question 3.
                            A. Logical, Thinking, Questioning
                            B. Empathetic, Feeling, Accommodating
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    } else
                        countB3++;

                }
                case 4 -> {
                    System.out.println("""
                            Question 4.
                            A. Organised, Orderly
                            B. Flexible, Adaptable
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    } else
                        countB4++;
                }
                case 5 -> {
                    System.out.println("""
                            Question 5.
                            A. More outgoing, Think out loud
                            B. More reserved, Think to yourself
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    } else
                        countB1++;
                }
                case 6 -> {
                    System.out.println("""
                            Question 6.
                            A. practical, realistic, experiential
                            B. imaginative, innovative,theoretical
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    } else
                        countB2++;
                }
                case 7 -> {
                    System.out.println("""
                            Question 7.
                            A.Candid, straight, forward, frank
                            B. Tactful, kind, encouraging
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    } else
                        countB3++;

                }
                case 8 -> {
                    System.out.println("""
                            Question 8.
                             A. Plan, Schedule
                             B. unplanned, spontaneous
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    } else
                        countB4++;                }
                case 9 -> {
                    System.out.println("""
                            Question 9.
                            A. Seek many tasks, public activities, interaction with others
                            B. Seek private, solitary activities with quiet to concentrate
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    } else
                        countB1++;
                }
                case 10 -> {
                    System.out.println("""
                            Question 10.
                            A. Standard, Usual, Conventional
                            B. Different, Novel, Unique
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    } else
                        countB2++;
                }
                case 11 -> {
                    System.out.println("""
                            Question 11.
                            A. Firm, tend to criticize, hold the line
                            B.Gentle, tend to appreciate, conciliate
                             """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    } else
                        countB3++;

                }
                case 12 -> {
                    System.out.println("""
                            Question 12
                            A. Regulated, structured
                            B. Easygoing, "live" and "let live"
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    } else
                        countB4++;
                }
                case 13 -> {
                    System.out.println("""
                            Question 13.
                            A. External, communicative, express yourself
                            B. Internal, reticent, keep to yourself
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    } else countB1++;
                }
                case 14 -> {
                    System.out.println("""
                            Question 14
                            A. Focus on here-and-now
                            B. Look to the future, global perspective, "big picture"
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) countA2++;
                    else countB2++;
                }
                case 15 -> {
                    System.out.println("""
                            Question 15.
                            A. Tough-minded, just
                            B. Tender-hearted and merciful
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    } else countB3++;
                }
                case 16 -> {
                    System.out.println("""
                            Question 16.
                            A. Preparation, plan ahead
                            B. Go with the flow, adapt as you go
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    } else countB4++;
                }
                case 17 -> {
                    System.out.println("""
                            Question 17
                            A. Active, initiate
                            B. Reflective, deliberate
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    } else countB1++;
                }
                case 18 -> {
                    System.out.println("""
                            Question 18.
                            A. Facts, things, "what is"
                            B. Ideas, dreams, "what could be" philosophical
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    } else countB2++;
                }
                case 19 -> {
                    System.out.println("""
                            Question 19
                            A. Matter of fact, issue-oriented
                            B. Sensitive, people-oriented, compassionate
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    } else countB3++;
                }
                case 20 -> {
                    System.out.println("""
                            Question 20
                            A. Control, govern
                            B. Latitude, freedom
                            """);
                    userInput = input.nextLine();
                    if (userInput.equalsIgnoreCase("a")) {
                        countA4++;
                    } else countB4++;
                }
            }
        }
    }


    private static void questionnaireResult() {
        if (countA1 > countB1) {
            System.out.print("E");
        } else {
            System.out.print("I");
        }
        if (countA2 > countB2) {
            System.out.print("S");
        } else {
            System.out.print("N");
        }
        if (countA3 > countB3) {
            System.out.print("T");
        } else {
            System.out.print("F");
        }
        if (countA4 > countB4) {
            System.out.print("J");
        } else {
            System.out.print("P");
        }
    }
}
