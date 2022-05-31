import java.util.*;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;
   // public List<musicPlayers> playMusic;

    String name;
    String type;
    String duration;
    int size;
    public AudioPlayer(String name, String type,int size,String duration)
    {
        this.name=name;
        this.type=type;
        this.duration=duration;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDuration() {
        return duration;
    }

    public int getSize() {
        return size;
    }


    @Override
    public void play(String name, String type, int s, String d) {

        if(type.equals("mp3"))
        {
            System.out.println("Playing mp3 file. Name: "+name +" Size: "+s+" Duration: "+d);
        }
        else if(type.equals("mp4") ||type.equals("vlc") ||type.equals("flv")  )
        {
            adapter=new MediaAdapter(type);
            adapter.play(name,type,s,d);
        }
        else
        {
            System.out.println("Invalid media. "+ type +" format not supported. ");
        }
    }
}
