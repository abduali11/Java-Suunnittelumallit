import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, IDocument> documents = new HashMap<>();

    public void addDocument(IDocument document) {
        documents.put(document.getIdentifier(), document);
    }

    public IDocument getDocument(String identifier) {
        return documents.get(identifier);
    }

    public void createProtectedDocument(String identifier, String content) {
        Document realDoc = new Document(identifier, content);
        DocumentProxy proxy = new DocumentProxy(realDoc);
        addDocument(proxy); // Tallennetaan vain proxy kirjastoon
    }
}
