package wa;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements zc.d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e f29598b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e f29599c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29600a;

    public /* synthetic */ e(int i) {
        this.f29600a = i;
    }

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        switch (this.f29600a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                zc.e eVar = (zc.e) obj2;
                eVar.a(f.f29607g, entry.getKey());
                eVar.a(f.f29608h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
