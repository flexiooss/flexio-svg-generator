import generator.Attribute;

public class DataSetImpl implements DataSet {
    private String event;
    private String type;
    private String resourceId;
    private String recordId;

    public DataSetImpl(String event, String type, String resourceId, String recordId) {
        this.event = event;
        this.type = type;
        this.resourceId = resourceId;
        this.recordId = recordId;
    }

    @Override
    public void to(Attribute attributes) {
        attributes.attributes("data-event", this.event);
        attributes.attributes("data-type", this.type);
        attributes.attributes("data-resource-id", this.resourceId);
        attributes.attributes("data-record-id", this.recordId);
    }
}
