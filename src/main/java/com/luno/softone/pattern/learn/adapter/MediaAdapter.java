package com.luno.softone.pattern.learn.adapter;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: MediaAdapter
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 16:22
 * @company:宝尊电商
 * @since JDK 1.7
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }


    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }
}
