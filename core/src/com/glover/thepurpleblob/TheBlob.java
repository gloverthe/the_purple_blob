package com.glover.thepurpleblob;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class TheBlob {

    public static final float BUTTERFLY_IMPULSE = 3500;
    public static final float GRAVITY = -20;
    public static final float BUTTERFLY_VELOCITY_Y = 200;
    public static final int BUTTERFLY_FALL_SPEED = -110;
    public static final String blobPath = "blob/";

    public static Texture blobWait_1;
    public static Texture blobWait_2;
    public static Texture blobWait_3;
    public static Texture blobWait_4;
    public static Sound wingFlap;
    public static Rectangle blob;
    public static Animation<TextureRegion> blobSprite;
    public static float blobStateTime = 0;

//    public static Vector2 butterflyPosition = new Vector2();
//    public static Vector2 butterflyVelocity = new Vector2();
//    public static Vector2 gravity = new Vector2();

    public static void load() {

        //		create butterfly
        blobWait_1 = new Texture(Gdx.files.internal(blobPath + "blob_tall_1.png"));
        blobWait_2 = new Texture(Gdx.files.internal(blobPath + "blob_small_look_right.png"));
        blobWait_3 = new Texture(Gdx.files.internal(blobPath + "blob_small_look_left.png"));
        blobWait_4 = new Texture(Gdx.files.internal(blobPath + "blobtallleftup.png"));

        blobWait_1.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        blobSprite = 	new Animation<TextureRegion>(0.10f,
                new TextureRegion(blobWait_1),
                new TextureRegion(blobWait_2),
                new TextureRegion(blobWait_3),
                new TextureRegion(blobWait_4));
        blobSprite.setPlayMode(Animation.PlayMode.LOOP);


//        wingFlap = Gdx.audio.newSound(Gdx.files.internal("sounds/butterflyFlapPCM.wav"));

        blob = new Rectangle();

        blob.x = 20;
        blob.y = 0;
        blob.height = 256;
        blob.width = 256;

        //new butterfly flapping stuff
//        butterflyPosition.set(20, (Constants.SCREEN_HEIGHT / 2) - (butterfly.height / 2));
//        butterflyVelocity.set(0, 0);
//        gravity.set(0, GRAVITY);
    }
}
