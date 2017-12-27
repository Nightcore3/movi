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


import com.badlogic.gdx.maps.tiled.*;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.*;


public class Arena_1 extends Pantalla {
    
    private TiledMap map;
    private OrthogonalTiledMapRenderer tmr;

   

    public Arena_1(MyGdxGame game) {
        super(game);
    }

    @Override
    public void show() {

        
    
        map= new TmxMapLoader().load("untitled.tmx");
        tmr= new OrthogonalTiledMapRenderer(map);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 0.5f);
        
        game.camera.update();
        game.batch.setProjectionMatrix(game.camera.combined);
        tmr.setView(game.camera);
        tmr.render();
        game.batch.begin();

        game.batch.end();
    }
        
        
       
        
       
        
    
    
}
