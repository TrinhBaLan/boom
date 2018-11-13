package bomberman.entities.tile.item;

import bomberman.entities.tile.Tile;
import bomberman.graphics.Sprite;

public abstract class Item extends Tile {
	protected boolean isRemoved = false;
	public Item(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}
}