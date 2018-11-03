import java.text.DecimalFormat;
import java.util.StringTokenizer;

//https://developer.android.com/reference/android/location/Location


public class Location {

    //POJOs 
    
    public static final int FORMAT_DEGREES = 0;
    public static final int FORMAT_MINUTES = 1;
    public static final int FORMAT_SECONDS = 2;
    public static final String EXTRA_COARSE_LOCATION = "coarseLocation";

    public static final String EXTRA_NO_GPS_LOCATION = "noGPSLocation";

    private String mProvider;
    private long mTime = 0;
    private long mElapsedRealtimeNanos = 0;
    private double mLatitude = 0.0;
    private double mLongitude = 0.0;
    private boolean mHasAltitude = false;
    private double mAltitude = 0.0f;
    private boolean mHasSpeed = false;
    private float mSpeed = 0.0f;
    private boolean mHasBearing = false;
    private float mBearing = 0.0f;
    private boolean mHasAccuracy = false;
    private float mAccuracy = 0.0f;
    private boolean mIsFromMockProvider = false;

    // Cache the inputs and outputs of computeDistanceAndBearing
    // so calls to distanceTo() and bearingTo() can share work
    private double mLat1 = 0.0;
    private double mLon1 = 0.0;
    private double mLat2 = 0.0;
    private double mLon2 = 0.0;
    private float mDistance = 0.0f;
    private float mInitialBearing = 0.0f;

    public Location(String provider) {
        mProvider = provider;
    }

    public Location(Location l) {
        set(1);
    }

    //
    public Location(double latitude, double longitude) {
        mLatitude = latitude;
        mLongitude = longitude; 
    }

    //to set the contents of the location. 
    public void set(Location l) {
        mProvider = l.mProvider;
        mTime = l.mTime;
        mElapsedRealtimeNanos = l.mElapsedRealtimeNanos;
        mLatitude = l.mLatitude;
        mLongitude = l.mLongitude;
        mHasAltitude = l.mHasAltitude;
        mAltitude = l.mAltitude;
        mHasSpeed = l.mHasSpeed;
        mSpeed = l.mSpeed;
        mHasBearing = l.mHasBearing;
        mBearing = l.mBearing;
        mHasAccuracy = l.mHasAccuracy;
        mAccuracy = l.mAccuracy;
        mIsFromMockProvider = l.mIsFromMockProvider;
    }

    //to reset the search
    public void reset() {

    }


}

