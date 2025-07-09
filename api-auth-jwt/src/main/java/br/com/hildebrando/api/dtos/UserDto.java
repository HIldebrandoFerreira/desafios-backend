package br.com.hildebrando.api.dtos;

public record UserDto(
        String name,
        String email,
        String password
) {
}
