package qa.util;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;
import java.io.IOException;

public class QMetryJsonBinder {
    public String aKey,pID;

    public void sendJsonRequest(String apiKey,String project){
        try {
            createJsonRequest(apiKey,project);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createJsonRequest(String aKey,String pID) throws IOException {
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("https://testmanagement.qmetry.com/rest/import/createandscheduletestresults/1");
        httppost.addHeader("apikey", aKey);
        httppost.addHeader("project", pID);

        try {
            FileBody jsonFile = new FileBody(new File("test_reports/json_report/Test_Automation.json"));
            StringBody entityType = new StringBody("CUCUMBER");
            MultipartEntity reqEntity = new MultipartEntity();
            reqEntity.addPart("file", jsonFile);
            reqEntity.addPart("entityType", entityType);

            httppost.setEntity(reqEntity);
            System.out.println("Requesting : " + httppost.getRequestLine());
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseBody = httpclient.execute((HttpUriRequest) httppost, responseHandler);
            System.out.println("ResponseBody : " + responseBody);

        } catch (ClientProtocolException ignored) {
        } finally {
            httpclient.getConnectionManager().shutdown();
        }
    }
}
