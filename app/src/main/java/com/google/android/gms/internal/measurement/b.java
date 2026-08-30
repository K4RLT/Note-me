package com.google.android.gms.internal.measurement;
import j6.n;

import java.util.List;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f13645w = i;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n e(j6.n nVar, List list) {
        switch (this.f13645w) {
            case 0:
                return new g(Double.valueOf(0.0d));
            case 1:
                return n.f13848h;
            case 2:
            case 3:
                return this;
            default:
                return n.f13848h;
        }
    }
}
