package com.nantian.vo;



import java.io.Serializable;
import java.util.List;

public class ListFirstMotionVO implements Serializable {

    List<FirstMotionVO> infos;
    FirstMotionVO  req;

    public List<FirstMotionVO> getInfos() {
        return infos;
    }

    public void setInfos(List<FirstMotionVO> infos) {
        this.infos = infos;
    }

    public FirstMotionVO getReq() {
        return req;
    }

    public void setReq(FirstMotionVO req) {
        this.req = req;
    }

    @Override
    public String toString() {
        return "ListFirstMotionVO{" +
                "infos=" + infos +
                ", req=" + req +
                '}';
    }
}
