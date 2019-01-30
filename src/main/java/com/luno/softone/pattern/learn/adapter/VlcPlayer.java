package com.luno.softone.pattern.learn.adapter;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: VlcPlayer
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 16:19
 * @company:
 * @since JDK 1.7
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
