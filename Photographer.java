import java.util.*;

public class Photographer{

  private ArrayList<String> cameras;

  public Photographer(){
    this.cameras = new ArrayList<String>();
  } 

  public int countCameras(){
    return this.cameras.size();
  }

  public void addCamera( String camera ){
    this.cameras.add( camera );
  }

  public void removeCamera( int position ){
    this.cameras.remove( position );
  }

}