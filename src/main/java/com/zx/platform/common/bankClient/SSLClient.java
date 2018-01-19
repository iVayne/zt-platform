package com.zx.platform.common.bankClient;

import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * com.zx.platform.common.bankClient
 * Created By vayne
 * Time on 2018/1/19 上午10:55
 * 项目 zt-platform
 *
 */
public class SSLClient {
    public static String Host="111.205.51.153";//ip
    public static int Post=7765;//端口
    public static String Encoding="utf-8";
    public static String InstID="08808698";
    private static String macKey ="";//密钥交易
    /**
     * 获取交换密钥交易
     * @throws Exception
     */
    public static void getBankKey() throws Exception{
        HttpsClient HttpsClient = new HttpsClient();
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath()+"client";
        path = URLDecoder.decode(path,"utf-8");
        //设置客户端密钥库
        HttpsClient.setKeyStoreParameters(path + "client.pfx", "Abcd1234", "PKCS12");
        //设置客户端信任库
        HttpsClient.setTrustStoreParameters(path + "/cacerts", "changeit", "jks");
        //ip
        HttpsClient.setHost(Host);
        //端口
        HttpsClient.setPort(Post);

        //测试，模拟9000交换密钥交易
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        String operationDate = sf.format(new Date());
        String message = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><in><head><version>1.0.1</version><InstID>"+InstID+"</InstID><trmSeqNum>2450510253</trmSeqNum><tranDate>"+operationDate+"</tranDate><tranTime>141550</tranTime><tradeCode>9000</tradeCode><servName>Ser1</servName><reserve1></reserve1><reserve2></reserve2><reserve3></reserve3></head><body><operationDate>" + operationDate + "</operationDate><field1></field1></body></in>";
        String resultStr= HttpsClient.sengMessage(message);///银行返回数据
        System.out.println(HttpsClient.sengMessage(message));
    }

}
