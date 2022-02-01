package qa.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PractiTestJsonCreator {
    public static String projID, pAPIKey;
    //String reqString;

    public void getPractiTestDetails(String projectID, String pApiKey) {
        projID = projectID;
        pAPIKey = pApiKey;

        if (!Files.exists(Paths.get("target/practitest-json/pt.json"))) {
            File pjDirectory = new File("target", "practitest-json");
            pjDirectory.mkdir();
            defaultJsonWriter();
        } else {
            defaultJsonWriter();
        }
    }

    public void sendToAPI(String jsonReq) {
        URL url;
        {
            try {
                url = new URL("https://api.practitest.com/api/v2/projects/" + projID + "/runs.json?api_token=" + pAPIKey + "");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type", "application/json; utf-8");
                con.setRequestProperty("Accept", "application/json");
                con.setDoOutput(true);

                try (OutputStream os = con.getOutputStream()) {
                    byte[] input = jsonReq.getBytes(StandardCharsets.UTF_8);
                    os.write(input, 0, input.length);
                }

                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine = null;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                    System.out.println("Json Response : " + response);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void jsonRequestCreator(String instance, int status) throws IOException {
        /*try {
            if (jsonObjectCount() <= 2) {
                reqString = newJsonCreator(instance, status);
                if (jsonObjectCount() == 2) {
                    sendToAPI(reqString);
                    defaultJsonWriter();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        sendToAPI(newJsonCreator(instance, status));
    }

    public void defaultJsonWriter() {
        File yourFile = new File("target/practitest-json/pt.json");
        try {
            yourFile.createNewFile();
            PrintWriter writer = new PrintWriter("target/practitest-json/pt.json", "UTF-8");
            writer.println("{\"data\":[]}");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readJsonFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get("target/practitest-json/pt.json")));
    }

    /*public int jsonObjectCount() throws IOException {
        JsonObject jsonObject = (JsonObject) new JsonParser().parse(readJsonFile());
        JsonArray dataObject = jsonObject.getAsJsonArray("data");
        return dataObject.size();
    }*/

    public String newJsonCreator(String instance, int status) throws IOException {
        /*JsonObject PreviousJsonObj = (JsonObject) new JsonParser().parse(readJsonFile());
        JsonArray array = PreviousJsonObj.getAsJsonArray("data");*/

        //Creating a JSONObject object
        JsonObject jsonObj = new JsonObject();
        //Inserting key-value pairs into the json object
        jsonObj.addProperty("type", "instances");

        JsonObject attributesObject = new JsonObject();
        attributesObject.addProperty("instance-id", instance);
        attributesObject.addProperty("exit-code", status);
        attributesObject.addProperty("automated-execution-output", "THIS IS MY OUTPUT");
        attributesObject.addProperty("run-duration", "00:00:30");
        jsonObj.add("attributes", attributesObject);

        JsonArray array = new JsonArray();
        array.add(jsonObj);

        JsonObject currentJsonObject = new JsonObject();
        currentJsonObject.add("data", array);

        System.out.println("asdasdasdasdasdads        " + currentJsonObject);

        try (FileWriter file = new FileWriter("target/practitest-json/pt.json")) {
            file.write(currentJsonObject.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readJsonFile();
    }
}
