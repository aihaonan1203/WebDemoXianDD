package com.personal.revenant.xiandd.bean;

import java.util.List;

public class PhotoBean {


    /**
     * meta : {"code":200,"msg":"OK"}
     * data : ["/upload/userfiles/fileupload/2018-12-24/1545623708837400755.JPEG",null,null,null,null,null,null,null,null,null]
     */

    private MetaBean meta;
    private List<String> data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public static class MetaBean {
        /**
         * code : 200
         * msg : OK
         */

        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
