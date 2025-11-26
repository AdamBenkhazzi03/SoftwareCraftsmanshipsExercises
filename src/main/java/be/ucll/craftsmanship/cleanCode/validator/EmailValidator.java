package be.ucll.craftsmanship.cleanCode.validator;

public class EmailValidator {
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public void validate(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        if (!email.matches(EMAIL_PATTERN)) {
            throw new IllegalArgumentException("Invalid email format");
        }
    }
}
