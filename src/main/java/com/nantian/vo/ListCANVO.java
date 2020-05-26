package com.nantian.vo;

import java.util.List;

public class ListCANVO {

    List<CandidateInfoVo> infos;
    List<CandidateInfoVo>  req;

    public List<CandidateInfoVo> getReq() {
        return req;
    }

    public void setReq(List<CandidateInfoVo> req) {
        this.req = req;
    }

    public List<CandidateInfoVo> getInfos() {
        return infos;
    }

    public void setInfos(List<CandidateInfoVo> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "ListCANVO{" +
                "infos=" + infos +
                ", req=" + req +
                '}';
    }
}
