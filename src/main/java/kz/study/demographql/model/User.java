package kz.study.demographql.model;

import java.util.List;

public record User(Long id, List<Event> events) {
}
