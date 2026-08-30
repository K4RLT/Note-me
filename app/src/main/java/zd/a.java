package zd;

import fa.y;

/* loaded from: classes.dex */
public final class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        y.f(str, "Provided message must not be empty.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th) {
        super(str, th);
        y.f(str, "Provided message must not be empty.");
    }
}
