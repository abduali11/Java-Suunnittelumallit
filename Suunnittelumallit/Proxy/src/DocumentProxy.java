import java.util.Date;

public class DocumentProxy implements IDocument {
    private Document document;
    private String identifier;

    public DocumentProxy(Document document) {
        this.document = document;
        this.identifier = document.getIdentifier();
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Date getCreationDate() {
        return document.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (AccessControlService.getInstance().isAllowed(user.getUsername(), identifier)) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }
}