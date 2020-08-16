package algo;

/**
 * @ClassName PointOnLine
 * @Description 判断点是否在线上
 * @Author luokai
 * @CreateDate 2020/8/15 22:51
 * @UPpdateUser luokai
 * @UpdateDate 2020/8/15 22:51
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/

/**
 * 算法原理介绍
 * 判断一个点是否在一条线上，其原理是利用叉积乘。a×b=|x1, y1|=x1y2-x2y1
 *                                                |x2, y2|
 * 例如点Q是否在线段p1和P2上  (Q-p1)✖(p2-p1) = 0
 * 除此之外，还要保证该点在点p1  p2所连成的对角矩阵的内部  因为第一个条件满足的情况下  可能是p1p2的延长线上
 *
 *
 */

import entity.Point;

public class PointOnLine {

    public boolean PointOnLine(Point p1, Point p2, Point q ){
        boolean flag = false;     // true   点在线上    false   点不在线上

        if(((q.getLon()-p1.getLon()) * (p2.getLat()-p1.getLat()) - (q.getLat()-p1.getLat()) * (p2.getLon()-p1.getLon())) == 0){
            //System.out.println("点在线上这条直线上");
            if(p1.getLon() >= p2.getLon() && p1.getLat() >= p2.getLat()){
                //点p1在点p2右上方    p1x > p2x p1y> p2y
                if(q.getLon() <= p1.getLon() && q.getLon() >= p2.getLon() && q.getLat() <= p1.getLat() && q.getLat() >= p2.getLat()){
                    flag = true;
                }
            }else if(p1.getLon() >= p2.getLon() && p1.getLat() <= p2.getLat()){
                //点p1在点p2的右下方   p1x > p2x p1y < p2y
                if(q.getLon() <= p1.getLon() && q.getLon() >= p2.getLon() && q.getLat() >= p1.getLat() && q.getLat() <= p2.getLat()){
                    flag = true;
                }
            }else if(p1.getLon() <= p2.getLon() && p1.getLat() >= p2.getLat()){
                //点p1在p2左上方   p1x < p2x p1y > p2y
                if(q.getLon() >= p1.getLon() && q.getLon() <= p2.getLon() && q.getLat() <= p1.getLat() && q.getLat() >= p2.getLat()){
                    flag = true;
                }
            }else if(p1.getLon() <= p2.getLon() && p1.getLat() <= p2.getLat()){
                //点p1在p2左下方 p1x < p2x p1y < p2y
                if(q.getLon() >= p1.getLon() && q.getLon() <= p2.getLon() && q.getLat() >= p1.getLat() && q.getLat() <= p2.getLat()){
                    flag = true;
                }
            }
        }
        return flag;
    }
}
