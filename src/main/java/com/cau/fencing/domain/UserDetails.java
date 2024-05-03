package com.cau.fencing.domain;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public abstract class UserDetails {
    public abstract Collection<? extends GrantedAuthority> getAuthorities();
}
