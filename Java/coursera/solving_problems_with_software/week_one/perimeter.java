
public class PerimeterRunner {
    public double getPerimeter(Shape s) {
// With solving how to run perimeters: 
// 0. Start with TotalPerim = 0;
        public double TotalPerim = 0; 
// 1. Start with prevPt = the last point
        Point prevPt = s.getLastPoint();
// 2. For each point currPt in the shape,
        for(Point currPt: s.getPoints()) {
//     3. Find distance from prevPt pt to currPt, name it currDist
        double currDist = prevPt.distance(currPt);
//     4. Update totalPerim to be totalPerim + currDist
            totalPerim = TotalPerim + currDist;
//     5. Update prevPt to be currPt. 
            prevPt = currPt;
// 6. totalPerim is my answer
        }
        return totalPerim;
    }
}

public void testPerimeter() {
    FileResource fr = new FileResource();
    Shape s = new Shape(fr);
    double length = getPerimeter(s);
    System.out.println("perimeter = " + length);
}

public static void main (String[] args) {
    PerimeterRunner pr = new PerimeterRunner();
    pr.testPerimeter();
}