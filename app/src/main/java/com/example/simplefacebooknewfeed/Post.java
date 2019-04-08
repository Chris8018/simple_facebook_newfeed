package com.example.simplefacebooknewfeed;

class Post {
    private String username;
    private String text;
    private String photo;

    public Post(String username, String text, String photo) {
        this.username = username;
        this.text = text;
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
