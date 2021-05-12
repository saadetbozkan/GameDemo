package gameDemo.concretes;

import gameDemo.abstracts.GameSevice;
import gameDemo.entities.Game;

public class GameManager implements GameSevice {
	@Override
	public void save(Game game) {

		System.out.println("Oyun kaydedildi : " + game.toString());

	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.toString());

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi.");

	}
}
