package com.example;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "USER" )
public class User {

    @Id
    private UUID id;

    private String userName;
    private String passWord;

    public User() {
        this.id = UUID.randomUUID();
    }

    public User(final String userName, final String passWord) {
        this();
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(final UUID id, final String userName, final String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(final String passWord) {
        this.passWord = passWord;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        final User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null)
            return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null)
            return false;
        return passWord != null ? passWord.equals(user.passWord) : user.passWord == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        return result;
    }
}
