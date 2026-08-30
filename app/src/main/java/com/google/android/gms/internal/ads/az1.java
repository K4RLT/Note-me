package com.google.android.gms.internal.ads;
import p.a;

/* loaded from: classes.dex */
public final class az1 extends va {

    /* renamed from: w, reason: collision with root package name */
    public final d51 f4644w;

    public az1(String str, y51 y51Var) {
        super(str, null, false, 1);
        this.f4644w = d51.u(y51Var);
    }

    @Override // com.google.android.gms.internal.ads.va, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        d51 d51Var = this.f4644w;
        if (d51Var.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(d51Var);
        return p.a.o(new StringBuilder(length + 17 + valueOf.length()), message, "\nsniff failures: ", valueOf);
    }
}
