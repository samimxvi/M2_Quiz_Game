import java.io.*;
import java.util.*;

class Quiz {
    static Scanner Cin = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void know() {
        System.out.print("\u001b[2J");
        System.out.flush();
        System.out.printf("\n \t\t\t\t\t\tHOW TO PLAY THE Quiz Game\t\t\t\t");
        System.out.printf(
                "\n------------_________________________________________________________________________________________________------------\n");
        System.out.printf("\n\n\t\t\t\t 1. This quiz game contains total 15 questions in total.");
        System.out.printf("\n\t\t\t\t 2. Each question carries 10 points.");
        System.out.printf("\n\t\t\t\t 3. You need to score 150 points continously to win the game.");
        System.out.printf("\n\t\t\t\t 4. You will presented 4 options.");
        System.out.printf("\n\t\t\t\t 5. Choose the right one and you can move ahead.");
        System.out.printf("\n\t\t\t\t 6. Otherwise, you loose.");
        System.out.printf("\n\t\t\t\t 7. But remember, there is always a second chance.");
        System.out.printf("\n\n\t\t\t\t\t************@  ALL THE BEST @************\n\n");
    }

    public void quit() {
        System.out.printf("\n\n\t\t\t****************@ THANK YOU FOR VISITING! @***************\n");
        System.out.printf("\t\t\t\t*********@  See you again soon @*********\n");
    }

    public void winner(int score, String name) {
        System.out.print("\u001b[2J");
        System.out.flush();
        if (score == 100) {
            System.out.printf("\n\n\n\n\n\n\n\t\t\t***********@ CONGRAGULATIONS! %s YOU WIN***************\n\n", name);
        }
    }

    public void start() {
        System.out.print("\u001b[2J");
        System.out.flush();

        int answer, temp, queue, score = 0;
        String name;

        System.out.printf("\n\n\t\t\t\t\t@ WELCOME TO THE C PROGRAMMING QUIZ GAME @");
        System.out.printf("\n\n\tTake a deep breath and let's begin!\n");
        System.out.printf("\n\tPlease Enter your name : ");
        // Enter data using BufferCiner
        try {
            name = reader.readLine();

            for (queue = 1; queue <= 10; queue++) {
                answer = 0;
                temp = queue;
                switch (temp) {
                    case 1:
                        System.out.printf("\n\n\t1.What is the only function all C programs must contain?");
                        System.out.printf("\n\t\t1.start()\t\t\t2.system()\n\t\t3.main()\t\t\t4.program()");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();

                        if (answer == 3) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is :", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    case 2:
                        System.out.printf("\n\n\t2.Which of the following is a correct comment?");
                        System.out.printf(
                                "\n\t\t1.*/ Comments */\t\t\t2.** Comment **\n\t\t3./* Comment */\t\t\t\t4.{ Comment }");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 3) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is :", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    case 3:

                        System.out.printf("\n\n\t3.Which of the following is not a correct variable type?");
                        System.out.printf("\n\t\t1.float\t\t\t2.real\n\t\t3.int\t\t\t4.double");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 2) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is :", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    case 4:

                        System.out.printf("\n\n\t4.C language has been developed by?");
                        System.out.printf(
                                "\n\t\t1.Ken Thompson\t\t\t2.Dennis Ritchie\n\t\t3.Peter Norton\t\t\t4.Peter Norton");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 2) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is : ", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    case 5:
                        System.out.printf("\n\n\t5.C can be used on?");
                        System.out.printf(
                                "\n\t\t1.Only MS-DOS\t\t\t2.Only Linux\n\t\t3.Only window\t\t\t4.All of the above");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 4) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is : ", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time!\n\n", name);
                            queue = 11;
                            break;
                        }

                    case 6:

                        System.out
                                .printf("\n\n\t6.C programs are convrted into the machine language with the help of?");
                        System.out.printf(
                                "\n\t\t1.An editor\t\t\t2.Compiler\n\t\t3.An operating system\t\t\t4.None of the above");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 2) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is :", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    case 7:
                        System.out.printf(
                                "\n\n\t7.What is the correct value to return to the operating system upon the successful completion of a program?");
                        System.out.printf("\n\t\t1.-1\t\t\t2.1\n\t\t3.0\t\t\t4.Programs do not return a value");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 3) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is : ", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    case 8:
                        System.out
                                .printf("\n\n\t8.Which of the following is not an example of a Looping statement?");
                        System.out.printf("\n\t\t1.For\t\t\t2.Do-while\n\t\t3.While\t\t\t4.Switch");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 4) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is : ", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    case 9:
                        System.out.printf("\n\n\t9.The ______ statement causes the loop to be terminated.");
                        System.out.printf("\n\t\t1.Exit\t\t\t2.Break\n\t\t3.Default\t\t\t4.Continue");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 2) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is : ", +score);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    case 10:
                        System.out.printf(
                                "\n\n\t10.To perform a set of instructions repeatedly which of the following can be used?");
                        System.out.printf("\n\t\t1.For\t\t\t2.While\n\t\t3.If-Else-If\t\t\t4.Both a & b");
                        System.out.printf("\n\n\tEnter your answer : ");
                        answer = Cin.nextInt();
                        if (answer == 4) {
                            score = score + 10;
                            System.out.printf("\tYour Answer is correct!\n");
                            System.out.printf("\tYour score is :", +score);
                            winner(score, name);
                        } else {
                            System.out.printf("\n\n\t\tYour answer is wrong!");
                            System.out.printf("\n\t\tBetter Luck next time! \n\n", name);
                            queue = 11;
                            break;
                        }

                    default: {
                        queue = 11;
                        break;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Can't read name");
        }
    }

    public static void main(String args[]) {
        int ch, menu = 0;

        Quiz req = new Quiz();

        Home: while (true) {
            System.out.print("\u001b[2J");
            System.out.flush();
            System.out.printf(
                    "\n\n\t\t\t******************@   WELLCOME TO THE QUIZ GAME   @******************\n");
            System.out.printf("\n\t\t\t\t\t\tTOPIC: C PROGRAMMING\n");
            System.out.printf("\n\t\t Press 1 to START the game");
            System.out.printf("\n\n\t\t Press 2 to KNOW how to play ");
            System.out.printf("\n\n\t\t Press 3 to QUIT the game \n");
            System.out.printf("\n\t\t ENTER YOUR OPTION: ");
            ch = Cin.nextInt();

            switch (ch) {
                case 1:
                    req.start();
                    System.out.printf("\n\n\tEnter 1 to return to the menu: ");
                    menu = Cin.nextInt();
                    if (menu == 1) {
                        ch = 0;
                        continue Home;
                    } else {
                        System.out.printf("\n\n\n\t\tPlease enter valid option!\n\n\n");
                    }

                case 2:
                    req.know();
                    System.out.printf("\n\tEnter 1 to return to the menu: ");
                    menu = Cin.nextInt();
                    if (menu == 1) {
                        ch = 0;
                        continue Home;
                    } else {
                        System.out.printf("\n\n\n\t\tPlease enter valid option!\n\n\n");
                    }

                case 3:
                    req.quit();
                    System.exit(0);

                default:
                    System.out.printf("\n\n\n\t\tPlease enter valid option!\n\n\n");
            }
        }
    }
}
