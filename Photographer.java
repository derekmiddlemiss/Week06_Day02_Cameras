import java.util.*;

public class Photographer{

  private ArrayList<String> cameras;

  public Photographer(){
    this.cameras = new ArrayList<String>();
  } 

  public int countCameras(){
    return this.cameras.size();
  }


}