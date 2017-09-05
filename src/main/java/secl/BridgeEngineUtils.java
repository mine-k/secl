package secl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import secl.common.BridgeEngineParameter;

import java.io.IOException;
import java.util.Base64;

public abstract class BridgeEngineUtils {

    public static String encodeToBase64String(BridgeEngineParameter parameter) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(parameter);
        return Base64.getEncoder().encodeToString(json.getBytes());
    }

    public static BridgeEngineParameter decodeToBridgeEngineParameter(String encoded) throws IOException {
        String json = new String(Base64.getDecoder().decode(encoded.getBytes()));
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, BridgeEngineParameter.class);
    }

}
