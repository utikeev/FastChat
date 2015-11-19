package com.sandwwraith.fastchat.social;

import java.io.InputStream;
import java.net.URL;

/**
 * Created by sandwwraith(@gmail.com)
 * ITMO University, 2015.
 */
public interface SocialWrapper {
    String retrieveToken(String url);

    String retrieveId(String url);

    URL generateUserInfoRequest(String token, String id);

    String generateTokenRequest(); //String because WebView requires string

    SocialUser parseUserData(InputStream in);
}
