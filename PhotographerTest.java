import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class PhotographerTest{

  Photographer jill;

  @Before
  public void before(){
    jill = new Photographer();
  }

  @Test
  public void jillHasNoCameras(){
    assertEquals( 0, jill.countCameras() );
  }



}
