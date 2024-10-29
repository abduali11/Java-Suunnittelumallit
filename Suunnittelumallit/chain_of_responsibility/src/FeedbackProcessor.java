public class FeedbackProcessor {
    public static void main(String[] args) {

        FeedbackHandler compensationHandler = new CompensationClaimHandler();
        FeedbackHandler contactHandler = new ContactRequestHandler();
        FeedbackHandler suggestionHandler = new DevelopmentSuggestionHandler();
        FeedbackHandler generalHandler = new GeneralFeedbackHandler();

        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(suggestionHandler);
        suggestionHandler.setNextHandler(generalHandler);

        // Generate sample messages
        Message msg1 = new Message(MessageType.COMPENSATION_CLAIM, "Requesting refund for product damage.", "user1@example.com");
        Message msg2 = new Message(MessageType.CONTACT_REQUEST, "Need more details about product warranty.", "user2@example.com");
        Message msg3 = new Message(MessageType.DEVELOPMENT_SUGGESTION, " a new feature for the app.", "user3@example.com");
        Message msg4 = new Message(MessageType.GENERAL_FEEDBACK, "How are you?", "user4@example.com");

        // Process messages
        compensationHandler.handleFeedback(msg1);
        compensationHandler.handleFeedback(msg2);
        compensationHandler.handleFeedback(msg3);
        compensationHandler.handleFeedback(msg4);
    }
}
