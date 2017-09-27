package secl.common;

public class BridgeEngineParameter {

    private String shareId;
    private String projectId;
    private String version;
    private String synchType;
    private String hs;

    public BridgeEngineParameter() {
    }

    public BridgeEngineParameter(String shareId, String projectId, String version, String synchType, String hs) {
        this.shareId = shareId;
        this.projectId = projectId;
        this.version = version;
        this.synchType = synchType;
        this.hs = hs;
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

    public String getSynchType() {
        return synchType;
    }

    public void setSynchType(String synchType) {
        this.synchType = synchType;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    @Override
    public String toString() {
        return "BridgeEngineParameter{" +
                "shareId='" + shareId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", version='" + version + '\'' +
                ", synchType='" + synchType + '\'' +
                ", hs='" + hs + '\'' +
                '}';
    }
}
