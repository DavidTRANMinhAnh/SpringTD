package fr.iut.apishop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.iut.apishop.model.Produit;
import fr.iut.apishop.repository.Produitrepository;

@SpringBootApplication
public class ApishopApplication implements CommandLineRunner {

	@Autowired
	private Produitrepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ApishopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.repo.save(new Produit(null, "Pomme verte", 1.25, 10));
		this.repo.save(new Produit(null, "Pomme rouge", 1.75, 20));
		this.repo.save(new Produit(null, "Pomme jaune", 1.55, 30));

		this.repo.findAll().forEach(System.out::println);
	}

}
