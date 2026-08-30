package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b6 implements e3 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4721u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f4722v;

    /* renamed from: w, reason: collision with root package name */
    public long f4723w;

    /* renamed from: x, reason: collision with root package name */
    public int f4724x;

    public b6(long j10, int i, int i10) {
        this.f4722v = i;
        this.f4723w = j10;
        this.f4724x = i10;
    }

    public String toString() {
        switch (this.f4721u) {
            case 0:
                String a10 = bq0.a(this.f4722v);
                int length = a10.length();
                long j10 = this.f4723w;
                int length2 = String.valueOf(j10).length();
                int i = this.f4724x;
                StringBuilder sb2 = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
                sb2.append("AtomSizeTooSmall{type=");
                sb2.append(a10);
                sb2.append(", size=");
                sb2.append(j10);
                sb2.append(", minHeaderSize=");
                sb2.append(i);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b6() {
    }
}
