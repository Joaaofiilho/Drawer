package Elements;

import Elements.Properties.Properties;

public abstract class Element {
    protected Properties properties;

    public abstract void mount(Drawer drawer);

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
