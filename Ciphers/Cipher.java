package Ciphers;

public interface Cipher {
    String decrypt(String plainText, String key);
    String encrypt(String plainText, String key);
}