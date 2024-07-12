package Microservices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ekart_Entity {
    private int  parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private int  receiverContact;
    private int itemPrice;
    private  String itemStatus;
    private  String  executiveName;
    private int executiveID;
}
