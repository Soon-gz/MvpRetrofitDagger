package com.abings.daager2demo.model;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Shuwen on 2016/7/7.
 */
public class listBean {

    /**
     * res : 0
     * data : [{"id":"92","title":"寒战2","verse":"","verse_en":"","score":null,"revisedscore":"0","releasetime":"2016-07-08 00:00:00","scoretime":"2016-07-09 00:00:00","cover":"http://image.wufazhuce.com/FulzuviRZ1_GiFYO0sVS68jD2sDt","servertime":1467960431},{"id":"89","title":"大鱼海棠","verse":"","verse_en":"","score":null,"revisedscore":"0","releasetime":"2016-07-08 00:00:00","scoretime":"2016-07-09 00:00:00","cover":"http://image.wufazhuce.com/Fgo4bRBDGrRIpWohCjo8zNsjXEsJ","servertime":1467960431},{"id":"93","title":"摇滚藏獒","verse":"","verse_en":"","score":null,"revisedscore":"0","releasetime":"2016-07-08 00:00:00","scoretime":"2016-07-09 00:00:00","cover":"http://image.wufazhuce.com/Fjj6HPNWve7tOPsh0rDavKAb0oGN","servertime":1467960431},{"id":"90","title":"致青春·原来你还在这里","verse":"","verse_en":"","score":null,"revisedscore":"0","releasetime":"2016-07-08 00:00:00","scoretime":"2016-07-09 00:00:00","cover":"http://image.wufazhuce.com/Fr3GxMCQ_C_wiFOxn8mpPIW9r6WP","servertime":1467960431},{"id":"91","title":"发条城市","verse":"","verse_en":"","score":null,"revisedscore":"0","releasetime":"2016-07-08 00:00:00","scoretime":"2016-07-09 00:00:00","cover":"http://image.wufazhuce.com/Fsq2oikFXGAWz2Xo55-TIpYtpE88","servertime":1467960431},{"id":"94","title":"冬","verse":"","verse_en":"","score":null,"revisedscore":"0","releasetime":"2016-07-08 00:00:00","scoretime":"2016-07-09 00:00:00","cover":"http://image.wufazhuce.com/Fnlne0_yrcYZXaxLIzBdaJVdPgWX","servertime":1467960431},{"id":"88","title":"忍者神龟2：破影而出","verse":"","verse_en":"","score":"76","revisedscore":"0","releasetime":"2016-07-02 00:00:00","scoretime":"2016-07-03 00:00:00","cover":"http://image.wufazhuce.com/FvBm_kOC2kF_Y2zF5czKZtyMvoAi","servertime":1467960431},{"id":"87","title":"赏金猎人","verse":"","verse_en":"","score":"75","revisedscore":"0","releasetime":"2016-07-01 00:00:00","scoretime":"2016-07-02 00:00:00","cover":"http://image.wufazhuce.com/FtIp6tEMWUtOtcq0KFLQEhUsNy9P","servertime":1467960431},{"id":"84","title":"惊天魔盗团2","verse":"","verse_en":"","score":"82","revisedscore":"0","releasetime":"2016-06-24 00:00:00","scoretime":"2016-06-25 00:00:00","cover":"http://image.wufazhuce.com/FudxHeHwbK55qpYhoPN3YzaJJOzE","servertime":1467960431},{"id":"85","title":"三人行","verse":"","verse_en":"","score":"70","revisedscore":"0","releasetime":"2016-06-24 00:00:00","scoretime":"2016-06-25 00:00:00","cover":"http://image.wufazhuce.com/FkzJ7ly-Y0a9MljDsHHdQEvKK4S_","servertime":1467960431},{"id":"86","title":"独立日：卷土重来","verse":"","verse_en":"","score":"69","revisedscore":"0","releasetime":"2016-06-24 00:00:00","scoretime":"2016-06-25 00:00:00","cover":"http://image.wufazhuce.com/Fjb4sPZL0U1a526U7zNT_Dv92VIz","servertime":1467960431},{"id":"76","title":"咖啡公社","verse":"","verse_en":"","score":"70","revisedscore":"0","releasetime":"2016-06-19 00:00:00","scoretime":"2016-06-20 00:00:00","cover":"http://image.wufazhuce.com/FhRmQQL34qo9iv54wSACFZI6hr1b","servertime":1467960431},{"id":"74","title":"乡愁","verse":"","verse_en":"","score":"74","revisedscore":"0","releasetime":"2016-06-18 00:00:00","scoretime":"2016-06-19 00:00:00","cover":"http://image.wufazhuce.com/Fsjs4Gb3_gFLJwZQks_EGJwjbN8L","servertime":1467960431},{"id":"80","title":"思悼","verse":"","verse_en":"","score":"75","revisedscore":"0","releasetime":"2016-06-17 00:00:00","scoretime":"2016-06-18 00:00:00","cover":"http://image.wufazhuce.com/FtQ-a-9yfuPauQ1rwkAatWnjwqqq","servertime":1467960431},{"id":"75","title":"布达佩斯大饭店","verse":"","verse_en":"","score":"85","revisedscore":"0","releasetime":"2016-06-16 00:00:00","scoretime":"2016-06-17 00:00:00","cover":"http://image.wufazhuce.com/FpGhqUqn5mj4pf86CFw76eiNqwZR","servertime":1467960431},{"id":"78","title":"晚春","verse":"","verse_en":"","score":"65","revisedscore":"0","releasetime":"2016-06-15 00:00:00","scoretime":"2016-06-16 00:00:00","cover":"http://image.wufazhuce.com/Fl68FV2cfPFSQzgF4Ek9UF9Ei6gs","servertime":1467960431},{"id":"82","title":"海街日记","verse":"","verse_en":"","score":"76","revisedscore":"0","releasetime":"2016-06-14 00:00:00","scoretime":"2016-06-15 00:00:00","cover":"http://image.wufazhuce.com/Fpe2eWLZ29hOE8q6nqdqrxjMPZcu","servertime":1467960431},{"id":"83","title":"海底总动员2","verse":"","verse_en":"","score":"75","revisedscore":"0","releasetime":"2016-06-17 00:00:00","scoretime":"2016-06-18 00:00:00","cover":"http://image.wufazhuce.com/Ftm2OwzwJ4Q6Iv34I3lLYwAZiL5C","servertime":1467960431},{"id":"77","title":"魂断威尼斯","verse":"","verse_en":"","score":"63","revisedscore":"0","releasetime":"2016-06-13 00:00:00","scoretime":"2016-06-14 00:00:00","cover":"http://image.wufazhuce.com/FokuA9zFpMWda70F4ucItssXhDtN","servertime":1467960431},{"id":"81","title":"龙虾","verse":"","verse_en":"","score":"67","revisedscore":"0","releasetime":"2016-06-12 00:00:00","scoretime":"2016-06-13 00:00:00","cover":"http://image.wufazhuce.com/Fn2JUKqI4NvfG52dUqnJLATZ2xLJ","servertime":1467960431}]
     */

