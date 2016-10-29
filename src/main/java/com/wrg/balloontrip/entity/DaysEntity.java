package com.wrg.balloontrip.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/5 0005.
 * Author by RuiGan
 */

public class DaysEntity implements Serializable {


    /**
     * message : ok
     * status : 200
     * data : {"id":111814,"destination_id":109,"created_at":"2016-04-23T09:46:48.000Z","plan_day_points_count":0,"official":true,"photo_id":441970,"title":"丽江+大理经典4日游","score":0,"published":true,"mixed":false,"photo":{"id":441970,"width":768,"height":687,"url":"http://inspiration.chanyouji.cn/Plan/111814/6799893f7d5aabaa068517e3196708b1.jpg","file_size":361500,"photo_url":"http://inspiration.chanyouji.cn/Plan/111814/6799893f7d5aabaa068517e3196708b1.jpg"},"destination":{"id":109,"lat":25.0454006195,"lng":102.7099990845,"district_id":100007,"parent_id":5,"name":"云南","name_en":"Yunnan","name_pinyin":"yun nan|yn","score":1165,"level":3,"path":".1.5.109.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg","title":"","description":"","tip":"最新云南游玩指南，含徒步、租车自驾及美食购物等攻略","time_cost":"","wiki_page_id":null,"has_airport":false,"visit_tip":"","is_top_destination":true,"is_in_grouping":false,"alias_name":null,"travel_tip":null,"photo":{"id":66760,"width":1192,"height":1067,"url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg","file_size":1088794,"photo_url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg"}},"days":[{"id":519315,"plan_id":111814,"position":1,"description":"丽江和大理是云南最重要的两大旅行地，适合用4天时间紧凑的游览一遍，既可以闲逛风情独特的丽江、大理古城，也可以欣赏玉龙雪山、洱海的绝美风光。 #第一天行程# 今日来一场悠闲的丽江古城漫步游，感受最柔软舒适的古城时光吧。不大的丽江古城中，包含着纳西族皇宫木府、开满小吃铺子的四方街、灯火酒绿的艳遇酒吧等各种元素。","points":[{"id":1159238,"position":0,"time_cost":30,"is_custom":false,"poi":{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2628,"visit_tip":"半小时","address":"丽江市古城区大研古镇北入口","topic":"和大水车合影留念","introduce":"走进丽江古城北门，一大一小两架水车便映入眼帘。这两驾连轴大水车是古城的标志性建筑，也是古城内最人声鼎沸的地方，一年四季都挤满了留影和集合的游客，想要单独和水车合影一张必须眼尖手快。 大水车前的石桥上，是拍摄水车的最佳地点。若是春天的傍晚前来，夕阳穿过水车，照射在一旁刻有江泽民题词的照壁上，碧绿的垂柳被微风拂动，潺潺的流水反射着碎金般的阳光，是大水车最美的一面。","time_cost":30,"wishes_count":9058,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":3100,"height":1859,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2628/a91ffe19de19dfad741e65c15f1861b0.jpg?imageMogr2/crop/!3100x1859a0a141/thumbnail/800"}}},{"id":1159239,"position":1,"time_cost":30,"is_custom":false,"poi":{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2617,"visit_tip":"半小时","address":"云南丽江市大研古城四方街","topic":"逛四方街品尝纳西美食","introduce":"丽江虽然不以美食而著称，但是却有很多有纳西族代表性的特色小吃，这其中以鸡豆凉粉、纳西烤鱼、丽江粑粑等最受欢迎。走在丽江古城的四方街上，短短的街道上有数十家小吃店，让你一次吃遍各种纳西小吃。 除了小吃外，丽江特色火锅也非常出名，以腊排骨火锅、洋芋鸡火锅、黑山羊火锅、菌类火锅等最美味。丽江的火锅有招牌蘸水，最好可以放一些薄荷涮在肉锅里，肉会带有清新的香味，薄荷混了肉味，非常好吃。 若要想吃正宗纳西菜，比较具有代表性的有三叠水和八大碗。\u201c三叠水\u201d是纳西人的最高礼仪，按所上菜看的口味分三次上席；\u201c八大碗\u201d则是纳西族传统的年夜饭，以八种各有寓意的菜式致以美好祝福。","time_cost":30,"wishes_count":10132,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2299/f4a2239dcadaf5104dc430cd339ad0c0.jpg?imageMogr2/crop/!1600x959a0a54/thumbnail/800"}}},{"id":1159240,"position":2,"time_cost":30,"is_custom":false,"poi":{"id":10543884,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128246.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"狮子山","name_en":"","name_pinyin":"shi zi shan gong yuan","business_id":128246,"poi_type":"SIGHT","district_id":32,"lat":26.871291,"lng":100.231285,"address":"丽江市古城区新华街","location_name":null,"blat":26.8772544861,"blng":100.237780896,"youji_lat":26.871291,"youji_lng":100.231285,"youji_poi_id":6400,"youji_poi_name":"狮子山","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2286,"visit_tip":"半小时","address":"丽江市古城区新华街狮子山公园","topic":"登狮子山俯瞰丽江古城全景","introduce":"丽江古城西侧的狮子山顶，是观赏丽江古城全景的最佳去处，可北望玉龙雪山，东俯丽江古城，西瞰丽江新城，南眺田园风光。晚上在狮子山俯瞰丽江，月色下在万家灯火装点下的古城更是流光溢彩，璀璨动人。 狮子山因山体宛如一头睡卧的狮子而得名，山顶坐落着极富建筑特色的万古楼，是丽江城内的制高点。公园南端有始建于乾隆十九年的白马龙潭寺，寺东有一泓清澈见底的潭水，被纳西人民奉为神泉。","time_cost":30,"wishes_count":10002,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":10543884,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128246.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"狮子山","name_en":"","name_pinyin":"shi zi shan gong yuan","business_id":128246,"poi_type":"SIGHT","district_id":32,"lat":26.871291,"lng":100.231285,"address":"丽江市古城区新华街","location_name":null,"blat":26.8772544861,"blng":100.237780896,"youji_lat":26.871291,"youji_lng":100.231285,"youji_poi_id":6400,"youji_poi_name":"狮子山","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2286/962cf8d20eb94a5908c45e399fba2a80.jpg?imageMogr2/crop/!1600x959a0a61/thumbnail/800"}}},{"id":1159241,"position":3,"time_cost":60,"is_custom":false,"poi":{"id":78639,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12325.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"木府","name_en":"","name_pinyin":"mu fu","business_id":12325,"poi_type":"SIGHT","district_id":32,"lat":26.869557,"lng":100.234204,"address":"丽江市古城区大研镇光义街官院巷49号 \u200e","location_name":null,"blat":26.8755760193,"blng":100.2405288786,"youji_lat":26.869557,"youji_lng":100.234204,"youji_poi_id":6396,"youji_poi_name":"木府","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2612,"visit_tip":"1小时","address":"丽江市古城区大研镇光义街官院巷49号","topic":"木府：精致雄伟的丽江王府","introduce":"丽江古城内的木府，是历代丽江木氏土司的王府。土司府在保持了中原建筑风格的基础上，添加了白族和纳西族的工艺，建筑精美而宏大，蔚为壮观，难怪徐霞客当年在木府门外慨叹：\u201c宫室之丽，拟于王者\u201d。 木府虽是土司王府，但宫室之瑰丽，不逊皇家，据说当年既是\u201c仿紫禁城而建\u201d，鼎盛时期，有宫舍100多间。府内中轴线上建有忠义牌坊、木牌坊、议事厅、万卷楼等建筑，高低错落，气势磅礴。 木府历经几百年的辉煌，大部分毁于清末的战火中，目前所见的绝大多数是1999年重建而成。虽是重建，但不妨碍其成为丽江古城内的代表性建筑。电视连续剧《木府风云》、《钱王》都是在这里拍摄的。","time_cost":60,"wishes_count":9281,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":78639,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12325.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"木府","name_en":"","name_pinyin":"mu fu","business_id":12325,"poi_type":"SIGHT","district_id":32,"lat":26.869557,"lng":100.234204,"address":"丽江市古城区大研镇光义街官院巷49号 \u200e","location_name":null,"blat":26.8755760193,"blng":100.2405288786,"youji_lat":26.869557,"youji_lng":100.234204,"youji_poi_id":6396,"youji_poi_name":"木府","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2612/f2129eeb0a93826ad76f3a83addabdd3.jpg?imageMogr2/crop/!1600x959a0a110/thumbnail/800"}}},{"id":1159242,"position":4,"time_cost":30,"is_custom":false,"poi":{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2774,"visit_tip":"半小时","address":"云南丽江市大研古城四方街","topic":"跳一次纳西广场舞","introduce":"每逢节庆日，丽江的纳西族的小伙子都要面对玉龙雪山，敲着\u201c东巴鼓\u201d，跳起欢快的东巴舞。如今在四方街上，几乎每天都有穿着民族服饰欢快起舞的纳西族，和他们一起跳一次广场舞，绝对会是难得的体验。 东巴舞是纳西族东巴文化的重要组成部分，一般运用于宗教祭祀活动中。东巴舞来源于古代纳西的社会生活，不少动作都是模拟各种动物的动作来进行的，形象十分生动。","time_cost":30,"wishes_count":7792,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":640,"height":384,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2774/b981f042f97f88922712b9e2d2e489a3.jpg?imageMogr2/crop/!640x384a0a149/thumbnail/800"}}},{"id":1159243,"position":5,"time_cost":0,"is_custom":false,"poi":{"id":16955515,"h5_url":"http://m.ctrip.com/webapp/you/foods/32/8589047.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"江湖酒吧","name_en":"","name_pinyin":"JIANG HU JIU BA","business_id":8589047,"poi_type":"RESTAURANT","district_id":32,"lat":26.870921,"lng":100.239741,"address":"古城区五一街王家庄巷41号","location_name":null,"blat":26.8767719269,"blng":100.2462710821,"youji_lat":26.870921,"youji_lng":100.239741,"youji_poi_id":171072,"youji_poi_name":"江湖酒吧","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2659,"visit_tip":"","address":"古城区五一街王家庄巷41号","topic":"泡一泡丽江酒吧","introduce":"如果说白天的丽江古城是民俗与美景的结合，那么夜幕降临后的丽江则不负其\u201c艳遇之都\u201d的美誉。古城内大大小小的酒吧纷纷开张，在鲜艳的霓虹灯下，素不相识的人们聚在一起，饮酒作乐。 丽江城内酒吧众多，最具特色的当属火塘酒吧了。火塘是藏区家中生火取暖、聚会的地方，一年365天都不会熄灭。在火塘酒吧中，歌手和客人围坐在火塘周边，自弹自唱、谈天说地、其乐融融。 江湖酒吧是丽江最热门的火塘音乐酒吧，也是音乐爱好者们在丽江的聚集点之一。江湖酒吧的主唱小松声音穿透力很强，伴随着让人回味无穷的音乐声，不大的酒吧中男男女女围着一个大火塘谈笑风生，十分惬意。","time_cost":0,"wishes_count":9456,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":16955515,"h5_url":"http://m.ctrip.com/webapp/you/foods/32/8589047.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"江湖酒吧","name_en":"","name_pinyin":"JIANG HU JIU BA","business_id":8589047,"poi_type":"RESTAURANT","district_id":32,"lat":26.870921,"lng":100.239741,"address":"古城区五一街王家庄巷41号","location_name":null,"blat":26.8767719269,"blng":100.2462710821,"youji_lat":26.870921,"youji_lng":100.239741,"youji_poi_id":171072,"youji_poi_name":"江湖酒吧","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1280,"height":767,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2323/f8a55533b79eef5686a3f20b5d5267a0.jpg?imageMogr2/crop/!1280x767a0a192/thumbnail/800"}}}]},{"id":519319,"plan_id":111814,"position":2,"description":"丽江城北的玉龙雪山是纳西族心中的神山，可以从丽江乘班车前往。这里景观丰富，你可以上山欣赏高海拔冰川的瑰丽景象，也可以在山腰欣赏蓝月谷的碧水、云杉坪的参天古木。除了自然景观外，蓝月谷每天中午都会上演的《印象丽江》舞台剧也不可错过。","points":[{"id":1159264,"position":0,"time_cost":180,"is_custom":false,"poi":{"id":10543840,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128202.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"玉龙冰川公园","name_en":"","name_pinyin":"bing chuan gong yuan","business_id":128202,"poi_type":"SIGHT","district_id":32,"lat":27.101439,"lng":100.177116,"address":"丽江市玉龙纳西族自治县玉龙雪山景区","location_name":null,"blat":27.1249198914,"blng":100.210635235,"youji_lat":27.101439,"youji_lng":100.177116,"youji_poi_id":166506,"youji_poi_name":"玉龙冰川公园","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2224,"visit_tip":"2-3小时","address":"云南省丽江市玉龙纳西族自治县玉龙雪山","topic":"登玉龙雪山近距离观赏冰川","introduce":"位于丽江古城旁的玉龙雪山，是北半球纬度最低的雪山，山上发育着19条冰川，远望如同一片瀑布悬挂于山顶，在阳光的照耀下泛着银光。乘坐大索道前往山腰，沿着山间栈道就可以近距离观赏冰川。 玉龙雪山上的冰川公园是玉龙雪山的主峰扇子陡东北坡一片平缓坡地，白色的山体即磅礴壮观又洁白清秀。这里秋冬春三季白雪茫茫，但到了夏季时，形成于四万多年前的白水一号冰川则裸露在外，游客可以近距离观察。","time_cost":180,"wishes_count":9621,"icon_type":2,"price":0,"user_activities_count":14,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":10543840,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128202.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"玉龙冰川公园","name_en":"","name_pinyin":"bing chuan gong yuan","business_id":128202,"poi_type":"SIGHT","district_id":32,"lat":27.101439,"lng":100.177116,"address":"丽江市玉龙纳西族自治县玉龙雪山景区","location_name":null,"blat":27.1249198914,"blng":100.210635235,"youji_lat":27.101439,"youji_lng":100.177116,"youji_poi_id":166506,"youji_poi_name":"玉龙冰川公园","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":1183,"topic":"玉龙雪山"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2224/a5f8208fb10f4388e415e489c710a056.jpg?imageMogr2/crop/!1600x959a0a190/thumbnail/800"}}},{"id":1159265,"position":1,"time_cost":120,"is_custom":false,"poi":{"id":10758688,"h5_url":"http://m.ctrip.com/webapp/you/resort/32/109868.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"印象丽江","name_en":"","name_pinyin":"yin xiang li jiang","business_id":109868,"poi_type":"ENTERTAINMENT","district_id":32,"lat":27.097406,"lng":100.258437,"address":"丽江市玉龙雪山景区甘海子蓝月谷剧场","location_name":null,"blat":27.1031074524,"blng":100.2650088911,"youji_lat":27.097406,"youji_lng":100.258437,"youji_poi_id":6394,"youji_poi_name":"印象丽江","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2273,"visit_tip":"2小时","address":"云南丽江玉龙雪山甘海子蓝月谷剧场","topic":"看一场《印象丽江》","introduce":"《印象丽江》是张艺谋导演的大型实景舞台剧，将云南少数民族的生活、耕种、爱情、狩猎、欢庆、行商等各种元素，用艺术的形式展现在人们的眼前，全视角的呈现了东巴文化的风貌。 《印象丽江》的演员大部分都是当地居民，演出在海拔3100米的玉龙雪山甘海子蓝月谷剧场露天舞台举行，用最淳朴的演员与最真实的场景，展示出丽江原住民对天地、山川的感情。 整个表演一气呵成，搭配蓝天白云雪山的真实背景，让人仿佛置身于其中。在震撼的背景音乐里，你能触及到纳西族人生命里的顽强与不息；回荡在雪山上的情歌，让你感受纳西族青年男女那纯净的爱情。","time_cost":120,"wishes_count":8819,"icon_type":2,"price":0,"user_activities_count":5,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":10758688,"h5_url":"http://m.ctrip.com/webapp/you/resort/32/109868.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"印象丽江","name_en":"","name_pinyin":"yin xiang li jiang","business_id":109868,"poi_type":"ENTERTAINMENT","district_id":32,"lat":27.097406,"lng":100.258437,"address":"丽江市玉龙雪山景区甘海子蓝月谷剧场","location_name":null,"blat":27.1031074524,"blng":100.2650088911,"youji_lat":27.097406,"youji_lng":100.258437,"youji_poi_id":6394,"youji_poi_name":"印象丽江","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":350,"topic":"必做之事"},{"id":1183,"topic":"玉龙雪山"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2273/7c16fcd3f9f4e54d7010e38a7c978992.jpg?imageMogr2/crop/!1600x959a0a131/thumbnail/800"}}},{"id":1159266,"position":2,"time_cost":60,"is_custom":false,"poi":{"id":91410,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/109863.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"蓝月谷","name_en":"","name_pinyin":"lan yue gu","business_id":109863,"poi_type":"SIGHT","district_id":32,"lat":27.125834,"lng":100.244685,"address":"丽江市玉龙纳西族自治县玉龙雪山东麓甘海子以北、云杉坪南侧的山谷之中","location_name":null,"blat":27.1316242218,"blng":100.2512473835,"youji_lat":27.125834,"youji_lng":100.244685,"youji_poi_id":6408,"youji_poi_name":"蓝月谷","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2576,"visit_tip":"1-2小时","address":"云南省丽江市玉龙纳西族自治县蓝月谷","topic":"蓝月谷：水色碧蓝小九寨","introduce":"蓝月谷原名\u201c白水河\u201d，每逢晴天，月牙形山谷中的湖水都会呈现出蔚蓝的颜色，因而得名。 蓝月谷被称为\u201c小九寨\u201d，这里的湖光山色虽然比不上九寨沟的绝美和静谧，但在雪山的映衬下也别有一番韵味。 蓝月谷位于玉龙雪山脚下，湖水都是由雪山融水汇聚而成，清澈见底。水中富含钙、铜等金属离子，因此形成了钙华地貌，以及蔚蓝色的池水。谷中的河水受山体阻挡，形成了玉液湖、镜潭湖、蓝月湖等湖泊。","time_cost":60,"wishes_count":8866,"icon_type":2,"price":0,"user_activities_count":11,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":91410,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/109863.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"蓝月谷","name_en":"","name_pinyin":"lan yue gu","business_id":109863,"poi_type":"SIGHT","district_id":32,"lat":27.125834,"lng":100.244685,"address":"丽江市玉龙纳西族自治县玉龙雪山东麓甘海子以北、云杉坪南侧的山谷之中","location_name":null,"blat":27.1316242218,"blng":100.2512473835,"youji_lat":27.125834,"youji_lng":100.244685,"youji_poi_id":6408,"youji_poi_name":"蓝月谷","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":443,"topic":"周边隐秘之地"},{"id":1183,"topic":"玉龙雪山"}],"photo":{"width":3232,"height":1939,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2576/1194c7c350bc66a221551269bd775cc0.jpg?imageMogr2/crop/!3232x1939a0a133/thumbnail/800"}}},{"id":1159267,"position":3,"time_cost":120,"is_custom":false,"poi":{"id":78646,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12467.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"云杉坪","name_en":"","name_pinyin":"yun shan ping","business_id":12467,"poi_type":"SIGHT","district_id":32,"lat":27.126441,"lng":100.244211,"address":"丽江市玉龙纳西族自治县丽玉龙雪山景区内","location_name":"玉龙县","blat":27.1208992004,"blng":100.2253909665,"youji_lat":27.126441,"youji_lng":100.244211,"youji_poi_id":6454,"youji_poi_name":"云杉坪","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":6862,"visit_tip":"2-3小时","address":"云南省丽江市玉龙纳西族自治县玉龙雪山云杉坪","topic":"云杉坪：玉龙雪山最佳拍摄地","introduce":"云杉坪是玉龙雪山山腰上的一片高山草甸，草场周边被高大茂密的云杉林所环抱。在这个海拔3200米的草甸上，可以将玉龙十三峰的壮观景象一览无余，是拍摄雪山的最佳取景点。 云杉坪又名\u201c殉情谷\u201d，传说是以前有很多青年男女在此殉情，因而成为了纳西青年男女心中的爱情圣地。前往云杉坪需要在玉龙雪山景区内乘坐云杉坪索道，穿过茂密繁盛的云杉林之后，便可来到草场。","time_cost":120,"wishes_count":7516,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":78646,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12467.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"云杉坪","name_en":"","name_pinyin":"yun shan ping","business_id":12467,"poi_type":"SIGHT","district_id":32,"lat":27.126441,"lng":100.244211,"address":"丽江市玉龙纳西族自治县丽玉龙雪山景区内","location_name":"玉龙县","blat":27.1208992004,"blng":100.2253909665,"youji_lat":27.126441,"youji_lng":100.244211,"youji_poi_id":6454,"youji_poi_name":"云杉坪","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":1183,"topic":"玉龙雪山"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/6862/0ddc2963f2cab91200cded5f352b91a4.jpg?imageMogr2/crop/!1600x959a0a66/thumbnail/800"}}}]},{"id":519323,"plan_id":111814,"position":3,"description":"今天上午从丽江出发前往大理，可乘坐火车或汽车，约需2小时。下午在古城内逛逛买买，傍晚看崇圣寺三塔的夕阳倒影，晚上回到古城的洋人街泡吧，可以好好感受嬉皮士风情。","points":[{"id":1159384,"position":0,"time_cost":60,"is_custom":false,"poi":{"id":24038580,"h5_url":"http://m.ctrip.com/webapp/you/shops/31/1447781.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"复兴路","name_en":"","name_pinyin":"fu xing lu","business_id":1447781,"poi_type":"SHOP","district_id":31,"lat":25.692144,"lng":100.161598,"address":"大理市复兴路267","location_name":null,"blat":25.6980190277,"blng":100.1681421218,"youji_lat":25.692144,"youji_lng":100.161598,"youji_poi_id":171184,"youji_poi_name":"复兴路","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3086,"visit_tip":"1小时","address":"云南大理市大理古城复兴路","topic":"逛复兴路吃吃买买","introduce":"复兴路由南至北纵贯整个大理古城，是古城内著名的步行街。道路两边都是特色店铺，经营大理石雕刻、民族服饰和大理特色食品等当地特产。花一天时间走在鲜花盛开的复兴路上，一路吃吃买买，是享受大理闲适生活的最佳方式。 在复兴路，不愁挑不到好的手信带回家。文雅一点的，可以购买天然大理石制作的文房四宝、花盆、灯具等工艺品；喜欢打扮的，一条富有民族特色的白族扎染长裙就能满足；爱吃喝的，鲜香浓郁的乳扇、香味独特的沱茶绝对能投其所好。","time_cost":60,"wishes_count":9940,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":24038580,"h5_url":"http://m.ctrip.com/webapp/you/shops/31/1447781.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"复兴路","name_en":"","name_pinyin":"fu xing lu","business_id":1447781,"poi_type":"SHOP","district_id":31,"lat":25.692144,"lng":100.161598,"address":"大理市复兴路267","location_name":null,"blat":25.6980190277,"blng":100.1681421218,"youji_lat":25.692144,"youji_lng":100.161598,"youji_poi_id":171184,"youji_poi_name":"复兴路","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":510,"topic":"大理古城"}],"photo":{"width":5000,"height":2999,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3086/a57fde67f6aeed8500c9be9244460a29.jpg?imageMogr2/crop/!5000x2999a0a188/thumbnail/800"}}},{"id":1159385,"position":1,"time_cost":30,"is_custom":false,"poi":{"id":84213,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/51944.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"五华楼","name_en":"","name_pinyin":"wu hua lou","business_id":51944,"poi_type":"SIGHT","district_id":31,"lat":25.69069,"lng":100.162831,"address":"大理白族自治州大理市玉洱路","location_name":null,"blat":25.6965675354,"blng":100.1693650844,"youji_lat":25.69069,"youji_lng":100.162831,"youji_poi_id":156149,"youji_poi_name":"五华楼","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2328,"visit_tip":"半小时","address":"大理白族自治州大理市玉洱路","topic":"登五华楼俯瞰大理古城全景","introduce":"大理五华楼位于大理古城的中心部位，是古代南诏王的国宾馆，又叫五花楼。因其规模的宏大，在南诏时，被称为\u201c天下第一楼\u201d。作为大理古城的至高点，登上五华楼可以俯瞰大理古城全城和苍山洱海。 五华楼作为国宾馆的历史长达数百年之久。每年三月十六，南诏时期的南诏王以及后来大理国的大理王都会在五华楼会见西南夷各个小国君长，和其他一些重要宾客，赐以酒席佳肴，奏以南诏、大理时期的音乐。","time_cost":30,"wishes_count":8840,"icon_type":2,"price":0,"user_activities_count":4,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":84213,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/51944.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"五华楼","name_en":"","name_pinyin":"wu hua lou","business_id":51944,"poi_type":"SIGHT","district_id":31,"lat":25.69069,"lng":100.162831,"address":"大理白族自治州大理市玉洱路","location_name":null,"blat":25.6965675354,"blng":100.1693650844,"youji_lat":25.69069,"youji_lng":100.162831,"youji_poi_id":156149,"youji_poi_name":"五华楼","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":510,"topic":"大理古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2328/5b4de54354b463db924f383b1a9b959c.jpg?imageMogr2/crop/!1600x959a0a107/thumbnail/800"}}},{"id":1159386,"position":2,"time_cost":60,"is_custom":false,"poi":{"id":13853728,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/1478241.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"人民路","name_en":"","name_pinyin":"ren min lu","business_id":1478241,"poi_type":"SIGHT","district_id":31,"lat":25.69393,"lng":100.164036,"address":"大理白族自治州大理市大理古城内","location_name":null,"blat":25.7010784149,"blng":100.1737493535,"youji_lat":25.69393,"youji_lng":100.164036,"youji_poi_id":162076,"youji_poi_name":"人民路","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3534,"visit_tip":"1-2小时","address":"云南大理市大理古城人民路","topic":"人民路：文艺青年必到","introduce":"人民路是大理古城里的一条非常繁华的步行街，大街两边开满各种店面，外加各种地摊，出售的多是文房四宝、白族手工、蜡染服饰、民族饰品等，是一条十分文艺范儿的街道，深受文艺青年游客的喜爱。 人民路没有洋人街出名，但却开满了众多美食小吃店铺和咖啡店、茶馆。在古城里逛累了，不妨来到人民路，坐在临街馆子里喝喝咖啡品品茶，看大街上川流不息的人群，也是一种别样的享受。","time_cost":60,"wishes_count":9144,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":13853728,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/1478241.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"人民路","name_en":"","name_pinyin":"ren min lu","business_id":1478241,"poi_type":"SIGHT","district_id":31,"lat":25.69393,"lng":100.164036,"address":"大理白族自治州大理市大理古城内","location_name":null,"blat":25.7010784149,"blng":100.1737493535,"youji_lat":25.69393,"youji_lng":100.164036,"youji_poi_id":162076,"youji_poi_name":"人民路","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":510,"topic":"大理古城"}],"photo":{"width":1000,"height":600,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3534/21886dfcbe65d9a6f41263041f157954.jpg?imageMogr2/crop/!1000x600a0a124/thumbnail/800"}}},{"id":1159387,"position":3,"time_cost":60,"is_custom":false,"poi":{"id":75915,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/3037.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"崇圣寺三塔","name_en":"","name_pinyin":"da li chong sheng si san ta","business_id":3037,"poi_type":"SIGHT","district_id":31,"lat":25.7060604095,"lng":100.1493148804,"address":"大理白族自治州大理市古城西北部1.5公里处214国道旁","location_name":null,"blat":25.7117996216,"blng":100.1559019676,"youji_lat":25.705636,"youji_lng":100.148771,"youji_poi_id":6509,"youji_poi_name":"崇圣寺三塔","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2344,"visit_tip":"1-2小时","address":"云南省大理白族自治州大理市崇圣寺三塔公园","topic":"看崇圣寺三塔绝美倒影","introduce":"崇圣寺位于大理古城北1.5公里处，寺内最著名的要数高耸的三座佛塔，已经有上千年的历史。三塔背靠苍山，面临洱海，蓝天白云下塔影倒映在宁静的\u201c三塔聚影池\u201d中，构成一幅绝美的画面。 崇圣寺曾是大理国的皇家寺院，大理国22任皇帝中有9任曾在此出家。这里也是唯一只许愿不还愿的寺庙，大雄宝殿供奉释迦牟尼、地藏王、普贤、文殊、观音，这些你需走遍全国才能拜见的佛像，在这里就能够见齐全。","time_cost":60,"wishes_count":9699,"icon_type":2,"price":0,"user_activities_count":9,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":75915,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/3037.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"崇圣寺三塔","name_en":"","name_pinyin":"da li chong sheng si san ta","business_id":3037,"poi_type":"SIGHT","district_id":31,"lat":25.7060604095,"lng":100.1493148804,"address":"大理白族自治州大理市古城西北部1.5公里处214国道旁","location_name":null,"blat":25.7117996216,"blng":100.1559019676,"youji_lat":25.705636,"youji_lng":100.148771,"youji_poi_id":6509,"youji_poi_name":"崇圣寺三塔","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":510,"topic":"大理古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2344/3dd7d459c11a411895903e2b1a7f1e5a.jpg?imageMogr2/crop/!1600x959a0a64/thumbnail/800"}}},{"id":1159388,"position":4,"time_cost":60,"is_custom":false,"poi":{"id":78641,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/12329.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大理洋人街","name_en":"","name_pinyin":"yang ren jie","business_id":12329,"poi_type":"SIGHT","district_id":31,"lat":25.69301,"lng":100.159421,"address":"大理白族自治州大理市古城护国路","location_name":null,"blat":25.6989459991,"blng":100.1659255803,"youji_lat":25.69301,"youji_lng":100.159421,"youji_poi_id":6516,"youji_poi_name":"大理洋人街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2330,"visit_tip":"1小时","address":"云南大理市大理古城护国路","topic":"洋人街：感受摇滚嬉皮文化","introduce":"洋人街因曾是外国游客在大理的集散地而得名，街上每天都有很多在街边弹着吉他唱歌的歌者，一群当今中国独立音乐的标志性人物都在往大理的路上赶，使这里形成了独特的摇滚嬉皮文化。 洋人街原名\u201c护国路\u201d，位于大理古城内，是一条东西向，长约1公里的青石板路。在大理古城内护国路和复兴路的交叉口，可以看到一座牌坊，上面刻着\u201c洋人街\u201d三个字，很容易找到，很多游人在牌坊这里拍照留念。 到了晚上，街上的酒吧开始营业，此时的洋人街尤为热闹，最出名的要数唐朝酒吧。沿街有中西风味餐厅、珠宝店、古董店、扎染店、画廊等许多小店，出售白族特色小吃和纪念品，可一路吃吃逛逛，只是价格偏高。","time_cost":60,"wishes_count":8931,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":78641,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/12329.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大理洋人街","name_en":"","name_pinyin":"yang ren jie","business_id":12329,"poi_type":"SIGHT","district_id":31,"lat":25.69301,"lng":100.159421,"address":"大理白族自治州大理市古城护国路","location_name":null,"blat":25.6989459991,"blng":100.1659255803,"youji_lat":25.69301,"youji_lng":100.159421,"youji_poi_id":6516,"youji_poi_name":"大理洋人街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":510,"topic":"大理古城"}],"photo":{"width":1000,"height":600,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2330/48fa8067ece768a316cc6e549177daec.jpg?imageMogr2/crop/!1000x600a0a62/thumbnail/800"}}}]},{"id":519324,"plan_id":111814,"position":4,"description":"最后一日游览以双廊为主的洱海东岸及洱海三岛。早起搭的士前往大理才村码头，乘船游览小普陀和南诏风情岛。下船后租电动车从双廊骑行至挖色，这一段路是洱海湖畔最美的地方，可以细细欣赏。傍晚返回双廊，住一晚玉几岛上的海景客栈吧。","points":[{"id":1192669,"position":0,"time_cost":120,"is_custom":false,"poi":{"id":10520883,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/144952.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"才村码头","name_en":"Caicun shipside","name_pinyin":"cai cun ma tou","business_id":144952,"poi_type":"SIGHT","district_id":31,"lat":25.718834,"lng":100.193663,"address":"大理市大理镇的大理古城东边才村","location_name":null,"blat":25.7251377106,"blng":100.2002195307,"youji_lat":25.718834,"youji_lng":100.193663,"youji_poi_id":8620,"youji_poi_name":"才村码头","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2407,"visit_tip":"2-3小时","address":"云南省大理白族自治州大理市才村码头","topic":"乘船游览清澈洱海","introduce":"到洱海游玩，乘船游湖是必做之事。作为大理自然景观的精华所在，洱海的湖水清澈透底，泛舟湖上犹如穿行在碧绿玻璃表面，可以轻易望到湖底的植被与鱼群，配合远处巍巍苍山，美得令人窒息。 洱海是云南省第二大淡水湖，因外形很像人耳而得名。除了乘船游湖外，自行车环湖也是体验洱海风情的好方法。你可以从古城悠闲的骑出来，晚上住在洱海湖畔，遥望著名的\u201c洱海月\u201d，用两天时间悠闲环湖。 泛舟游湖，还可以登上洱海三岛游玩一番。南诏风情岛上有全球最高的汉白玉观音像，还可以体验白族独特的待客礼仪\u201c三道茶\u201d；玉几岛聚集了知名舞蹈家、艺术家开设的私家客栈；小普陀岛迷你精致，将山水点缀的十分生动。","time_cost":120,"wishes_count":12148,"icon_type":2,"price":0,"user_activities_count":4,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":10520883,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/144952.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"才村码头","name_en":"Caicun shipside","name_pinyin":"cai cun ma tou","business_id":144952,"poi_type":"SIGHT","district_id":31,"lat":25.718834,"lng":100.193663,"address":"大理市大理镇的大理古城东边才村","location_name":null,"blat":25.7251377106,"blng":100.2002195307,"youji_lat":25.718834,"youji_lng":100.193663,"youji_poi_id":8620,"youji_poi_name":"才村码头","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":512,"topic":"洱海"}],"photo":{"width":1280,"height":767,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2407/4978c219fa5b0f0af18f6026df019ba0.jpg?imageMogr2/crop/!1280x767a0a73/thumbnail/800"}}},{"id":1192670,"position":1,"time_cost":15,"is_custom":false,"poi":{"id":76390,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/4360.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"小普陀岛","name_en":"","name_pinyin":"xiao pu tuo","business_id":4360,"poi_type":"SIGHT","district_id":31,"lat":25.807474,"lng":100.222877,"address":"大理白族自治州挖色镇海印村","location_name":null,"blat":25.813583374,"blng":100.2293566795,"youji_lat":25.807474,"youji_lng":100.222877,"youji_poi_id":6534,"youji_poi_name":"小普陀岛","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3178,"visit_tip":"半小时","address":"云南省大理白族自治州大理市小普陀","topic":"小普陀：观音镇海印章","introduce":"小普陀是洱海中的一块孤零零的礁石，这块礁型如方印，相传是观音大士留下的镇海之印。岛礁不过50米方圆，但名气很大，上面建设了一间供奉观音的楼阁，成为了洱海的一种象征，往来游人大多都要上岛一观。 传说洱海里面原来有很多蛟龙，常常掀起狂风恶浪，这块礁石就是观音菩萨用来镇住蛟龙的大印。在明朝崇祯年间，附近的渔民捐资在岛上修建了一座楼阁，在里面供奉了观音菩萨的塑像，百姓就称为观音阁。","time_cost":15,"wishes_count":7502,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":76390,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/4360.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"小普陀岛","name_en":"","name_pinyin":"xiao pu tuo","business_id":4360,"poi_type":"SIGHT","district_id":31,"lat":25.807474,"lng":100.222877,"address":"大理白族自治州挖色镇海印村","location_name":null,"blat":25.813583374,"blng":100.2293566795,"youji_lat":25.807474,"youji_lng":100.222877,"youji_poi_id":6534,"youji_poi_name":"小普陀岛","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":512,"topic":"洱海"}],"photo":{"width":3648,"height":2188,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3178/e0b99637f893db97b5c3861ce0624e45.jpg?imageMogr2/crop/!3648x2188a0a205/thumbnail/800"}}},{"id":1192671,"position":2,"time_cost":60,"is_custom":false,"poi":{"id":78637,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/12322.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"南诏风情岛","name_en":"","name_pinyin":"nan zhao feng qing dao","business_id":12322,"poi_type":"SIGHT","district_id":120045,"lat":25.9021,"lng":100.191002,"address":"大理市双廊镇大建旁村","location_name":null,"blat":25.9083499908,"blng":100.1973713461,"youji_lat":25.9021,"youji_lng":100.191002,"youji_poi_id":7182,"youji_poi_name":"南诏风情岛","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3174,"visit_tip":"1小时","address":"云南大理洱海南诏风情岛","topic":"南诏风情岛：最高汉白玉观音像","introduce":"南诏风情岛位于洱海双廊正对的湖中，以极具南诏文化特色的石雕、石景闻名。岛上矗立着一座约15米高的观音像，号称是全球最高汉白玉观音像。石像仿制南诏时期的阿嵯耶观音造像，与汉传寺庙中的观音像截然不同。 除了阿嵯耶观音像之外，南诏风情岛上还有不少其他南诏特色石雕，如沙壹母群雕、太湖石景群落、海的儿女等。另外，岛上有不少风格各异的客栈，入住后可以在渔村里看民族歌舞表演，品品白族三道茶，领略浓郁的民俗风情。","time_cost":60,"wishes_count":7409,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":78637,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/12322.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"南诏风情岛","name_en":"","name_pinyin":"nan zhao feng qing dao","business_id":12322,"poi_type":"SIGHT","district_id":120045,"lat":25.9021,"lng":100.191002,"address":"大理市双廊镇大建旁村","location_name":null,"blat":25.9083499908,"blng":100.1973713461,"youji_lat":25.9021,"youji_lng":100.191002,"youji_poi_id":7182,"youji_poi_name":"南诏风情岛","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":512,"topic":"洱海"}],"photo":{"width":956,"height":573,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3174/38a892695e6e1474893e58f12c001eba.jpg?imageMogr2/crop/!956x573a348a0/thumbnail/800"}}},{"id":1192672,"position":3,"time_cost":0,"is_custom":false,"poi":{"id":78637,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/12322.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"南诏风情岛","name_en":"","name_pinyin":"nan zhao feng qing dao","business_id":12322,"poi_type":"SIGHT","district_id":120045,"lat":25.9021,"lng":100.191002,"address":"大理市双廊镇大建旁村","location_name":null,"blat":25.9083499908,"blng":100.1973713461,"youji_lat":25.9021,"youji_lng":100.191002,"youji_poi_id":7182,"youji_poi_name":"南诏风情岛","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3113,"visit_tip":"","address":"云南大理市洱海南诏风情岛","topic":"三道茶：白族最高待客礼仪","introduce":"三道茶是云南白族招待贵宾时的一种饮茶方式，具有\u201c头苦、二甜、三回味\u201d的特点。作为白族最高的待客礼仪，三道茶不仅仪式感浓重，还蕴含着\u201c先苦后甜、不忘自省\u201d的人生哲理。 第一道茶，称为\u201c苦茶\u201d。因白族人讲究\u201c酒满敬人，茶满欺人\u201d，所以这道茶只有小半杯，不以冲喝为目的，以小口品饮，在舌尖上回味茶的苦凉清香为趣。 第二道茶，称为\u201c甜茶\u201d，是用大理特产乳扇、核桃仁和红糖为佐料，冲入清淡的茶水制作而成。此道茶甜而不腻，所用茶杯大若小碗，客人可以痛快地喝个够。 第三道茶，称为\u201c回味茶\u201d，是用蜂蜜加少许花椒、姜、桂皮为作料，冲茶煎制而成。此道茶甜蜜中带有麻辣味，喝后回味无穷。因姜在白语中有富贵之意，所以此道茶表达了主人对客人的祝福。","time_cost":0,"wishes_count":8227,"icon_type":0,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":78637,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/12322.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"南诏风情岛","name_en":"","name_pinyin":"nan zhao feng qing dao","business_id":12322,"poi_type":"SIGHT","district_id":120045,"lat":25.9021,"lng":100.191002,"address":"大理市双廊镇大建旁村","location_name":null,"blat":25.9083499908,"blng":100.1973713461,"youji_lat":25.9021,"youji_lng":100.191002,"youji_poi_id":7182,"youji_poi_name":"南诏风情岛","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":513,"topic":"特色美食"}],"photo":{"width":640,"height":383,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3113/221f5ba5c92b4d632c2140a32b6b5051.jpg?imageMogr2/crop/!640x383a0a32/thumbnail/800"}}},{"id":1192673,"position":4,"time_cost":120,"is_custom":false,"poi":{"id":13853754,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/1478242.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"挖色镇","name_en":"","name_pinyin":"wa se zhen","business_id":1478242,"poi_type":"SIGHT","district_id":31,"lat":25.828952,"lng":100.226618,"address":"大理白族自治州大理市洱海东岸","location_name":null,"blat":25.8350105286,"blng":100.2331236882,"youji_lat":25.827801,"youji_lng":100.225998,"youji_poi_id":8613,"youji_poi_name":"挖色镇","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2824,"visit_tip":"2小时","address":"云南大理市挖色镇","topic":"挖色：最美苍洱风光","introduce":"位于洱海东岸的挖色镇，是观赏苍洱风光的最佳之地。沿着双廊前往挖色的公路一路走来，近处是清澈见底的洱海，远处是连绵雄奇的苍山，天气好时还可以看到海天一色、湖面如镜的美景。 除了美丽风光外，挖色也是白族真古建筑最多的地方。挖色白族门楼多为清末民初所建，属于典型的海东建筑特色。本地建筑凡三坊院均设照壁，洁白的照壁上绘有精细美丽的纹饰，具有聚光透气的作用。","time_cost":120,"wishes_count":10104,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":13853754,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/1478242.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"挖色镇","name_en":"","name_pinyin":"wa se zhen","business_id":1478242,"poi_type":"SIGHT","district_id":31,"lat":25.828952,"lng":100.226618,"address":"大理白族自治州大理市洱海东岸","location_name":null,"blat":25.8350105286,"blng":100.2331236882,"youji_lat":25.827801,"youji_lng":100.225998,"youji_poi_id":8613,"youji_poi_name":"挖色镇","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":401,"topic":"周边古镇"},{"id":512,"topic":"洱海"}],"photo":{"width":670,"height":402,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2824/21d8455dcecd85eb8d3d0bf0638b587f.jpg?imageMogr2/crop/!670x402a49a0/thumbnail/800"}}},{"id":1192674,"position":5,"time_cost":120,"is_custom":false,"poi":{"id":10532874,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/4365.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"双廊","name_en":"","name_pinyin":"shuang lang","business_id":4365,"poi_type":"SIGHT","district_id":120045,"lat":25.90968,"lng":100.193781,"address":"大理白族自治州大理市双廊镇（洱海东岸）","location_name":null,"blat":25.9159622192,"blng":100.2001973941,"youji_lat":25.913401,"youji_lng":100.195,"youji_poi_id":7179,"youji_poi_name":"双廊","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2408,"visit_tip":"2-3小时","address":"大理白族自治州大理市双廊镇","topic":"双廊：住湖畔酒店晒太阳发呆","introduce":"双廊坐落在大理洱海边，拥有\u201c风、花、雪、月\u201d妙景，以无敌湖景而闻名。双廊的好客栈数不胜数，早晨推开窗就能感受到面朝大海，春暖花开的景象。住在双廊，每天晒晒太阳发发呆，享受最美好的慢生活。 双廊镇位于洱海东北岸，因紧靠碧波荡漾的洱海，并可远眺苍山十九峰，故有\u201c大理风光在苍洱，苍洱风光在双廊\u201d的美誉。在双廊，阳光透过云层，折射在湖水上，形成了\u201c洱海神光\u201d，是摄友们最想捕抓的画面。","time_cost":120,"wishes_count":11884,"icon_type":2,"price":0,"user_activities_count":21,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":10532874,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/4365.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"双廊","name_en":"","name_pinyin":"shuang lang","business_id":4365,"poi_type":"SIGHT","district_id":120045,"lat":25.90968,"lng":100.193781,"address":"大理白族自治州大理市双廊镇（洱海东岸）","location_name":null,"blat":25.9159622192,"blng":100.2001973941,"youji_lat":25.913401,"youji_lng":100.195,"youji_poi_id":7179,"youji_poi_name":"双廊","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":401,"topic":"周边古镇"},{"id":512,"topic":"洱海"}],"photo":{"width":1239,"height":743,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2408/f9cbb3c6bb839a3d0b7aba947ca80513.jpg?imageMogr2/crop/!1239x743a29a213/thumbnail/800"}}},{"id":1192675,"position":6,"time_cost":30,"is_custom":false,"poi":{"id":91334,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/109778.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"玉几岛","name_en":"","name_pinyin":"yu ji dao","business_id":109778,"poi_type":"SIGHT","district_id":31,"lat":25.906253,"lng":100.191275,"address":"大理市双廊镇双廊村环海路","location_name":null,"blat":25.9126167297,"blng":100.1969554402,"youji_lat":25.906253,"youji_lng":100.191275,"youji_poi_id":8622,"youji_poi_name":"玉几岛","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3175,"visit_tip":"半小时","address":"大理市双廊镇玉几岛","topic":"玉几岛：名流私人客栈扎堆","introduce":"玉几岛与双廊镇相连，是洱海中的一座小小半岛。岛上风景优美，众多名人纷纷来此开私人客栈，其中最著名的要数舞蹈家杨丽萍的\u201c太阳宫\u201d，以及白族画家赵青的\u201c青庐\u201d。这些私人客栈多采用邀请制，即使有钱也未必住得进去。 玉几岛上有保存完好的千年古渔村白族民居，极富渔家文化特色，还是《五朵金花的儿女们》、《洱海月》等电影的拍摄地。站在玉几岛上，远眺苍山十九峰，近观岛曲秀丽景色，俯视洱海碧水清波，实在令人心旷神怡。","time_cost":30,"wishes_count":7517,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":91334,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/109778.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"玉几岛","name_en":"","name_pinyin":"yu ji dao","business_id":109778,"poi_type":"SIGHT","district_id":31,"lat":25.906253,"lng":100.191275,"address":"大理市双廊镇双廊村环海路","location_name":null,"blat":25.9126167297,"blng":100.1969554402,"youji_lat":25.906253,"youji_lng":100.191275,"youji_poi_id":8622,"youji_poi_name":"玉几岛","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":512,"topic":"洱海"}],"photo":{"width":640,"height":383,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3175/a12051bacd81310c9c868f3a836ab8e9.jpg?imageMogr2/crop/!640x383a0a16/thumbnail/800"}}}]}]}
     */

