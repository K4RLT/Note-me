package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class bl1 implements u91 {
    public static final byte[] e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final af1 f4820a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4821b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4822c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4823d;

    public bl1(ke1 ke1Var) {
        String valueOf = String.valueOf(ke1Var.P.f8681d);
        this.f4820a = new tc("HMAC".concat(valueOf), new SecretKeySpec(((gl1) ke1Var.Q.f4819v).b(), "HMAC"));
        ne1 ne1Var = ke1Var.P;
        this.f4821b = ne1Var.f8679b;
        this.f4822c = ke1Var.R.b();
        if (ne1Var.f8680c.equals(ja1.I)) {
            this.f4823d = Arrays.copyOf(e, 1);
        } else {
            this.f4823d = new byte[0];
        }
    }

    public bl1(ge1 ge1Var) {
        this.f4820a = x21.y(ye1.g0(ze1.b(ge1Var.P.f7116a), ge1Var.Q));
        ie1 ie1Var = ge1Var.P;
        this.f4821b = ie1Var.f7117b;
        this.f4822c = ge1Var.R.b();
        if (ie1Var.f7118c.equals(x91.f12519t)) {
            this.f4823d = Arrays.copyOf(e, 1);
        } else {
            this.f4823d = new byte[0];
        }
    }

    public bl1(tc tcVar, int i) {
        this.f4820a = tcVar;
        this.f4821b = i;
        this.f4822c = new byte[0];
        this.f4823d = new byte[0];
        tcVar.e(new byte[0], i);
    }
}
