package com.tongji.demo;

import com.alibaba.fastjson.JSON;
import com.tongji.demo.bean.VisitBase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		VisitBase vb = new VisitBase();
		vb.setVisitType(1);
		vb.setAccountId(1);
		vb.setStatus(1);
		vb.setContent("θΏεη");
		//vb.setShopIds(visitBase.getShopIds());
		System.out.println(JSON.toJSONString(vb));
	}

}
