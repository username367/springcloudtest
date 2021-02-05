package com.example.demo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2021/1/14.
 */
//配Feign的客户端接口，在接口中映射其他微服务中提供的具体服务
//name="producer"表示当前映射的是哪个服务中的方法
@Component
@FeignClient(name="producer",fallback = HelloRemote.HelloRemoteHystrix.class)
public interface HelloRemote {

    //当调用HelloRemote中的helloRomote方法时候
    //相当于调用producer服务中的/hello对应的方法
    @GetMapping("/hello")
    public String helloRomote(@RequestParam("name") String name);
    @Component
    public class HelloRemoteHystrix implements HelloRemote{
        @Override
        public String helloRomote(String name) {
        return "hello "+name+",该服务目前不可用";
    }
    }
}