    private String message;
    private int status;
    /**
     * id : 111814
     * destination_id : 109
     * created_at : 2016-04-23T09:46:48.000Z
     * plan_day_points_count : 0
     * official : true
     * photo_id : 441970
     * title : 丽江+大理经典4日游
     * score : 0
     * published : true
     * mixed : false
     * photo : {"id":441970,"width":768,"height":687,"url":"http://inspiration.chanyouji.cn/Plan/111814/6799893f7d5aabaa068517e3196708b1.jpg","file_size":361500,"photo_url":"http://inspiration.chanyouji.cn/Plan/111814/6799893f7d5aabaa068517e3196708b1.jpg"}
     * destination : {"id":109,"lat":25.0454006195,"lng":102.7099990845,"district_id":100007,"parent_id":5,"name":"云南","name_en":"Yunnan","name_pinyin":"yun nan|yn","score":1165,"level":3,"path":".1.5.109.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg","title":"","description":"","tip":"最新云南游玩指南，含徒步、租车自驾及美食购物等攻略","time_cost":"","wiki_page_id":null,"has_airport":false,"visit_tip":"","is_top_destination":true,"is_in_grouping":false,"alias_name":null,"travel_tip":null,"photo":{"id":66760,"width":1192,"height":1067,"url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg","file_size":1088794,"photo_url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg"}}
     * days : [{"id":519315,"plan_id":111814,"position":1,"description":"丽江和大理是云南最重要的两大旅行地，适合用4天时间紧凑的游览一遍，既可以闲逛风情独特的丽江、大理古城，也可以欣赏玉龙雪山、洱海的绝美风光。 #第一天行程# 今日来一场悠闲的丽江古城漫步游，感受最柔软舒适的古城时光吧。不大的丽江古城中，包含着纳西族皇宫木府、开满小吃铺子的四方街、灯火酒绿的艳遇酒吧等各种元素。","points":[{"id":1159238,"position":0,"time_cost":30,"is_custom":false,"poi":{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2628,"visit_tip":"半小时","address":"丽江市古城区大研古镇北入口","topic":"和大水车合影留念","introduce":"走进丽江古城北门，一大一小两架水车便映入眼帘。这两驾连轴大水车是古城的标志性建筑，也是古城内最人声鼎沸的地方，一年四季都挤满了留影和集合的游客，想要单独和水车合影一张必须眼尖手快。 大水车前的石桥上，是拍摄水车的最佳地点。若是春天的傍晚前来，夕阳穿过水车，照射在一旁刻有江泽民题词的照壁上，碧绿的垂柳被微风拂动，潺潺的流水反射着碎金般的阳光，是大水车最美的一面。","time_cost":30,"wishes_count":9058,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":3100,"height":1859,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2628/a91ffe19de19dfad741e65c15f1861b0.jpg?imageMogr2/crop/!3100x1859a0a141/thumbnail/800"}}},{"id":1159239,"position":1,"time_cost":30,"is_custom":false,"poi":{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2617,"visit_tip":"半小时","address":"云南丽江市大研古城四方街","topic":"逛四方街品尝纳西美食","introduce":"丽江虽然不以美食而著称，但是却有很多有纳西族代表性的特色小吃，这其中以鸡豆凉粉、纳西烤鱼、丽江粑粑等最受欢迎。走在丽江古城的四方街上，短短的街道上有数十家小吃店，让你一次吃遍各种纳西小吃。 除了小吃外，丽江特色火锅也非常出名，以腊排骨火锅、洋芋鸡火锅、黑山羊火锅、菌类火锅等最美味。丽江的火锅有招牌蘸水，最好可以放一些薄荷涮在肉锅里，肉会带有清新的香味，薄荷混了肉味，非常好吃。 若要想吃正宗纳西菜，比较具有代表性的有三叠水和八大碗。\u201c三叠水\u201d是纳西人的最高礼仪，按所上菜看的口味分三次上席；\u201c八大碗\u201d则是纳西族传统的年夜饭，以八种各有寓意的菜式致以美好祝福。","time_cost":30,"wishes_count":10132,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2299/f4a2239dcadaf5104dc430cd339ad0c0.jpg?imageMogr2/crop/!1600x959a0a54/thumbnail/800"}}},{"id":1159240,"position":2,"time_cost":30,"is_custom":false,"poi":{"id":10543884,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128246.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"狮子山","name_en":"","name_pinyin":"shi zi shan gong yuan","business_id":128246,"poi_type":"SIGHT","district_id":32,"lat":26.871291,"lng":100.231285,"address":"丽江市古城区新华街","location_name":null,"blat":26.8772544861,"blng":100.237780896,"youji_lat":26.871291,"youji_lng":100.231285,"youji_poi_id":6400,"youji_poi_name":"狮子山","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2286,"visit_tip":"半小时","address":"丽江市古城区新华街狮子山公园","topic":"登狮子山俯瞰丽江古城全景","introduce":"丽江古城西侧的狮子山顶，是观赏丽江古城全景的最佳去处，可北望玉龙雪山，东俯丽江古城，西瞰丽江新城，南眺田园风光。晚上在狮子山俯瞰丽江，月色下在万家灯火装点下的古城更是流光溢彩，璀璨动人。 狮子山因山体宛如一头睡卧的狮子而得名，山顶坐落着极富建筑特色的万古楼，是丽江城内的制高点。公园南端有始建于乾隆十九年的白马龙潭寺，寺东有一泓清澈见底的潭水，被纳西人民奉为神泉。","time_cost":30,"wishes_count":10002,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":10543884,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128246.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"狮子山","name_en":"","name_pinyin":"shi zi shan gong yuan","business_id":128246,"poi_type":"SIGHT","district_id":32,"lat":26.871291,"lng":100.231285,"address":"丽江市古城区新华街","location_name":null,"blat":26.8772544861,"blng":100.237780896,"youji_lat":26.871291,"youji_lng":100.231285,"youji_poi_id":6400,"youji_poi_name":"狮子山","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2286/962cf8d20eb94a5908c45e399fba2a80.jpg?imageMogr2/crop/!1600x959a0a61/thumbnail/800"}}},{"id":1159241,"position":3,"time_cost":60,"is_custom":false,"poi":{"id":78639,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12325.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"木府","name_en":"","name_pinyin":"mu fu","business_id":12325,"poi_type":"SIGHT","district_id":32,"lat":26.869557,"lng":100.234204,"address":"丽江市古城区大研镇光义街官院巷49号 \u200e","location_name":null,"blat":26.8755760193,"blng":100.2405288786,"youji_lat":26.869557,"youji_lng":100.234204,"youji_poi_id":6396,"youji_poi_name":"木府","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2612,"visit_tip":"1小时","address":"丽江市古城区大研镇光义街官院巷49号","topic":"木府：精致雄伟的丽江王府","introduce":"丽江古城内的木府，是历代丽江木氏土司的王府。土司府在保持了中原建筑风格的基础上，添加了白族和纳西族的工艺，建筑精美而宏大，蔚为壮观，难怪徐霞客当年在木府门外慨叹：\u201c宫室之丽，拟于王者\u201d。 木府虽是土司王府，但宫室之瑰丽，不逊皇家，据说当年既是\u201c仿紫禁城而建\u201d，鼎盛时期，有宫舍100多间。府内中轴线上建有忠义牌坊、木牌坊、议事厅、万卷楼等建筑，高低错落，气势磅礴。 木府历经几百年的辉煌，大部分毁于清末的战火中，目前所见的绝大多数是1999年重建而成。虽是重建，但不妨碍其成为丽江古城内的代表性建筑。电视连续剧《木府风云》、《钱王》都是在这里拍摄的。","time_cost":60,"wishes_count":9281,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":78639,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12325.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"木府","name_en":"","name_pinyin":"mu fu","business_id":12325,"poi_type":"SIGHT","district_id":32,"lat":26.869557,"lng":100.234204,"address":"丽江市古城区大研镇光义街官院巷49号 \u200e","location_name":null,"blat":26.8755760193,"blng":100.2405288786,"youji_lat":26.869557,"youji_lng":100.234204,"youji_poi_id":6396,"youji_poi_name":"木府","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2612/f2129eeb0a93826ad76f3a83addabdd3.jpg?imageMogr2/crop/!1600x959a0a110/thumbnail/800"}}},{"id":1159242,"position":4,"time_cost":30,"is_custom":false,"poi":{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2774,"visit_tip":"半小时","address":"云南丽江市大研古城四方街","topic":"跳一次纳西广场舞","introduce":"每逢节庆日，丽江的纳西族的小伙子都要面对玉龙雪山，敲着\u201c东巴鼓\u201d，跳起欢快的东巴舞。如今在四方街上，几乎每天都有穿着民族服饰欢快起舞的纳西族，和他们一起跳一次广场舞，绝对会是难得的体验。 东巴舞是纳西族东巴文化的重要组成部分，一般运用于宗教祭祀活动中。东巴舞来源于古代纳西的社会生活，不少动作都是模拟各种动物的动作来进行的，形象十分生动。","time_cost":30,"wishes_count":7792,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":640,"height":384,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2774/b981f042f97f88922712b9e2d2e489a3.jpg?imageMogr2/crop/!640x384a0a149/thumbnail/800"}}},{"id":1159243,"position":5,"time_cost":0,"is_custom":false,"poi":{"id":16955515,"h5_url":"http://m.ctrip.com/webapp/you/foods/32/8589047.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"江湖酒吧","name_en":"","name_pinyin":"JIANG HU JIU BA","business_id":8589047,"poi_type":"RESTAURANT","district_id":32,"lat":26.870921,"lng":100.239741,"address":"古城区五一街王家庄巷41号","location_name":null,"blat":26.8767719269,"blng":100.2462710821,"youji_lat":26.870921,"youji_lng":100.239741,"youji_poi_id":171072,"youji_poi_name":"江湖酒吧","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2659,"visit_tip":"","address":"古城区五一街王家庄巷41号","topic":"泡一泡丽江酒吧","introduce":"如果说白天的丽江古城是民俗与美景的结合，那么夜幕降临后的丽江则不负其\u201c艳遇之都\u201d的美誉。古城内大大小小的酒吧纷纷开张，在鲜艳的霓虹灯下，素不相识的人们聚在一起，饮酒作乐。 丽江城内酒吧众多，最具特色的当属火塘酒吧了。火塘是藏区家中生火取暖、聚会的地方，一年365天都不会熄灭。在火塘酒吧中，歌手和客人围坐在火塘周边，自弹自唱、谈天说地、其乐融融。 江湖酒吧是丽江最热门的火塘音乐酒吧，也是音乐爱好者们在丽江的聚集点之一。江湖酒吧的主唱小松声音穿透力很强，伴随着让人回味无穷的音乐声，不大的酒吧中男男女女围着一个大火塘谈笑风生，十分惬意。","time_cost":0,"wishes_count":9456,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":16955515,"h5_url":"http://m.ctrip.com/webapp/you/foods/32/8589047.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"江湖酒吧","name_en":"","name_pinyin":"JIANG HU JIU BA","business_id":8589047,"poi_type":"RESTAURANT","district_id":32,"lat":26.870921,"lng":100.239741,"address":"古城区五一街王家庄巷41号","location_name":null,"blat":26.8767719269,"blng":100.2462710821,"youji_lat":26.870921,"youji_lng":100.239741,"youji_poi_id":171072,"youji_poi_name":"江湖酒吧","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1280,"height":767,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2323/f8a55533b79eef5686a3f20b5d5267a0.jpg?imageMogr2/crop/!1280x767a0a192/thumbnail/800"}}}]},{"id":519319,"plan_id":111814,"position":2,"description":"丽江城北的玉龙雪山是纳西族心中的神山，可以从丽江乘班车前往。这里景观丰富，你可以上山欣赏高海拔冰川的瑰丽景象，也可以在山腰欣赏蓝月谷的碧水、云杉坪的参天古木。除了自然景观外，蓝月谷每天中午都会上演的《印象丽江》舞台剧也不可错过。","points":[{"id":1159264,"position":0,"time_cost":180,"is_custom":false,"poi":{"id":10543840,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128202.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"玉龙冰川公园","name_en":"","name_pinyin":"bing chuan gong yuan","business_id":128202,"poi_type":"SIGHT","district_id":32,"lat":27.101439,"lng":100.177116,"address":"丽江市玉龙纳西族自治县玉龙雪山景区","location_name":null,"blat":27.1249198914,"blng":100.210635235,"youji_lat":27.101439,"youji_lng":100.177116,"youji_poi_id":166506,"youji_poi_name":"玉龙冰川公园","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2224,"visit_tip":"2-3小时","address":"云南省丽江市玉龙纳西族自治县玉龙雪山","topic":"登玉龙雪山近距离观赏冰川","introduce":"位于丽江古城旁的玉龙雪山，是北半球纬度最低的雪山，山上发育着19条冰川，远望如同一片瀑布悬挂于山顶，在阳光的照耀下泛着银光。乘坐大索道前往山腰，沿着山间栈道就可以近距离观赏冰川。 玉龙雪山上的冰川公园是玉龙雪山的主峰扇子陡东北坡一片平缓坡地，白色的山体即磅礴壮观又洁白清秀。这里秋冬春三季白雪茫茫，但到了夏季时，形成于四万多年前的白水一号冰川则裸露在外，游客可以近距离观察。","time_cost":180,"wishes_count":9621,"icon_type":2,"price":0,"user_activities_count":14,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":10543840,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128202.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"玉龙冰川公园","name_en":"","name_pinyin":"bing chuan gong yuan","business_id":128202,"poi_type":"SIGHT","district_id":32,"lat":27.101439,"lng":100.177116,"address":"丽江市玉龙纳西族自治县玉龙雪山景区","location_name":null,"blat":27.1249198914,"blng":100.210635235,"youji_lat":27.101439,"youji_lng":100.177116,"youji_poi_id":166506,"youji_poi_name":"玉龙冰川公园","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":1183,"topic":"玉龙雪山"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2224/a5f8208fb10f4388e415e489c710a056.jpg?imageMogr2/crop/!1600x959a0a190/thumbnail/800"}}},{"id":1159265,"position":1,"time_cost":120,"is_custom":false,"poi":{"id":10758688,"h5_url":"http://m.ctrip.com/webapp/you/resort/32/109868.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"印象丽江","name_en":"","name_pinyin":"yin xiang li jiang","business_id":109868,"poi_type":"ENTERTAINMENT","district_id":32,"lat":27.097406,"lng":100.258437,"address":"丽江市玉龙雪山景区甘海子蓝月谷剧场","location_name":null,"blat":27.1031074524,"blng":100.2650088911,"youji_lat":27.097406,"youji_lng":100.258437,"youji_poi_id":6394,"youji_poi_name":"印象丽江","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2273,"visit_tip":"2小时","address":"云南丽江玉龙雪山甘海子蓝月谷剧场","topic":"看一场《印象丽江》","introduce":"《印象丽江》是张艺谋导演的大型实景舞台剧，将云南少数民族的生活、耕种、爱情、狩猎、欢庆、行商等各种元素，用艺术的形式展现在人们的眼前，全视角的呈现了东巴文化的风貌。 《印象丽江》的演员大部分都是当地居民，演出在海拔3100米的玉龙雪山甘海子蓝月谷剧场露天舞台举行，用最淳朴的演员与最真实的场景，展示出丽江原住民对天地、山川的感情。 整个表演一气呵成，搭配蓝天白云雪山的真实背景，让人仿佛置身于其中。在震撼的背景音乐里，你能触及到纳西族人生命里的顽强与不息；回荡在雪山上的情歌，让你感受纳西族青年男女那纯净的爱情。","time_cost":120,"wishes_count":8819,"icon_type":2,"price":0,"user_activities_count":5,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":10758688,"h5_url":"http://m.ctrip.com/webapp/you/resort/32/109868.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"印象丽江","name_en":"","name_pinyin":"yin xiang li jiang","business_id":109868,"poi_type":"ENTERTAINMENT","district_id":32,"lat":27.097406,"lng":100.258437,"address":"丽江市玉龙雪山景区甘海子蓝月谷剧场","location_name":null,"blat":27.1031074524,"blng":100.2650088911,"youji_lat":27.097406,"youji_lng":100.258437,"youji_poi_id":6394,"youji_poi_name":"印象丽江","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":350,"topic":"必做之事"},{"id":1183,"topic":"玉龙雪山"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2273/7c16fcd3f9f4e54d7010e38a7c978992.jpg?imageMogr2/crop/!1600x959a0a131/thumbnail/800"}}},{"id":1159266,"position":2,"time_cost":60,"is_custom":false,"poi":{"id":91410,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/109863.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"蓝月谷","name_en":"","name_pinyin":"lan yue gu","business_id":109863,"poi_type":"SIGHT","district_id":32,"lat":27.125834,"lng":100.244685,"address":"丽江市玉龙纳西族自治县玉龙雪山东麓甘海子以北、云杉坪南侧的山谷之中","location_name":null,"blat":27.1316242218,"blng":100.2512473835,"youji_lat":27.125834,"youji_lng":100.244685,"youji_poi_id":6408,"youji_poi_name":"蓝月谷","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2576,"visit_tip":"1-2小时","address":"云南省丽江市玉龙纳西族自治县蓝月谷","topic":"蓝月谷：水色碧蓝小九寨","introduce":"蓝月谷原名\u201c白水河\u201d，每逢晴天，月牙形山谷中的湖水都会呈现出蔚蓝的颜色，因而得名。 蓝月谷被称为\u201c小九寨\u201d，这里的湖光山色虽然比不上九寨沟的绝美和静谧，但在雪山的映衬下也别有一番韵味。 蓝月谷位于玉龙雪山脚下，湖水都是由雪山融水汇聚而成，清澈见底。水中富含钙、铜等金属离子，因此形成了钙华地貌，以及蔚蓝色的池水。谷中的河水受山体阻挡，形成了玉液湖、镜潭湖、蓝月湖等湖泊。","time_cost":60,"wishes_count":8866,"icon_type":2,"price":0,"user_activities_count":11,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":91410,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/109863.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"蓝月谷","name_en":"","name_pinyin":"lan yue gu","business_id":109863,"poi_type":"SIGHT","district_id":32,"lat":27.125834,"lng":100.244685,"address":"丽江市玉龙纳西族自治县玉龙雪山东麓甘海子以北、云杉坪南侧的山谷之中","location_name":null,"blat":27.1316242218,"blng":100.2512473835,"youji_lat":27.125834,"youji_lng":100.244685,"youji_poi_id":6408,"youji_poi_name":"蓝月谷","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":443,"topic":"周边隐秘之地"},{"id":1183,"topic":"玉龙雪山"}],"photo":{"width":3232,"height":1939,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2576/1194c7c350bc66a221551269bd775cc0.jpg?imageMogr2/crop/!3232x1939a0a133/thumbnail/800"}}},{"id":1159267,"position":3,"time_cost":120,"is_custom":false,"poi":{"id":78646,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12467.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"云杉坪","name_en":"","name_pinyin":"yun shan ping","business_id":12467,"poi_type":"SIGHT","district_id":32,"lat":27.126441,"lng":100.244211,"address":"丽江市玉龙纳西族自治县丽玉龙雪山景区内","location_name":"玉龙县","blat":27.1208992004,"blng":100.2253909665,"youji_lat":27.126441,"youji_lng":100.244211,"youji_poi_id":6454,"youji_poi_name":"云杉坪","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":6862,"visit_tip":"2-3小时","address":"云南省丽江市玉龙纳西族自治县玉龙雪山云杉坪","topic":"云杉坪：玉龙雪山最佳拍摄地","introduce":"云杉坪是玉龙雪山山腰上的一片高山草甸，草场周边被高大茂密的云杉林所环抱。在这个海拔3200米的草甸上，可以将玉龙十三峰的壮观景象一览无余，是拍摄雪山的最佳取景点。 云杉坪又名\u201c殉情谷\u201d，传说是以前有很多青年男女在此殉情，因而成为了纳西青年男女心中的爱情圣地。前往云杉坪需要在玉龙雪山景区内乘坐云杉坪索道，穿过茂密繁盛的云杉林之后，便可来到草场。","time_cost":120,"wishes_count":7516,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":78646,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12467.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"云杉坪","name_en":"","name_pinyin":"yun shan ping","business_id":12467,"poi_type":"SIGHT","district_id":32,"lat":27.126441,"lng":100.244211,"address":"丽江市玉龙纳西族自治县丽玉龙雪山景区内","location_name":"玉龙县","blat":27.1208992004,"blng":100.2253909665,"youji_lat":27.126441,"youji_lng":100.244211,"youji_poi_id":6454,"youji_poi_name":"云杉坪","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":1183,"topic":"玉龙雪山"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/6862/0ddc2963f2cab91200cded5f352b91a4.jpg?imageMogr2/crop/!1600x959a0a66/thumbnail/800"}}}]},{"id":519323,"plan_id":111814,"position":3,"description":"今天上午从丽江出发前往大理，可乘坐火车或汽车，约需2小时。下午在古城内逛逛买买，傍晚看崇圣寺三塔的夕阳倒影，晚上回到古城的洋人街泡吧，可以好好感受嬉皮士风情。","points":[{"id":1159384,"position":0,"time_cost":60,"is_custom":false,"poi":{"id":24038580,"h5_url":"http://m.ctrip.com/webapp/you/shops/31/1447781.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"复兴路","name_en":"","name_pinyin":"fu xing lu","business_id":1447781,"poi_type":"SHOP","district_id":31,"lat":25.692144,"lng":100.161598,"address":"大理市复兴路267","location_name":null,"blat":25.6980190277,"blng":100.1681421218,"youji_lat":25.692144,"youji_lng":100.161598,"youji_poi_id":171184,"youji_poi_name":"复兴路","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3086,"visit_tip":"1小时","address":"云南大理市大理古城复兴路","topic":"逛复兴路吃吃买买","introduce":"复兴路由南至北纵贯整个大理古城，是古城内著名的步行街。道路两边都是特色店铺，经营大理石雕刻、民族服饰和大理特色食品等当地特产。花一天时间走在鲜花盛开的复兴路上，一路吃吃买买，是享受大理闲适生活的最佳方式。 在复兴路，不愁挑不到好的手信带回家。文雅一点的，可以购买天然大理石制作的文房四宝、花盆、灯具等工艺品；喜欢打扮的，一条富有民族特色的白族扎染长裙就能满足；爱吃喝的，鲜香浓郁的乳扇、香味独特的沱茶绝对能投其所好。","time_cost":60,"wishes_count":9940,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":24038580,"h5_url":"http://m.ctrip.com/webapp/you/shops/31/1447781.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"复兴路","name_en":"","name_pinyin":"fu xing lu","business_id":1447781,"poi_type":"SHOP","district_id":31,"lat":25.692144,"lng":100.161598,"address":"大理市复兴路267","location_name":null,"blat":25.6980190277,"blng":100.1681421218,"youji_lat":25.692144,"youji_lng":100.161598,"youji_poi_id":171184,"youji_poi_name":"复兴路","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":510,"topic":"大理古城"}],"photo":{"width":5000,"height":2999,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3086/a57fde67f6aeed8500c9be9244460a29.jpg?imageMogr2/crop/!5000x2999a0a188/thumbnail/800"}}},{"id":1159385,"position":1,"time_cost":30,"is_custom":false,"poi":{"id":84213,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/51944.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"五华楼","name_en":"","name_pinyin":"wu hua lou","business_id":51944,"poi_type":"SIGHT","district_id":31,"lat":25.69069,"lng":100.162831,"address":"大理白族自治州大理市玉洱路","location_name":null,"blat":25.6965675354,"blng":100.1693650844,"youji_lat":25.69069,"youji_lng":100.162831,"youji_poi_id":156149,"youji_poi_name":"五华楼","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2328,"visit_tip":"半小时","address":"大理白族自治州大理市玉洱路","topic":"登五华楼俯瞰大理古城全景","introduce":"大理五华楼位于大理古城的中心部位，是古代南诏王的国宾馆，又叫五花楼。因其规模的宏大，在南诏时，被称为\u201c天下第一楼\u201d。作为大理古城的至高点，登上五华楼可以俯瞰大理古城全城和苍山洱海。 五华楼作为国宾馆的历史长达数百年之久。每年三月十六，南诏时期的南诏王以及后来大理国的大理王都会在五华楼会见西南夷各个小国君长，和其他一些重要宾客，赐以酒席佳肴，奏以南诏、大理时期的音乐。","time_cost":30,"wishes_count":8840,"icon_type":2,"price":0,"user_activities_count":4,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":84213,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/51944.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"五华楼","name_en":"","name_pinyin":"wu hua lou","business_id":51944,"poi_type":"SIGHT","district_id":31,"lat":25.69069,"lng":100.162831,"address":"大理白族自治州大理市玉洱路","location_name":null,"blat":25.6965675354,"blng":100.1693650844,"youji_lat":25.69069,"youji_lng":100.162831,"youji_poi_id":156149,"youji_poi_name":"五华楼","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":510,"topic":"大理古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2328/5b4de54354b463db924f383b1a9b959c.jpg?imageMogr2/crop/!1600x959a0a107/thumbnail/800"}}},{"id":1159386,"position":2,"time_cost":60,"is_custom":false,"poi":{"id":13853728,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/1478241.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"人民路","name_en":"","name_pinyin":"ren min lu","business_id":1478241,"poi_type":"SIGHT","district_id":31,"lat":25.69393,"lng":100.164036,"address":"大理白族自治州大理市大理古城内","location_name":null,"blat":25.7010784149,"blng":100.1737493535,"youji_lat":25.69393,"youji_lng":100.164036,"youji_poi_id":162076,"youji_poi_name":"人民路","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3534,"visit_tip":"1-2小时","address":"云南大理市大理古城人民路","topic":"人民路：文艺青年必到","introduce":"人民路是大理古城里的一条非常繁华的步行街，大街两边开满各种店面，外加各种地摊，出售的多是文房四宝、白族手工、蜡染服饰、民族饰品等，是一条十分文艺范儿的街道，深受文艺青年游客的喜爱。 人民路没有洋人街出名，但却开满了众多美食小吃店铺和咖啡店、茶馆。在古城里逛累了，不妨来到人民路，坐在临街馆子里喝喝咖啡品品茶，看大街上川流不息的人群，也是一种别样的享受。","time_cost":60,"wishes_count":9144,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":13853728,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/1478241.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"人民路","name_en":"","name_pinyin":"ren min lu","business_id":1478241,"poi_type":"SIGHT","district_id":31,"lat":25.69393,"lng":100.164036,"address":"大理白族自治州大理市大理古城内","location_name":null,"blat":25.7010784149,"blng":100.1737493535,"youji_lat":25.69393,"youji_lng":100.164036,"youji_poi_id":162076,"youji_poi_name":"人民路","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":510,"topic":"大理古城"}],"photo":{"width":1000,"height":600,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3534/21886dfcbe65d9a6f41263041f157954.jpg?imageMogr2/crop/!1000x600a0a124/thumbnail/800"}}},{"id":1159387,"position":3,"time_cost":60,"is_custom":false,"poi":{"id":75915,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/3037.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"崇圣寺三塔","name_en":"","name_pinyin":"da li chong sheng si san ta","business_id":3037,"poi_type":"SIGHT","district_id":31,"lat":25.7060604095,"lng":100.1493148804,"address":"大理白族自治州大理市古城西北部1.5公里处214国道旁","location_name":null,"blat":25.7117996216,"blng":100.1559019676,"youji_lat":25.705636,"youji_lng":100.148771,"youji_poi_id":6509,"youji_poi_name":"崇圣寺三塔","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2344,"visit_tip":"1-2小时","address":"云南省大理白族自治州大理市崇圣寺三塔公园","topic":"看崇圣寺三塔绝美倒影","introduce":"崇圣寺位于大理古城北1.5公里处，寺内最著名的要数高耸的三座佛塔，已经有上千年的历史。三塔背靠苍山，面临洱海，蓝天白云下塔影倒映在宁静的\u201c三塔聚影池\u201d中，构成一幅绝美的画面。 崇圣寺曾是大理国的皇家寺院，大理国22任皇帝中有9任曾在此出家。这里也是唯一只许愿不还愿的寺庙，大雄宝殿供奉释迦牟尼、地藏王、普贤、文殊、观音，这些你需走遍全国才能拜见的佛像，在这里就能够见齐全。","time_cost":60,"wishes_count":9699,"icon_type":2,"price":0,"user_activities_count":9,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":75915,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/3037.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"崇圣寺三塔","name_en":"","name_pinyin":"da li chong sheng si san ta","business_id":3037,"poi_type":"SIGHT","district_id":31,"lat":25.7060604095,"lng":100.1493148804,"address":"大理白族自治州大理市古城西北部1.5公里处214国道旁","location_name":null,"blat":25.7117996216,"blng":100.1559019676,"youji_lat":25.705636,"youji_lng":100.148771,"youji_poi_id":6509,"youji_poi_name":"崇圣寺三塔","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":510,"topic":"大理古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2344/3dd7d459c11a411895903e2b1a7f1e5a.jpg?imageMogr2/crop/!1600x959a0a64/thumbnail/800"}}},{"id":1159388,"position":4,"time_cost":60,"is_custom":false,"poi":{"id":78641,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/12329.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大理洋人街","name_en":"","name_pinyin":"yang ren jie","business_id":12329,"poi_type":"SIGHT","district_id":31,"lat":25.69301,"lng":100.159421,"address":"大理白族自治州大理市古城护国路","location_name":null,"blat":25.6989459991,"blng":100.1659255803,"youji_lat":25.69301,"youji_lng":100.159421,"youji_poi_id":6516,"youji_poi_name":"大理洋人街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2330,"visit_tip":"1小时","address":"云南大理市大理古城护国路","topic":"洋人街：感受摇滚嬉皮文化","introduce":"洋人街因曾是外国游客在大理的集散地而得名，街上每天都有很多在街边弹着吉他唱歌的歌者，一群当今中国独立音乐的标志性人物都在往大理的路上赶，使这里形成了独特的摇滚嬉皮文化。 洋人街原名\u201c护国路\u201d，位于大理古城内，是一条东西向，长约1公里的青石板路。在大理古城内护国路和复兴路的交叉口，可以看到一座牌坊，上面刻着\u201c洋人街\u201d三个字，很容易找到，很多游人在牌坊这里拍照留念。 到了晚上，街上的酒吧开始营业，此时的洋人街尤为热闹，最出名的要数唐朝酒吧。沿街有中西风味餐厅、珠宝店、古董店、扎染店、画廊等许多小店，出售白族特色小吃和纪念品，可一路吃吃逛逛，只是价格偏高。","time_cost":60,"wishes_count":8931,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":78641,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/12329.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大理洋人街","name_en":"","name_pinyin":"yang ren jie","business_id":12329,"poi_type":"SIGHT","district_id":31,"lat":25.69301,"lng":100.159421,"address":"大理白族自治州大理市古城护国路","location_name":null,"blat":25.6989459991,"blng":100.1659255803,"youji_lat":25.69301,"youji_lng":100.159421,"youji_poi_id":6516,"youji_poi_name":"大理洋人街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":510,"topic":"大理古城"}],"photo":{"width":1000,"height":600,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2330/48fa8067ece768a316cc6e549177daec.jpg?imageMogr2/crop/!1000x600a0a62/thumbnail/800"}}}]},{"id":519324,"plan_id":111814,"position":4,"description":"最后一日游览以双廊为主的洱海东岸及洱海三岛。早起搭的士前往大理才村码头，乘船游览小普陀和南诏风情岛。下船后租电动车从双廊骑行至挖色，这一段路是洱海湖畔最美的地方，可以细细欣赏。傍晚返回双廊，住一晚玉几岛上的海景客栈吧。","points":[{"id":1192669,"position":0,"time_cost":120,"is_custom":false,"poi":{"id":10520883,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/144952.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"才村码头","name_en":"Caicun shipside","name_pinyin":"cai cun ma tou","business_id":144952,"poi_type":"SIGHT","district_id":31,"lat":25.718834,"lng":100.193663,"address":"大理市大理镇的大理古城东边才村","location_name":null,"blat":25.7251377106,"blng":100.2002195307,"youji_lat":25.718834,"youji_lng":100.193663,"youji_poi_id":8620,"youji_poi_name":"才村码头","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2407,"visit_tip":"2-3小时","address":"云南省大理白族自治州大理市才村码头","topic":"乘船游览清澈洱海","introduce":"到洱海游玩，乘船游湖是必做之事。作为大理自然景观的精华所在，洱海的湖水清澈透底，泛舟湖上犹如穿行在碧绿玻璃表面，可以轻易望到湖底的植被与鱼群，配合远处巍巍苍山，美得令人窒息。 洱海是云南省第二大淡水湖，因外形很像人耳而得名。除了乘船游湖外，自行车环湖也是体验洱海风情的好方法。你可以从古城悠闲的骑出来，晚上住在洱海湖畔，遥望著名的\u201c洱海月\u201d，用两天时间悠闲环湖。 泛舟游湖，还可以登上洱海三岛游玩一番。南诏风情岛上有全球最高的汉白玉观音像，还可以体验白族独特的待客礼仪\u201c三道茶\u201d；玉几岛聚集了知名舞蹈家、艺术家开设的私家客栈；小普陀岛迷你精致，将山水点缀的十分生动。","time_cost":120,"wishes_count":12148,"icon_type":2,"price":0,"user_activities_count":4,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":10520883,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/144952.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"才村码头","name_en":"Caicun shipside","name_pinyin":"cai cun ma tou","business_id":144952,"poi_type":"SIGHT","district_id":31,"lat":25.718834,"lng":100.193663,"address":"大理市大理镇的大理古城东边才村","location_name":null,"blat":25.7251377106,"blng":100.2002195307,"youji_lat":25.718834,"youji_lng":100.193663,"youji_poi_id":8620,"youji_poi_name":"才村码头","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":512,"topic":"洱海"}],"photo":{"width":1280,"height":767,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2407/4978c219fa5b0f0af18f6026df019ba0.jpg?imageMogr2/crop/!1280x767a0a73/thumbnail/800"}}},{"id":1192670,"position":1,"time_cost":15,"is_custom":false,"poi":{"id":76390,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/4360.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"小普陀岛","name_en":"","name_pinyin":"xiao pu tuo","business_id":4360,"poi_type":"SIGHT","district_id":31,"lat":25.807474,"lng":100.222877,"address":"大理白族自治州挖色镇海印村","location_name":null,"blat":25.813583374,"blng":100.2293566795,"youji_lat":25.807474,"youji_lng":100.222877,"youji_poi_id":6534,"youji_poi_name":"小普陀岛","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3178,"visit_tip":"半小时","address":"云南省大理白族自治州大理市小普陀","topic":"小普陀：观音镇海印章","introduce":"小普陀是洱海中的一块孤零零的礁石，这块礁型如方印，相传是观音大士留下的镇海之印。岛礁不过50米方圆，但名气很大，上面建设了一间供奉观音的楼阁，成为了洱海的一种象征，往来游人大多都要上岛一观。 传说洱海里面原来有很多蛟龙，常常掀起狂风恶浪，这块礁石就是观音菩萨用来镇住蛟龙的大印。在明朝崇祯年间，附近的渔民捐资在岛上修建了一座楼阁，在里面供奉了观音菩萨的塑像，百姓就称为观音阁。","time_cost":15,"wishes_count":7502,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":76390,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/4360.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"小普陀岛","name_en":"","name_pinyin":"xiao pu tuo","business_id":4360,"poi_type":"SIGHT","district_id":31,"lat":25.807474,"lng":100.222877,"address":"大理白族自治州挖色镇海印村","location_name":null,"blat":25.813583374,"blng":100.2293566795,"youji_lat":25.807474,"youji_lng":100.222877,"youji_poi_id":6534,"youji_poi_name":"小普陀岛","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":512,"topic":"洱海"}],"photo":{"width":3648,"height":2188,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3178/e0b99637f893db97b5c3861ce0624e45.jpg?imageMogr2/crop/!3648x2188a0a205/thumbnail/800"}}},{"id":1192671,"position":2,"time_cost":60,"is_custom":false,"poi":{"id":78637,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/12322.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"南诏风情岛","name_en":"","name_pinyin":"nan zhao feng qing dao","business_id":12322,"poi_type":"SIGHT","district_id":120045,"lat":25.9021,"lng":100.191002,"address":"大理市双廊镇大建旁村","location_name":null,"blat":25.9083499908,"blng":100.1973713461,"youji_lat":25.9021,"youji_lng":100.191002,"youji_poi_id":7182,"youji_poi_name":"南诏风情岛","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3174,"visit_tip":"1小时","address":"云南大理洱海南诏风情岛","topic":"南诏风情岛：最高汉白玉观音像","introduce":"南诏风情岛位于洱海双廊正对的湖中，以极具南诏文化特色的石雕、石景闻名。岛上矗立着一座约15米高的观音像，号称是全球最高汉白玉观音像。石像仿制南诏时期的阿嵯耶观音造像，与汉传寺庙中的观音像截然不同。 除了阿嵯耶观音像之外，南诏风情岛上还有不少其他南诏特色石雕，如沙壹母群雕、太湖石景群落、海的儿女等。另外，岛上有不少风格各异的客栈，入住后可以在渔村里看民族歌舞表演，品品白族三道茶，领略浓郁的民俗风情。","time_cost":60,"wishes_count":7409,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":78637,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/12322.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"南诏风情岛","name_en":"","name_pinyin":"nan zhao feng qing dao","business_id":12322,"poi_type":"SIGHT","district_id":120045,"lat":25.9021,"lng":100.191002,"address":"大理市双廊镇大建旁村","location_name":null,"blat":25.9083499908,"blng":100.1973713461,"youji_lat":25.9021,"youji_lng":100.191002,"youji_poi_id":7182,"youji_poi_name":"南诏风情岛","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":512,"topic":"洱海"}],"photo":{"width":956,"height":573,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3174/38a892695e6e1474893e58f12c001eba.jpg?imageMogr2/crop/!956x573a348a0/thumbnail/800"}}},{"id":1192672,"position":3,"time_cost":0,"is_custom":false,"poi":{"id":78637,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/12322.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"南诏风情岛","name_en":"","name_pinyin":"nan zhao feng qing dao","business_id":12322,"poi_type":"SIGHT","district_id":120045,"lat":25.9021,"lng":100.191002,"address":"大理市双廊镇大建旁村","location_name":null,"blat":25.9083499908,"blng":100.1973713461,"youji_lat":25.9021,"youji_lng":100.191002,"youji_poi_id":7182,"youji_poi_name":"南诏风情岛","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3113,"visit_tip":"","address":"云南大理市洱海南诏风情岛","topic":"三道茶：白族最高待客礼仪","introduce":"三道茶是云南白族招待贵宾时的一种饮茶方式，具有\u201c头苦、二甜、三回味\u201d的特点。作为白族最高的待客礼仪，三道茶不仅仪式感浓重，还蕴含着\u201c先苦后甜、不忘自省\u201d的人生哲理。 第一道茶，称为\u201c苦茶\u201d。因白族人讲究\u201c酒满敬人，茶满欺人\u201d，所以这道茶只有小半杯，不以冲喝为目的，以小口品饮，在舌尖上回味茶的苦凉清香为趣。 第二道茶，称为\u201c甜茶\u201d，是用大理特产乳扇、核桃仁和红糖为佐料，冲入清淡的茶水制作而成。此道茶甜而不腻，所用茶杯大若小碗，客人可以痛快地喝个够。 第三道茶，称为\u201c回味茶\u201d，是用蜂蜜加少许花椒、姜、桂皮为作料，冲茶煎制而成。此道茶甜蜜中带有麻辣味，喝后回味无穷。因姜在白语中有富贵之意，所以此道茶表达了主人对客人的祝福。","time_cost":0,"wishes_count":8227,"icon_type":0,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":78637,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/12322.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"南诏风情岛","name_en":"","name_pinyin":"nan zhao feng qing dao","business_id":12322,"poi_type":"SIGHT","district_id":120045,"lat":25.9021,"lng":100.191002,"address":"大理市双廊镇大建旁村","location_name":null,"blat":25.9083499908,"blng":100.1973713461,"youji_lat":25.9021,"youji_lng":100.191002,"youji_poi_id":7182,"youji_poi_name":"南诏风情岛","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":513,"topic":"特色美食"}],"photo":{"width":640,"height":383,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3113/221f5ba5c92b4d632c2140a32b6b5051.jpg?imageMogr2/crop/!640x383a0a32/thumbnail/800"}}},{"id":1192673,"position":4,"time_cost":120,"is_custom":false,"poi":{"id":13853754,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/1478242.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"挖色镇","name_en":"","name_pinyin":"wa se zhen","business_id":1478242,"poi_type":"SIGHT","district_id":31,"lat":25.828952,"lng":100.226618,"address":"大理白族自治州大理市洱海东岸","location_name":null,"blat":25.8350105286,"blng":100.2331236882,"youji_lat":25.827801,"youji_lng":100.225998,"youji_poi_id":8613,"youji_poi_name":"挖色镇","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2824,"visit_tip":"2小时","address":"云南大理市挖色镇","topic":"挖色：最美苍洱风光","introduce":"位于洱海东岸的挖色镇，是观赏苍洱风光的最佳之地。沿着双廊前往挖色的公路一路走来，近处是清澈见底的洱海，远处是连绵雄奇的苍山，天气好时还可以看到海天一色、湖面如镜的美景。 除了美丽风光外，挖色也是白族真古建筑最多的地方。挖色白族门楼多为清末民初所建，属于典型的海东建筑特色。本地建筑凡三坊院均设照壁，洁白的照壁上绘有精细美丽的纹饰，具有聚光透气的作用。","time_cost":120,"wishes_count":10104,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":13853754,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/1478242.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"挖色镇","name_en":"","name_pinyin":"wa se zhen","business_id":1478242,"poi_type":"SIGHT","district_id":31,"lat":25.828952,"lng":100.226618,"address":"大理白族自治州大理市洱海东岸","location_name":null,"blat":25.8350105286,"blng":100.2331236882,"youji_lat":25.827801,"youji_lng":100.225998,"youji_poi_id":8613,"youji_poi_name":"挖色镇","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":401,"topic":"周边古镇"},{"id":512,"topic":"洱海"}],"photo":{"width":670,"height":402,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2824/21d8455dcecd85eb8d3d0bf0638b587f.jpg?imageMogr2/crop/!670x402a49a0/thumbnail/800"}}},{"id":1192674,"position":5,"time_cost":120,"is_custom":false,"poi":{"id":10532874,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/4365.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"双廊","name_en":"","name_pinyin":"shuang lang","business_id":4365,"poi_type":"SIGHT","district_id":120045,"lat":25.90968,"lng":100.193781,"address":"大理白族自治州大理市双廊镇（洱海东岸）","location_name":null,"blat":25.9159622192,"blng":100.2001973941,"youji_lat":25.913401,"youji_lng":100.195,"youji_poi_id":7179,"youji_poi_name":"双廊","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2408,"visit_tip":"2-3小时","address":"大理白族自治州大理市双廊镇","topic":"双廊：住湖畔酒店晒太阳发呆","introduce":"双廊坐落在大理洱海边，拥有\u201c风、花、雪、月\u201d妙景，以无敌湖景而闻名。双廊的好客栈数不胜数，早晨推开窗就能感受到面朝大海，春暖花开的景象。住在双廊，每天晒晒太阳发发呆，享受最美好的慢生活。 双廊镇位于洱海东北岸，因紧靠碧波荡漾的洱海，并可远眺苍山十九峰，故有\u201c大理风光在苍洱，苍洱风光在双廊\u201d的美誉。在双廊，阳光透过云层，折射在湖水上，形成了\u201c洱海神光\u201d，是摄友们最想捕抓的画面。","time_cost":120,"wishes_count":11884,"icon_type":2,"price":0,"user_activities_count":21,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":10532874,"h5_url":"http://m.ctrip.com/webapp/you/sight/120045/4365.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"双廊","name_en":"","name_pinyin":"shuang lang","business_id":4365,"poi_type":"SIGHT","district_id":120045,"lat":25.90968,"lng":100.193781,"address":"大理白族自治州大理市双廊镇（洱海东岸）","location_name":null,"blat":25.9159622192,"blng":100.2001973941,"youji_lat":25.913401,"youji_lng":100.195,"youji_poi_id":7179,"youji_poi_name":"双廊","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":399,"topic":"必做之事"},{"id":401,"topic":"周边古镇"},{"id":512,"topic":"洱海"}],"photo":{"width":1239,"height":743,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2408/f9cbb3c6bb839a3d0b7aba947ca80513.jpg?imageMogr2/crop/!1239x743a29a213/thumbnail/800"}}},{"id":1192675,"position":6,"time_cost":30,"is_custom":false,"poi":{"id":91334,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/109778.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"玉几岛","name_en":"","name_pinyin":"yu ji dao","business_id":109778,"poi_type":"SIGHT","district_id":31,"lat":25.906253,"lng":100.191275,"address":"大理市双廊镇双廊村环海路","location_name":null,"blat":25.9126167297,"blng":100.1969554402,"youji_lat":25.906253,"youji_lng":100.191275,"youji_poi_id":8622,"youji_poi_name":"玉几岛","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":3175,"visit_tip":"半小时","address":"大理市双廊镇玉几岛","topic":"玉几岛：名流私人客栈扎堆","introduce":"玉几岛与双廊镇相连，是洱海中的一座小小半岛。岛上风景优美，众多名人纷纷来此开私人客栈，其中最著名的要数舞蹈家杨丽萍的\u201c太阳宫\u201d，以及白族画家赵青的\u201c青庐\u201d。这些私人客栈多采用邀请制，即使有钱也未必住得进去。 玉几岛上有保存完好的千年古渔村白族民居，极富渔家文化特色，还是《五朵金花的儿女们》、《洱海月》等电影的拍摄地。站在玉几岛上，远眺苍山十九峰，近观岛曲秀丽景色，俯视洱海碧水清波，实在令人心旷神怡。","time_cost":30,"wishes_count":7517,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":110,"lat":25.6065006256,"lng":100.2679977417,"district_id":31,"parent_id":109,"name":"大理","name_en":"Dali","name_pinyin":"da li|dl","score":90,"level":4,"path":".1.5.109.110.","published":true,"is_in_china":true,"inspiration_activities_count":64,"activity_collections_count":9,"wishes_count":256309,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","title":"云南的文艺度假胜地","description":"大理位于云南省的西北部，东临洱海，西靠苍山，是云南最文艺的度假胜地。在这里，可以逛鲜花遍地的大理古城，去洱海泛舟或者环湖骑行，还可以去风景超美的双廊古镇住一下特色临海酒店。周边还有挖色、沙溪、邓诺等多个古镇可以一同游玩。 春季是前往大理游览的最佳季节，经典行程一般为3天以上，建议每天安排的不要太紧凑，可以悠闲欣赏这里的湖光山色。目前国内只有北京、上海、广州等少数城市可以直飞大理机场，一般可以从昆明转机前往。","tip":"最新大理游玩指南，含特色周边、游洱海、登苍山及美食购物等攻略","time_cost":"","wiki_page_id":18183,"has_airport":true,"visit_tip":"建议游玩3-5天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429256,"width":1280,"height":768,"url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg","file_size":700598,"photo_url":"http://inspiration.chanyouji.cn/Destination/110/a8da4b847348b2d4fd9d6da09af1af1d.jpg"},"wiki_page":{"id":18183,"destination_id":141,"title":"交通指南","category_type":3,"destination":{"id":141,"name_zh_cn":"大理","children_count":0,"name_en":"Dali","image_url":"http://m.chanyouji.cn/destinations/141-landscape.jpg"}}},"pois":[{"id":91334,"h5_url":"http://m.ctrip.com/webapp/you/sight/31/109778.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"玉几岛","name_en":"","name_pinyin":"yu ji dao","business_id":109778,"poi_type":"SIGHT","district_id":31,"lat":25.906253,"lng":100.191275,"address":"大理市双廊镇双廊村环海路","location_name":null,"blat":25.9126167297,"blng":100.1969554402,"youji_lat":25.906253,"youji_lng":100.191275,"youji_poi_id":8622,"youji_poi_name":"玉几岛","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":512,"topic":"洱海"}],"photo":{"width":640,"height":383,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/3175/a12051bacd81310c9c868f3a836ab8e9.jpg?imageMogr2/crop/!640x383a0a16/thumbnail/800"}}}]}]
     */

