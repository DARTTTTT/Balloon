package com.wrg.balloontrip.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/3 0003.
 * Author by RuiGan
 */

public class TripEntity {


    /**
     * event_type : recommend
     * user : {"id":105,"name":"氢直播","gender":1,"level":3,"photo_url":"http://inspiration.chanyouji.cn/User/105/ae09cbe73ffb7fc9076327dd1a0b267b.jpg"}
     * activity : {"id":60730,"made_at":"2016-10-03T18:44:53.000Z","likes_count":2,"comments_count":0,"topic":"【枫叶国の秋】探访落基山脉第一大自然湖泊Maligne Lake","contents_count":9,"district_id":1557,"created_at":"2016-10-03T05:12:26.000Z","favorites_count":0,"parent_district_id":100029,"parent_district_count":3,"level":3,"description":"#Day Trip along the Maligne Road#\nMaligne Lake - Spirit Island - Medicine Lake - Maligne Canyon - Fairmont Jasper Park Lodge\n        抵达Jasper后的第三天准时赴约Maligne Lake Cruise。时差效应明显消退后，生物钟逐渐恢复正常，meaning早上开始各种起不来LoL。难得不赶路，在院子里发完呆后去了小镇上颇为有名的一家咖啡馆The Other Paw Bakery Cafe。其实，他们家还有一家姐妹店The Bear's Paw Bakery，听说也很有名。由于星爸爸在加西并没有横屏，因此，在Zero Starbucks的领地，这家不大的咖啡馆绝对起到了超强替补的作用。面包房的选择很多，我挑了一块Pumpkin Maple Square，外加一杯Featured Latte (Full Mocha)。Honestly speaking, 咖啡的味道偏甜，时令产品南瓜派倒是味道不错，一点也不甜。唯一的缺点是排队太长！\n        从Jasper开到Maligne Lake大约需要1个小时(Buffer included)。我们预约的是12:30的那班船，提前15分钟去ticket office checkin，换取Boarding Pass。从码头到精灵岛大约19分钟的旅程，导游妹妹活灵活现的讲了不少关于Maligne Lake的知识，该湖是落基山脉中第二大湖，仅次于班夫的明尼万卡湖，可最大的区别是明尼万卡是人造的！所以，眼前所看到的这片湖可谓天然打造的最大湖泊。湖的最深处足有97米深，且由于所有的水都来自于山上融化的冰川，因此终年寒冷刺骨。看到湖上居然还有勇士在Kayak，我还是表挑战这种高难度运动了LoL不一会儿，精灵岛华丽丽的出现在眼前。由于今日的阳光极佳，精灵岛周围的湖水在阳光照射下泛着粼光，随便按一张都是画就酱紫轻巧的实现了:P\n        回程的路上在Medicine Lake驻留了一会儿，这片湖四周的森林几乎被全数烧焦。去年7月由一刀闪电引发的山火，在这里足足烧了近两周，许多动物也未能幸免，最后在自然雨的浇灌下，终于熄灭。除了疏散附近的人群外，这里几乎没有采取更多的人工措施去改变起火灭火这一去过程。当地人相信，这些都是生物界的自然规律。一年后的今天，万念俱灰的焦木丛中已然能看到些许的绿色，森林仿佛又逐渐恢复生机。生命的轮回从来都没有终点，植物尚且如此，何况人类。Btw，忽然发现Medicine Lake exactly就面向正北方，可谓观极光的上佳场所。好想哪天就在那里一直守到半夜，等着漫天的星光跳舞，前有湖、后有山、天空还有绿光飘过，该有多美😇😇\n        继续沿着Maligne Road往回开便是Maligne Canyon。整个峡谷自上往下就像万丈深渊，可以看到中间的岩石从中有着郁郁葱葱的绿藻，显然是水源充沛的时候留下的痕迹。而处于枯水期的现在，只能到谷底才能看到大片水流倾倒而下的情景。这里是Hiking不错的场所，小圈大约半小时，大圈估摸着得走个1个半小时。水声潺潺，树林遮荫，特别适合夏日漫步。\n        今日的最后一站选择了高端洋气上档次的Fairmont Jasper Park Lodge。整个酒店就位于公园里，四周群山湖泊环绕，绿草丛生，环境不错。酒店亦提供划船、自行车等活动，还有比较简单的Trail供客人散步。认真的参观了三个Fairmont后，还是最喜欢这座。或许是看厌了高楼，还是喜欢湖边一座座的小Cabin。\n        在Jasper的短短几天里，经历了今年的第一场大雪，刷成功了一条Hiking Trail，剩下两个Items (极光+看到熊)不知道今夜有没有机会实现了🙈🙈","contents":[{"id":374641,"caption":"精灵岛","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374641/bca9ddaa8bda5d5c987511a4f69add76.jpg","position":0,"width":900,"height":1200},{"id":374642,"caption":"Maligne Lake Boat House","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374642/87c5854e51ffc45611384c30fa75a814.jpg","position":1,"width":1200,"height":742},{"id":374643,"caption":"Maligne Lake一景","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374643/1f01c2a8e6d0b32293b9e094ce0427f7.jpg","position":2,"width":1200,"height":779},{"id":374644,"caption":"Medicine Lake全景","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374644/ec083e7f08196dd6f1e24655c1bc63c1.jpg","position":3,"width":1200,"height":574},{"id":374645,"caption":"Maligne Canyon","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374645/d23f90e5b05c49ee7c0650cba333ef07.jpg","position":4,"width":900,"height":1200},{"id":374646,"caption":"Road Trip@Maligne Road","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374646/3fa793203133a516571b6aca39bfed52.jpg","position":5,"width":1200,"height":900},{"id":374647,"caption":"Sunset@Fairmont Jasper Park Lodge","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374647/63b15053811564729b08dfe5037e837f.jpg","position":6,"width":1200,"height":675},{"id":374648,"caption":"Sunset@Jasper Park","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374648/10beea0e5e308c9b336be7edf9cee258.jpg","position":7,"width":1200,"height":858},{"id":374649,"caption":"Jasper小镇夜景","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374649/d527cb987872e41bc823c261eae6ae17.jpg","position":8,"width":1200,"height":900}],"districts":[{"id":100029,"name":"加拿大","name_en":"Canada","name_pinyin":"jia na da|jnd","score":null,"level":2,"path":".120004.100029.","published":false,"is_in_china":false,"user_activities_count":18,"lat":56.1304,"lng":-106.347,"is_valid_destination":false,"destination_id":266},{"id":1557,"name":"贾斯珀","name_en":"Jasper","name_pinyin":"jia si po|jsp","score":null,"level":6,"path":".120004.100029.21564.30735.17403.1557.","published":false,"is_in_china":false,"user_activities_count":2,"lat":52.9466,"lng":-117.926,"is_valid_destination":false,"destination_id":null}],"categories":[{"id":133,"name":"自驾","category_type":"customize"}],"user":{"id":94351,"name":"宝姑娘不姓宝","gender":0,"level":3,"photo_url":"http://inspiration.chanyouji.cn/User/94351/299626b154a47378f4aafd10e569a762.jpg"},"poi":{"id":92905,"h5_url":"http://m.ctrip.com/webapp/you/sight/1557/123147.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"Maligne Lake","name_en":"Maligne Lake","name_pinyin":"MaligneLake","business_id":123147,"poi_type":"SIGHT","district_id":1557,"lat":52.6655693054,"lng":-117.5346221924,"address":"贾斯珀国家公园 Improvement District No. 12, AB T0E","location_name":null,"blat":52.6655693054,"blng":-117.5346221924,"youji_lat":null,"youji_lng":null,"youji_poi_id":null,"youji_poi_name":null,"is_in_china":false,"local_name":null,"local_address_name":null},"inspiration_activity_id":0,"inspiration_activity":null}
     */

