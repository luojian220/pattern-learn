package com.luno.softone.pattern.learn.adapter;

/**
 * @author luojian
 * @version 1.0
 * @ClassName: Mp4Player
 * @Reason: TODO ADD REASON(可选)
 * @date: 2019年01月25日 16:22
 * @company:宝尊电商
 * @since JDK 1.7
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);

    }
}
