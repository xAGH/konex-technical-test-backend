package xagh.technical_test.konex.core.infrastructure;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseBody {
    private Boolean status;
    private String message;
    private Object data;
}
