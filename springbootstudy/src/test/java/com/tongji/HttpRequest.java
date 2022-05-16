package com.tongji;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 * @author ZhangChunyuan
 * @date 2022-05-16 12:58
 */public class HttpRequest {
    public static void httpPost() throws Exception {

        // json格式的参数，我们可以用map来封装参数，然后将参数转换为json格式
        //{"visitType":"1","accountId":"200","content":"123456780","status":"000"}
        // {"biz_side":"kuaituantuan",
        // "app":"200",
        // "level":2,
        // "version":32369,
        // "report_time_ms":1652670871005,
        // "rand_num":127366,
        // "crc32":1436558695,
        // "common_tags":{"d":"microsoft","m":"microsoft","osV":"Windows 10 x64","releaseVersion":"3.23.69","uid":"4761693042"},
        // "datas":[{"category":4,"type":400,"id_raw_value":"10475","timestamp":1652670871005,"api_ratio":1,"tags":{"network":"1","custom_typeTagKey":"oc_render_tk","custom_ocRenderTk":"ocRenderTk","custom_source":"oc_page","custom_initLoadingRange":"lte5000"},"extras":{"platform":"windows","wxVersion":"3.6.0","system":"Windows 10 x64","manufacture":"microsoft","model":"microsoft","sdkVersion":"2.19.2","benchmarkLevel":"-1","ocRenderTk":"ocRenderTk","source":"oc_page","initLoadingRange":"lte5000","userName":"undefined","nickName":"ONE","uid":"4761693042","time":"2022-05-16 11:14:31","networkType":"1"},"lvalues":{"initLoading":{"values":[697]},"queryBaseInfo":{"values":[186]},"preRender":{"values":[6]},"loadAddressId":{"values":[162]},"loadLastAddress":{"values":[140]},"updateOrderAmount":{"values":[115]}}}]}
        Map<String, Object> params = new HashMap<>();
        params.put("visitType", "1");
        params.put("accountId", "2001111");
        params.put("content", "123456780");
        params.put("status", "000");
        String str = "{\"biz_side\":\"kuaituantuan\",\"app\":\"200\",\"level\":2,\"version\":32369,\"report_time_ms\":1652670871005,\"rand_num\":127366,\"crc32\":1436558695,\"common_tags\":{\"d\":\"microsoft\",\"m\":\"microsoft\",\"osV\":\"Windows 10 x64\",\"releaseVersion\":\"3.23.69\",\"uid\":\"4761693042\"},\"datas\":[{\"category\":4,\"type\":400,\"id_raw_value\":\"10475\",\"timestamp\":1652670871005,\"api_ratio\":1,\"tags\":{\"network\":\"1\",\"custom_typeTagKey\":\"oc_render_tk\",\"custom_ocRenderTk\":\"ocRenderTk\",\"custom_source\":\"oc_page\",\"custom_initLoadingRange\":\"lte5000\"},\"extras\":{\"platform\":\"windows\",\"wxVersion\":\"3.6.0\",\"system\":\"Windows 10 x64\",\"manufacture\":\"microsoft\",\"model\":\"microsoft\",\"sdkVersion\":\"2.19.2\",\"benchmarkLevel\":\"-1\",\"ocRenderTk\":\"ocRenderTk\",\"source\":\"oc_page\",\"initLoadingRange\":\"lte5000\",\"userName\":\"undefined\",\"nickName\":\"ONE\",\"uid\":\"4761693042\",\"time\":\"2022-05-16 11:14:31\",\"networkType\":\"1\"},\"lvalues\":{\"initLoading\":{\"values\":[697]},\"queryBaseInfo\":{\"values\":[186]},\"preRender\":{\"values\":[6]},\"loadAddressId\":{\"values\":[162]},\"loadLastAddress\":{\"values\":[140]},\"updateOrderAmount\":{\"values\":[115]}}}]}";
      /*  params.put("subTitle","44");
        params.put("leadTitle","44");
        params.put("abstract","44");
        params.put("articleType",0);
        params.put("source","44");
        params.put("tag","44");
        params.put("optUser","44");
        params.put("author","44");
        params.put("editor","44");
        params.put("liability","44");
        params.put("status",1);
        params.put("content","44");
        params.put("imgUrl","44");*/
        String paramsJson = JSON.toJSONString(params); // 将参数转换为json字符串
        System.out.println(paramsJson);

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost("https://pmmtk-a.pinduoduo.com/api/pmm/defined");
        httpPost.addHeader("Content-type", "application/json; charset=utf-8");


        StringEntity entity = new StringEntity(paramsJson, "UTF-8");
        httpPost.setEntity(entity);


        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
