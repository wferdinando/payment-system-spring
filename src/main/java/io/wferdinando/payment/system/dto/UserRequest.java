package io.wferdinando.payment.system.dto;

import io.wferdinando.payment.system.entity.User;

public record UserRequest(String name, String email, String password) {

    public User toModel() {
        return new User(name, email, password);
    }

}
