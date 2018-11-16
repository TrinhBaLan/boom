package bomberman.entities.tile.item;

import bomb_audio.item_get;
import bomberman.Game;
import bomberman.entities.Entity;
import bomberman.entities.character.Bomber;
import bomberman.graphics.Sprite;

public class FlameItem extends Item {
	item_get ig = new item_get();
	
	public FlameItem(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item
		if( e instanceof Bomber) {
			if( !isRemoved) {
				this.remove();
				isRemoved = true;
				Game.addBombRadius(1);
				ig.play(false);
			}
			return true;
		}
		return false;
	}

}