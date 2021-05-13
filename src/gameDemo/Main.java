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
<<<<<<< HEAD
		Game game = new Game(1, "Pc Call Of Duty Wwýý", 250);
		GameService gameService = new GameManager();
		gameService.save(game);
=======
		Game game = new Game(1, "Pc Call Of Duty WwÃ½Ã½", 250);
		GameManager gameManager = new GameManager();
		gameManager.save(game);
>>>>>>> 02dfafe52cbeb5a6c284467c33f306a0bdd6de69
		game.setGamePrice(260);
		gameService.update(game);
		gameService.delete(game);

		System.out.println("\n***********************\n");

<<<<<<< HEAD
		Gamer gamer = new Gamer(1, "Saadet", "Bozkan", 1996, "39934448442");
		GamerService gamerService = new GamerManager(new MernisServiceAdapter());
		gamerService.save(gamer);
=======
		Gamer gamer = new Gamer(1, "Saadet", "Bozkan", 1990, "11111111111");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer);
>>>>>>> 02dfafe52cbeb5a6c284467c33f306a0bdd6de69
		gamer.setId(2);
		;
		gamerService.update(gamer);
		gamerService.delete(gamer);

		System.out.println("\n***********************\n");

<<<<<<< HEAD
		Campaing campaing = new Campaing(1, "Bahar Kampanyasý", 10);
		CampaingService campaingService = new CampaingManager();
		campaingService.save(campaing);
=======
		Campaing campaing = new Campaing(1, "Bahar KampanyasÃ½", 10);
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.save(campaing);
>>>>>>> 02dfafe52cbeb5a6c284467c33f306a0bdd6de69
		campaing.setDiscount(20);
		campaingService.update(campaing);
		
		SaleService saleService = new SaleManager();
		saleService.buy(gamer, game);
		saleService.buyWithCampaingCampain(gamer, game, campaing);

	}

}
