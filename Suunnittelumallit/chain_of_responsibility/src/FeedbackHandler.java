abstract class FeedbackHandler {
    protected FeedbackHandler nextHandler;

    public void setNextHandler(FeedbackHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleFeedback(Message message) {
        if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        } else {
            System.out.println("Unhandled feedback: " + message.getContent());
        }
    }
}
