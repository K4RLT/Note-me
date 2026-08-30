package ya;
import zc.a;
import zc.d;
import zc.e;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w f31543b = new w(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w f31544c = new w(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31545a;

    public /* synthetic */ w(int i) {
        this.f31545a = i;
    }

    @Override // a
    public final void a(Object obj, Object obj2) {
        switch (this.f31545a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                e eVar = (e) obj2;
                eVar.a(x.f31572g, entry.getKey());
                eVar.a(x.f31573h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
