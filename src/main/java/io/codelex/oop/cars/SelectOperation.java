package io.codelex.oop.cars;

public enum SelectOperation {
    LESS_THAN("<"),
    GREATER_THAN(">"),
    LESS_OR_EQUAL("<="),
    GREATER_OR_EQUAL(">="),
    EQUALS("="),
    DOES_NOT_EQUAL("!=");

    private final String operationInString;

    SelectOperation(String operationInString) {
        this.operationInString = operationInString;
    }

    public String getOperationInString() {
        return operationInString;
    }

    public static SelectOperation getOperation(String s) {
        switch (s) {
            case "<" -> {
                return LESS_THAN;
            }
            case ">" -> {
                return GREATER_THAN;
            }
            case "<=" -> {
                return LESS_OR_EQUAL;
            }
            case ">=" -> {
                return GREATER_OR_EQUAL;
            }
            case "=" -> {
                return EQUALS;
            }
            case "!=" -> {
                return DOES_NOT_EQUAL;
            }
            default -> {
                return null;
            }
        }
    }
}
