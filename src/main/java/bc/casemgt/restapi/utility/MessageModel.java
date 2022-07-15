package bc.casemgt.restapi.utility;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MessageModel {

    private String message;
    private boolean status;
    private Object data;
}