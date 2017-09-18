package secl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import secl.common.BridgeEngineParameter;
import secl.common.Execution;
import secl.common.Office;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

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

    public static List<String> buildBridgeEngineExecuteArguments(BridgeEngineParameter parameter, Execution execution, Office office, String filePath) {
        List<String> args = new ArrayList<>();
        args.add("-execution");
        args.add(execution.name());
        args.add("-shareId");
        args.add(parameter.getShareId());
        args.add("-projectId");
        args.add(parameter.getProjectId());
        args.add("-version");
        args.add(parameter.getVersion());
        args.add("-office");
        args.add(office.name());
        args.add("-file");
        args.add(filePath);
        args.add("-schema");
        args.add("schema_data_batch");
        if (parameter.getSynchType() != null) {
            args.add("-synchType");
            args.add(parameter.getSynchType());
        }
        if (parameter.getHs() != null) {
            args.add("-hs");
            args.add(parameter.getHs());
        }
        return args;
    }

}
