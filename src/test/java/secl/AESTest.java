package secl;

import org.junit.Assert;
import org.junit.Test;

public class AESTest {

    @Test
    public void encodeTest() throws Exception {
        String encode = new AES().encode("1234");
        Assert.assertEquals(encode, "dnSNBNeTWbeQkvjHpem9UQ==");
    }

    @Test
    public void decodeTest() throws Exception {
        String decode = new AES().decode("dnSNBNeTWbeQkvjHpem9UQ==");
        Assert.assertEquals(decode, "1234");
    }

    @Test
    public void encodeTest2() throws Exception {
        String encode = new AES().encode("coint6746");
        System.out.println(encode);
    }

}