package com.microprofile.sample.todo.app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class TodoApplication extends Application {

    // application servlet definition

    public TodoApplication() {
    }
}
