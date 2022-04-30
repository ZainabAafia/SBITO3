

public class AbstractTest {
	public static void main(String[] args) {
		//Instrument i = new Instrument();
	//	MusicalInstrument i = new MusicalInstrument();
//		StringBasedMusicalInstrument i = new StringBasedMusicalInstrument();
		Guitar g = new Guitar();
		g.utilize();
		g.play();
		g.tuneStrings();
		g.pluck();
		Violin v =new Violin();
		v.bow();
		v.play();
	}
}
abstract class Instrument {
	abstract void utilize();
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Guitar strings");
	}

	@Override
	void play() {
		System.out.println("Playing the guitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the guitar....");
	}
	
	
	void pluck() {
		System.out.println("Plucking the guitar....");
	}
}

class Violin extends StringBasedMusicalInstrument{

	
	void tuneStrings() {
		System.out.println("Tuning the strings..");
		
	}

	
	void play() {
		
		System.out.println("Playing the violin...");
	}

	
	void utilize() {
		
		System.out.println("Utilizing  the violin...");
	}
	void bow() {
		System.out.println(" Bowing the violin");
		
	}
}


	

	
