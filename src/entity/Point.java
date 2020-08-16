package entity;

/**
 * @ClassName Point
 * @Description 定义坐标点
 * @Author luokai
 * @CreateDate 2020/8/15 22:52
 * @UPpdateUser luokai
 * @UpdateDate 2020/8/15 22:52
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Point {
    public Point(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    //定义经纬度
    private double lon;
    private double lat;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

}
