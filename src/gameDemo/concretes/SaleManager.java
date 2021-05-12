package gameDemo.concretes;

import gameDemo.abstracts.SaleService;
import gameDemo.entities.Campaing;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println(gamer.getName() + " " + game.getGameName() + " oyununu aldý.Fiyat : " + game.getGamePrice());
	}

	@Override
	public void buyWithCampaingCampain(Gamer gamer, Game game, Campaing campaing) {
		double discount = game.getGamePrice() - campaing.getDiscount() * game.getGamePrice() / 100;
		System.out.println(gamer.getName() + " " + game.getGameName() + " oyununu aldý.Fiyat : " + game.getGamePrice()
				+ " Uygulanan kampanya : " + campaing.getName() + " Fiyat : " + discount);
	}

}
