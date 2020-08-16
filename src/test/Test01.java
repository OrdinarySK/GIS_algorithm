package test;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/8/16 11:41
 * @UPpdateUser luokai
 * @UpdateDate 2020/8/16 11:41
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
import entity.Point;
import algo.PointOnLine;
public class Test01 {
    public static void main(String args[]){
        Point p1 = new Point(110,30);
        Point p2 = new Point(115, 40);
        Point q = new Point(112, 34);

        PointOnLine pointOnLine = new PointOnLine();
        boolean flag = pointOnLine.PointOnLine(p1, p2, q);
        if(flag){
            System.out.println("该点在线上");
        }else{
            System.out.println("该点不在线上");
        }
    }
}
