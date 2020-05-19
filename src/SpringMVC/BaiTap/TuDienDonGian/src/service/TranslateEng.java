package service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TranslateEng implements Translate {

    static Map<String,String> map = new HashMap<>();
    static{
            map.put("hello","Xin Chào");
            map.put("bye bye","Tạm Biệt");
            map.put("handsome","Đẹp Trai");
            map.put("like","Thích");
            map.put("love","Yêu");
    }
    @Override
    public String translate(String key) {
        String result = "";
        try {
            result = map.get(key);
            return result;
        }catch (Exception e){
            throw e;
        }
    }
}
