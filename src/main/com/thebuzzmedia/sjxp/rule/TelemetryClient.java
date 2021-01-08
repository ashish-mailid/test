import com.microsoft.applicationinsights.web.internal.ThreadContext;





public class TelemetryClient {
    private static final String SAMPLE_CSV_FILE_PATH = "./users.csv";

    public static void main(String[] args) throws IOException {
       static final TelemetryClient telemetryClient = new TelemetryClient();
boolean success = false;
long startTime = System.currentTimeMillis();
try {
    success = dependency.call();
} finally {
    long endTime = System.currentTimeMillis();
    RemoteDependencyTelemetry telemetry = new RemoteDependencyTelemetry();
    telemetry.setTimestamp(new Date(startTime));
    telemetry.setDuration(new Duration(endTime - startTime));
    telemetryClient.trackDependency(telemetry);
}
        }
    }
}
