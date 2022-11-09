public class Main
{
    public static void main(String[] args)
    {   //Instantiation of Reference Class Objects
        //Declaration = Initialization
        Song oldTownRoad = new Song("Old Town Road", "Lil Nas X", true, 136, 1.53);
        Song shutUpMyMomIsCalling = new Song("Shut Up My Mom is Calling", "Hotel Ugly", true, 139, 2.45);
        Song goneAway = new Song("Gone Away", "The Offspring", true, 111, 4.30);
        Song blank = new Song();
        Song babyHotLine = new Song("Baby Hot Line", "Jack Stauber", true, 120, 4.51);

        System.out.println(blank.toString());
        System.out.println(babyHotLine.toString());
        System.out.print("The first title is " + oldTownRoad.getTitle() + ",");
        System.out.println(" and is performed by " + oldTownRoad.getArtist() + ".");

        System.out.println("First, Shut Up My Mom Is Calling has a tempo of " + shutUpMyMomIsCalling.getTempo());
        shutUpMyMomIsCalling.setTempo(200);
        System.out.println("After update, Shut Up My Mom Is Calling has a tempo of " + shutUpMyMomIsCalling.getTempo());


        System.out.println("I have " + Song.getNumSongs() + " songs in my playlist.");
        System.out.println(oldTownRoad.toString()); //Use Java 7 version - toString()
        System.out.println("\n" + shutUpMyMomIsCalling.toString());
        System.out.println("\n" + goneAway.toString());

    }
}