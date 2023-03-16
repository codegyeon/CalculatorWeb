package com.example.waspractice;

public class QueryString {
    private final String value;
    private final String key;

    public QueryString(String key, String value) {
        this.key = key;
        this.value = value;

    }

    public boolean exists(String key) {
        return this.key.equals(key);
    }

    public String getValue() {
        return this.value;
    }
}
