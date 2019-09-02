package ha;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main( String[] args ) throws IOException {

        Page page = new Page();
        page.setTitle("title");
        page.setH1List(new ArrayList<>(Arrays.asList("fv", "sf")));
        HashMap<String, String> q = new HashMap<>();
        q.put("one", "sfwsfswfcwscfsdcsadcs");
        q.put("two", "sfvsfsrfsfvsdfvsdfvsd");
        page.setMetadata(q);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(page);

        System.out.println(json);

        Page pg;

        ObjectMapper mapper = new ObjectMapper();
        pg = mapper.readValue(json, Page.class);

        System.out.println(pg.getH1List());
        System.out.println(pg.getMetadata());
        System.out.println(pg.getTitle());

    }
}

