package com.glover.thepurpleblob;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class TheBlob {

    public static final float BLOB_JUMP = 5000;
    public static final float GRAVITY = -20;
    public static final float BUTTERFLY_VELOCITY_Y = 200;
    public static final int BUTTERFLY_FALL_SPEED = -400;
    public static final String blobPath = "blob/";

    public static Texture blobWait_1;
    public static Texture blobWait_2;
    public static Texture blobWait_3;
    public static Texture blobWait_4;
    public static Texture blobRight_1;
    public static Texture blobRight_2;
    public static Texture blobRight_3;
    public static Texture blobRight_4;
    public static Texture blobLeft_1;
    public static Texture blobLeft_2;
//    public static Texture blobLeft_3;
//    public static Texture blobLeft_4;

    public static Sound wingFlap;
    public static Rectangle blob;
    public static Animation<TextureRegion> blobSpriteWait;
    public static Animation<TextureRegion> blobSpriteGoRight;
    public static Animation<TextureRegion> blobSpriteGoLeft;
    public static float blobStateTime = 0;

//    public static Vector2 butterflyPosition = new Vector2();
//    public static Vector2 butterflyVelocity = new Vector2();
//    public static Vector2 gravity = new Vector2();

    public static void load() {

        //		create blob
        blobWait_1 = new Texture(Gdx.files.internal(blobPath + "blob_tall_1.png"));
        blobWait_2 = new Texture(Gdx.files.internal(blobPath + "blob_small_look_right.png"));
        blobWait_3 = new Texture(Gdx.files.internal(blobPath + "blob_small_look_left.png"));
        blobWait_4 = new Texture(Gdx.files.internal(blobPath + "blobtallleftup.png"));

        blobWait_1.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        blobSpriteWait = new Animation<TextureRegion>(0.10f,
                new TextureRegion(blobWait_1),
                new TextureRegion(blobWait_2),
                new TextureRegion(blobWait_3),
                new TextureRegion(blobWait_4));
        blobSpriteWait.setPlayMode(Animation.PlayMode.LOOP);


        blobRight_1 = new Texture(Gdx.files.internal(blobPath + "blob_tall_goright_2.png"));
        blobRight_2 = new Texture(Gdx.files.internal(blobPath + "blob_tall_goright_1.png"));
        blobRight_3 = new Texture(Gdx.files.internal(blobPath + "blob_small_goright_2.png"));
        blobRight_4 = new Texture(Gdx.files.internal(blobPath + "blob_small_goright_1.png"));

        blobRight_1.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        blobSpriteGoRight = new Animation<TextureRegion>(0.10f,
                new TextureRegion(blobRight_1),
                new TextureRegion(blobRight_2),
                new TextureRegion(blobRight_3),
                new TextureRegion(blobRight_4));
        blobSpriteGoRight.setPlayMode(Animation.PlayMode.LOOP);

        blobLeft_1 = new Texture(Gdx.files.internal(blobPath + "blobtallturnleft.png"));
        blobLeft_2 = new Texture(Gdx.files.internal(blobPath + "blob_small_turn_left.png"));

        blobLeft_1.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        blobSpriteGoLeft = new Animation<TextureRegion>(0.20f,
                new TextureRegion(blobLeft_1),
                new TextureRegion(blobLeft_2));
        blobSpriteGoLeft.setPlayMode(Animation.PlayMode.LOOP);




//        wingFlap = Gdx.audio.newSound(Gdx.files.internal("sounds/butterflyFlapPCM.wav"));

        blob = new Rectangle();

        blob.x = 20;
        blob.y = 0;
        blob.height = 250;
        blob.width = 250;

        //new butterfly flapping stuff
//        butterflyPosition.set(20, (Constants.SCREEN_HEIGHT / 2) - (butterfly.height / 2));
//        butterflyVelocity.set(0, 0);
//        gravity.set(0, GRAVITY);
    }


}
