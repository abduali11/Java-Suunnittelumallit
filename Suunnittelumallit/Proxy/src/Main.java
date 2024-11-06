public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User("user1");
        User user2 = new User("user2");

        // Luo suojaamaton ja suojattu dokumentti
        library.addDocument(new Document("doc1", "Unprotected document content"));
        library.createProtectedDocument("doc2", "Protected document content");

        // Myönnä käyttäjälle user1 pääsy doc2-dokumenttiin
        AccessControlService.getInstance().grantAccess(user1.getUsername(), "doc2");

        try {
            // Pääsy suojaamattomaan dokumenttiin
            IDocument doc1 = library.getDocument("doc1");
            System.out.println("doc1 content: " + doc1.getContent(user1));

            // Pääsy suojattuun dokumenttiin käyttäjällä, jolla on oikeudet
            IDocument doc2 = library.getDocument("doc2");
            System.out.println("doc2 content for user1: " + doc2.getContent(user1));

            // Yritetään pääsyä käyttäjällä, jolla ei ole oikeuksia (pitäisi heittää poikkeus)
            System.out.println("doc2 content for user2: " + doc2.getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
