package Microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "Feign-Interceptor" ,url = "http://localhost:5657/database")
public interface FiegnCommunicator{
    @GetMapping("/exe/{exeid}")
    public List<Ekart_Entity> getcourier(@PathVariable("exeid") int exeid);
}
