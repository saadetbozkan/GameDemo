package gameDemo.concretes;

import gameDemo.abstracts.GamerCheckService;
import gameDemo.abstracts.GamerService;
import gameDemo.entities.Gamer;

public class GamerManager implements GamerService {
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {

		if (this.gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu kaydedildi." + gamer.getName());
		}

	}

	@Override
	public void update(Gamer gamer) {
		if (this.gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu guncellendi." + gamer.getName());
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi.");

	}

}
