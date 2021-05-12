package gameDemo.abstracts;

import gameDemo.entities.Game;

public interface GameSevice {
	void save(Game game);

	void update(Game game);

	void delete(Game game);

}
