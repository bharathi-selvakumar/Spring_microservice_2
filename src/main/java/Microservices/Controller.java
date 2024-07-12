package Microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/micro")
public class Controller {
    @Autowired
    Executive_services services;




    @GetMapping("/exe/{id}")
    public Entity_Executive get_id(@PathVariable("id") int id){
        return services.getEkartAndExe(id);
    }

    @GetMapping("/get")
    public List<Entity_Executive> get(){
        return services.Read();
    }

    @PostMapping("/post")
    public Entity_Executive post(@RequestBody Entity_Executive data){
        return services.Post(data);
    }

    @GetMapping("/get/{id}")
    public Entity_Executive get_per(@PathVariable("id") int id){
        return services.read_per(id);
    }




}
