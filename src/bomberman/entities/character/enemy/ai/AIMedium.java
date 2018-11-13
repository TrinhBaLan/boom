package bomberman.entities.character.enemy.ai;

import java.util.Random;

import bomberman.entities.character.Bomber;
import bomberman.entities.character.enemy.Enemy;

public class AIMedium extends AI {
	Bomber _bomber;
	Enemy _e;
	
	public AIMedium(Bomber bomber, Enemy e) {
		_bomber = bomber;
		_e = e;
	}

	@Override
	public int calculateDirection() {
		// TODO: cài đặt thuật toán tìm đường đi
		
		double x_bomber = _bomber.getX();
		double y_bomber = _bomber.getY();
		double x_enemy  = _e.getX();
		double y_enemy  = _e.getY();
				
		double distance = Math.sqrt(Math.pow((x_bomber - x_enemy),2) + Math.pow((y_bomber - y_enemy),2));
		if( distance >= 10 * 16 * Math.sqrt(2)){ // đường chéo ô vuông 10 x 10, 1 ô rộng 16 pixels
			// giống aiLow
			return new AILow().calculateDirection();
		}
		else {
			int vertical = random.nextInt(2);
			if( vertical == 1) { // chiều ngang
				if( x_bomber < x_enemy) return 3;
				else return 1;
			}
			else {// theo chiều dọc
				if( y_bomber < y_enemy) return 0;
				else return 2;
			}
		}
	}
}