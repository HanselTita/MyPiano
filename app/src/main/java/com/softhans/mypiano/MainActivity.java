package com.softhans.mypiano;

import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.media.AudioManager.STREAM_MUSIC;

public class MainActivity extends AppCompatActivity {


    //Helpful Constatnts
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME =1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private  final int NO_LOOP =0;
    private final int PRIORITY =0;
    private final float NORMAL_PLAY_RATE = 1.0f;


    private int mC;
    private int mCSharp;
    private int mD;
    private int mEFlat;
    private int mE;
    private int mF;
    private int mFSharp;
    private int mG;
    private int mGsharp;
    private int mA;
    private int mBFlat;
    private int mB;

    private SoundPool mSoundPool;

/** Whenever you want to make an apps that use a particular features like camera, media, etc.
 * Get to the resources available in Android Documentations.
 * To get that get to the site: www.developer.android.com
 * And look for the API (Application Programming Interface)guide
 * Then search about that particular feature*
 * Alternatively check stackOVerflow to pose your difficulties or see if someone had similar issues.
 * Always check on github samples it helps.*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: Create a new SoundPool.
        /**From research, the SoundPool is the best class to use. We create a SoundPool in the Main class(mSoundPool).
         * Note also that a member variable works with respect to where it is created (called local variable).
         * For example all variable/field created within onCreate Method, works only inside the braces of onCreate
         * Member variables created in the Main class like "mC" works for the entire class*/

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, STREAM_MUSIC, 0);


      //TODO: Load and get the IDs to identify the sounds.
        mC = mSoundPool.load(getApplicationContext(), R.raw.c, 1);
        mCSharp = mSoundPool.load(getApplicationContext(), R.raw.csharp, 1);
        mD = mSoundPool.load(getApplicationContext(), R.raw.d, 1);
        mEFlat= mSoundPool.load(getApplicationContext(), R.raw.eflat, 1);
        mE = mSoundPool.load(getApplicationContext(), R.raw.e, 1);
        mF = mSoundPool.load(getApplicationContext(), R.raw.f, 1);
        mFSharp = mSoundPool.load(getApplicationContext(), R.raw.fsharp, 1);
        mG = mSoundPool.load(getApplicationContext(), R.raw.g, 1);
        mGsharp = mSoundPool.load(getApplicationContext(), R.raw.gsharp, 1);
        mA = mSoundPool.load(getApplicationContext(), R.raw.a, 1);
        mBFlat = mSoundPool.load(getApplicationContext(), R.raw.bflat, 1);
        mB = mSoundPool.load(getApplicationContext(), R.raw.b, 1);




        /*final Button cBtn = (Button) findViewById(R.id.c);
        final Button cSharpBtn = (Button) findViewById(R.id.cSharp);
        final Button dBtn = (Button) findViewById(R.id.d);
        final Button eFlatBtn = (Button) findViewById(R.id.eFlat);
        final Button eBtn = (Button) findViewById(R.id.e);
        final Button fBtn = (Button) findViewById(R.id.f);
        final Button fSharpBtn = (Button) findViewById(R.id.fSharp);
        final Button gBtn = (Button) findViewById(R.id.g);
        final Button gsharpBtn = (Button) findViewById(R.id.gSharp);
        final Button aBtn = (Button) findViewById(R.id.a);
        final Button bFlatBtn = (Button) findViewById(R.id.bFlat);
        final Button bBtn = (Button) findViewById(R.id.b);
*/


    }

    //TODO:Add the play methods tirggered by the buttons

    public void playC(View view){
    mSoundPool.play(mC, 1.0f, 1.0f, 0, 0, 1.0f);

    /**Alternatively we can doe in  "(mC, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE)"
        Gotten from helpful constants above.*/

    }
    public void playCSharp(View view){

    mSoundPool.play(mCSharp, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playD(View view){
        mSoundPool.play(mD, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

    }
    public void playEFlat(View view){

        mSoundPool.play(mEFlat, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playE(View view){
        mSoundPool.play(mE, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

    }
    public void playF(View view){

        mSoundPool.play(mF, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playFSharp(View view){

        mSoundPool.play(mFSharp, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playG(View view){

        mSoundPool.play(mG, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playGSharp(View view){

        mSoundPool.play(mGsharp, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playA(View view){

        mSoundPool.play(mA,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playBFlat(View view){

        mSoundPool.play(mBFlat, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playB(View view){
        mSoundPool.play(mB, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

    }


}
