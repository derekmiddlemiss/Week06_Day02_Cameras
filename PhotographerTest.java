import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class PhotographerTest{

  Photographer jill;
  DigitalCamera nikon;
  AnalogCamera hasselblad;

  @Before
  public void before(){
    jill = new Photographer();
    nikon = new DigitalCamera( "SLR Nikon with paparazzi lens" );
    hasselblad = new AnalogCamera( "Antique bellows Hasselblad" );
  }

  @Test
  public void jillHasNoCameras(){
    assertEquals( 0, jill.countCameras() );
  }

  @Test
  public void addCameraToJill(){
    jill.addCamera( nikon );
    assertEquals( 1, jill.countCameras() );
  }

  @Test
  public void removeCameraFromJill(){
    jill.addCamera( nikon );
    jill.addCamera( hasselblad );    
    jill.removeCamera( 0 );
    assertEquals( 1, jill.countCameras() );
  }



}
