public class DistanceFilter implements Filter {
    private Location givenLoc;
    private float maxDist;
    private String name;

    public DistanceFilter(Location loc, float max) {
        givenLoc = loc;
        maxDist = max;
        name = "DistanceFilter";
    }

    public boolean satisfies(QuakeEntry qe) {
        Locaiton quakeLoc = qe.getLocation();
        float dist = givenLoc.distanceTo(quakeLoc);
        if(dist < maxDist) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}