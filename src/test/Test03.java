package test;

import algo.MinPointToPolyline;
import entity.Point;

/**
 * @ClassName Test03
 * @Description 测试点到线段的最短距离
 * @Author luokai
 * @CreateDate 2020/8/16 22:35
 * @UPpdateUser luokai
 * @UpdateDate 2020/8/16 22:35
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Test03 {

    public static void main(String args[]){
        Point p1 = new Point(10,5);
        Point p2 = new Point(20,10);
        Point q = new Point(15,8);
        MinPointToPolyline minPointToPolyline = new MinPointToPolyline();
        double distance = minPointToPolyline.MinPointToPolyline(p1, p2, q);
        System.out.println(distance);
    }

}
