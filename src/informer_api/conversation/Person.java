package informer_api.conversation;

import java.io.Serializable;

/**
 * <p>
 * Class for person in contact list. Stores only most necessary information.
 * </p>
 * Created by Piotr Waszkiewicz on 30.01.17.
 */
public class Person implements Serializable {
    private String nickname, number;
    private byte[] photo;

    public Person(String nickname, String number, byte[] photo) {
        this.nickname = nickname;
        this.number = number;
        this.photo = photo;
    }

    public Person(String number) {
        this.number = number;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNumber() {
        return number;
    }

    public byte[] getPhoto() {
        return photo;
    }

    @Override
    public int hashCode() {
        return nickname.hashCode() + number.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean equal = false;
        if (o instanceof Person)
            equal = (this.nickname.contentEquals(((Person) o).getNickname())) && (this.number.contentEquals(((Person) o).getNumber()));
        return equal;
    }
}
