package test;

import algo.PolylineDirection;
import entity.Point;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/8/16 18:11
 * @UPpdateUser luokai
 * @UpdateDate 2020/8/16 18:11
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Test02 {
    public static void main(String args[]){
        Point p0 = new Point(10,20);
        Point p1 = new Point(12,20);
        Point p2 = new Point(15,30);

        PolylineDirection polylineDirection = new PolylineDirection();
        String text = polylineDirection.PolylineDirection(p0, p1, p2);
        System.out.println(text);
    }

}
