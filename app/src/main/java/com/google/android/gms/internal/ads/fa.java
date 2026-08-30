package com.google.android.gms.internal.ads;
import a5.a;
import q.x;

/* loaded from: classes.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public final String f5995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5996b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5997c;

    /* renamed from: d, reason: collision with root package name */
    public int f5998d;
    public String e;

    public fa(int i, int i10, int i11) {
        String str;
        if (i == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = p.a.j(i, "/", new StringBuilder(String.valueOf(i).length() + 1));
        }
        this.f5995a = str;
        this.f5996b = i10;
        this.f5997c = i11;
        this.f5998d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i;
        int i10 = this.f5998d;
        if (i10 == Integer.MIN_VALUE) {
            i = this.f5996b;
        } else {
            i = i10 + this.f5997c;
        }
        this.f5998d = i;
        int length = String.valueOf(i).length();
        String str = this.f5995a;
        this.e = a5.a.f(i, str, new StringBuilder(str.length() + length));
    }

    public final void b() {
        if (this.f5998d != Integer.MIN_VALUE) {
            return;
        }
        q.x.o("generateNewId() must be called before retrieving ids.");
    }
}
