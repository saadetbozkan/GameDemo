package gameDemo;

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
		GameManager gameManager = new GameManager();
		gameManager.save(game);
		game.setGamePrice(260);
		gameManager.update(game);
		gameManager.delete(game);

		System.out.println("\n***********************\n");

		Gamer gamer = new Gamer(1, "Saadet", "Bozkan", 1990, "11111111111");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer);
		gamer.setId(2);
		;
		gamerManager.update(gamer);
		gamerManager.delete(gamer);

		System.out.println("\n***********************\n");

		Campaing campaing = new Campaing(1, "Bahar Kampanyasý", 10);
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.save(campaing);
		campaing.setDiscount(20);
		campaingManager.update(campaing);
		SaleManager saleManager = new SaleManager();
		saleManager.buy(gamer, game);
		saleManager.buyWithCampaingCampain(gamer, game, campaing);

	}

}
