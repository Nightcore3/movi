package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyGdxGame extends Game {
	
        public SpriteBatch batch;
	public OrthographicCamera camera;
	public Pantalla coche;
	public Pantalla animacion;
        public Pantalla animacionMolino;
        public Pantalla arena;

	@Override
	public void create() {
		// Creamos algunas cosas sencillas...
		batch = new SpriteBatch();
                  int vpWidth= Gdx.graphics.getWidth(),
                      vpHeight= Gdx.graphics.getHeight();
        
                camera = new OrthographicCamera(vpWidth,vpHeight);
                camera.position.set(vpWidth/4,vpHeight/4,0);
		animacion = new com.mygdx.game.PantallaAnimation(this);
                animacionMolino= new com.mygdx.game.AnimationMolino(this);
                arena= new com.mygdx.game.Arena_1(this);
		setScreen(arena);
	}
        
        
     
        
        
}
