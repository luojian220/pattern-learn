package com.luno.softone.pattern.learn.adapter;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: AudioPlayer
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 16:24
 * @company:
 * @since JDK 1.7
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        } else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            //mediaAdapter 提供了播放其他文件格式的支持
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
