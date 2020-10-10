package com.javatrip.encypt;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.security.MessageDigest;
/**
* @ClassName: Des3 加密解密类
* @Description: java类作用描述
* @Author: 公众号：Java旅途
* @CreateDate: 2020/10/11 0:14
* @Version: 1.0
*/
public class Des3 {
	/**
	 * 数据加密
	 * @param src  解密串
	 * @param key  加密秘钥
	 * @return
	 * @throws Exception
	 */
	public static String encryptThreeDESECB(String src, String key) throws Exception {
		DESedeKeySpec dks = new DESedeKeySpec(key.getBytes("UTF-8"));
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
		SecretKey securekey = keyFactory.generateSecret(dks);

		Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, securekey);
		byte[] b = cipher.doFinal(src.getBytes("UTF-8"));

		String ss = new String(Base64.encodeBase64(b));
		ss = ss.replaceAll("\\+", "-");
		ss = ss.replaceAll("/", "_");
		return ss;
	}

	// 3DESECB解密,key必须是长度大于等于 3*8 = 24 位
	/**
	 * 解密
	 * @param src   解密串
	 * @param key   解密秘钥
	 * @return
	 * @throws Exception
	 */
	public static String decryptThreeDESECB(String src, String key) throws Exception {
		src = src.replaceAll("-", "+");
		src = src.replaceAll("_", "/");
		byte[] bytesrc = Base64.decodeBase64(src.getBytes("UTF-8"));
		// --解密的key
		DESedeKeySpec dks = new DESedeKeySpec(key.getBytes("UTF-8"));
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
		SecretKey securekey = keyFactory.generateSecret(dks);

		// --Chipher对象解密
		Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, securekey);
		byte[] retByte = cipher.doFinal(bytesrc);

		return new String(retByte, "UTF-8");
	}
	
	
	public static String string2MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];
		for (int i = 0; i < charArray.length; i++){
			byteArray[i] = (byte) charArray[i];
		}
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16){
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
	public static final String DES3KEY = "javatripzzzzzzzzxxxxxxxx";

	public static void main(String[] args) throws Exception{
		String st = encryptThreeDESECB("root", DES3KEY);
		System.out.println(st);
	}
}
