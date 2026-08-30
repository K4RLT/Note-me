package l9;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class a extends ga.a {
    public static final Parcelable.Creator<a> CREATOR = new i9.b(7);

    /* renamed from: u, reason: collision with root package name */
    public final String f20029u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20030v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20031w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f20032x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f20033y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r10, int r11, int r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            if (r13 == 0) goto L5
            java.lang.String r12 = "0"
            goto L7
        L5:
            java.lang.String r12 = "1"
        L7:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r11)
            int r0 = r0 + 13
            int r1 = r1.length()
            int r1 = r1 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "afma-sdk-a-v"
            java.lang.String r2 = "."
            g3.a.r(r10, r11, r1, r2, r0)
            java.lang.String r6 = a5.a.k(r0, r2, r12)
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.a.<init>(int, int, int, boolean, boolean):void");
    }

    public static a a() {
        return new a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 2, this.f20029u);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f20030v);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f20031w);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f20032x ? 1 : 0);
        e7.j(parcel, 6, 4);
        parcel.writeInt(this.f20033y ? 1 : 0);
        e7.l(parcel, k3);
    }

    public a(int i, int i10, boolean z3) {
        this(i, i10, 0, z3, false);
    }

    public a(int i, int i10, String str, boolean z3, boolean z9) {
        this.f20029u = str;
        this.f20030v = i;
        this.f20031w = i10;
        this.f20032x = z3;
        this.f20033y = z9;
    }
}
