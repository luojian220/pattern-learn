package com.luno.softone.pattern.learn.adapter;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: AdapterPatternDemo
 * @Reason: 适配器模式
 * @date: 2019年01月25日 16:25
 * @company:
 * @since JDK 1.7
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
