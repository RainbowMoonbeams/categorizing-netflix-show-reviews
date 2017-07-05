package com.netflixshowsreview;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

	@Resource
	public CategoryRepository catRepo;

	@Resource
	public NetflixShowRepository showRepo;

	@Override
	public void run(String... args) throws Exception {

		//initializing category names
		Category comedy = new Category("Comedy");
		Category drama = new Category("Drama");
		Category dramedy = new Category("Dramedy");
		Category psycThrill = new Category("Psychological Thriller");
		Category scifi = new Category("Science Fiction");

		//saving category names to categoryRepository
		catRepo.save(comedy);
		catRepo.save(drama);
		catRepo.save(dramedy);
		catRepo.save(psycThrill);
		catRepo.save(scifi);
		
		// constructor reference
//		NetflixShow something = new NetflixShow("Show Name", "imageUrl", "creator", 0000, dramedy, "Stars", "description", "review");
	
		
		//comedy:
		NetflixShow unbreakKimmy = new NetflixShow("Unbreakable Kimmy Schmidt", "/images/unbreakable-kimmy-schmidt.jpg", "Tina Fey, Robert Carlock", 2015, comedy,
				"Ellie Kemper, Jane Krakowski & Titus Burgess... among others", "Description: Lorem ipsum dolor sit amet, consectetur adipisicing elit, "
						+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " 
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo " 
						+ "consequat.", "Review: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
						+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
						+ "ut aliquip ex ea commodoconsequat.");
//		NetflixShow wilfred = new NetflixShow("Wilfred", "/images/wilfred.jpg", "creator", 2011, comedy, "Elija Woood... among others", "Wilfred is a Netflix Original Comedy "
//				+ "show about a deeply depressed man who befriends his neighbors dog, "
//				+ "who appears to the man as a man dressed in a got costume who speaks in an australian accent and loves to smoke weed."
//				+ "The dog gets him into all sorts of trouble as he tries to be his moral compas but actually gives terrible advice."
//				+ "The two get in and out of all sorts of mischeif together.", "hilarious Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
//						+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
//						+ "ut aliquip ex ea commodoconsequat.");
//		NetflixShow hatersBackOff = new NetflixShow("Haters Back Off", "/images/haters-back-off.jpg", "creator", 0000, comedy, "Coleen... among others", "description", "review");
		
		//drama:
		NetflixShow houseOfCards = new NetflixShow("House of Cards", "/images/houseofcards.jpg", "Beau Willimon", 2013, drama, "Kevin Spacey, Robin Wright... among others",
				"A ruthless politician will stop at nothing to conqure Wshington, D.C., in this Emmy and Golden-Globe-winning political drama.",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
				+ "ut aliquip ex ea commodoconsequat.");
		
		//dramedy:
		NetflixShow glow = new NetflixShow("Glow", "/images/glow.jpg", "Liz Flahive, Carly Mensch", 2017, comedy,
				"Alison Brie, Berry Gilpin & Marc Maron... among others", "Description: Lorem ipsum dolor sit amet, "
						+ "consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim "
						+ "veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo " 
						+ "consequat. ", "Review: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod "
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " 
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo "
						+ "consequat. lorem ipsum asdflj aadslfjaewoij  vajdi;foijawe jfia;weoijf ");
//		NetflixShow flaked = new NetflixShow("Flaked", "/images/flaked.jpg", "Will Arnett, Mark Chappell", 2016, dramedy,
//				"Will Arnett, David Sullivan, & Ruth Kearney... among others", "description", "lorem ipsum asdflj aadslfjaewoij  vajdi;foijawe jfia;weoijf ");
//		NetflixShow love = new NetflixShow("Love", "/images/love.jpg", "creator", 2016, dramedy, "Gillian Peters, Paul Rust... among others", "A boy and girl meet in a convenience store. They hit it off and their relationship turns into a \"thing\"" 
//				+ ". They both have issues, but what relationship doesnt? And if this show doesn't make you want to move to LA, you're watching it wrong.", 
//				"sweet & sour Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
//				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
//				+ "ut aliquip ex ea commodoconsequat.");
//		NetflixShow girlboss = new NetflixShow("Girlboss", "/images/girlboss.jpg", "creator", 2017, dramedy, "Stars!", "Girlboss is a Netflix Original, loosely based on a true story about"
//				+ "strong-willed Sophia who always wants to do things her own way. Her principals won't allow her to bow down "
//				+ "to \"the man\", even if that means alsmot being evicted from her apartment. She strikes it rich, when she "
//				+ "finds she's really good at selling vintage clothes on eBay. Leading to launching "
//				+ "her own e-comerce site, and eventually opening a brick & mortar store in the namesake, Nasty Gal.",
//		"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
//				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
//				+ "ut aliquip ex ea commodoconsequat.");
//		NetflixShow santaClarita = new NetflixShow("Santa Clarita Diet", "/images/santa-clarita-diet.jpg", "creator", 0000, dramedy, "Stars", "description", "review");
//		NetflixShow unfortEvents = new NetflixShow("A Series of Unfortunate Events", "/images/unfort-events.jpg", "creator", 0000, dramedy, "Stars", "description", "review");
		
		//psycthrill
		NetflixShow theOA = new NetflixShow("The OA", "/images/the-oa.jpg", "creator", 2016, psycThrill, "Starring...", "A woman returns home after she went missing for 7 years. "
				+ "She gathers a group of misfits to tell her story to."
				+ " She draws you into her world, retelling of her childhood and of the time she's been gone.", "Addicting! Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
				+ "ut aliquip ex ea commodoconsequat. ");
//		NetflixShow paranoid = new NetflixShow("Paranoid", "/images/paranoid.jpg", "creator", 0000, psycThrill, "Stars", "description", "review");
//		NetflixShow theFall = new NetflixShow("The Fall", "/images/the-fall.jpg", "creator", 0000, drama, "Stars", "description", "review");
		
		//scifi
		NetflixShow strangerThings = new NetflixShow("Stranger Things", "/images/stranger-things.jpg", "creator", 2016 , scifi, "Wynona Ryder... among others", "Follow a group of pree-teen boys in this "
				+ "murder-mystery-adventure set in the 1980's. Wynona Ryder stars as the mother of the missing boy. Strange things happen"
				+ " in a small town, where a deep mystery is finally uncovered and "
				+ "leaves you with an eerie feeling...", "wicked addicting Lorem ipsum dolor sit amet, consectetur adipisicing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud "
				+ "exercitation ullamco laboris nisi ut aliquip ex ea commodoconsequat. ");
//		NetflixShow blackMirror = new NetflixShow("Black Mirror", "/images/black-mirror.jpg", "creator", 0000, scifi, "Stars", "description", "review");

		//saving shows and information to showRepository
//		showRepo.save(unfortEvents);
//		showRepo.save(theFall);
//		showRepo.save(paranoid);
//		showRepo.save(santaClarita);
//		showRepo.save(hatersBackOff);
//		showRepo.save(blackMirror);
//		showRepo.save(girlboss);
//		showRepo.save(wilfred);
//		showRepo.save(love);
//		showRepo.save(flaked);
		showRepo.save(theOA);
		showRepo.save(strangerThings);
		showRepo.save(houseOfCards);
		showRepo.save(unbreakKimmy);
		showRepo.save(glow);
	}
}
