package gameDemo;

import gameDemo.abstracts.CampaingService;
import gameDemo.abstracts.GameService;
import gameDemo.abstracts.GamerService;
import gameDemo.abstracts.SaleService;
import gameDemo.adaptors.MernisServiceAdapter;
import gameDemo.concretes.CampaingManager;
import gameDemo.concretes.GameManager;
import gameDemo.concretes.GamerManager;
import gameDemo.concretes.SaleManager;
import gameDemo.entities.Campaing;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game = new Game(1, "Pc Call Of Duty Wwýý", 250);
		GameService gameService = new GameManager();
		gameService.save(game);
		game.setGamePrice(260);
		gameService.update(game);
		gameService.delete(game);

		System.out.println("\n***********************\n");

		Gamer gamer = new Gamer(1, "Saadet", "Bozkan", 1996, "39934448442");
		GamerService gamerService = new GamerManager(new MernisServiceAdapter());
		gamerService.save(gamer);
		gamer.setId(2);
		;
		gamerService.update(gamer);
		gamerService.delete(gamer);

		System.out.println("\n***********************\n");

		Campaing campaing = new Campaing(1, "Bahar Kampanyasý", 10);
		CampaingService campaingService = new CampaingManager();
		campaingService.save(campaing);
		campaing.setDiscount(20);
		campaingService.update(campaing);
		
		SaleService saleService = new SaleManager();
		saleService.buy(gamer, game);
		saleService.buyWithCampaingCampain(gamer, game, campaing);

	}

}
