package lab1_iterator;

public class Tourist implements Collection{
	   public String places[] = {
			   "Khreshchatyk",
			   "Carpathian Mountains",
			   "Askania-Nova",
			   "Odesa Opera and Ballet Theatre",
			   "Kharkiv Zoo", 
			   };
	 
	   public Iterator getIterator() {
	      return new PlaceIterator();
	   }
	 
	   private class PlaceIterator implements Iterator {
	      int index;
	 
	      public boolean hasNext() {      
	         if(index < places.length){
	            return true;
	         }
	         return false;
	      }
	 
	      public Object next() {      
	         if(this.hasNext()){
	            return places[index++];
	         }
	         return null;
	      }		
	   }
	}