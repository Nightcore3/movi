package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyGdxGame extends Game {
	
    public SpriteBatch batch;
	
	public Pantalla coche;
	public Pantalla animacion;
        public Pantalla animacionMolino;

	@Override
	public void create() {
		// Creamos algunas cosas sencillas...
		batch = new SpriteBatch();
		
		
		animacion = new com.mygdx.game.PantallaAnimation(this);
                animacionMolino= new com.mygdx.game.AnimationMolino(this);
		setScreen(animacionMolino);
	}

        
}
