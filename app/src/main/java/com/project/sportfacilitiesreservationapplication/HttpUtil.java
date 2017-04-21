package com.project.sportfacilitiesreservationapplication;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jylee on 2017-04-18.
 */

public class HttpUtil {
    /** HTTP_METHOD_GET. */
    private static final String HTTP_METHOD_GET = "GET";
    private static final String TAG_NAME = "HttpUtil";

    public static String get(String url) {
        Log.d(TAG_NAME, "url:" + url);
        return request(url, HTTP_METHOD_GET);
    }
    private static String request(String url, String method) {
        String result = null;
        HttpURLConnection con = null;
        BufferedReader reader = null;
        try {
            con = (HttpURLConnection) new URL(url).openConnection();
            con.setRequestMethod(method);
            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            result = sb.toString();
        } catch (MalformedURLException e) {
            Log.e(TAG_NAME, e.getMessage(), e);
        } catch (IOException e) {
            Log.e(TAG_NAME, e.getMessage(), e);
        } finally {
            if (con != null) {
                con.disconnect();
            }
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        Log.d(TAG_NAME, "response:" + result);
        return result;
    }
}
