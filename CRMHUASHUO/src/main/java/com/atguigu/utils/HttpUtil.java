package com.atguigu.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

/**
  * 
 * @project 
 * @author zhoushaohua
 * @create 2019-11-17 ����2:35:38
 */
public class HttpUtil {
	/** 
	 * ʹ��Get��ʽ��ȡ���� 
	 *  
	 * @param url 
	 *            URL����������http://HOST/XX?XX=XX&XXX=XXX 
	 * @param charset 
	 * @return 
	 */
	public static String sendGet(String url) {
		String result = "";
		BufferedReader in = null;
		try {
			URL realUrl = new URL(url);
			// �򿪺�URL֮�������  
			URLConnection connection = realUrl.openConnection();
			// ����ͨ�õ���������  
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// ����ʵ�ʵ�����  
			connection.connect();
			// ���� BufferedReader����������ȡURL����Ӧ  
			in = new BufferedReader(new InputStreamReader(connection
					.getInputStream(), "utf-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("����GET��������쳣��" + e);
			e.printStackTrace();
		}
		// ʹ��finally�����ر�������  
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
 
	/**  
	 * POST�����ַ�����ʽ����  
	 * @param url �����ַ  
	 * @param param ��������  
	 * @param charset ���뷽ʽ  
	 */
	public static String sendPostUrl(String url, String param, String charset) {
 
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// �򿪺�URL֮�������  
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ���������  
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// ����POST�������������������  
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// ��ȡURLConnection�����Ӧ�������  
			out = new PrintWriter(conn.getOutputStream());
			// �����������  
			out.print(param);
			// flush������Ļ���  
			out.flush();
			// ����BufferedReader����������ȡURL����Ӧ  
			in = new BufferedReader(new InputStreamReader(
					conn.getInputStream(), charset));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("���� POST ��������쳣��" + e);
			e.printStackTrace();
		}
		// ʹ��finally�����ر��������������  
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
 
	/**  
	 * POST����Map��ʽ����  
	 * @param url �����ַ  
	 * @param param ��������  
	 * @param charset ���뷽ʽ  
	 */
	public static String sendPost(String url, Map<String, String> param,
			String charset) {
 
		StringBuffer buffer = new StringBuffer();
		if (param != null && !param.isEmpty()) {
			for (Map.Entry<String, String> entry : param.entrySet()) {
				buffer.append(entry.getKey()).append("=").append(
						URLEncoder.encode(entry.getValue())).append("&");
 
			}
		}
		buffer.deleteCharAt(buffer.length() - 1);
 
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// �򿪺�URL֮�������  
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ���������  
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// ����POST�������������������  
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// ��ȡURLConnection�����Ӧ�������  
			out = new PrintWriter(conn.getOutputStream());
			// �����������  
			out.print(buffer);
			// flush������Ļ���  
			out.flush();
			// ����BufferedReader����������ȡURL����Ӧ  
			in = new BufferedReader(new InputStreamReader(
					conn.getInputStream(), charset));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("���� POST ��������쳣��" + e);
			e.printStackTrace();
		}
		// ʹ��finally�����ر��������������  
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
 
	public static void main(String[] args) {
		
		HttpUtil httpUtil = new HttpUtil();
		String urls="https://itunes.apple.com/lookup";
		String id = "1378934878";
		String idParm = "id="+id;
		
		
		String result = null;
		Map<String, String> iosNeedMap= new HashMap<String, String>();
		try {
			result = httpUtil.sendPostUrl(urls,idParm,"utf-8");
			JSONObject JSONObject = new JSONObject(result);
			String resStr = JSONObject.get("results").toString();
			String resStr2 =resStr.substring(1, resStr.length()-1);
			JSONObject JSONObjectStr2 = new JSONObject(resStr2);
			iosNeedMap.put("artworkUrl100", (String) JSONObjectStr2.get("artworkUrl100"));
			iosNeedMap.put("trackName", (String) JSONObjectStr2.get("trackName"));
			System.out.println(iosNeedMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}