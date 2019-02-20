package adapter_pattern;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("AdvancedMediaPlayer:VlcPlayer--playVlc");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
