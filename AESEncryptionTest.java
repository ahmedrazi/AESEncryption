import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class AESEncryptionTest {

    @Test
    public void testEncryptionAndDecryption() throws Exception {
        byte[] originalData = "test data".getBytes();
        String secretKey = "secret key";

        String encryptedData = AESEncryption.encrypt(originalData, secretKey);
        byte[] decryptedData = AESEncryption.decrypt(encryptedData, secretKey);

        assertArrayEquals(originalData, decryptedData);
    }
}

