
package bank.classes;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/**
 *
 * @author markj
 */

public class BankSMS {
    
    private final String BASE_URL = "https://n8x285.api.infobip.com";
    private final String API_KEY = "App 9e764f24ec4c25d8507eed7542145901-b786cbcb-d7b9-4384-8c9b-6e4ae9588c8d";
    private final String MEDIA_TYPE = "application/json";
    private final String SENDER = "TeamBangan Bank";
//    private static final String RECIPIENT = "639452573308";
//    private String RECIPIENT;

    public BankSMS(String pin, String RECIPIENT) {
        
        String validnumber = "+63" + RECIPIENT;
        String MESSAGE_TEXT = "Your One Time Pin is " + pin;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            
            String bodyJson = String.format("{\"messages\":[{\"from\":\"%s\",\"destinations\":[{\"to\":\"%s\"}],\"text\":\"%s\"}]}",
                    SENDER,
                    validnumber,
                    MESSAGE_TEXT
            );
            
            MediaType mediaType = MediaType.parse(MEDIA_TYPE);
            RequestBody body = RequestBody.create(bodyJson, mediaType);
            
            Request request = prepareHttpRequest(body);
            Response response = client.newCall(request).execute();
            
            System.out.println("HTTP status code: " + response.code());
            System.out.println("Response body: " + response.body().string());
        } catch (IOException ex) {
            Logger.getLogger(BankSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    private Request prepareHttpRequest(RequestBody body) {
        return new Request.Builder()
                .url(String.format("%s/sms/2/text/advanced", BASE_URL))
                .method("POST", body)
                .addHeader("Authorization", API_KEY)
                .addHeader("Content-Type", MEDIA_TYPE)
                .addHeader("Accept", MEDIA_TYPE)
                .build();
    }

 
}
