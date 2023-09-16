
public class PetRunner {

	public static void main(String[] args) {
		Pet george = new Pet("George","Cat",false,0,0);
		System.out.printf("New pet George\nName: %s\nAnimal Type: %s\nAlive?: %s\n",george.getName(),george.getAnimalType(),george.getAlive());
		george.setAlive(true);
		george.setHealth(100);
		System.out.printf("\nChanging Life status and health of George\nAlive?: %s\nHealth: %.1f%%\nHunger: %.1f%%\n",george.getAlive(),george.getHealth(),george.getHunger());
		System.out.printf("\n%s",george.toString());
		Pet billy = new Pet("Billy","Dog",true,100,0);
		System.out.printf("\n\nNew pet created\nName: %s\nAnimal Type: %s\nAlive?: %s\n",billy.getName(),billy.getAnimalType(),billy.getAlive());
		billy.setHunger(99.9);
		billy.setHealth(47.3);
		System.out.printf("\nChanging the health and hunger of Billy\nAlive?: %s\nHealth: %.1f%%\nHunger: %.1f%%\n",billy.getAlive(),billy.getHealth(),billy.getHunger());
		billy.feed(10);
		System.out.printf("\nFeeding Billy\nAlive?: %s\nHealth: %.1f%%\nHunger: %.1f%%\n",billy.getAlive(),billy.getHealth(),billy.getHunger());
		System.out.printf("\n%s",billy.toString());
	}

}
