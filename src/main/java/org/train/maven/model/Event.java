package org.train.maven.model;

import java.util.Objects;
import java.util.UUID;

public class Event {
    private UUID uuid;
    private String name;
    private String message;

    public Event() {
    }

    public Event(UUID uuid, String name, String message) {
        this.uuid = uuid;
        this.name = name;
        this.message = message;
    }

    public Event(String name, String message) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.message = message;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(uuid, event.uuid) && Objects.equals(name, event.name) && Objects.equals(message, event.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, message);
    }

    @Override
    public String toString() {
        return "Event{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
