package com.example.voila.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.voila.entities.Role;
import com.example.voila.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
public class UserDetailsImpl implements  UserDetails {
    Collection<GrantedAuthority> authorities = new ArrayList<>();

    private static final long serialVersionUID = 1L;
    private final User user;

    public UserDetailsImpl(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        for (final Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getTitre()));
        }
        return authorities;

    }


    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

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
