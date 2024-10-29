// Enum for message types
enum MessageType {

    COMPENSATION_CLAIM, CONTACT_REQUEST, DEVELOPMENT_SUGGESTION, GENERAL_FEEDBACK
}

// Message class to hold feedback details
class Message {
    private MessageType type;
    private String content;
    private String senderEmail;

    public Message(MessageType type, String content, String senderEmail) {
        this.type = type;
        this.content = content;
        this.senderEmail = senderEmail;
    }

    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSenderEmail() {
        return senderEmail;
    }
}
