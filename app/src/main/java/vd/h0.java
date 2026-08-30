package vd;
import m.i;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f27594a;

    /* renamed from: b, reason: collision with root package name */
    public final df.a f27595b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27596c;

    /* renamed from: d, reason: collision with root package name */
    public int f27597d;
    public a0 e;

    public h0() {
        g0 g0Var = g0.f27586u;
        this.f27594a = o0.f27626a;
        this.f27595b = g0Var;
        this.f27596c = a();
        this.f27597d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f27595b.invoke()).toString();
        uuid.getClass();
        String lowerCase = mf.i(uuid, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public final a0 b() {
        a0 a0Var = this.e;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.l.h("currentSession");
        throw null;
    }
}
