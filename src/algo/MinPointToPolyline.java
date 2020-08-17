package algo;

/**
 * @ClassName MinPointToPolyline
 * @Description 判断点到线段的最短距离
 * @Author luokai
 * @CreateDate 2020/8/16 21:57
 * @UPpdateUser luokai
 * @UpdateDate 2020/8/16 21:57
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/

import entity.Point;

/***
 * 原理分析
 * 点到线段的最短距离  分为三种情况  a.点q的投影点在p1和p2的中间 b.点q的投影点在p1和p2的延长线p2端 c.点q的投影点在p1和p2延长线的p1端
 *           ---- ----
 *          (p1q  p1p2)
 *   r =  ---------------------
 *           ---- ----
 *          |p1p2||p1p2|
 *
 *          ----
 *          p1p2    为p1p2的向量
 *
 *   c为垂足
 *    distance   = { |qc|,      0<r<1; }
 *                { |qp2|,     r>=1; }
 *                { |qp1|,     r<=0; }
 *
 */
public class MinPointToPolyline {

    public double MinPointToPolyline(Point p1, Point p2, Point q){
        //两线段的向量点乘
        double r = (p1.getLon() - q.getLon()) * (p1.getLat() - q.getLat()) + (p2.getLon() - p1.getLon()) * (p2.getLat() - p1.getLat());
        //d 为p1p2模的平方
        double d = (p2.getLon() - p1.getLon()) * (p2.getLon() - p1.getLon()) + (p2.getLat() - p1.getLat()) * (p2.getLat() - p1.getLat());
        double distance ;
        if(r <= 0){
            //qp1
            distance = Math.sqrt((p1.getLon() - q.getLon()) * (p1.getLon() - q.getLon()) + (p1.getLat() - q.getLat()) * (p1.getLat() -q.getLat()));
        }else if(r >= d){
            //qp2
            distance = Math.sqrt((p2.getLon() - q.getLon()) * (p2.getLon() - q.getLon()) + (p2.getLat() - q.getLat()) * (p2.getLat() -q.getLat()));
        }else{
            //利用点到直线的公式   cx和cy为垂足点的xy坐标
            double ra = r / d;
            double cx = p1.getLon() + (p2.getLon() - p1.getLon()) * ra;
            double cy = p1.getLat() + (p2.getLat() - p1.getLat()) * ra;
            distance = Math.sqrt((q.getLon() - cx) * (q.getLon() - cx) + (q.getLat() - cy) * (q.getLat() - cy));
        }

        return distance;
    }

}
