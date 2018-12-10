package org.simplesupermarket.web.mvc.datahandle;

import org.simplesupermarket.web.auth.AuthUserDetail;

public interface DataHandle {
    <T> T handleData(T data, AuthUserDetail user);
}