    private int res;
    /**
     * id : 92
     * title : 寒战2
     * verse :
     * verse_en :
     * score : null
     * revisedscore : 0
     * releasetime : 2016-07-08 00:00:00
     * scoretime : 2016-07-09 00:00:00
     * cover : http://image.wufazhuce.com/FulzuviRZ1_GiFYO0sVS68jD2sDt
     * servertime : 1467960431
     */

    private List<DataBean> data;

    public static listBean objectFromData(String str) {

        return new Gson().fromJson(str, listBean.class);
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String title;
        private String verse;
        private String verse_en;
        private Object score;
        private String revisedscore;
        private String releasetime;
        private String scoretime;
        private String cover;
        private int servertime;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVerse() {
            return verse;
        }

        public void setVerse(String verse) {
            this.verse = verse;
        }

        public String getVerse_en() {
            return verse_en;
        }

        public void setVerse_en(String verse_en) {
            this.verse_en = verse_en;
        }

        public Object getScore() {
            return score;
        }

        public void setScore(Object score) {
            this.score = score;
        }

        public String getRevisedscore() {
            return revisedscore;
        }

        public void setRevisedscore(String revisedscore) {
            this.revisedscore = revisedscore;
        }

        public String getReleasetime() {
            return releasetime;
        }

        public void setReleasetime(String releasetime) {
            this.releasetime = releasetime;
        }

        public String getScoretime() {
            return scoretime;
        }

        public void setScoretime(String scoretime) {
            this.scoretime = scoretime;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getServertime() {
            return servertime;
        }

        public void setServertime(int servertime) {
            this.servertime = servertime;
        }
    }
}
