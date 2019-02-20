package adapter_pattern;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("AdvancedMediaPlayer:Mp4Player--playMp4");
    }
}
