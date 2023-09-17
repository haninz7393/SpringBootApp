package com.sol.SpringBootApp.models;

public enum Position {
    MANAGER, SUPERVISOR, TEAMLEADER, MEMBER;

    public String toString() {

        switch (this) {
            case MANAGER:
                return "manager";
            case SUPERVISOR:
                return "supervisor";
            case TEAMLEADER:
                return "teamleader";
            case MEMBER:
                return "member";
            default:
                return "";
        }
    }
}