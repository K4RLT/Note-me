package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final /* synthetic */ class hv implements m2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14441u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f14442v;

    public /* synthetic */ hv(String str, int i) {
        this.f14441u = i;
        this.f14442v = str;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
    public final Object l(Object obj) {
        cs csVar = (cs) obj;
        switch (this.f14441u) {
            case 0:
                return (gs) csVar.x().get(this.f14442v);
            case 1:
                return (tr) csVar.w().get(this.f14442v);
            default:
                zr zrVar = (zr) csVar.g();
                String str = this.f14442v;
                str.getClass();
                zrVar.b();
                cs.v((cs) zrVar.f14430v).remove(str);
                return (cs) zrVar.i();
        }
    }
}
