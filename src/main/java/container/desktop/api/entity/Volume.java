package container.desktop.api.entity;

public interface Volume extends Entity {
    String getId();
    String getContainerId();
    void setContainerId(String containerId);
    String getMountPoint();
    void setMountPoint(String mountPoint);
    Integer getSize();
    void setSize(Integer size);
}
