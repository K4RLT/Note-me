package qc;
import c.b;

/* loaded from: classes.dex */
public final class l implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final l f23847a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f23848b = zc.b("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f23849c = zc.b("size");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f23850d = zc.b("name");
    public static final zc.c e = zc.b("uuid");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        zc.e eVar = (zc.e) obj2;
        s0 s0Var = (s0) ((v1) obj);
        eVar.d(f23848b, s0Var.f23927a);
        eVar.d(f23849c, s0Var.f23928b);
        eVar.a(f23850d, s0Var.f23929c);
        String str = s0Var.f23930d;
        if (str != null) {
            bArr = str.getBytes(m2.f23870a);
        } else {
            bArr = null;
        }
        eVar.a(e, bArr);
    }
}