    private List<DataBean> data;

    public static TripEntity objectFromData(String str) {

        return new Gson().fromJson(str, TripEntity.class);
    }

    public static TripEntity objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), TripEntity.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<TripEntity> arrayTripEntity2FromData(String str) {

        Type listType = new TypeToken<ArrayList<TripEntity>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<TripEntity> arrayTripEntity2FromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<TripEntity>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String event_type;
        /**
         * id : 105
         * name : 氢直播
         * gender : 1
         * level : 3
         * photo_url : http://inspiration.chanyouji.cn/User/105/ae09cbe73ffb7fc9076327dd1a0b267b.jpg
         */

        private UserBean user;
        /**
         * id : 60730
         * made_at : 2016-10-03T18:44:53.000Z
         * likes_count : 2
         * comments_count : 0
         * topic : 【枫叶国の秋】探访落基山脉第一大自然湖泊Maligne Lake
         * contents_count : 9
         * district_id : 1557
         * created_at : 2016-10-03T05:12:26.000Z
         * favorites_count : 0
         * parent_district_id : 100029
         * parent_district_count : 3
         * level : 3
         * description : #Day Trip along the Maligne Road#
         Maligne Lake - Spirit Island - Medicine Lake - Maligne Canyon - Fairmont Jasper Park Lodge
         抵达Jasper后的第三天准时赴约Maligne Lake Cruise。时差效应明显消退后，生物钟逐渐恢复正常，meaning早上开始各种起不来LoL。难得不赶路，在院子里发完呆后去了小镇上颇为有名的一家咖啡馆The Other Paw Bakery Cafe。其实，他们家还有一家姐妹店The Bear's Paw Bakery，听说也很有名。由于星爸爸在加西并没有横屏，因此，在Zero Starbucks的领地，这家不大的咖啡馆绝对起到了超强替补的作用。面包房的选择很多，我挑了一块Pumpkin Maple Square，外加一杯Featured Latte (Full Mocha)。Honestly speaking, 咖啡的味道偏甜，时令产品南瓜派倒是味道不错，一点也不甜。唯一的缺点是排队太长！
         从Jasper开到Maligne Lake大约需要1个小时(Buffer included)。我们预约的是12:30的那班船，提前15分钟去ticket office checkin，换取Boarding Pass。从码头到精灵岛大约19分钟的旅程，导游妹妹活灵活现的讲了不少关于Maligne Lake的知识，该湖是落基山脉中第二大湖，仅次于班夫的明尼万卡湖，可最大的区别是明尼万卡是人造的！所以，眼前所看到的这片湖可谓天然打造的最大湖泊。湖的最深处足有97米深，且由于所有的水都来自于山上融化的冰川，因此终年寒冷刺骨。看到湖上居然还有勇士在Kayak，我还是表挑战这种高难度运动了LoL不一会儿，精灵岛华丽丽的出现在眼前。由于今日的阳光极佳，精灵岛周围的湖水在阳光照射下泛着粼光，随便按一张都是画就酱紫轻巧的实现了:P
         回程的路上在Medicine Lake驻留了一会儿，这片湖四周的森林几乎被全数烧焦。去年7月由一刀闪电引发的山火，在这里足足烧了近两周，许多动物也未能幸免，最后在自然雨的浇灌下，终于熄灭。除了疏散附近的人群外，这里几乎没有采取更多的人工措施去改变起火灭火这一去过程。当地人相信，这些都是生物界的自然规律。一年后的今天，万念俱灰的焦木丛中已然能看到些许的绿色，森林仿佛又逐渐恢复生机。生命的轮回从来都没有终点，植物尚且如此，何况人类。Btw，忽然发现Medicine Lake exactly就面向正北方，可谓观极光的上佳场所。好想哪天就在那里一直守到半夜，等着漫天的星光跳舞，前有湖、后有山、天空还有绿光飘过，该有多美😇😇
         继续沿着Maligne Road往回开便是Maligne Canyon。整个峡谷自上往下就像万丈深渊，可以看到中间的岩石从中有着郁郁葱葱的绿藻，显然是水源充沛的时候留下的痕迹。而处于枯水期的现在，只能到谷底才能看到大片水流倾倒而下的情景。这里是Hiking不错的场所，小圈大约半小时，大圈估摸着得走个1个半小时。水声潺潺，树林遮荫，特别适合夏日漫步。
         今日的最后一站选择了高端洋气上档次的Fairmont Jasper Park Lodge。整个酒店就位于公园里，四周群山湖泊环绕，绿草丛生，环境不错。酒店亦提供划船、自行车等活动，还有比较简单的Trail供客人散步。认真的参观了三个Fairmont后，还是最喜欢这座。或许是看厌了高楼，还是喜欢湖边一座座的小Cabin。
         在Jasper的短短几天里，经历了今年的第一场大雪，刷成功了一条Hiking Trail，剩下两个Items (极光+看到熊)不知道今夜有没有机会实现了🙈🙈
         * contents : [{"id":374641,"caption":"精灵岛","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374641/bca9ddaa8bda5d5c987511a4f69add76.jpg","position":0,"width":900,"height":1200},{"id":374642,"caption":"Maligne Lake Boat House","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374642/87c5854e51ffc45611384c30fa75a814.jpg","position":1,"width":1200,"height":742},{"id":374643,"caption":"Maligne Lake一景","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374643/1f01c2a8e6d0b32293b9e094ce0427f7.jpg","position":2,"width":1200,"height":779},{"id":374644,"caption":"Medicine Lake全景","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374644/ec083e7f08196dd6f1e24655c1bc63c1.jpg","position":3,"width":1200,"height":574},{"id":374645,"caption":"Maligne Canyon","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374645/d23f90e5b05c49ee7c0650cba333ef07.jpg","position":4,"width":900,"height":1200},{"id":374646,"caption":"Road Trip@Maligne Road","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374646/3fa793203133a516571b6aca39bfed52.jpg","position":5,"width":1200,"height":900},{"id":374647,"caption":"Sunset@Fairmont Jasper Park Lodge","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374647/63b15053811564729b08dfe5037e837f.jpg","position":6,"width":1200,"height":675},{"id":374648,"caption":"Sunset@Jasper Park","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374648/10beea0e5e308c9b336be7edf9cee258.jpg","position":7,"width":1200,"height":858},{"id":374649,"caption":"Jasper小镇夜景","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374649/d527cb987872e41bc823c261eae6ae17.jpg","position":8,"width":1200,"height":900}]
         * districts : [{"id":100029,"name":"加拿大","name_en":"Canada","name_pinyin":"jia na da|jnd","score":null,"level":2,"path":".120004.100029.","published":false,"is_in_china":false,"user_activities_count":18,"lat":56.1304,"lng":-106.347,"is_valid_destination":false,"destination_id":266},{"id":1557,"name":"贾斯珀","name_en":"Jasper","name_pinyin":"jia si po|jsp","score":null,"level":6,"path":".120004.100029.21564.30735.17403.1557.","published":false,"is_in_china":false,"user_activities_count":2,"lat":52.9466,"lng":-117.926,"is_valid_destination":false,"destination_id":null}]
         * categories : [{"id":133,"name":"自驾","category_type":"customize"}]
         * user : {"id":94351,"name":"宝姑娘不姓宝","gender":0,"level":3,"photo_url":"http://inspiration.chanyouji.cn/User/94351/299626b154a47378f4aafd10e569a762.jpg"}
         * poi : {"id":92905,"h5_url":"http://m.ctrip.com/webapp/you/sight/1557/123147.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"Maligne Lake","name_en":"Maligne Lake","name_pinyin":"MaligneLake","business_id":123147,"poi_type":"SIGHT","district_id":1557,"lat":52.6655693054,"lng":-117.5346221924,"address":"贾斯珀国家公园 Improvement District No. 12, AB T0E","location_name":null,"blat":52.6655693054,"blng":-117.5346221924,"youji_lat":null,"youji_lng":null,"youji_poi_id":null,"youji_poi_name":null,"is_in_china":false,"local_name":null,"local_address_name":null}
         * inspiration_activity_id : 0
         * inspiration_activity : null
         */

        private ActivityBean activity;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public static DataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getEvent_type() {
            return event_type;
        }

        public void setEvent_type(String event_type) {
            this.event_type = event_type;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public ActivityBean getActivity() {
            return activity;
        }

        public void setActivity(ActivityBean activity) {
            this.activity = activity;
        }

        public static class UserBean {
            private int id;
            private String name;
            private int gender;
            private int level;
            private String photo_url;

            public static UserBean objectFromData(String str) {

                return new Gson().fromJson(str, UserBean.class);
            }

            public static UserBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), UserBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<UserBean> arrayUserBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<UserBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<UserBean> arrayUserBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<UserBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getPhoto_url() {
                return photo_url;
            }

            public void setPhoto_url(String photo_url) {
                this.photo_url = photo_url;
            }
        }

        public static class ActivityBean {
            private int id;
            private String made_at;
            private int likes_count;
            private int comments_count;
            private String topic;
            private int contents_count;
            private int district_id;
            private String created_at;
            private int favorites_count;
            private int parent_district_id;
            private int parent_district_count;
            private int level;
            private String description;
            /**
             * id : 94351
             * name : 宝姑娘不姓宝
             * gender : 0
             * level : 3
             * photo_url : http://inspiration.chanyouji.cn/User/94351/299626b154a47378f4aafd10e569a762.jpg
             */

            private UserBean user;
            /**
             * id : 92905
             * h5_url : http://m.ctrip.com/webapp/you/sight/1557/123147.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=
             * name : Maligne Lake
             * name_en : Maligne Lake
             * name_pinyin : MaligneLake
             * business_id : 123147
             * poi_type : SIGHT
             * district_id : 1557
             * lat : 52.6655693054
             * lng : -117.5346221924
             * address : 贾斯珀国家公园 Improvement District No. 12, AB T0E
             * location_name : null
             * blat : 52.6655693054
             * blng : -117.5346221924
             * youji_lat : null
             * youji_lng : null
             * youji_poi_id : null
             * youji_poi_name : null
             * is_in_china : false
             * local_name : null
             * local_address_name : null
             */

            private PoiBean poi;
            private int inspiration_activity_id;
            private Object inspiration_activity;
            /**
             * id : 374641
             * caption : 精灵岛
             * photo_url : http://inspiration.chanyouji.cn/UserActivityContent/374641/bca9ddaa8bda5d5c987511a4f69add76.jpg
             * position : 0
             * width : 900
             * height : 1200
             */

            private List<ContentsBean> contents;
            /**
             * id : 100029
             * name : 加拿大
             * name_en : Canada
             * name_pinyin : jia na da|jnd
             * score : null
             * level : 2
             * path : .120004.100029.
             * published : false
             * is_in_china : false
             * user_activities_count : 18
             * lat : 56.1304
             * lng : -106.347
             * is_valid_destination : false
             * destination_id : 266
             */

            private List<DistrictsBean> districts;
            /**
             * id : 133
             * name : 自驾
             * category_type : customize
             */

            private List<CategoriesBean> categories;

            public static ActivityBean objectFromData(String str) {

                return new Gson().fromJson(str, ActivityBean.class);
            }

            public static ActivityBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ActivityBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ActivityBean> arrayActivityBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ActivityBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ActivityBean> arrayActivityBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ActivityBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMade_at() {
                return made_at;
            }

            public void setMade_at(String made_at) {
                this.made_at = made_at;
            }

            public int getLikes_count() {
                return likes_count;
            }

            public void setLikes_count(int likes_count) {
                this.likes_count = likes_count;
            }

            public int getComments_count() {
                return comments_count;
            }

            public void setComments_count(int comments_count) {
                this.comments_count = comments_count;
            }

            public String getTopic() {
                return topic;
            }

            public void setTopic(String topic) {
                this.topic = topic;
            }

            public int getContents_count() {
                return contents_count;
            }

            public void setContents_count(int contents_count) {
                this.contents_count = contents_count;
            }

            public int getDistrict_id() {
                return district_id;
            }

            public void setDistrict_id(int district_id) {
                this.district_id = district_id;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public int getFavorites_count() {
                return favorites_count;
            }

            public void setFavorites_count(int favorites_count) {
                this.favorites_count = favorites_count;
            }

            public int getParent_district_id() {
                return parent_district_id;
            }

            public void setParent_district_id(int parent_district_id) {
                this.parent_district_id = parent_district_id;
            }

            public int getParent_district_count() {
                return parent_district_count;
            }

            public void setParent_district_count(int parent_district_count) {
                this.parent_district_count = parent_district_count;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public PoiBean getPoi() {
                return poi;
            }

            public void setPoi(PoiBean poi) {
                this.poi = poi;
            }

            public int getInspiration_activity_id() {
                return inspiration_activity_id;
            }

            public void setInspiration_activity_id(int inspiration_activity_id) {
                this.inspiration_activity_id = inspiration_activity_id;
            }

            public Object getInspiration_activity() {
                return inspiration_activity;
            }

            public void setInspiration_activity(Object inspiration_activity) {
                this.inspiration_activity = inspiration_activity;
            }

            public List<ContentsBean> getContents() {
                return contents;
            }

            public void setContents(List<ContentsBean> contents) {
                this.contents = contents;
            }

            public List<DistrictsBean> getDistricts() {
                return districts;
            }

            public void setDistricts(List<DistrictsBean> districts) {
                this.districts = districts;
            }

            public List<CategoriesBean> getCategories() {
                return categories;
            }

            public void setCategories(List<CategoriesBean> categories) {
                this.categories = categories;
            }

            public static class UserBean {
                private int id;
                private String name;
                private int gender;
                private int level;
                private String photo_url;

                public static UserBean objectFromData(String str) {

                    return new Gson().fromJson(str, UserBean.class);
                }

                public static UserBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), UserBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<UserBean> arrayUserBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<UserBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<UserBean> arrayUserBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<UserBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getGender() {
                    return gender;
                }

                public void setGender(int gender) {
                    this.gender = gender;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getPhoto_url() {
                    return photo_url;
                }

                public void setPhoto_url(String photo_url) {
                    this.photo_url = photo_url;
                }
            }

            public static class PoiBean {
                private int id;
                private String h5_url;
                private String name;
                private String name_en;
                private String name_pinyin;
                private int business_id;
                private String poi_type;
                private int district_id;
                private double lat;
                private double lng;
                private String address;
                private Object location_name;
                private double blat;
                private double blng;
                private Object youji_lat;
                private Object youji_lng;
                private Object youji_poi_id;
                private Object youji_poi_name;
                private boolean is_in_china;
                private Object local_name;
                private Object local_address_name;

                public static PoiBean objectFromData(String str) {

                    return new Gson().fromJson(str, PoiBean.class);
                }

                public static PoiBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), PoiBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<PoiBean> arrayPoiBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<PoiBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<PoiBean> arrayPoiBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<PoiBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getH5_url() {
                    return h5_url;
                }

                public void setH5_url(String h5_url) {
                    this.h5_url = h5_url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getName_en() {
                    return name_en;
                }

                public void setName_en(String name_en) {
                    this.name_en = name_en;
                }

                public String getName_pinyin() {
                    return name_pinyin;
                }

                public void setName_pinyin(String name_pinyin) {
                    this.name_pinyin = name_pinyin;
                }

                public int getBusiness_id() {
                    return business_id;
                }

                public void setBusiness_id(int business_id) {
                    this.business_id = business_id;
                }

                public String getPoi_type() {
                    return poi_type;
                }

                public void setPoi_type(String poi_type) {
                    this.poi_type = poi_type;
                }

                public int getDistrict_id() {
                    return district_id;
                }

                public void setDistrict_id(int district_id) {
                    this.district_id = district_id;
                }

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public Object getLocation_name() {
                    return location_name;
                }

                public void setLocation_name(Object location_name) {
                    this.location_name = location_name;
                }

                public double getBlat() {
                    return blat;
                }

                public void setBlat(double blat) {
                    this.blat = blat;
                }

                public double getBlng() {
                    return blng;
                }

                public void setBlng(double blng) {
                    this.blng = blng;
                }

                public Object getYouji_lat() {
                    return youji_lat;
                }

                public void setYouji_lat(Object youji_lat) {
                    this.youji_lat = youji_lat;
                }

                public Object getYouji_lng() {
                    return youji_lng;
                }

                public void setYouji_lng(Object youji_lng) {
                    this.youji_lng = youji_lng;
                }

                public Object getYouji_poi_id() {
                    return youji_poi_id;
                }

                public void setYouji_poi_id(Object youji_poi_id) {
                    this.youji_poi_id = youji_poi_id;
                }

                public Object getYouji_poi_name() {
                    return youji_poi_name;
                }

                public void setYouji_poi_name(Object youji_poi_name) {
                    this.youji_poi_name = youji_poi_name;
                }

                public boolean isIs_in_china() {
                    return is_in_china;
                }

                public void setIs_in_china(boolean is_in_china) {
                    this.is_in_china = is_in_china;
                }

                public Object getLocal_name() {
                    return local_name;
                }

                public void setLocal_name(Object local_name) {
                    this.local_name = local_name;
                }

                public Object getLocal_address_name() {
                    return local_address_name;
                }

                public void setLocal_address_name(Object local_address_name) {
                    this.local_address_name = local_address_name;
                }
            }

            public static class ContentsBean {
                private int id;
                private String caption;
                private String photo_url;
                private int position;
                private int width;
                private int height;

                public static ContentsBean objectFromData(String str) {

                    return new Gson().fromJson(str, ContentsBean.class);
                }

                public static ContentsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), ContentsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<ContentsBean> arrayContentsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<ContentsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<ContentsBean> arrayContentsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<ContentsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getCaption() {
                    return caption;
                }

                public void setCaption(String caption) {
                    this.caption = caption;
                }

                public String getPhoto_url() {
                    return photo_url;
                }

                public void setPhoto_url(String photo_url) {
                    this.photo_url = photo_url;
                }

                public int getPosition() {
                    return position;
                }

                public void setPosition(int position) {
                    this.position = position;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }

            public static class DistrictsBean {
                private int id;
                private String name;
                private String name_en;
                private String name_pinyin;
                private Object score;
                private int level;
                private String path;
                private boolean published;
                private boolean is_in_china;
                private int user_activities_count;
                private double lat;
                private double lng;
                private boolean is_valid_destination;
                private int destination_id;

                public static DistrictsBean objectFromData(String str) {

                    return new Gson().fromJson(str, DistrictsBean.class);
                }

                public static DistrictsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), DistrictsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<DistrictsBean> arrayDistrictsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<DistrictsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<DistrictsBean> arrayDistrictsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<DistrictsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getName_en() {
                    return name_en;
                }

                public void setName_en(String name_en) {
                    this.name_en = name_en;
                }

                public String getName_pinyin() {
                    return name_pinyin;
                }

                public void setName_pinyin(String name_pinyin) {
                    this.name_pinyin = name_pinyin;
                }

                public Object getScore() {
                    return score;
                }

                public void setScore(Object score) {
                    this.score = score;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getPath() {
                    return path;
                }

                public void setPath(String path) {
                    this.path = path;
                }

                public boolean isPublished() {
                    return published;
                }

                public void setPublished(boolean published) {
                    this.published = published;
                }

                public boolean isIs_in_china() {
                    return is_in_china;
                }

                public void setIs_in_china(boolean is_in_china) {
                    this.is_in_china = is_in_china;
                }

                public int getUser_activities_count() {
                    return user_activities_count;
                }

                public void setUser_activities_count(int user_activities_count) {
                    this.user_activities_count = user_activities_count;
                }

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                public boolean isIs_valid_destination() {
                    return is_valid_destination;
                }

                public void setIs_valid_destination(boolean is_valid_destination) {
                    this.is_valid_destination = is_valid_destination;
                }

                public int getDestination_id() {
                    return destination_id;
                }

                public void setDestination_id(int destination_id) {
                    this.destination_id = destination_id;
                }
            }

            public static class CategoriesBean {
                private int id;
                private String name;
                private String category_type;

                public static CategoriesBean objectFromData(String str) {

                    return new Gson().fromJson(str, CategoriesBean.class);
                }

                public static CategoriesBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), CategoriesBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<CategoriesBean> arrayCategoriesBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<CategoriesBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<CategoriesBean> arrayCategoriesBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<CategoriesBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCategory_type() {
                    return category_type;
                }

                public void setCategory_type(String category_type) {
                    this.category_type = category_type;
                }
            }
        }
    }
}
