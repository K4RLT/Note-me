package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.q41;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s3 extends q41 {
    public final /* synthetic */ w3 A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f14954z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(w3 w3Var, int i) {
        super(w3Var);
        this.f14954z = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(w3Var);
                this.A = w3Var;
                super(w3Var);
                return;
            case 2:
                Objects.requireNonNull(w3Var);
                this.A = w3Var;
                super(w3Var);
                return;
            default:
                Objects.requireNonNull(w3Var);
                this.A = w3Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final Object a(int i) {
        int i10 = this.f14954z;
        w3 w3Var = this.A;
        switch (i10) {
            case 0:
                Object obj = w3.D;
                return w3Var.b()[i];
            case 1:
                return new v3(w3Var, i);
            default:
                Object obj2 = w3.D;
                return w3Var.c()[i];
        }
    }
}
