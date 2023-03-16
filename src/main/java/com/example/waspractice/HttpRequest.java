package com.example.waspractice;

import java.io.BufferedReader;
import java.io.IOException;

public class HttpRequest {
    private  final  RequestLine requestLine;

    public HttpRequest(BufferedReader br) throws IOException {
        this.requestLine = new RequestLine(br.readLine());
    }

    public QueryStrings getQueryString() {
        return requestLine.getQueryStrings();
    }

    public boolean isGetRequest() {
        return requestLine.isGetRequest();
    }

    public boolean matchPath(String path) {
        return requestLine.matchPath(path);
    }



}
