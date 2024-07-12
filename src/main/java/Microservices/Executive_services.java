package Microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Executive_services {

    @Autowired
     Repo_executive jpa;

    @Autowired
    FiegnCommunicator fieng;


    public Entity_Executive getEkartAndExe(int id){
        Entity_Executive obj=jpa.findById(id).orElse(new Entity_Executive());
        if(obj!=null){
            obj.setEkartEntity(fieng.getcourier(obj.getExecutiveId()));
        }
        return obj;
    }

    public List<Entity_Executive> Read(){
        return jpa.findAll();
    }

    public Entity_Executive Post(Entity_Executive data){
        return jpa.save(data);
    }

    public Entity_Executive read_per(int id ){
        return jpa.findById(id).orElse(new Entity_Executive());
    }
}
