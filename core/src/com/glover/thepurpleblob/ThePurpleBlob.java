package com.glover.thepurpleblob;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ThePurpleBlob extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Character blobDirection;
	Integer blobWait;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
//		img = new Texture("blob/blob_tall_bigeyes.png");
		blobDirection = 'n';
		blobWait = 0;
		TheBlob.load();

	}

	@Override
	public void render () {

		float deltaTime = Gdx.graphics.getDeltaTime();
		TheBlob.blobStateTime += deltaTime;

		if(blobWait == 6){
			blobDirection = 'n';
			blobWait = 0;
		}


		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(TheBlob.returnBlob(blobDirection).getKeyFrame(TheBlob.blobStateTime), TheBlob.getBlobx(), TheBlob.getBloby());
		blobWait += 1;
//		if(blobDirection=='n') {
//			batch.draw(TheBlob.blobSpriteWait.getKeyFrame(TheBlob.blobStateTime), TheBlob.blob.x, TheBlob.blob.y);
//		}
//		if(blobDirection=='r') {
//			batch.draw(TheBlob.blobSpriteGoRight.getKeyFrame(TheBlob.blobStateTime), TheBlob.blob.x, TheBlob.blob.y);
//			blobWait += 1;
//		}
//		if(blobDirection=='l') {
//			batch.draw(TheBlob.blobSpriteGoLeft.getKeyFrame(TheBlob.blobStateTime), TheBlob.blob.x, TheBlob.blob.y);
//			blobWait += 1;
//		}
		//toDo fix calcuations for blob postions now getters and setters used
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
			TheBlob.setBlobx(-200 * Gdx.graphics.getDeltaTime())  ;
			blobDirection = 'l' ;
			blobWait = 0;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			TheBlob.setBlobx(200 * Gdx.graphics.getDeltaTime())  ;
			blobDirection = 'r' ;
			blobWait = 0;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.UP)){
			TheBlob.setBloby(TheBlob.BLOB_JUMP * Gdx.graphics.getDeltaTime());
//			blobDirection = 'r' ;
//			blobWait = 0;
		}
		//toDo add in blob jumping using logic from butterfly - touch screen

		TheBlob.setBloby(-200 * Gdx.graphics.getDeltaTime());
//		if(TheBlob.blob.y < 0) TheBlob.blob.y = 0;
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
