//1. Complete writing the method getNumPoints that has one parameter s that is of type Shape. This method returns an integer that is the number of points in Shape s. Hint: You will need to iterate over all the points in the Shape S and count them.

// 2. Add code in the method testPerimeter to call getNumPoints and to print the result.

// 3. Complete writing the method getAverageLength that has one parameter s that is of type Shape.This method returns a number of type double that is the calculated average of all the sides’lengths in the Shape S.

// 4. Add code in the method testPerimeter to call the method getAverageLength and to print out the result.Note if you were to select the file example1.txt,then the average side length should be 4.0.

// 5. Complete writing the method getLargestSide that has one parameter s that is of type Shape.This method returns a number of type double that is the longest side in the Shape S.

// 6. Add code in the method testPerimeter to call the method getLargestSide and to print out the result.Note if you were to select the file example1.txt,then the longest side should be 5.0.

// 7. Complete writing the method getLargestX that has one parameter s that is of type Shape.This method returns a number of type double that is the largest x value over all the points in the Shape s.

// 8. Add code in the method testPerimeter to call the method getLargestX and to print out the result.Note if you were to select the file example1.txt,then the longest side should be 4.0.


//In this assignment you will find the largest perimeter over several shapes by examining several files representing shapes, calculating the size of the largest perimeter and also the name of the file with the largest perimeter. You will add new methods to the PerimeterAssignmentRunner class.

import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
        public double getPerimeter(Shape s) {
                // Start with totalPerim = 0
                double totalPerim = 0.0;
                // Start wth prevPt = the last point
                Point prevPt = s.getLastPoint();
                // For each point currPt in the shape,
                for (Point currPt : s.getPoints()) {
                        // Find distance from prevPt point to currPt
                        double currDist = prevPt.distance(currPt);
                        // Update totalPerim by currDist
                        totalPerim = totalPerim + currDist;
                        // Update prevPt to be currPt
                        prevPt = currPt;
                }
                // totalPerim is the answer
                return totalPerim;
        }

        public int getNumPoints(Shape s) {
                // This method returns an integer that is the number of points in Shape s. Hint:
                // You will need to iterate over all the points in the Shape S and count them.
                int numPoints = 0;
                for (Point p : s.getPoints()) {
                        numPoints += 1;
                }
                return numPoints;
        }

        public double getAverageLength(Shape s) {
                // This method returns a number of type double that is the calculated average of
                // all the sides’ lengths in the Shape S.
                double length = getPerimeter(s);
                double numSides = (double) getNumPoints(s);
                double avgLength = length / numSides;
                return avgLength;
        }

        public double getLargestSide(Shape s) {
                // This method returns a number of type double that is the longest side in the
                // Shape S.
                Point lastPoint = s.getLastPoint();
                double largestSide = 0.0;
                for (Point p : s.getPoints()) {
                        double dist = lastPoint.distance(p);
                        if (dist > largestSide) {
                                largestSide = dist;
                        }
                        lastPoint = p;
                }
                return largestSide;
        }

        public double getLargestX(Shape s) {
                // This method returns a number of type double that is the largest x value
                // (x-coordinate) over all the points in the Shape s.
                Point lastPoint = s.getLastPoint();
                int lastPointX = lastPoint.getX();
                double largestX = (double) lastPointX;
                for (Point p : s.getPoints()) {
                        int newX = p.getX();
                        if (newX > largestX) {
                                largestX = (double) newX;
                        }
                }
                return largestX;
        }

        public double getLargestPerimeterMultipleFiles() {
                // This method creates a DirectoryResource (so you can select multiple files)
                // and then iterates over these files. For each File f, it converts the file
                // into a FileResource with the line
                DirectoryResource dr = new DirectoryResource();
                double largestPerim = 0.0;
                FileResource largestFile = null;

                for (File f : dr.selectedFiles()) {
                        FileResource fr = new FileResource(f);
                        Shape s = new Shape(fr);
                        double perim = getPerimeter(s);
                        if (perim > largestPerim) {
                                largestPerim = perim;
                        }
                }
                return largestPerim;
        }

        public String getFileWithLargestPerimeter() {
                // This method should, like the getLargestPerimeterMultipleFiles method, create
                // its own Directory Resource, except that this new method returns the File that
                // has the largest such perimeter,
                // so it has return type File.
                DirectoryResource dr = new DirectoryResource();
                double largestPerim = 0.0;
                File largestFile = null;

                for (File f : dr.selectedFiles()) {
                        FileResource fr = new FileResource(f);
                        Shape s = new Shape(fr);
                        double perim = getPerimeter(s);
                        if (perim > largestPerim) {
                                largestPerim = perim;
                                largestFile = f;
                        }
                }
                return largestFile.getName();
        }

        public void testPerimeter() {
                FileResource fr = new FileResource();
                Shape s = new Shape(fr);
                double length = getPerimeter(s);
                int numPoints = getNumPoints(s); // method to call getNumpoints to print result.
                double avgLength = getAverageLength(s); // call the method getAverageLength
                double largestSide = getLargestSide(s); // to call the method getLargestSide and to print out the
                                                        // result.
                double largestX = getLargestX(s); // call the method getLargestX and to print out the result.

                System.out.println("perimeter = " + length);
                System.out.println("num of points = " + numPoints);
                System.out.println("average = " + avgLength);
                System.out.println("largest side = " + largestSide);
                System.out.println("largest X = " + largestX);
        }

        public void testPerimeterMultipleFiles() {
                // call getLargestPerimeterMultipleFiles and to print out the largest such
                // perimeter.
                double largest = getLargestPerimeterMultipleFiles();
                System.out.println("Largest perimeter is : " + largest);
        }

        public void testFileWithLargestPerimeter() {
                // call getFileWithLargestPerimeter. For the File that is returned, print the
                // name of that file.
                String file = getFileWithLargestPerimeter();
                System.out.println("Largest perimeter file is : " + file);
        }

        // This method creates a triangle that you can use to test your other methods
        public void triangle() {
                Shape triangle = new Shape();
                triangle.addPoint(new Point(0, 0));
                triangle.addPoint(new Point(6, 0));
                triangle.addPoint(new Point(3, 6));
                for (Point p : triangle.getPoints()) {
                        System.out.println(p);
                }
                double peri = getPerimeter(triangle);
                System.out.println("perimeter = " + peri);
        }

        // This method prints names of all files in a chosen folder that you can use to
        // test your other methods
        public void printFileNames() {
                DirectoryResource dr = new DirectoryResource();
                for (File f : dr.selectedFiles()) {
                        System.out.println(f);
                }
        }

        public static void main(String[] args) {
                PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
                pr.testPerimeter();
        }
}