    private DataBean data;

    public static DaysEntity objectFromData(String str) {

        return new Gson().fromJson(str, DaysEntity.class);
    }

    public static DaysEntity objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), DaysEntity.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<DaysEntity> arrayDaysEntityFromData(String str) {

        Type listType = new TypeToken<ArrayList<DaysEntity>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<DaysEntity> arrayDaysEntityFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<DaysEntity>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        private int id;
        private int destination_id;
        private String created_at;
        private int plan_day_points_count;
        private boolean official;
        private int photo_id;
        private String title;
        private int score;
        private boolean published;
        private boolean mixed;
        /**
         * id : 441970
         * width : 768
         * height : 687
         * url : http://inspiration.chanyouji.cn/Plan/111814/6799893f7d5aabaa068517e3196708b1.jpg
         * file_size : 361500
         * photo_url : http://inspiration.chanyouji.cn/Plan/111814/6799893f7d5aabaa068517e3196708b1.jpg
         */

        private PhotoBean photo;
        /**
         * id : 109
         * lat : 25.0454006195
         * lng : 102.7099990845
         * district_id : 100007
         * parent_id : 5
         * name : 云南
         * name_en : Yunnan
         * name_pinyin : yun nan|yn
         * score : 1165
         * level : 3
         * path : .1.5.109.
         * published : true
         * is_in_china : true
         * inspiration_activities_count : 0
         * activity_collections_count : 0
         * wishes_count : 0
         * wiki_destination_id : null
         * photo_url : http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg
         * title :
         * description :
         * tip : 最新云南游玩指南，含徒步、租车自驾及美食购物等攻略
         * time_cost :
         * wiki_page_id : null
         * has_airport : false
         * visit_tip :
         * is_top_destination : true
         * is_in_grouping : false
         * alias_name : null
         * travel_tip : null
         * photo : {"id":66760,"width":1192,"height":1067,"url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg","file_size":1088794,"photo_url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg"}
         */

        private DestinationBean destination;
        /**
         * id : 519315
         * plan_id : 111814
         * position : 1
         * description : 丽江和大理是云南最重要的两大旅行地，适合用4天时间紧凑的游览一遍，既可以闲逛风情独特的丽江、大理古城，也可以欣赏玉龙雪山、洱海的绝美风光。 #第一天行程# 今日来一场悠闲的丽江古城漫步游，感受最柔软舒适的古城时光吧。不大的丽江古城中，包含着纳西族皇宫木府、开满小吃铺子的四方街、灯火酒绿的艳遇酒吧等各种元素。
         * points : [{"id":1159238,"position":0,"time_cost":30,"is_custom":false,"poi":{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2628,"visit_tip":"半小时","address":"丽江市古城区大研古镇北入口","topic":"和大水车合影留念","introduce":"走进丽江古城北门，一大一小两架水车便映入眼帘。这两驾连轴大水车是古城的标志性建筑，也是古城内最人声鼎沸的地方，一年四季都挤满了留影和集合的游客，想要单独和水车合影一张必须眼尖手快。 大水车前的石桥上，是拍摄水车的最佳地点。若是春天的傍晚前来，夕阳穿过水车，照射在一旁刻有江泽民题词的照壁上，碧绿的垂柳被微风拂动，潺潺的流水反射着碎金般的阳光，是大水车最美的一面。","time_cost":30,"wishes_count":9058,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":3100,"height":1859,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2628/a91ffe19de19dfad741e65c15f1861b0.jpg?imageMogr2/crop/!3100x1859a0a141/thumbnail/800"}}},{"id":1159239,"position":1,"time_cost":30,"is_custom":false,"poi":{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2617,"visit_tip":"半小时","address":"云南丽江市大研古城四方街","topic":"逛四方街品尝纳西美食","introduce":"丽江虽然不以美食而著称，但是却有很多有纳西族代表性的特色小吃，这其中以鸡豆凉粉、纳西烤鱼、丽江粑粑等最受欢迎。走在丽江古城的四方街上，短短的街道上有数十家小吃店，让你一次吃遍各种纳西小吃。 除了小吃外，丽江特色火锅也非常出名，以腊排骨火锅、洋芋鸡火锅、黑山羊火锅、菌类火锅等最美味。丽江的火锅有招牌蘸水，最好可以放一些薄荷涮在肉锅里，肉会带有清新的香味，薄荷混了肉味，非常好吃。 若要想吃正宗纳西菜，比较具有代表性的有三叠水和八大碗。\u201c三叠水\u201d是纳西人的最高礼仪，按所上菜看的口味分三次上席；\u201c八大碗\u201d则是纳西族传统的年夜饭，以八种各有寓意的菜式致以美好祝福。","time_cost":30,"wishes_count":10132,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2299/f4a2239dcadaf5104dc430cd339ad0c0.jpg?imageMogr2/crop/!1600x959a0a54/thumbnail/800"}}},{"id":1159240,"position":2,"time_cost":30,"is_custom":false,"poi":{"id":10543884,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128246.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"狮子山","name_en":"","name_pinyin":"shi zi shan gong yuan","business_id":128246,"poi_type":"SIGHT","district_id":32,"lat":26.871291,"lng":100.231285,"address":"丽江市古城区新华街","location_name":null,"blat":26.8772544861,"blng":100.237780896,"youji_lat":26.871291,"youji_lng":100.231285,"youji_poi_id":6400,"youji_poi_name":"狮子山","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2286,"visit_tip":"半小时","address":"丽江市古城区新华街狮子山公园","topic":"登狮子山俯瞰丽江古城全景","introduce":"丽江古城西侧的狮子山顶，是观赏丽江古城全景的最佳去处，可北望玉龙雪山，东俯丽江古城，西瞰丽江新城，南眺田园风光。晚上在狮子山俯瞰丽江，月色下在万家灯火装点下的古城更是流光溢彩，璀璨动人。 狮子山因山体宛如一头睡卧的狮子而得名，山顶坐落着极富建筑特色的万古楼，是丽江城内的制高点。公园南端有始建于乾隆十九年的白马龙潭寺，寺东有一泓清澈见底的潭水，被纳西人民奉为神泉。","time_cost":30,"wishes_count":10002,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":10543884,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128246.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"狮子山","name_en":"","name_pinyin":"shi zi shan gong yuan","business_id":128246,"poi_type":"SIGHT","district_id":32,"lat":26.871291,"lng":100.231285,"address":"丽江市古城区新华街","location_name":null,"blat":26.8772544861,"blng":100.237780896,"youji_lat":26.871291,"youji_lng":100.231285,"youji_poi_id":6400,"youji_poi_name":"狮子山","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2286/962cf8d20eb94a5908c45e399fba2a80.jpg?imageMogr2/crop/!1600x959a0a61/thumbnail/800"}}},{"id":1159241,"position":3,"time_cost":60,"is_custom":false,"poi":{"id":78639,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12325.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"木府","name_en":"","name_pinyin":"mu fu","business_id":12325,"poi_type":"SIGHT","district_id":32,"lat":26.869557,"lng":100.234204,"address":"丽江市古城区大研镇光义街官院巷49号 \u200e","location_name":null,"blat":26.8755760193,"blng":100.2405288786,"youji_lat":26.869557,"youji_lng":100.234204,"youji_poi_id":6396,"youji_poi_name":"木府","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2612,"visit_tip":"1小时","address":"丽江市古城区大研镇光义街官院巷49号","topic":"木府：精致雄伟的丽江王府","introduce":"丽江古城内的木府，是历代丽江木氏土司的王府。土司府在保持了中原建筑风格的基础上，添加了白族和纳西族的工艺，建筑精美而宏大，蔚为壮观，难怪徐霞客当年在木府门外慨叹：\u201c宫室之丽，拟于王者\u201d。 木府虽是土司王府，但宫室之瑰丽，不逊皇家，据说当年既是\u201c仿紫禁城而建\u201d，鼎盛时期，有宫舍100多间。府内中轴线上建有忠义牌坊、木牌坊、议事厅、万卷楼等建筑，高低错落，气势磅礴。 木府历经几百年的辉煌，大部分毁于清末的战火中，目前所见的绝大多数是1999年重建而成。虽是重建，但不妨碍其成为丽江古城内的代表性建筑。电视连续剧《木府风云》、《钱王》都是在这里拍摄的。","time_cost":60,"wishes_count":9281,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":78639,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12325.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"木府","name_en":"","name_pinyin":"mu fu","business_id":12325,"poi_type":"SIGHT","district_id":32,"lat":26.869557,"lng":100.234204,"address":"丽江市古城区大研镇光义街官院巷49号 \u200e","location_name":null,"blat":26.8755760193,"blng":100.2405288786,"youji_lat":26.869557,"youji_lng":100.234204,"youji_poi_id":6396,"youji_poi_name":"木府","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2612/f2129eeb0a93826ad76f3a83addabdd3.jpg?imageMogr2/crop/!1600x959a0a110/thumbnail/800"}}},{"id":1159242,"position":4,"time_cost":30,"is_custom":false,"poi":{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2774,"visit_tip":"半小时","address":"云南丽江市大研古城四方街","topic":"跳一次纳西广场舞","introduce":"每逢节庆日，丽江的纳西族的小伙子都要面对玉龙雪山，敲着\u201c东巴鼓\u201d，跳起欢快的东巴舞。如今在四方街上，几乎每天都有穿着民族服饰欢快起舞的纳西族，和他们一起跳一次广场舞，绝对会是难得的体验。 东巴舞是纳西族东巴文化的重要组成部分，一般运用于宗教祭祀活动中。东巴舞来源于古代纳西的社会生活，不少动作都是模拟各种动物的动作来进行的，形象十分生动。","time_cost":30,"wishes_count":7792,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":640,"height":384,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2774/b981f042f97f88922712b9e2d2e489a3.jpg?imageMogr2/crop/!640x384a0a149/thumbnail/800"}}},{"id":1159243,"position":5,"time_cost":0,"is_custom":false,"poi":{"id":16955515,"h5_url":"http://m.ctrip.com/webapp/you/foods/32/8589047.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"江湖酒吧","name_en":"","name_pinyin":"JIANG HU JIU BA","business_id":8589047,"poi_type":"RESTAURANT","district_id":32,"lat":26.870921,"lng":100.239741,"address":"古城区五一街王家庄巷41号","location_name":null,"blat":26.8767719269,"blng":100.2462710821,"youji_lat":26.870921,"youji_lng":100.239741,"youji_poi_id":171072,"youji_poi_name":"江湖酒吧","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2659,"visit_tip":"","address":"古城区五一街王家庄巷41号","topic":"泡一泡丽江酒吧","introduce":"如果说白天的丽江古城是民俗与美景的结合，那么夜幕降临后的丽江则不负其\u201c艳遇之都\u201d的美誉。古城内大大小小的酒吧纷纷开张，在鲜艳的霓虹灯下，素不相识的人们聚在一起，饮酒作乐。 丽江城内酒吧众多，最具特色的当属火塘酒吧了。火塘是藏区家中生火取暖、聚会的地方，一年365天都不会熄灭。在火塘酒吧中，歌手和客人围坐在火塘周边，自弹自唱、谈天说地、其乐融融。 江湖酒吧是丽江最热门的火塘音乐酒吧，也是音乐爱好者们在丽江的聚集点之一。江湖酒吧的主唱小松声音穿透力很强，伴随着让人回味无穷的音乐声，不大的酒吧中男男女女围着一个大火塘谈笑风生，十分惬意。","time_cost":0,"wishes_count":9456,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":16955515,"h5_url":"http://m.ctrip.com/webapp/you/foods/32/8589047.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"江湖酒吧","name_en":"","name_pinyin":"JIANG HU JIU BA","business_id":8589047,"poi_type":"RESTAURANT","district_id":32,"lat":26.870921,"lng":100.239741,"address":"古城区五一街王家庄巷41号","location_name":null,"blat":26.8767719269,"blng":100.2462710821,"youji_lat":26.870921,"youji_lng":100.239741,"youji_poi_id":171072,"youji_poi_name":"江湖酒吧","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1280,"height":767,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2323/f8a55533b79eef5686a3f20b5d5267a0.jpg?imageMogr2/crop/!1280x767a0a192/thumbnail/800"}}}]
         */

        private List<DaysBean> days;

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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDestination_id() {
            return destination_id;
        }

        public void setDestination_id(int destination_id) {
            this.destination_id = destination_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public int getPlan_day_points_count() {
            return plan_day_points_count;
        }

        public void setPlan_day_points_count(int plan_day_points_count) {
            this.plan_day_points_count = plan_day_points_count;
        }

        public boolean isOfficial() {
            return official;
        }

        public void setOfficial(boolean official) {
            this.official = official;
        }

        public int getPhoto_id() {
            return photo_id;
        }

        public void setPhoto_id(int photo_id) {
            this.photo_id = photo_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public boolean isPublished() {
            return published;
        }

        public void setPublished(boolean published) {
            this.published = published;
        }

        public boolean isMixed() {
            return mixed;
        }

        public void setMixed(boolean mixed) {
            this.mixed = mixed;
        }

        public PhotoBean getPhoto() {
            return photo;
        }

        public void setPhoto(PhotoBean photo) {
            this.photo = photo;
        }

        public DestinationBean getDestination() {
            return destination;
        }

        public void setDestination(DestinationBean destination) {
            this.destination = destination;
        }

        public List<DaysBean> getDays() {
            return days;
        }

        public void setDays(List<DaysBean> days) {
            this.days = days;
        }

        public static class PhotoBean implements  Serializable{
            private int id;
            private int width;
            private int height;
            private String url;
            private int file_size;
            private String photo_url;

            public static PhotoBean objectFromData(String str) {

                return new Gson().fromJson(str, PhotoBean.class);
            }

            public static PhotoBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), PhotoBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<PhotoBean> arrayPhotoBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<PhotoBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<PhotoBean> arrayPhotoBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<PhotoBean>>() {
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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getFile_size() {
                return file_size;
            }

            public void setFile_size(int file_size) {
                this.file_size = file_size;
            }

            public String getPhoto_url() {
                return photo_url;
            }

            public void setPhoto_url(String photo_url) {
                this.photo_url = photo_url;
            }
        }

        public static class DestinationBean implements Serializable{
            private int id;
            private double lat;
            private double lng;
            private int district_id;
            private int parent_id;
            private String name;
            private String name_en;
            private String name_pinyin;
            private int score;
            private int level;
            private String path;
            private boolean published;
            private boolean is_in_china;
            private int inspiration_activities_count;
            private int activity_collections_count;
            private int wishes_count;
            private Object wiki_destination_id;
            private String photo_url;
            private String title;
            private String description;
            private String tip;
            private String time_cost;
            private Object wiki_page_id;
            private boolean has_airport;
            private String visit_tip;
            private boolean is_top_destination;
            private boolean is_in_grouping;
            private Object alias_name;
            private Object travel_tip;
            /**
             * id : 66760
             * width : 1192
             * height : 1067
             * url : http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg
             * file_size : 1088794
             * photo_url : http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg
             */

            private PhotoBean photo;

            public static DestinationBean objectFromData(String str) {

                return new Gson().fromJson(str, DestinationBean.class);
            }

            public static DestinationBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), DestinationBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<DestinationBean> arrayDestinationBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<DestinationBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<DestinationBean> arrayDestinationBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<DestinationBean>>() {
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

            public int getDistrict_id() {
                return district_id;
            }

            public void setDistrict_id(int district_id) {
                this.district_id = district_id;
            }

            public int getParent_id() {
                return parent_id;
            }

            public void setParent_id(int parent_id) {
                this.parent_id = parent_id;
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

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
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

            public int getInspiration_activities_count() {
                return inspiration_activities_count;
            }

            public void setInspiration_activities_count(int inspiration_activities_count) {
                this.inspiration_activities_count = inspiration_activities_count;
            }

            public int getActivity_collections_count() {
                return activity_collections_count;
            }

            public void setActivity_collections_count(int activity_collections_count) {
                this.activity_collections_count = activity_collections_count;
            }

            public int getWishes_count() {
                return wishes_count;
            }

            public void setWishes_count(int wishes_count) {
                this.wishes_count = wishes_count;
            }

            public Object getWiki_destination_id() {
                return wiki_destination_id;
            }

            public void setWiki_destination_id(Object wiki_destination_id) {
                this.wiki_destination_id = wiki_destination_id;
            }

            public String getPhoto_url() {
                return photo_url;
            }

            public void setPhoto_url(String photo_url) {
                this.photo_url = photo_url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getTip() {
                return tip;
            }

            public void setTip(String tip) {
                this.tip = tip;
            }

            public String getTime_cost() {
                return time_cost;
            }

            public void setTime_cost(String time_cost) {
                this.time_cost = time_cost;
            }

            public Object getWiki_page_id() {
                return wiki_page_id;
            }

            public void setWiki_page_id(Object wiki_page_id) {
                this.wiki_page_id = wiki_page_id;
            }

            public boolean isHas_airport() {
                return has_airport;
            }

            public void setHas_airport(boolean has_airport) {
                this.has_airport = has_airport;
            }

            public String getVisit_tip() {
                return visit_tip;
            }

            public void setVisit_tip(String visit_tip) {
                this.visit_tip = visit_tip;
            }

            public boolean isIs_top_destination() {
                return is_top_destination;
            }

            public void setIs_top_destination(boolean is_top_destination) {
                this.is_top_destination = is_top_destination;
            }

            public boolean isIs_in_grouping() {
                return is_in_grouping;
            }

            public void setIs_in_grouping(boolean is_in_grouping) {
                this.is_in_grouping = is_in_grouping;
            }

            public Object getAlias_name() {
                return alias_name;
            }

            public void setAlias_name(Object alias_name) {
                this.alias_name = alias_name;
            }

            public Object getTravel_tip() {
                return travel_tip;
            }

            public void setTravel_tip(Object travel_tip) {
                this.travel_tip = travel_tip;
            }

            public PhotoBean getPhoto() {
                return photo;
            }

            public void setPhoto(PhotoBean photo) {
                this.photo = photo;
            }

            public static class PhotoBean implements Serializable {
                private int id;
                private int width;
                private int height;
                private String url;
                private int file_size;
                private String photo_url;

                public static PhotoBean objectFromData(String str) {

                    return new Gson().fromJson(str, PhotoBean.class);
                }

                public static PhotoBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), PhotoBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<PhotoBean> arrayPhotoBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<PhotoBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<PhotoBean> arrayPhotoBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<PhotoBean>>() {
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

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getFile_size() {
                    return file_size;
                }

                public void setFile_size(int file_size) {
                    this.file_size = file_size;
                }

                public String getPhoto_url() {
                    return photo_url;
                }

                public void setPhoto_url(String photo_url) {
                    this.photo_url = photo_url;
                }
            }
        }

        public static class DaysBean implements Serializable {
            private int id;
            private int plan_id;
            private int position;
            private String description;

            @Override
            public String toString() {
                return "DaysBean{" +
                        "id=" + id +
                        ", plan_id=" + plan_id +
                        ", position=" + position +
                        ", description='" + description + '\'' +
                        ", points=" + points +
                        '}';
            }

            /**
             * id : 1159238
             * position : 0
             * time_cost : 30
             * is_custom : false
             * poi : {"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null}
             * inspiration_activity : {"id":2628,"visit_tip":"半小时","address":"丽江市古城区大研古镇北入口","topic":"和大水车合影留念","introduce":"走进丽江古城北门，一大一小两架水车便映入眼帘。这两驾连轴大水车是古城的标志性建筑，也是古城内最人声鼎沸的地方，一年四季都挤满了留影和集合的游客，想要单独和水车合影一张必须眼尖手快。 大水车前的石桥上，是拍摄水车的最佳地点。若是春天的傍晚前来，夕阳穿过水车，照射在一旁刻有江泽民题词的照壁上，碧绿的垂柳被微风拂动，潺潺的流水反射着碎金般的阳光，是大水车最美的一面。","time_cost":30,"wishes_count":9058,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":3100,"height":1859,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2628/a91ffe19de19dfad741e65c15f1861b0.jpg?imageMogr2/crop/!3100x1859a0a141/thumbnail/800"}}
             */

            private List<PointsBean> points;

            public static DaysBean objectFromData(String str) {

                return new Gson().fromJson(str, DaysBean.class);
            }

            public static DaysBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), DaysBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<DaysBean> arrayDaysBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<DaysBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<DaysBean> arrayDaysBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<DaysBean>>() {
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

            public int getPlan_id() {
                return plan_id;
            }

            public void setPlan_id(int plan_id) {
                this.plan_id = plan_id;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<PointsBean> getPoints() {
                return points;
            }

            public void setPoints(List<PointsBean> points) {
                this.points = points;
            }

            public static class PointsBean implements Serializable {
                private int id;
                private int position;
                private int time_cost;
                private boolean is_custom;

                @Override
                public String toString() {
                    return "PointsBean{" +
                            "id=" + id +
                            ", position=" + position +
                            ", time_cost=" + time_cost +
                            ", is_custom=" + is_custom +
                            ", poi=" + poi +
                            ", inspiration_activity=" + inspiration_activity +
                            '}';
                }

                /**
                 * id : 86497
                 * h5_url : http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=
                 * name : 大水车
                 * name_en :
                 * name_pinyin : gu cheng da shui che
                 * business_id : 60937
                 * poi_type : SIGHT
                 * district_id : 32
                 * lat : 26.876254
                 * lng : 100.233196
                 * address : 丽江市古城区大研古镇入口
                 * location_name : null
                 * blat : 26.8819236755
                 * blng : 100.2398870929
                 * youji_lat : 26.876254
                 * youji_lng : 100.233196
                 * youji_poi_id : 161006
                 * youji_poi_name : 大水车
                 * is_in_china : true
                 * local_name : null
                 * local_address_name : null
                 */

                private PoiBean poi;

                /**
                 * id : 2628
                 * visit_tip : 半小时
                 * address : 丽江市古城区大研古镇北入口
                 * topic : 和大水车合影留念
                 * introduce : 走进丽江古城北门，一大一小两架水车便映入眼帘。这两驾连轴大水车是古城的标志性建筑，也是古城内最人声鼎沸的地方，一年四季都挤满了留影和集合的游客，想要单独和水车合影一张必须眼尖手快。 大水车前的石桥上，是拍摄水车的最佳地点。若是春天的傍晚前来，夕阳穿过水车，照射在一旁刻有江泽民题词的照壁上，碧绿的垂柳被微风拂动，潺潺的流水反射着碎金般的阳光，是大水车最美的一面。
                 * time_cost : 30
                 * wishes_count : 9058
                 * icon_type : 2
                 * price : 0
                 * user_activities_count : 0
                 * destination : {"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230340,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}}
                 * pois : [{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null}]
                 * activity_collections : [{"id":449,"topic":"丽江古城"}]
                 * photo : {"width":3100,"height":1859,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2628/a91ffe19de19dfad741e65c15f1861b0.jpg?imageMogr2/crop/!3100x1859a0a141/thumbnail/800"}
                 */

                private InspirationActivityBean inspiration_activity;

                public static PointsBean objectFromData(String str) {

                    return new Gson().fromJson(str, PointsBean.class);
                }

                public static PointsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), PointsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<PointsBean> arrayPointsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<PointsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<PointsBean> arrayPointsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<PointsBean>>() {
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

                public int getPosition() {
                    return position;
                }

                public void setPosition(int position) {
                    this.position = position;
                }

                public int getTime_cost() {
                    return time_cost;
                }

                public void setTime_cost(int time_cost) {
                    this.time_cost = time_cost;
                }

                public boolean isIs_custom() {
                    return is_custom;
                }

                public void setIs_custom(boolean is_custom) {
                    this.is_custom = is_custom;
                }

                public PoiBean getPoi() {
                    return poi;
                }

                public void setPoi(PoiBean poi) {
                    this.poi = poi;
                }

                public InspirationActivityBean getInspiration_activity() {
                    return inspiration_activity;
                }

                public void setInspiration_activity(InspirationActivityBean inspiration_activity) {
                    this.inspiration_activity = inspiration_activity;
                }

                public static class PoiBean implements Serializable{
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
                    private double youji_lat;
                    private double youji_lng;
                    private int youji_poi_id;
                    private String youji_poi_name;
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

                    public double getYouji_lat() {
                        return youji_lat;
                    }

                    public void setYouji_lat(double youji_lat) {
                        this.youji_lat = youji_lat;
                    }

                    public double getYouji_lng() {
                        return youji_lng;
                    }

                    public void setYouji_lng(double youji_lng) {
                        this.youji_lng = youji_lng;
                    }

                    public int getYouji_poi_id() {
                        return youji_poi_id;
                    }

                    public void setYouji_poi_id(int youji_poi_id) {
                        this.youji_poi_id = youji_poi_id;
                    }

                    public String getYouji_poi_name() {
                        return youji_poi_name;
                    }

                    public void setYouji_poi_name(String youji_poi_name) {
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

                public static class InspirationActivityBean implements Serializable {
                    private int id;
                    private String visit_tip;
                    private String address;
                    private String topic;
                    private String introduce;
                    private int time_cost;
                    private int wishes_count;
                    private int icon_type;
                    private int price;
                    private int user_activities_count;
                    /**
                     * id : 111
                     * lat : 26.8768005371
                     * lng : 100.2300033569
                     * district_id : 32
                     * parent_id : 109
                     * name : 丽江
                     * name_en : Lijiang
                     * name_pinyin : li jiang|lj
                     * score : 100
                     * level : 4
                     * path : .1.5.109.111.
                     * published : true
                     * is_in_china : true
                     * inspiration_activities_count : 93
                     * activity_collections_count : 13
                     * wishes_count : 230340
                     * wiki_destination_id : null
                     * photo_url : http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg
                     * title : 雪山下的柔美小城
                     * description : 丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。
                     * tip : 最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略
                     * time_cost :
                     * wiki_page_id : 18582
                     * has_airport : true
                     * visit_tip : 建议游玩3-4天
                     * is_top_destination : false
                     * is_in_grouping : true
                     * alias_name : null
                     * travel_tip : null
                     * photo : {"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"}
                     * wiki_page : {"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}
                     */

                    private DestinationBean destination;
                    /**
                     * width : 3100
                     * height : 1859
                     * photo_url : http://inspiration.chanyouji.cn/InspirationActivity/2628/a91ffe19de19dfad741e65c15f1861b0.jpg?imageMogr2/crop/!3100x1859a0a141/thumbnail/800
                     */

                    private PhotoBean photo;
                    /**
                     * id : 86497
                     * h5_url : http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=
                     * name : 大水车
                     * name_en :
                     * name_pinyin : gu cheng da shui che
                     * business_id : 60937
                     * poi_type : SIGHT
                     * district_id : 32
                     * lat : 26.876254
                     * lng : 100.233196
                     * address : 丽江市古城区大研古镇入口
                     * location_name : null
                     * blat : 26.8819236755
                     * blng : 100.2398870929
                     * youji_lat : 26.876254
                     * youji_lng : 100.233196
                     * youji_poi_id : 161006
                     * youji_poi_name : 大水车
                     * is_in_china : true
                     * local_name : null
                     * local_address_name : null
                     */

                    private List<PoisBean> pois;
                    /**
                     * id : 449
                     * topic : 丽江古城
                     */

                    private List<ActivityCollectionsBean> activity_collections;

                    public static InspirationActivityBean objectFromData(String str) {

                        return new Gson().fromJson(str, InspirationActivityBean.class);
                    }

                    public static InspirationActivityBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), InspirationActivityBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public static List<InspirationActivityBean> arrayInspirationActivityBeanFromData(String str) {

                        Type listType = new TypeToken<ArrayList<InspirationActivityBean>>() {
                        }.getType();

                        return new Gson().fromJson(str, listType);
                    }

                    public static List<InspirationActivityBean> arrayInspirationActivityBeanFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);
                            Type listType = new TypeToken<ArrayList<InspirationActivityBean>>() {
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

                    public String getVisit_tip() {
                        return visit_tip;
                    }

                    public void setVisit_tip(String visit_tip) {
                        this.visit_tip = visit_tip;
                    }

                    public String getAddress() {
                        return address;
                    }

                    public void setAddress(String address) {
                        this.address = address;
                    }

                    public String getTopic() {
                        return topic;
                    }

                    public void setTopic(String topic) {
                        this.topic = topic;
                    }

                    public String getIntroduce() {
                        return introduce;
                    }

                    public void setIntroduce(String introduce) {
                        this.introduce = introduce;
                    }

                    public int getTime_cost() {
                        return time_cost;
                    }

                    public void setTime_cost(int time_cost) {
                        this.time_cost = time_cost;
                    }

                    public int getWishes_count() {
                        return wishes_count;
                    }

                    public void setWishes_count(int wishes_count) {
                        this.wishes_count = wishes_count;
                    }

                    public int getIcon_type() {
                        return icon_type;
                    }

                    public void setIcon_type(int icon_type) {
                        this.icon_type = icon_type;
                    }

                    public int getPrice() {
                        return price;
                    }

                    public void setPrice(int price) {
                        this.price = price;
                    }

                    public int getUser_activities_count() {
                        return user_activities_count;
                    }

                    public void setUser_activities_count(int user_activities_count) {
                        this.user_activities_count = user_activities_count;
                    }

                    public DestinationBean getDestination() {
                        return destination;
                    }

                    public void setDestination(DestinationBean destination) {
                        this.destination = destination;
                    }

                    public PhotoBean getPhoto() {
                        return photo;
                    }

                    public void setPhoto(PhotoBean photo) {
                        this.photo = photo;
                    }

                    public List<PoisBean> getPois() {
                        return pois;
                    }

                    public void setPois(List<PoisBean> pois) {
                        this.pois = pois;
                    }

                    public List<ActivityCollectionsBean> getActivity_collections() {
                        return activity_collections;
                    }

                    public void setActivity_collections(List<ActivityCollectionsBean> activity_collections) {
                        this.activity_collections = activity_collections;
                    }

                    public static class DestinationBean implements Serializable{
                        private int id;
                        private double lat;
                        private double lng;
                        private int district_id;
                        private int parent_id;
                        private String name;
                        private String name_en;
                        private String name_pinyin;
                        private int score;
                        private int level;
                        private String path;
                        private boolean published;
                        private boolean is_in_china;
                        private int inspiration_activities_count;
                        private int activity_collections_count;
                        private int wishes_count;
                        private Object wiki_destination_id;
                        private String photo_url;
                        private String title;
                        private String description;
                        private String tip;
                        private String time_cost;
                        private int wiki_page_id;
                        private boolean has_airport;
                        private String visit_tip;
                        private boolean is_top_destination;
                        private boolean is_in_grouping;
                        private Object alias_name;
                        private Object travel_tip;

                        @Override
                        public String toString() {
                            return "DestinationBean{" +
                                    "id=" + id +
                                    ", lat=" + lat +
                                    ", lng=" + lng +
                                    ", district_id=" + district_id +
                                    ", parent_id=" + parent_id +
                                    ", name='" + name + '\'' +
                                    ", name_en='" + name_en + '\'' +
                                    ", name_pinyin='" + name_pinyin + '\'' +
                                    ", score=" + score +
                                    ", level=" + level +
                                    ", path='" + path + '\'' +
                                    ", published=" + published +
                                    ", is_in_china=" + is_in_china +
                                    ", inspiration_activities_count=" + inspiration_activities_count +
                                    ", activity_collections_count=" + activity_collections_count +
                                    ", wishes_count=" + wishes_count +
                                    ", wiki_destination_id=" + wiki_destination_id +
                                    ", photo_url='" + photo_url + '\'' +
                                    ", title='" + title + '\'' +
                                    ", description='" + description + '\'' +
                                    ", tip='" + tip + '\'' +
                                    ", time_cost='" + time_cost + '\'' +
                                    ", wiki_page_id=" + wiki_page_id +
                                    ", has_airport=" + has_airport +
                                    ", visit_tip='" + visit_tip + '\'' +
                                    ", is_top_destination=" + is_top_destination +
                                    ", is_in_grouping=" + is_in_grouping +
                                    ", alias_name=" + alias_name +
                                    ", travel_tip=" + travel_tip +
                                    ", photo=" + photo +
                                    ", wiki_page=" + wiki_page +
                                    '}';
                        }

                        /**
                         * id : 429219
                         * width : 1000
                         * height : 600
                         * url : http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg
                         * file_size : 645362
                         * photo_url : http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg
                         */

                        private PhotoBean photo;
                        /**
                         * id : 18582
                         * destination_id : 140
                         * title : 交通指南
                         * category_type : 3
                         * destination : {"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}
                         */

                        private WikiPageBean wiki_page;

                        public static DestinationBean objectFromData(String str) {

                            return new Gson().fromJson(str, DestinationBean.class);
                        }

                        public static DestinationBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), DestinationBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public static List<DestinationBean> arrayDestinationBeanFromData(String str) {

                            Type listType = new TypeToken<ArrayList<DestinationBean>>() {
                            }.getType();

                            return new Gson().fromJson(str, listType);
                        }

                        public static List<DestinationBean> arrayDestinationBeanFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);
                                Type listType = new TypeToken<ArrayList<DestinationBean>>() {
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

                        public int getDistrict_id() {
                            return district_id;
                        }

                        public void setDistrict_id(int district_id) {
                            this.district_id = district_id;
                        }

                        public int getParent_id() {
                            return parent_id;
                        }

                        public void setParent_id(int parent_id) {
                            this.parent_id = parent_id;
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

                        public int getScore() {
                            return score;
                        }

                        public void setScore(int score) {
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

                        public int getInspiration_activities_count() {
                            return inspiration_activities_count;
                        }

                        public void setInspiration_activities_count(int inspiration_activities_count) {
                            this.inspiration_activities_count = inspiration_activities_count;
                        }

                        public int getActivity_collections_count() {
                            return activity_collections_count;
                        }

                        public void setActivity_collections_count(int activity_collections_count) {
                            this.activity_collections_count = activity_collections_count;
                        }

                        public int getWishes_count() {
                            return wishes_count;
                        }

                        public void setWishes_count(int wishes_count) {
                            this.wishes_count = wishes_count;
                        }

                        public Object getWiki_destination_id() {
                            return wiki_destination_id;
                        }

                        public void setWiki_destination_id(Object wiki_destination_id) {
                            this.wiki_destination_id = wiki_destination_id;
                        }

                        public String getPhoto_url() {
                            return photo_url;
                        }

                        public void setPhoto_url(String photo_url) {
                            this.photo_url = photo_url;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public String getTip() {
                            return tip;
                        }

                        public void setTip(String tip) {
                            this.tip = tip;
                        }

                        public String getTime_cost() {
                            return time_cost;
                        }

                        public void setTime_cost(String time_cost) {
                            this.time_cost = time_cost;
                        }

                        public int getWiki_page_id() {
                            return wiki_page_id;
                        }

                        public void setWiki_page_id(int wiki_page_id) {
                            this.wiki_page_id = wiki_page_id;
                        }

                        public boolean isHas_airport() {
                            return has_airport;
                        }

                        public void setHas_airport(boolean has_airport) {
                            this.has_airport = has_airport;
                        }

                        public String getVisit_tip() {
                            return visit_tip;
                        }

                        public void setVisit_tip(String visit_tip) {
                            this.visit_tip = visit_tip;
                        }

                        public boolean isIs_top_destination() {
                            return is_top_destination;
                        }

                        public void setIs_top_destination(boolean is_top_destination) {
                            this.is_top_destination = is_top_destination;
                        }

                        public boolean isIs_in_grouping() {
                            return is_in_grouping;
                        }

                        public void setIs_in_grouping(boolean is_in_grouping) {
                            this.is_in_grouping = is_in_grouping;
                        }

                        public Object getAlias_name() {
                            return alias_name;
                        }

                        public void setAlias_name(Object alias_name) {
                            this.alias_name = alias_name;
                        }

                        public Object getTravel_tip() {
                            return travel_tip;
                        }

                        public void setTravel_tip(Object travel_tip) {
                            this.travel_tip = travel_tip;
                        }

                        public PhotoBean getPhoto() {
                            return photo;
                        }

                        public void setPhoto(PhotoBean photo) {
                            this.photo = photo;
                        }

                        public WikiPageBean getWiki_page() {
                            return wiki_page;
                        }

                        public void setWiki_page(WikiPageBean wiki_page) {
                            this.wiki_page = wiki_page;
                        }

                        public static class PhotoBean implements Serializable {
                            private int id;
                            private int width;
                            private int height;
                            private String url;
                            private int file_size;
                            private String photo_url;

                            public static PhotoBean objectFromData(String str) {

                                return new Gson().fromJson(str, PhotoBean.class);
                            }

                            public static PhotoBean objectFromData(String str, String key) {

                                try {
                                    JSONObject jsonObject = new JSONObject(str);

                                    return new Gson().fromJson(jsonObject.getString(str), PhotoBean.class);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                                return null;
                            }

                            public static List<PhotoBean> arrayPhotoBeanFromData(String str) {

                                Type listType = new TypeToken<ArrayList<PhotoBean>>() {
                                }.getType();

                                return new Gson().fromJson(str, listType);
                            }

                            public static List<PhotoBean> arrayPhotoBeanFromData(String str, String key) {

                                try {
                                    JSONObject jsonObject = new JSONObject(str);
                                    Type listType = new TypeToken<ArrayList<PhotoBean>>() {
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

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public int getFile_size() {
                                return file_size;
                            }

                            public void setFile_size(int file_size) {
                                this.file_size = file_size;
                            }

                            public String getPhoto_url() {
                                return photo_url;
                            }

                            public void setPhoto_url(String photo_url) {
                                this.photo_url = photo_url;
                            }
                        }

                        public static class WikiPageBean implements Serializable {
                            private int id;
                            private int destination_id;
                            private String title;
                            private int category_type;
                            /**
                             * id : 140
                             * name_zh_cn : 丽江
                             * children_count : 0
                             * name_en : Lijiang
                             * image_url : http://m.chanyouji.cn/destinations/140-landscape.jpg
                             */

                            private DestinationBean destination;

                            public static WikiPageBean objectFromData(String str) {

                                return new Gson().fromJson(str, WikiPageBean.class);
                            }

                            public static WikiPageBean objectFromData(String str, String key) {

                                try {
                                    JSONObject jsonObject = new JSONObject(str);

                                    return new Gson().fromJson(jsonObject.getString(str), WikiPageBean.class);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                                return null;
                            }

                            public static List<WikiPageBean> arrayWikiPageBeanFromData(String str) {

                                Type listType = new TypeToken<ArrayList<WikiPageBean>>() {
                                }.getType();

                                return new Gson().fromJson(str, listType);
                            }

                            public static List<WikiPageBean> arrayWikiPageBeanFromData(String str, String key) {

                                try {
                                    JSONObject jsonObject = new JSONObject(str);
                                    Type listType = new TypeToken<ArrayList<WikiPageBean>>() {
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

                            public int getDestination_id() {
                                return destination_id;
                            }

                            public void setDestination_id(int destination_id) {
                                this.destination_id = destination_id;
                            }

                            public String getTitle() {
                                return title;
                            }

                            public void setTitle(String title) {
                                this.title = title;
                            }

                            public int getCategory_type() {
                                return category_type;
                            }

                            public void setCategory_type(int category_type) {
                                this.category_type = category_type;
                            }

                            public DestinationBean getDestination() {
                                return destination;
                            }

                            public void setDestination(DestinationBean destination) {
                                this.destination = destination;
                            }

                            public static class DestinationBeans {
                                private int id;
                                private String name_zh_cn;
                                private int children_count;
                                private String name_en;
                                private String image_url;

                                public static DestinationBean objectFromData(String str) {

                                    return new Gson().fromJson(str, DestinationBean.class);
                                }

                                public static DestinationBean objectFromData(String str, String key) {

                                    try {
                                        JSONObject jsonObject = new JSONObject(str);

                                        return new Gson().fromJson(jsonObject.getString(str), DestinationBean.class);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                    return null;
                                }

                                public static List<DestinationBean> arrayDestinationBeanFromData(String str) {

                                    Type listType = new TypeToken<ArrayList<DestinationBean>>() {
                                    }.getType();

                                    return new Gson().fromJson(str, listType);
                                }

                                public static List<DestinationBean> arrayDestinationBeanFromData(String str, String key) {

                                    try {
                                        JSONObject jsonObject = new JSONObject(str);
                                        Type listType = new TypeToken<ArrayList<DestinationBean>>() {
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

                                public String getName_zh_cn() {
                                    return name_zh_cn;
                                }

                                public void setName_zh_cn(String name_zh_cn) {
                                    this.name_zh_cn = name_zh_cn;
                                }

                                public int getChildren_count() {
                                    return children_count;
                                }

                                public void setChildren_count(int children_count) {
                                    this.children_count = children_count;
                                }

                                public String getName_en() {
                                    return name_en;
                                }

                                public void setName_en(String name_en) {
                                    this.name_en = name_en;
                                }

                                public String getImage_url() {
                                    return image_url;
                                }

                                public void setImage_url(String image_url) {
                                    this.image_url = image_url;
                                }
                            }
                        }
                    }

                    public static class PhotoBean implements Serializable {
                        private int width;
                        private int height;
                        private String photo_url;

                        public static PhotoBean objectFromData(String str) {

                            return new Gson().fromJson(str, PhotoBean.class);
                        }

                        public static PhotoBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), PhotoBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public static List<PhotoBean> arrayPhotoBeanFromData(String str) {

                            Type listType = new TypeToken<ArrayList<PhotoBean>>() {
                            }.getType();

                            return new Gson().fromJson(str, listType);
                        }

                        public static List<PhotoBean> arrayPhotoBeanFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);
                                Type listType = new TypeToken<ArrayList<PhotoBean>>() {
                                }.getType();

                                return new Gson().fromJson(jsonObject.getString(str), listType);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return new ArrayList();


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

                        public String getPhoto_url() {
                            return photo_url;
                        }

                        public void setPhoto_url(String photo_url) {
                            this.photo_url = photo_url;
                        }
                    }

                    public static class PoisBean implements Serializable {
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
                        private double youji_lat;
                        private double youji_lng;
                        private int youji_poi_id;
                        private String youji_poi_name;
                        private boolean is_in_china;
                        private Object local_name;
                        private Object local_address_name;

                        public static PoisBean objectFromData(String str) {

                            return new Gson().fromJson(str, PoisBean.class);
                        }

                        public static PoisBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), PoisBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public static List<PoisBean> arrayPoisBeanFromData(String str) {

                            Type listType = new TypeToken<ArrayList<PoisBean>>() {
                            }.getType();

                            return new Gson().fromJson(str, listType);
                        }

                        public static List<PoisBean> arrayPoisBeanFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);
                                Type listType = new TypeToken<ArrayList<PoisBean>>() {
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

                        public double getYouji_lat() {
                            return youji_lat;
                        }

                        public void setYouji_lat(double youji_lat) {
                            this.youji_lat = youji_lat;
                        }

                        public double getYouji_lng() {
                            return youji_lng;
                        }

                        public void setYouji_lng(double youji_lng) {
                            this.youji_lng = youji_lng;
                        }

                        public int getYouji_poi_id() {
                            return youji_poi_id;
                        }

                        public void setYouji_poi_id(int youji_poi_id) {
                            this.youji_poi_id = youji_poi_id;
                        }

                        public String getYouji_poi_name() {
                            return youji_poi_name;
                        }

                        public void setYouji_poi_name(String youji_poi_name) {
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

                    public static class ActivityCollectionsBean implements Serializable {
                        private int id;
                        private String topic;

                        public static ActivityCollectionsBean objectFromData(String str) {

                            return new Gson().fromJson(str, ActivityCollectionsBean.class);
                        }

                        public static ActivityCollectionsBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), ActivityCollectionsBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public static List<ActivityCollectionsBean> arrayActivityCollectionsBeanFromData(String str) {

                            Type listType = new TypeToken<ArrayList<ActivityCollectionsBean>>() {
                            }.getType();

                            return new Gson().fromJson(str, listType);
                        }

                        public static List<ActivityCollectionsBean> arrayActivityCollectionsBeanFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);
                                Type listType = new TypeToken<ArrayList<ActivityCollectionsBean>>() {
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

                        public String getTopic() {
                            return topic;
                        }

                        public void setTopic(String topic) {
                            this.topic = topic;
                        }
                    }
                }
            }
        }
    }
}
