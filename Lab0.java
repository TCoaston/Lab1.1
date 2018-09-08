/* Created: Bob Roos, 3 October 2013
Edited: Anastasia Kurdia, 11 January 2016
This program models the work of an octopus in the kitchen 
and tests the work of Octopus and Utensil class functions
*/
 

public class Lab0
{
    public static void main(String[] args)
    {
        // Variable dictionary:
        Octopus ocky;           // an octopus
        Utensil spat;           // a kitchen utensil
        Octopus Squidward;      // an octopus
        Utensil fork;           // a kitchen utensil

        spat = new Utensil("spatula"); // create a spatula
        spat.setColor("green");        // set spatula properties--color...
        spat.setCost(10.59);           // ... and price

        ocky = new Octopus("Ocky");    // create and name the octopus
        //ocky.setAge(10);               // set the octopus's age...
        ocky.setWeight(100);           // ... weight,...
        ocky.setUtensil(spat);         // ... and favorite utensil.

        //The following section of code is mine. Additionally, I added my variables to the dictionary,
        // and I have print statements below
        Squidward = new Octopus("Squidward"); // create and name my octopus
        Squidward.setAge(21); // set my octopus name

        fork = new Utensil("fork"); // create a spoon
        fork.setColor("red"); //set fork spatula properties--color
        fork.setCost(79.99);  //and price
        Squidward.setUtensil(fork); // Favorite utensil
        Squidward.setWeight(18); //set weight of octopus
        //This ends my section of code, with the addition of the print statements below




        System.out.println("Testing 'get' methods:");
        System.out.println(ocky.getName() + " weighs " +ocky.getWeight() 
            + " pounds\n" + "and is " + ocky.getAge() 
            + " years old. His favorite utensil is a "
            + ocky.getUtensil());

        System.out.println(ocky.getName() + "'s " + ocky.getUtensil() + " costs $"
            + ocky.getUtensil().getCost());
        System.out.println("Utensil's color: " + spat.getColor());

        // Use methods to change some values:

        ocky.setAge(20);
        ocky.setWeight(125);
        spat.setCost(15.99);
        spat.setColor("blue");

        System.out.println("\nTesting 'set' methods:");
        System.out.println(ocky.getName() + "'s new age: " + ocky.getAge());
        System.out.println(ocky.getName() + "'s new weight: " + ocky.getWeight());
        System.out.println("Utensil's new cost: $" + spat.getCost());
        System.out.println("Utensil's new color: " + spat.getColor());



        //The following print statements are mine
        System.out.println("");
        System.out.println(Squidward.getName() + "'s age: " + Squidward.getAge());
        System.out.println(Squidward.getName() + "'s weight: " + Squidward.getWeight());
        System.out.println(Squidward.getName() + "'s utensil is: a " + Squidward.getUtensil());
        System.out.println(Squidward.getName() + "'s utensil's new cost: $" + fork.getCost());
        System.out.println(Squidward.getName() + "'s utensil's color: " + fork.getColor());


    }
}
