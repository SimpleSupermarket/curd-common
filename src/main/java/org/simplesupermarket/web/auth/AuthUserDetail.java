package org.simplesupermarket.web.auth;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author 董文强
 * @version 1.0
 * @date 2018年12月03日
 */
public abstract class AuthUserDetail implements UserDetails {


    abstract public String getRoleName();
    abstract public Integer getId();
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> ro = new ArrayList<>();
        ro.add(new SimpleGrantedAuthority(this.getRoleName()));
        return ro;
    }

    abstract public Integer getRoleId();

    @Override
    public String getPassword() {
        return "no password!";
    }

    abstract public String getName();

    @Override
    abstract public String getUsername();

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
