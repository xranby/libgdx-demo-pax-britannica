package de.swagner.paxbritannica.desktop;

import com.badlogic.gdx.backends.jogamp.JoglApplication;
import com.badlogic.gdx.backends.jogamp.JoglApplicationConfiguration;
import de.swagner.paxbritannica.PaxBritannica;

public class DesktopLauncher {
	public static void main(String[] args) {
		JoglApplicationConfiguration config = new JoglApplicationConfiguration();
		config.width = 1024;
		config.height = 550;
		config.title = "Pax Britannica";
		new JoglApplication(new PaxBritannica(), config);
	}
}
