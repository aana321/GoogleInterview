import jdk.nashorn.internal.parser.JSONParser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

    public class DataAccess {
        public static void main(String[] args) throws IOException, MalformedURLException {



            ObjectMapper mapper = new ObjectMapper();

            // Open the URL for reading
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                List<JsonNode> users = new ArrayList<>();

                String line;
                while ((line = reader.readLine()) != null) {
                    // Parse the line into a JSON object
                    JsonNode node = mapper.readTree(line);
                    users.add(node);
                }

                // Iterate through the list of users
                for (JsonNode user : users) {
                    // Get the phone number and address
                    String phone = user.get("phone").asText();
                    String address = user.get("address").get("street").asText();
                    System.out.println("Phone: " + phone);
                    System.out.println("Address: " + address);
                }
            }
        }
    }







