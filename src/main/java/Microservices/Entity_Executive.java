package Microservices;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Entity_Executive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int executiveId;
    private String executiveName;
    private int servicesPinCode;
    transient private List<Ekart_Entity> ekartEntity;
}
