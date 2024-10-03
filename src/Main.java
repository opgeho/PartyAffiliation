import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String partyAfil = "";

        System.out.println("Enter your party affiliation [R,D,I] : ");
        partyAfil = in.nextLine();

        if(partyAfil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        } else if (partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a democratic donkey!");
        } else if (partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println("you get an independant Man!");
        }
        else
        {
            System.out.println("Your party " + partyAfil + " is not a recognized party.");
        }
    }
}