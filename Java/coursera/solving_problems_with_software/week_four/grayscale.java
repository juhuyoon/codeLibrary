//converting many images to grayscale
//Save the converted, new images as files
//Add "grey-" prefix to original file name

//1) Ask user to pick files & iterate over them
//2) Convert one image to grayscale
//3) Combine and convert many of them
//4) Save the results


//Psuedocoding:
    //1) Start with an image (colorImage)
    //2) Make a blank image of the same size (whiteImage)
    //3) For each pixel in the whiteImage
        //3a) Look at the corresponding pixel in whiteImage (inPixel)
        //3b) Compute the inPixel's R + G + B
        //3c) Divide the sum by 3 (call it average)
        //3d) Set the pixel's red to average
        //3e) Set the pixel's green to average
        //3f) Set the pixel's blue to average
    //4) outImage will be the answer, and repeat for all images

    //going through the code
import edu.duke.*;
import java.io.*;

public class GrayScaleConverter {
	// I started with the image I wanted (inImage)
	public ImageResource makeGray(ImageResource inImage) {
		// I made a blank image of the same size
		ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
		// for each pixel in outImage
		for (Pixel pixel : outImage.pixels()) {
			// look at the corresponding pixel in inImage
			Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
			// compute inPixel's red + inPixel's blue + inPixel's green
			// divide that sum by 3 (call it average)
			int average = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen()) / 3;
			// set pixel's red to average
			pixel.setRed(average);
			// set pixel's green to average
			pixel.setGreen(average);
			// set pixel's blue to average
			pixel.setBlue(average);
		}
		// outImage is your answer
		return outImage;
	}

	public void selectAndConvert() {
		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource inImage = new ImageResource(f);
			ImageResource gray = makeGray(inImage);
			gray.draw();
		}
	}

	
	public void testGray() {
		ImageResource ir = new ImageResource();
		ImageResource gray = makeGray(ir);
		gray.draw();
	}

	public class ImageSaver {
		public void doSave() {
			DirectoryResource dr = new DirectoryResource();
			for (File f : dr.selectedFiles()) {
				ImageResource image = new ImageResource(f);
				String fname = image.getFileName();
				String newName = "copy-" + fname;
				image.setFileName(newName);
				image.draw();
				image.save();
			}
		}
	}

}

// //First think about how to create a new image that is the inverse of another image.
// Start by solving an example by hand, write down the steps, find patterns and then test the algorithm
// Then create a new BlueJ class called BatchInversions. In this class create a method named makeInversion that has one parameter, an image, and returns a new image that is the inverse of the original image.
// Then add another method called selectAndConvert to handle the batch processing of files. This method allows the user to select several files and display the images. Test this method to make sure it works.
// Then modify the selectAndConvert method to save each inverted image as a file with a new filename. Use the old filename and append to the front of it “inverted-”