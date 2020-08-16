package algo;

/**
 * @ClassName PolylineDirection
 * @Description 判断折线的方向
 * @Author luokai
 * @CreateDate 2020/8/16 17:37
 * @UPpdateUser luokai
 * @UpdateDate 2020/8/16 17:37
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/

import entity.Point;

/**
 * 折线段的拐向判断方法可以直接由矢量叉积的性质推出。对于有公共端点的线段p0p1和p1p2，通过计算(p2 - p0)× (p1 - p0)的符号便可以确定折线段的拐向：
 * 若(p2 - p0)× (p1 - p0) > 0,则p0p1在p1点拐向右侧后得到p1p2。
 * 若(p2 - p0)× (p1 - p0) < 0,则p0p1在p1点拐向左侧后得到p1p2。
 * 若(p2 - p0)× (p1 - p0) = 0,则p0、p1、p2三点共线
 * 左侧 右侧是指 相对于po---p1方向
 */
public class PolylineDirection {
    private final String right = "右拐";
    private final String left = "左拐";
    private final String line = "共线";

    public String PolylineDirection(Point p0, Point p1, Point p2){

        String location = null;
        if((p2.getLon() - p0.getLon()) * (p1.getLat() - p0.getLat()) - (p2.getLat() - p0.getLat()) * (p1.getLon() - p0.getLon()) > 0){
            location = right;
        }else if((p2.getLon() - p0.getLon()) * (p1.getLat() - p0.getLat()) - (p2.getLat() - p0.getLat()) * (p1.getLon() - p0.getLon()) < 0){
            location = left;
        }else if((p2.getLon() - p0.getLon()) * (p1.getLat() - p0.getLat()) - (p2.getLat() - p0.getLat()) * (p1.getLon() - p0.getLon()) == 0){
            location = line;
        }
        return location;
    }

}
