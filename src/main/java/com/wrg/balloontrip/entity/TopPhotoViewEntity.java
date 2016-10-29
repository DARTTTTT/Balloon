package com.wrg.balloontrip.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/30 0030.
 * Author by RuiGan
 */

public class TopPhotoViewEntity {


    /**
     * message : ok
     * status : 200
     * data : [{"photo":{"width":1280,"height":600,"photo_url":"http://inspiration.chanyouji.cn/Advert/128/3767179302031cf063bc7d85454bf3cd.jpg"},"id":128,"ios_url":"","android_url":"","target_id":"90","advert_type":"album","topic":"在热气球里遇见世界","market":"all","open_in_browser":false},{"photo":{"width":1280,"height":600,"photo_url":"http://inspiration.chanyouji.cn/Advert/127/b6f8da181f1ac9805e02d84603f7bc0c.jpg"},"id":127,"ios_url":"","android_url":"","target_id":"89","advert_type":"album","topic":"氢气球每周精选","market":"all","open_in_browser":false},{"photo":{"width":1280,"height":600,"photo_url":"http://inspiration.chanyouji.cn/Advert/109/0eed18a5d3165826636145867e00bbef.jpg"},"id":109,"ios_url":"","android_url":"","target_id":"76","advert_type":"album","topic":"如何添加自定义地点","market":"all","open_in_browser":false}]
     */

    private String message;
    private int status;
    /**
     * photo : {"width":1280,"height":600,"photo_url":"http://inspiration.chanyouji.cn/Advert/128/3767179302031cf063bc7d85454bf3cd.jpg"}
     * id : 128
     * ios_url :
     * android_url :
     * target_id : 90
     * advert_type : album
     * topic : 在热气球里遇见世界
     * market : all
     * open_in_browser : false
     */

    private List<DataBean> data;

    public static TopPhotoViewEntity objectFromData(String str) {

        return new Gson().fromJson(str, TopPhotoViewEntity.class);
    }

    public static TopPhotoViewEntity objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), TopPhotoViewEntity.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<TopPhotoViewEntity> arrayTopPhotoViewEntityFromData(String str) {

        Type listType = new TypeToken<ArrayList<TopPhotoViewEntity>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<TopPhotoViewEntity> arrayTopPhotoViewEntityFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<TopPhotoViewEntity>>() {
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * width : 1280
         * height : 600
         * photo_url : http://inspiration.chanyouji.cn/Advert/128/3767179302031cf063bc7d85454bf3cd.jpg
         */

        private PhotoBean photo;
        private int id;
        private String ios_url;
        private String android_url;
        private String target_id;
        private String advert_type;
        private String topic;
        private String market;
        private boolean open_in_browser;

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

        public PhotoBean getPhoto() {
            return photo;
        }

        public void setPhoto(PhotoBean photo) {
            this.photo = photo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIos_url() {
            return ios_url;
        }

        public void setIos_url(String ios_url) {
            this.ios_url = ios_url;
        }

        public String getAndroid_url() {
            return android_url;
        }

        public void setAndroid_url(String android_url) {
            this.android_url = android_url;
        }

        public String getTarget_id() {
            return target_id;
        }

        public void setTarget_id(String target_id) {
            this.target_id = target_id;
        }

        public String getAdvert_type() {
            return advert_type;
        }

        public void setAdvert_type(String advert_type) {
            this.advert_type = advert_type;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getMarket() {
            return market;
        }

        public void setMarket(String market) {
            this.market = market;
        }

        public boolean isOpen_in_browser() {
            return open_in_browser;
        }

        public void setOpen_in_browser(boolean open_in_browser) {
            this.open_in_browser = open_in_browser;
        }

        public static class PhotoBean {
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
    }
}
