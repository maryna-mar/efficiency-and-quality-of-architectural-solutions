package lab9_facade;

public class APIYouTube {
	   private Decoder h264;
	   private Decoder mpeg;
	   private Decoder xvid;

	   public APIYouTube() {
		  h264 = new H264();
	      mpeg = new MPEG();
	      xvid = new XviD();
	   }

	   public void decodeH264(){
	      h264.decode();
	   }
	   public void decodeMPEG(){
	      mpeg.decode();
	   }
	   public void decodeXviD(){
	      xvid.decode();
	   }
	}
