package io.ansan.gradlenative;

import io.ansan.gradlenative.extention.GradleNativeExtension;
import org.gradle.api.Project;
import org.gradle.api.Plugin;

public class GradlenativePlugin implements Plugin<Project> {
    public void apply(Project project) {
      var extension = project.getExtensions().create("gradlenative", GradleNativeExtension.class);
    }
}
