package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final /* synthetic */ class jv implements z2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14533u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f14534v;

    public /* synthetic */ jv(int i, Object obj) {
        this.f14533u = i;
        this.f14534v = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z2
    public final Object zza() {
        boolean z3;
        switch (this.f14533u) {
            case 0:
                ((ss) this.f14534v).getClass();
                return lr.SHARED_PREFERENCES_ONLY;
            default:
                if (((s5) this.f14534v).g() != lr.PROTOSTORE_ONLY) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
        }
    }
}
