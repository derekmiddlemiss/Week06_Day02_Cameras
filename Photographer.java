import java.util.*;

public class Photographer{

  private ArrayList<Printable> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
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
    String concatDetails = ""
    for ( Printable camera : this.cameras ) {
      concatDetails = concatDetails + " , " + camera.printDetails();
    }
    return concatDetails;
  }

}