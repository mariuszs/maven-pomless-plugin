package pomless;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "pomless", requiresProject = false)
public class PomLessMojo extends AbstractMojo {

    @Override
    public void execute() {
        getLog().info("pomless build succeeded");
    }

}
