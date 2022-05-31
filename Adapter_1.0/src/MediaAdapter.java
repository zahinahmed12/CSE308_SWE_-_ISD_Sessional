public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer adv;

    public MediaAdapter(String type)
    {
        if(type.equals("vlc"))
        {
            adv=new VlcPlayer();
        }
        else if(type.equals("mp4"))
        {
            adv=new Mp4Player();
        }
        else if(type.equals("flv"))
        {
            adv=new FlvPlayer();
        }
    }

    @Override
    public void play(String name, String type, int s, String d) {
        if(type.equals("vlc"))
        {
            adv.playVlc(name,s,d);
        }
        else if(type.equals("mp4"))
        {
            adv.playMp4(name,s,d);
        }
        else if(type.equals("flv"))
        {
            adv.playFlv(name,s,d);
        }
    }
}
