public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String name, int s, String d) {

    }

    @Override
    public void playVlc(String name, int s, String d) {

        System.out.println("Playing vlc file. Name: "+name +" Size: "+s+" Duration: "+d);
    }

    @Override
    public void playFlv(String name, int s, String d) {

    }
}
