package secl.common;

public class BridgeEngineParameter {

    private String shareId;
    private String projectId;
    private String version;

    public BridgeEngineParameter() {
    }

    public BridgeEngineParameter(String shareId, String projectId, String version) {
        this.shareId = shareId;
        this.projectId = projectId;
        this.version = version;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }
}
