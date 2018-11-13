@update 13/11
Bomb.java --119 cho bomber đi qua bom
Enemy.java --128--132 thêm căn lại đường đi cho enemy
Item.java --7 thêm isRemoved
bombItem.java, FlameItem.java, SpeedItem.java ---15 sửa collide
Flame.java --83 gỡ comment
Ai ---- thêm tìm đường cho quái


@update 12/11
Enemy.java --101 thêm chạm flame thì chết
Bomber.java -- 178 chạm quái đã chết


@ update 11/11
BombItem.java    --18 sửa ăn item xong thì item mất
FlameItem.java	--18 sửa ăn item xong thì item mất
SpeedItem.java 	--18 sửa ăn item xong thì item mất
DestroyableTile.java  --43 sửa dính bomb thì mất

fileLevelLoader.java  --180 thêm _board sửa nullpointer exceeption

Portal.java -- 10 sửa constructor để thêm _board

Game.java --32 thêm LIVES = 3;
Game.java --148 cập nhật lives khi chết

Board.java -- 39 thêm lives;
Board.java -- 92 thêm 1 lives khi next level
Board.java -- 359 thêm get set lives;
Board.java -365 thêm getLevels

InfoPanel.java -- 28 thêm hiển thị lives người chơi
InfoPanel.java -- 48 thêm hiển thị lives người chơi

Bomber.java --118 thêm trừ lives khi chết
Bomber.java --125 thêm restart level khi chết

Frame.java --48 thêm setLives để cập nhật lives khi chết

