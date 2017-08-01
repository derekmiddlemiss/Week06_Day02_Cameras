import java.util.*;

public class Photographer{

  private ArrayList<Printable> cameras;
  private HashMap<String,Integer> journal;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
    this.journal = new HashMap<String,Integer>();
  } 

  public int countCameras(){
    return this.cameras.size();
  }

  public void addCamera( Printable camera ){
    this.cameras.add( camera );
  }

  public void removeCamera( int position ){
    this.cameras.remove( position );
  }

  public String printCameraDetails(){
    String concatDetails = "";
    Integer count = 1;
    for ( Printable camera : this.cameras ) {
      concatDetails = concatDetails + Integer.toString(count) + ". " + camera.printDetails() + " ";
      count++;
    }
    // System.out.println(concatDetails);
    return concatDetails;
  }

  public void addToJournal( String day, Integer number ){
    this.journal.put( day, number);
  }

  public Integer getFromJournal( String day ){
    return this.journal.get( day );
  }

  public Integer numberOfPhotos(){
    Integer number = 0;
    for ( Integer value : this.journal.values() ){
      number = number + value;
    }
    return number;
  }

}