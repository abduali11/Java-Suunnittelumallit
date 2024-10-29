class CompensationClaimHandler extends FeedbackHandler {
    @Override
    public void handleFeedback(Message message) {
        if (message.getType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Processing compensation claim: " + message.getContent());
        } else {
            super.handleFeedback(message);
        }
    }
}

class ContactRequestHandler extends FeedbackHandler {
    @Override
    public void handleFeedback(Message message) {
        if (message.getType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Forwarding contact request to relevant department: " + message.getContent());
        } else {
            super.handleFeedback(message);
        }
    }
}

class DevelopmentSuggestionHandler extends FeedbackHandler {
    @Override
    public void handleFeedback(Message message) {
        if (message.getType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Logging development suggestion: " + message.getContent());
        } else {
            super.handleFeedback(message);
        }
    }
}

class GeneralFeedbackHandler extends FeedbackHandler {
    @Override
    public void handleFeedback(Message message) {
        if (message.getType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("Analyzing general feedback: " + message.getContent());
        } else {
            super.handleFeedback(message);
        }
    }
}
