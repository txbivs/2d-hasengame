/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasventure.tiles;

import hasventure.gfx.Assets;

/**
 *
 * @author Tobias
 */
public class RockTile extends Tile {

	public RockTile(int id) {
		super(Assets.stone, id);
	}
	
	public boolean isSolid(){
		return true;
	}

}
