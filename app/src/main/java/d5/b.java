package d5;

import android.adservices.measurement.DeletionRequest;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.graphics.HardwareBufferRenderer;
import android.hardware.HardwareBuffer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ GetTopicsRequest.Builder e() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse i(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic j(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager k(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* synthetic */ HardwareBufferRenderer m(HardwareBuffer hardwareBuffer) {
        return new HardwareBufferRenderer(hardwareBuffer);
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void q() {
        new DeletionRequest.Builder();
    }
}
