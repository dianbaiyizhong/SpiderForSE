package com.hhm.searchengine.spiderforse.analyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

import com.hhm.searchengine.spiderforse.dao.impl.ContentDao;
import com.hhm.searchengine.spiderforse.vo.Content;

public class AnalyzerDomain {

	public void Start(Content content) {
		try {
			URL url = new URL(content.getUrl());
			try {
				InetAddress[] address = InetAddress.getAllByName(url.getHost());

				// 获取ip地址
				String ip = address[0].getHostAddress();

				content.setIp(ip);

				String arr_lal[] = getIPXY(ip);

				if (arr_lal.toString() != null) {
					content.setLal(arr_lal[0] + "," + arr_lal[1]);

				}

				content.setCity(GetAddressByIP(ip));

				// 保存
				ContentDao contentDao = new ContentDao();
				contentDao.Add(content);

			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	public static String getAddressByIP(String strIP) {
		try {
			URL url = new URL("http://ip.qq.com/cgi-bin/searchip?searchip1="
					+ strIP);
			URLConnection conn = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream(), "GBK"));
			String line = null;
			StringBuffer result = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				result.append(line);
			}
			reader.close();
			strIP = result.substring(result.indexOf("该IP所在地为："));
			strIP = strIP.substring(strIP.indexOf("：") + 1);
			String province = strIP.substring(6, strIP.indexOf("省"));
			String city = strIP.substring(strIP.indexOf("省") + 1, strIP
					.indexOf("市"));

			return province + city;

		} catch (IOException e) {
			return "读取失败";
		}
	}

	/**
	 * 获取指定IP对应的经纬度（为空返回当前机器经纬度）
	 * 
	 * @param ip
	 * @return
	 */
	static String ak = "oU5jofRjrAgcwFUneyKo8EE8";

	public static String[] getIPXY(String ip) {

		if (null == ip) {
			ip = "";
		}

		try {

			URL url = new URL("http://api.map.baidu.com/location/ip?ak=" + ak
					+ "&ip=" + ip + "&coor=bd09ll");
			InputStream inputStream = url.openStream();
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			BufferedReader reader = new BufferedReader(inputReader);
			StringBuffer sb = new StringBuffer();
			String str;
			do {
				str = reader.readLine();
				sb.append(str);
			} while (null != str);

			str = sb.toString();
			if (null == str || str.isEmpty()) {
				return null;
			}

			// 获取坐标位子
			int index = str.indexOf("point");
			int end = str.indexOf("}}", index);

			if (index == -1 || end == -1) {
				return null;
			}

			str = str.substring(index - 1, end + 1);
			if (null == str || str.isEmpty()) {
				return null;
			}

			String[] ss = str.split(":");
			if (ss.length != 4) {
				return null;
			}

			String x = ss[2].split(",")[0];
			String y = ss[3];

			x = x.substring(x.indexOf("\"") + 1, x.indexOf("\"", 1));
			y = y.substring(y.indexOf("\"") + 1, y.indexOf("\"", 1));

			return new String[] { x, y };

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static JSONObject readJsonFromUrl(String url) throws IOException,
			JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is,
					Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
			// System.out.println("同时 从这里也能看出 即便return了，仍然会执行finally的！");
		}
	}

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public String GetAddressByIP(String ip) {
		try {
			JSONObject json = readJsonFromUrl("http://api.map.baidu.com/location/ip?ak="
					+ ak + "&ip=" + ip);

			return ((JSONObject) json.get("content")).get("address").toString();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return null;
	}
}
