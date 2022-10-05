package com.rajesh.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private final float LEFT_VOLUME= 1.0f;
    private final float RIGHT_VOLUME= 1.0f;
    private int NO_LOOP = 1;


    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;


    SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool.Builder().setMaxStreams(7).build();


        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);





    }

    public void playC(View view) {

        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,NO_LOOP,1.0f);


    }
    public void playD(View view) {
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,NO_LOOP,1.0f);
    }
    public void playE(View view) {
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,0,NO_LOOP,1.0f);
    }
    public void playF(View view) {
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,NO_LOOP,1.0f);
    }
    public void playG(View view) {

        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,NO_LOOP,1.0f);
    }
    public void playA(View view) {

        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,0,NO_LOOP,1.0f);

    }
    public void playB(View view) {
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,NO_LOOP,1.0f);


    }
}