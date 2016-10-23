package lab;

import java.awt.Color;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  
  public static void testChromakey()
	{
		Picture mark = new Picture("blue-mark.jpg");
		Picture moon = new Picture("moon-surface.jpg");
		mark.explore();
		mark.chromakey(moon, Color.blue);
		mark.explore();
	}
	public static void testEncodeAndDecode()
	{
		Picture beach = new Picture("beach.jpg");
		Picture message = new Picture("msg.jpg");
		
		beach.explore();
		message.explore();
		beach.encode(message);
		beach.explore();
		beach.decode();
		beach.explore();
	}
	public static void testEdgeDetection2()
	{

		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection2(10);
		swan.explore();
	}


	public static void testMyCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		Picture a = new Picture("seagull.jpg");
		Picture b = new Picture("snowman.jpg");
		Picture c = new Picture("beach.jpg");
		canvas.explore();
		canvas.myCollage(a, b, c);
		canvas.explore();
	}
	
	public static void testCopy()
	{
		Picture pic = new Picture("seagull.jpg");
		pic.explore();
		pic.copy(pic, 0, 200, 300, 400);
		pic.explore();
	}
	
	public static void testMirrorArms()
	{

		Picture pic = new Picture("snowman.jpg");
		pic.explore();
		pic.mirrorArms();
		pic.explore();


	}

	public static void testMirrorGull()
	{

		Picture pic = new Picture("seagull.jpg");
		pic.explore();
		pic.mirrorGull();
		pic.explore();

	}
	public static void testMirrorDiagonal()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorDiagonal();
		beach.explore();
	}
	public static void testMirrorVerticalRightToLeft()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
	}
	
	public static void testMirrorHorizontal()
	{
		Picture pic = new Picture("redMotorcycle.jpg");
	    pic.explore();
	    pic.mirrorHorizontal();
	    pic.explore();
	}
	
	public static void testMirrorHorizontalBotToTop()
	{
		Picture pic = new Picture("redMotorcycle.jpg");
	    pic.explore();
	    pic.mirrorHorizontalBotToTop();
	    pic.explore();
	}
	
	public static void testFixUnderwater()
	{
		Picture fish = new Picture("water.jpg");
		fish.explore();
		fish.fixUnderwater();
		fish.explore();
	}
	public static void testGrayscale()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}
	public static void testNegate()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}
	
public static void testKeepOnlyBlue()
{
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
}

public static void testNoise()
{
	  Picture dog = new Picture("dog.jpg");
	  dog.explore();
	  dog.noise(4);
	  dog.explore();
}
	
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	testNoise();
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}