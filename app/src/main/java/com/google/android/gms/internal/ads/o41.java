package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o41 extends q41 {
    public final /* synthetic */ s41 A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f8956z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(s41 s41Var, int i) {
        super(s41Var);
        this.f8956z = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(s41Var);
                this.A = s41Var;
                super(s41Var);
                return;
            case 2:
                Objects.requireNonNull(s41Var);
                this.A = s41Var;
                super(s41Var);
                return;
            default:
                Objects.requireNonNull(s41Var);
                this.A = s41Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final Object a(int i) {
        switch (this.f8956z) {
            case 0:
                return this.A.b()[i];
            case 1:
                return new r41(this.A, i);
            default:
                return this.A.c()[i];
        }
    }
}
