package ha;


import java.util.*;


public class Page {
    private String url;
    private String title;
    private Map<String, String> metadata = new HashMap<>();
    private Map<String, String> links = new HashMap<>();
    private List<String> h1List = new ArrayList<>();
    private List<String> h2List = new ArrayList<>();
    private List<String> h3to6List = new ArrayList<>();
    private List<String> plainTextList = new ArrayList<>(); //<p>, <pre> and <span> tags


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public List<String> getH1List() {
        return h1List;
    }

    public void setH1List(List<String> h1List) {
        this.h1List = h1List;
    }
}
