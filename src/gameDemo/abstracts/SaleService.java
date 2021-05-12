package gameDemo.abstracts;

import gameDemo.entities.Campaing;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public interface SaleService {
	void buy(Gamer gamer, Game game);

	void buyWithCampaingCampain(Gamer gamer, Game game, Campaing campaing);

}
