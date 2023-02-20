package com.tedu.exc;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class Artcle implements Serializable {


    private static final long serialVersionUID = -2190478991237776141L;

    int id;
    String title;
    String content;

    private void writeObject(ObjectOutputStream out) throws IOException {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] titleArray = encoder.encode(title.getBytes());
        byte[] contentArray = encoder.encode(content.getBytes());
        title = new String(titleArray);
        content = new String(contentArray);
        out.defaultWriteObject();
    }



}
