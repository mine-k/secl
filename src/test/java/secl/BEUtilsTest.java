package secl;

import org.junit.Assert;
import org.junit.Test;
import secl.common.BridgeEngineParameter;

public class BEUtilsTest {

    @Test
    public void encodeToString() throws Exception {
        BridgeEngineParameter parameter = new BridgeEngineParameter("123", "456", "789", "BT6P", "H");
        String encoded = BridgeEngineUtils.encodeToBase64String(parameter);
        System.out.println(encoded);
        BridgeEngineParameter bridgeEngineParameter = BridgeEngineUtils.decodeToBridgeEngineParameter(encoded);
        Assert.assertEquals("123", bridgeEngineParameter.getShareId());
        Assert.assertEquals("456", bridgeEngineParameter.getProjectId());
        Assert.assertEquals("789", bridgeEngineParameter.getVersion());
    }

}