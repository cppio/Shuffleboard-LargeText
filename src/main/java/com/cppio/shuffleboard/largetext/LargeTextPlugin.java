package com.cppio.shuffleboard.largetext;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import java.util.List;

@Description(
    group = "com.cppio.shuffleboard",
    name = "Large Text",
    summary = "Provides the Large Text widget",
    version = "0.1.0"
)
public class LargeTextPlugin extends Plugin {
    @Override
    public List<ComponentType> getComponents() {
        return List.of(WidgetType.forAnnotatedWidget(LargeTextWidget.class));
    }
}
