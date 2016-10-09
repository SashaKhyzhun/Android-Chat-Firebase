package com.sashakhyzhun.wearexample;

class Note {

    private String title = "";
    private String id = "";

    Note(String title, String id) {
        this.title = title;
        this.id = id;
    }

    String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
