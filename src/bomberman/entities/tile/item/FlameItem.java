package bomberman.entities.tile.item;

import bomberman.Game;
import bomberman.entities.Entity;
import bomberman.entities.character.Bomber;
import bomberman.graphics.Sprite;

public class FlameItem extends Item {

	public FlameItem(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item
		System.out.println("k");
		if( e instanceof Bomber) {
			if( !isRemoved) {
				this.remove();
				isRemoved = true;
				Game.addBombRadius(1);
			}
			return true;
		}
		return false;
	}

}