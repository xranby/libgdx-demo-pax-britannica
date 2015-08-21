package de.swagner.paxbritannica.desktop;

import com.badlogic.gdx.backends.jogamp.*;
import de.swagner.paxbritannica.PaxBritannica;

public class DesktopLauncher {
	public static void main(String[] args) {
		JoglNewtApplicationConfiguration config = new JoglNewtApplicationConfiguration();
		config.width = 1024;
		config.height = 550;
		config.title = "Pax Britannica";
		new JoglNewtApplication(new PaxBritannica(), config);
	}
}
