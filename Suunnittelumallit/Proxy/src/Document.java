

import java.util.Date;

public class Document implements IDocument {
    private String identifier;
    private Date creationDate;
    private String content;

    public Document(String identifier, String content) {
        this.identifier = identifier;
        this.creationDate = new Date();
        this.content = content;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content; // Suojaamaton dokumentti, ei pääsynvalvontaa
    }
}
