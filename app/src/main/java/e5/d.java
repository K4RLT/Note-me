package e5;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.f15916b = i;
    }

    @Override // e5.f
    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        switch (this.f15916b) {
            case 1:
                aVar.getClass();
                adsSdkName = d5.b.e().setAdsSdkName("com.google.android.gms.ads");
                shouldRecordObservation = adsSdkName.setShouldRecordObservation(aVar.f15911a);
                build = shouldRecordObservation.build();
                build.getClass();
                return build;
            default:
                return super.a(aVar);
        }
    }
}
