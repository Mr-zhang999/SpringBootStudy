package com.tongji.demo.bean;
import lombok.Data;

import java.util.List;

@Data
public class VisitBase {

    private Integer visitType;
    private Integer accountId;
    private String content;
    private Integer status;
  //  private List<Integer> shopIds;

/*    public VisitBase() {
    }*/

/*    public VisitBase(Integer visitType, Integer accountId, String content, Integer status, List<Integer> shopIds) {
        this.visitType = visitType;
        this.accountId = accountId;
        this.content = content;
        this.status = status;
        this.shopIds = shopIds;
    }*/
}
