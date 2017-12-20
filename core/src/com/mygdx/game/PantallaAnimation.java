package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;

import com.badlogic.gdx.graphics.g2d.*;

public class PantallaAnimation extends Pantalla {

    private Texture dude;
    private TextureRegion dudeRegion;
    private TextureRegion[] dudeFrames;
    private Animation dudeAnimation;
    private float duracion=0;
    
    
    
    private Texture dude2;
    private TextureRegion dudeRegion2;
    private TextureRegion[] dudeFrames2;
    private Animation dudeAnimation2;
    
    
    
    
    
    private static final int ALTO=3600;
    private static final int ANCHO=9000;
    private static final int NUM_FOTO_X=20; //nimero de fotogramas por imagen
    private static final int NUM_FOTO_Y=8;
    
    
    
    
    
    
    
    public PantallaAnimation(MyGdxGame game) {
        super(game);
    }

    @Override
    public void show() {
        dude =new Texture("bruja_caminando.png");
        dudeRegion= new TextureRegion(dude,ANCHO,ALTO);
        TextureRegion[][] temp= dudeRegion.split(ANCHO/NUM_FOTO_X,ALTO/NUM_FOTO_Y);
        dudeFrames = new TextureRegion [temp.length * temp[0].length];
        
        int indice=0;
        for (TextureRegion[] temp1 : temp) {
            for (int j = 0; j<temp[0].length; j++) {
                dudeFrames[indice++] = temp1[j];
            }
        }
        
        
       /* for(int frame=0 ;frame<temp.length;frame++){
            dudeFrames[frame]=temp[0][frame];
        }
        */
        
       //esta bien
       dudeAnimation= new Animation(0.04f,dudeFrames);
       
       
       
       dude2=new Texture("bruja_atacando.png");
       dudeRegion2= new TextureRegion(dude2,ANCHO,ALTO);
       TextureRegion[][] temp2= dudeRegion2.split(ANCHO/NUM_FOTO_X, ALTO/NUM_FOTO_Y);
       dudeFrames2 = new TextureRegion [temp2.length * temp2[0].length];
       
        indice=(temp2.length * temp2[0].length)-1;
        for (int i = 0; i<temp2.length;i++) {
            for (int j = 0; j<temp2[0].length; j++) {
                dudeFrames2[indice--] = temp2[i][j];
            }
        }
       
        dudeAnimation2= new Animation(0.04f,dudeFrames2);
    
    }
	
    
    
    
     @Override
    public void render(float delta) {
         
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 0.5f);
        
        duracion+=delta;
        
        TextureRegion frame  = (TextureRegion) dudeAnimation.getKeyFrame(duracion, true);
        TextureRegion frame2 = (TextureRegion) dudeAnimation2.getKeyFrame(duracion, true);
        game.batch.begin();
        game.batch.draw(frame2, 200, 200);
        game.batch.draw(frame, 0, 0);
        game.batch.end();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*private TextureAtlas atlas;
	private Texture dude;
	private TextureRegion dudeRegion;
	private TextureRegion[] dudeFrames;
	private Animation dudeAnimation;
	private float duracion = 0;
	
	private static final int ANCHO = 252;
	private static final int ALTO = 49;

	public PantallaAnimation(MyGdxGame game) {
		super(game);
	}
	
	@Override
	public void show() {
		atlas = new TextureAtlas("atlas.atlas");
		TextureRegion region = atlas.findRegion("dudewalking");
		dudeRegion = new TextureRegion(region, 0, 0, ANCHO, ALTO);
		TextureRegion[][] temp = dudeRegion.split(ANCHO / 9, ALTO);
		dudeFrames = new TextureRegion[temp.length * temp[0].length];
		int indice = 0;
            for (TextureRegion[] temp1 : temp) {
                for (int j = 0; j < temp1.length; j++) {
                    dudeFrames[indice++] = temp1[j];
                }
            }
		dudeAnimation = new Animation(0.1f, dudeFrames);
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
		
		duracion += delta;
		TextureRegion frame = (TextureRegion) dudeAnimation.getKeyFrame(duracion, true);
		game.batch.begin();
			game.batch.draw(frame, 100, 100);
		game.batch.end();
	}*/

   
}
