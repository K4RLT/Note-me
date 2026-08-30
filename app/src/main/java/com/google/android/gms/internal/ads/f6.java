package com.google.android.gms.internal.ads;
import q.x;

/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5940a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5941b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5942c;

    public /* synthetic */ f6(boolean z3, boolean z9, boolean z10) {
        this.f5940a = z3;
        this.f5941b = z9;
        this.f5942c = z10;
    }

    public zu1 a() {
        if (!this.f5940a && (this.f5941b || this.f5942c)) {
            q.x.o("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
        return new zu1(this);
    }
}
