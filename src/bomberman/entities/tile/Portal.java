package bomberman.entities.tile;

import bomberman.*;
import bomberman.entities.Entity;
import bomberman.entities.character.Bomber;
import bomberman.graphics.Sprite;

public class Portal extends Tile {
	protected Board _board;
	public Portal(int x, int y, Sprite sprite, Board _board) {
		super(x, y, sprite);
		this._board = _board;
	}
	
	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý khi Bomber đi vào
		if( e instanceof Bomber) {
			if( _board.detectNoEnemies() ) {
				_board.nextLevel();
				return true;
			}
			else return true;
		}
		return false;
	}

}