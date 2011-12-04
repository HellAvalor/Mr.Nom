package de.gordin.mrnom;

import de.gordin.framework.Screen;
import de.gordin.framework.impl.AndroidGame;

public class MrNomGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}