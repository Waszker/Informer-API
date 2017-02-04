package informer_api.conversation;

import java.io.Serializable;

/**
 * <p>
 * Class storing message text and data.
 * </p>
 * Created by Piotr Waszkiewicz on 30.01.17.
 */
public class Message implements Serializable {
    private boolean isSentByOwner;
    private String date, text, destinationNumber;
    private byte[] data;

    /**
     * <p>
     * Creates normal text message (SMS);
     * </p>
     *
     * @param isSentByOwner - information who sent the message
     * @param date          - date when message was sent
     * @param text          - content of the message
     */
    public Message(boolean isSentByOwner, String date, String text) {
        this.isSentByOwner = isSentByOwner;
        this.date = date;
        this.text = text;
        this.data = null;
        this.destinationNumber = null;
    }

    /**
     * <p>
     * Message for sending purposes.
     * </p>
     *
     * @param destinationNumber
     * @param text
     */
    public Message(String destinationNumber, String text) {
        this.destinationNumber = destinationNumber;
        this.text = text;
        this.isSentByOwner = true;
        this.date = null;
        this.data = null;
    }

    public boolean isSentByOwner() {
        return isSentByOwner;
    }

    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public byte[] getData() {
        return data;
    }
}
