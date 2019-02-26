package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        return getBucketCount(height*width,areaPerBucket) - extraBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width,height,areaPerBucket,0);
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
