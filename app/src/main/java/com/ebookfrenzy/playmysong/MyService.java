package com.ebookfrenzy.playmysong;

import android.app.IntentService;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;

import java.io.IOException;

/**
 * Created by student on 3/16/15.
 */
public class MyService extends IntentService {

    public MyService() {
        super("PlayMySong");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        MediaPlayer mPlayer;
        mPlayer = new MediaPlayer();
        Uri myUri = Uri.parse("file:///sdcard/mySongs/song1.mp3");
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        try {
            mPlayer.setDataSource(getApplicationContext(), myUri);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mPlayer.start();
    }
}
