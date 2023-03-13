package org.example.security;

import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

public class AesGcmExample {

    private static final String AES = "AES";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 16;
    private static final String STRONG_AES_GCM_ALGO = "AES/GCM/NoPadding";
    private static final String SECRET_KEY_STRONG_ALGO = "PBKDF2WithHmacSHA256";

    public static SecretKey generateKeyFromPassword(String password, String salt)
        throws NoSuchAlgorithmException, InvalidKeySpecException {

        SecretKeyFactory factory = SecretKeyFactory.getInstance(SECRET_KEY_STRONG_ALGO);

        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, 256);

        SecretKey originalKey = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), AES);

        return originalKey;
    }

    public static GCMParameterSpec getGcmParameterSpec() {

        byte[] iv = new byte[GCM_IV_LENGTH];
        new SecureRandom().nextBytes(iv);

        return new GCMParameterSpec(GCM_TAG_LENGTH * 8, iv);
    }

    public static String generateEncryptionSalt(){
        return new SecureRandom().toString();
    }

    public static String encryptAesGcm(String input, SecretKey key, GCMParameterSpec parameterSpec)
        throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException,
        InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        Cipher cipher = Cipher.getInstance(STRONG_AES_GCM_ALGO);
        cipher.init(Cipher.ENCRYPT_MODE, key, parameterSpec);

        byte[] cipherText = cipher.doFinal(input.getBytes());

        return Base64.getEncoder().encodeToString(cipherText);
    }

    public static String decryptAesGcm(String cipherText, SecretKey key, GCMParameterSpec parameterSpec)
        throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException,
        InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        Cipher cipher = Cipher.getInstance(STRONG_AES_GCM_ALGO);
        cipher.init(Cipher.DECRYPT_MODE, key, parameterSpec);

        byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(cipherText));

        return new String(plainText);

    }

    /**
     * This is a playground to try AES GCM encryption/decryption
     *
     * @param args
     */
    public static void main(String[] args) {

        String input = "TEXT SAMPLE TO USE";
        String password = "Hello123456!!";
        String salt = new SecureRandom().toString();

        try {

            GCMParameterSpec parameterSpec = getGcmParameterSpec();

            SecretKey key1 = generateKeyFromPassword(password, salt);
            String encrypted = encryptAesGcm(input, key1,parameterSpec);
            System.out.println("encrypted: " + encrypted);

            SecretKey key2 = generateKeyFromPassword(password, salt);
            String decrypted =  decryptAesGcm(encrypted,key2,parameterSpec);
            System.out.println("decrypted: " + decrypted);

        } catch (
            NoSuchAlgorithmException
            | InvalidAlgorithmParameterException
            | NoSuchPaddingException
            | IllegalBlockSizeException
            | BadPaddingException
            | InvalidKeyException
            | InvalidKeySpecException e
        ) {
            e.printStackTrace();
        }
    }
}
