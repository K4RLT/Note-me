package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ab1 extends ca1 {
    public final bb1 P;
    public final gl1 Q;
    public final Integer R;

    public ab1(bb1 bb1Var, gl1 gl1Var, Integer num) {
        super(27);
        this.P = bb1Var;
        this.Q = gl1Var;
        this.R = num;
    }

    public static ab1 h0(bb1 bb1Var, Integer num) {
        gl1 a10;
        w91 w91Var = bb1Var.f4758b;
        if (w91Var == w91.f12184k) {
            if (num != null) {
                a10 = gl1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                androidx.datastore.preferences.protobuf.s1.q("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
        } else if (w91Var == w91.f12185l) {
            if (num == null) {
                a10 = gl1.a(new byte[0]);
            } else {
                androidx.datastore.preferences.protobuf.s1.q("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(w91Var.f12196b));
        }
        return new ab1(bb1Var, a10, num);
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final Integer E() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final gl1 g0() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final /* synthetic */ v91 s() {
        return this.P;
    }
}
