package io.getarrays.server.model;

public enum Status {
    SERVERUP("SERVER_UP"),
    SERVERDOWN("SERVER_DOWN");
    public final String status;
    Status(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
