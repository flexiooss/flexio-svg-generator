package TRS;

import io.flexio.svg.generator.generator.Attribute;

public interface DataSet {
    static DataSet.Builder builder() {
        return new DataSet.Builder();
    }

    public void to(Attribute attributes);

    public static class Builder {
        private String event;
        private String type;
        private String resourceId;
        private String recordId;

        public DataSet build() {
            return new DataSetImpl(this.event, this.type, this.resourceId, this.recordId);
        }

        public DataSet.Builder event(String event) {
            this.event = event;
            return this;
        }

        public DataSet.Builder type(String type) {
            this.type = type;
            return this;
        }

        public DataSet.Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public DataSet.Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
    }
}
