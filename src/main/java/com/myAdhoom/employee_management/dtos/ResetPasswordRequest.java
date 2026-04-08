package com.myAdhoom.employee_management.dtos;

public record ResetPasswordRequest(
    String token,
    String newPassword
) {
}
