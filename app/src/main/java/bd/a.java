package bd;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3196a;

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        switch (this.f3196a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                zc.e eVar = (zc.e) obj2;
                eVar.a(cd.f.f4088g, entry.getKey());
                eVar.a(cd.f.f4089h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
