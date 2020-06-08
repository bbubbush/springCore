package com.bbubbush.demo.logic.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class DemoDomain {
    @Min(0)
    private long id;
    @NotEmpty
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
