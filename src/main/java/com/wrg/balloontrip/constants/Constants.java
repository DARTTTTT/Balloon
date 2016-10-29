package com.wrg.balloontrip.constants;

/**
 * Created by Administrator on 2016/9/30 0030.
 * Author by RuiGan
 */

public interface Constants {


    //首页顶部图片
    String URL_COVER = "http://q.chanyouji.com/api/v1/adverts.json?market=qq&first_launch=false";
    //攻略 旅游列表
    String URL_STRATEGY_LIST = "http://q.chanyouji.com/api/v2/destinations.json";
    //攻略详情
    String URL_STRATEGY_DETAIL = "http://q.chanyouji.com/api/v3/destinations/%d.json //";
    //攻略行程
    String URL_STRATEGY_ROUTE = "http://q.chanyouji.com/api/v2/plans/%d.json" ;//111814;
    //游记 列表
    String URL_TRIP = "http://q.chanyouji.com/api/v1/timelines.json?page=1";


}
