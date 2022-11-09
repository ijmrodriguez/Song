public class Song
{
    //1) Class or Instance variables
    private String title;
    private String artist;
    private boolean hasChorus;
    private int tempo;
    private double playTime;
    private static int numSongs;

    //2) Constructors
    public Song(String title, String artist, boolean hasChorus, int tempo, double playTime)
    {
        this.title = title;
        this.artist = artist;
        this.hasChorus = hasChorus;
        this.tempo = tempo;
        this.playTime = playTime;
        numSongs++;
    }//end of full constructor

    public Song()
    {
        //title = ""; //empty string frequently used as a default value
        title = "title goes here";
        artist = "none"; //String types can be null or empty
        hasChorus = false; //typical default for a boolean type
        tempo = 0; //typically default for a number type
        playTime = 0;
        numSongs++;
    }//end default constructor

    //4) Getter = allow the client to access instance variables
    public String getTitle()
    {
        return title;
    }//end of title getter

    public String getArtist()
    {
       return artist;
    }//end artist getter

    public int getTempo()
    {
        return tempo;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }

    //5) Setters (aka mutators) To change a value
    public void setTempo(int myTempo)
    {
        tempo = myTempo;
    }//end of tempo getter

    //6) Brain Methods
    //Convert playTime to seconds
    public int playTimeSeconds()
    {
        int minuteInSeconds = 60 * (int)(playTime);
        int seconds = (int)(playTime * 100) % 100;
        return seconds + minuteInSeconds;
    }


    //3) ToString
    public String toString()
    {
        String output = "Title: " + title +
                        "\nArtist: " + artist +
                        "\nHas a Chorus " + hasChorus +
                        "\nTempo: " + tempo +
                        "\nPlay time: " + playTime;
        return output;
    }
}//end of Song class
