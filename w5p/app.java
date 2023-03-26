package w5p;

public class app {

	public static void main(String[] args) {
		// Utilizing interfaces
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Words");
		logger.Error("Words Words Words Words");
		
		Logger loggest = new SpacedLogger();
		loggest.Log("Wooooooooooooooooooooooooords");
		loggest.Error("Words");
	}

}
