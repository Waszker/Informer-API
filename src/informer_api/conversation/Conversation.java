package informer_api.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     Class representing text conversations with other people.
 *     Created basing on phone number.
 * </p>
 * Created by Piotr Waszkiewicz on 30.01.17.
 */
public class Conversation implements Serializable {
    private Person person;
    private List<Message> messages;

    /**
     * <p>
     *     Creates conversation object holding messages exchanged between person and phone owner.
     * </p>
     * @param person - the person whom owner has the conversation with
     */
    public Conversation(Person person) {
        this.person = person;
        this.messages = new ArrayList<>();
    }

    /**
     * <p>
     *     Adds message to whole conversation.
     * </p>
     * @param message - data exchanged between user and other person
     */
    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public Person getPerson() {
        return person;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
