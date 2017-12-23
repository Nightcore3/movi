/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

/**
 *
 * @author Oscar
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;

import com.badlogic.gdx.graphics.g2d.*;

public class AnimationMolino extends Pantalla {
    
    private Texture molino;
    private TextureRegion molinoRegion;
    private TextureRegion[] molinoFrames;
    private Animation molinoAnimation;
    private float duracion=0;
    
    private static final int ALTO=355;
    private static final int ANCHO=3600;
    private static final int NUM_FOTO_X=6; //nimero de fotogramas por imagen
    private static final int NUM_FOTO_Y=1;
    
    
    public AnimationMolino(MyGdxGame game) {
        super(game);
    }

    @Override
    public void show() {
        molino =new Texture("molino.jpg");
        molinoRegion= new TextureRegion(molino,ANCHO,ALTO);
        TextureRegion[][] temp= molinoRegion.split(ANCHO/NUM_FOTO_X,ALTO/NUM_FOTO_Y);
        molinoFrames = new TextureRegion [12];
        
        
         for(int i=0 ;i<6;i++){
            molinoFrames[i]=temp[0][i];
        }
         int con =6;
         for(int i=5;i>=0;i--){
            molinoFrames[con++]=temp[0][i];
        }
         
         molinoAnimation= new Animation(0.15f,molinoFrames);
        
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 0.5f);
        
        duracion+=delta;
        
        TextureRegion frame  = (TextureRegion) molinoAnimation.getKeyFrame(duracion, true);
        
        game.batch.begin();
        game.batch.draw(frame, 100, 100);
        game.batch.end();
    }


    
    
}
