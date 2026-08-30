package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final /* synthetic */ class vu implements m2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15155u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Boolean f15156v;

    public /* synthetic */ vu(Boolean bool, int i) {
        this.f15155u = i;
        this.f15156v = bool;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
    public final Object l(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f15155u) {
            case 0:
                boolean z3 = false;
                if (bool.booleanValue() && this.f15156v.booleanValue()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                boolean z9 = false;
                if (bool.booleanValue() && this.f15156v.booleanValue()) {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
        }
    }
}
