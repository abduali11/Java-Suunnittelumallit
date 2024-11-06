import java.util.HashMap;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance;
    private Map<String, String> accessPermissions;

    private AccessControlService() {
        accessPermissions = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void grantAccess(String username, String documentId) {
        accessPermissions.put(username, documentId);
    }

    public boolean isAllowed(String username, String documentId) {
        return documentId.equals(accessPermissions.get(username));
    }
}
