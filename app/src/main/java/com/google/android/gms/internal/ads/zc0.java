package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zc0 extends com.google.android.gms.internal.measurement.e4 {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f13136y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc0(s90 s90Var, h00 h00Var, int i) {
        super(6, s90Var, h00Var, false);
        this.f13136y = i;
    }

    @Override // com.google.android.gms.internal.measurement.e4
    public Set p(a60 a60Var) {
        switch (this.f13136y) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.p(a60Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e4
    public Set q(a60 a60Var) {
        switch (this.f13136y) {
            case 1:
                return Collections.EMPTY_SET;
            default:
                return super.q(a60Var);
        }
    }
}
