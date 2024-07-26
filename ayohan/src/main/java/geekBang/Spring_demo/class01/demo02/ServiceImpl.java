package geekBang.Spring_demo.class01.demo02;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {

    private String serviceName;

    public ServiceImpl(String serviceName) {
        this.serviceName = serviceName;
    }

}