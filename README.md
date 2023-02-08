# AESEncryption
implementation of encryption and decryption in Java using AES and bitwise operations:
You can use the encryption method by passing in a byte[] and a secret key String, and the decryption method by passing in the encrypted String and the secret key String.

Note that AES encryption requires a key size of 128, 192, or 256 bits, and the key length is determined by the size of the key byte array. In this example, the key length is set to 128 bits by using Arrays.copyOf to truncate the SHA-1 hash of the secret key to 16 bytes.

The encryption and decryption methods use the Advanced Encryption Standard (AES) algorithm in Electronic Code Book (ECB) mode, with PKCS5 padding.
