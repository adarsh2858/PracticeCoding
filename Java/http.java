import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringWriter;
// import org.apache.commons.io.IOUtils;
import java.net.HttpURLConnection;
import java.net.URL;

class http {

    public static void main(String[] args) {

        try {
            // Create a neat value object to hold the URL
            // URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
            URL awsAPI = new URL("https://h5p9ullr2j.execute-api.ap-south-1.amazonaws.com/dev/service");

            // Open a connection(?) on the URL(??) and cast the response(???)
            HttpURLConnection connection = (HttpURLConnection) awsAPI.openConnection();

            // Now it's "open", we can set the request method, headers etc.
            // connection.setRequestProperty("accept", "application/json");

            // This line makes the request
            InputStream responseStream = connection.getInputStream();

            // StringWriter writer = new StringWriter();
            // IOUtils.copy(inputStream, writer, encoding);
            // String theString = writer.toString();
            ByteArrayOutputStream result = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            for (int length; (length = responseStream.read(buffer)) != -1; ) {
                result.write(buffer, 0, length);
            }
            // StandardCharsets.UTF_8.name() > JDK 7
            // return result.toString("UTF-8");
            System.out.println(result.toString("UTF-8"));

            // Manually converting the response body InputStream to APOD using Jackson
            // ObjectMapper mapper = new ObjectMapper();
            // APOD apod = mapper.readValue(responseStream, APOD.class);

            // Finally we have the response
            // System.out.println(apod.title);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}