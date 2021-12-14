package com.glover.thepurpleblob.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.glover.thepurpleblob.ThePurpleBlob;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "The Purple Blob";
		config.width = 1920;
		config.height = 1200;

		new LwjglApplication(new ThePurpleBlob(), config);
	}
}
