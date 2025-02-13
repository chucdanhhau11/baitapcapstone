package com.java06.luxurious_hotel.exception.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNotActivatedException extends RuntimeException{
    private String message = "User account not activated!";
}
