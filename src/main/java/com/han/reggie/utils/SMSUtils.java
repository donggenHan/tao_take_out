package com.han.reggie.utils;



import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
public class SMSUtils {

    /**
     * 发送短信
     * @param signName 签名
     * @param templateCode 模板
     * @param phoneNumbers 手机号
     * @param param 参数
     */
    public static void sendMessage(String signName, String templateCode,String phoneNumbers,String param){
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI5tG72JVofryUGc1751NP", "C0Wwv43wFq49ROrMzUbd2K6XUFRxsp");
        IAcsClient client = new DefaultAcsClient(profile);

        SendSmsRequest request = new SendSmsRequest();
        request.setSysRegionId("cn-hangzhou");
        request.setPhoneNumbers(phoneNumbers);//15968168704
        request.setSignName(signName);//阿里云短信测试
        request.setTemplateCode(templateCode);//SMS_154950909
        request.setTemplateParam("{\"code\":\""+param+"\"}");//"{\"code\":\""+param+"\"}"              "{\"code\":\"1234\"}"
        try {
            SendSmsResponse response = client.getAcsResponse(request);
            System.out.println("短信发送成功");
        }catch (ClientException e) {
            e.printStackTrace();
        }
    }

}
