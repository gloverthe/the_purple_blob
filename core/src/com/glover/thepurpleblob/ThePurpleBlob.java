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
	
	@Override
	public void create () {
		batch = new SpriteBatch();
//		img = new Texture("blob/blob_tall_bigeyes.png");
		TheBlob.load();

	}

	@Override
	public void render () {

		float deltaTime = Gdx.graphics.getDeltaTime();
		TheBlob.blobStateTime += deltaTime;

		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(TheBlob.blobSprite.getKeyFrame(TheBlob.blobStateTime), TheBlob.blob.x, TheBlob.blob.y);

		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) TheBlob.blob.x -= 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) TheBlob.blob.x += 200 * Gdx.graphics.getDeltaTime();

		//toDo add in blob jumping using logic from butterfly - touch screen
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
