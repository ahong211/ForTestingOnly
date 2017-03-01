package com.example.albert.fortestingonly;

/**
 * Created by Albert on 2/20/17.
 */

public class AndroidFlavor {
    String versionName;
    String versionNumber;
    int image; // drawable reference id

    public AndroidFlavor(String vName, String vNumber, int image) {
        this.versionName = vName;
        this.versionNumber = vNumber;
        this.image = image;
    }
}
