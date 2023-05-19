package lab9_facade;

public class Application {
	   public static void main(String[] args) {
	      APIYouTube api = new APIYouTube();

	      api.decodeH264();
	      api.decodeMPEG();
	      api.decodeXviD();		
	   }
	}