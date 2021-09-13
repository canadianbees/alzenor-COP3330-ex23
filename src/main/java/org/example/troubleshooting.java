/*
 *  UCF COP3330 Fall 2021 Troubleshooting Class file
 *  Copyright 2021 Celina Alzenor
 */
package org.example;
import java.util.Scanner;

public class troubleshooting
{

    //runs through a series of questions to ask user and tries to provide a solution
    public void questions()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");

        String choice = input.next();

        if(choice.matches("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            choice = input.next();

            if(choice.matches("y"))
            {
                System.out.print("Clean the terminals and try starting again.");
            }

            else if(choice.matches("n"))
            {
                System.out.print("Replace the cables and try again ");
            }
        }
        else if(choice.matches("n"))
        {
            System.out.print("Does the car make a slicking noise? ");
            choice = input.next();

            if(choice.matches("y"))
            {
                System.out.println("Replace the battery.");
            }

            else if(choice.matches("n"))
            {
                System.out.print("Does the car crank up but fail to start? ");
                choice = input.next();

                if(choice.matches("y"))
                {
                    System.out.print("Check spark plug connections.");
                }

               else if(choice.matches("n"))
                {
                    System.out.print("Does the engine start and then die? ");
                    choice = input.next();

                    if(choice.matches("y"))
                    {
                        System.out.print("Does your car have fuel injection? ");
                        choice = input.next();

                       if(choice.matches("y"))
                        {
                            System.out.print("Get it in for service.");
                        }

                        else if(choice.matches("n"))
                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }

                   else if(choice.matches("n"))
                    {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}
