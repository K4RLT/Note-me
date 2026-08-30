package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14952a;

    public /* synthetic */ s1(int i) {
        this.f14952a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f14952a) {
            case 0:
                if (obj == null) {
                    ba.p pVar = t1.A;
                    throw null;
                }
                throw new ClassCastException();
            case 1:
                throw p.a.f(obj);
            case 2:
                throw p.a.f(obj);
            case 3:
                throw p.a.f(obj);
            default:
                throw p.a.f(obj);
        }
    }
}
