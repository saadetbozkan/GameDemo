package gameDemo.concretes;

import gameDemo.abstracts.CampaingService;
import gameDemo.entities.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void save(Campaing campaing) {
		System.out.println("Yeni kampanya eklendi : " + campaing.getName());
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(
				"Yeni kampanya guncellendi : " + campaing.getName() + " indirim oraný: " + campaing.getDiscount());

	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println("Yeni kampanya eklendi : ");

	}

}
