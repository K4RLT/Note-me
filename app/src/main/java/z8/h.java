package z8;

import q.x;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final h f31984h = new h("320x50_mb", 320, 50);
    public static final h i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f31985j;

    /* renamed from: a, reason: collision with root package name */
    public final int f31986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31987b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31988c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31989d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31990f;

    /* renamed from: g, reason: collision with root package name */
    public int f31991g;

    static {
        new h("468x60_as", 468, 60);
        new h("320x100_as", 320, 100);
        new h("728x90_as", 728, 90);
        new h("300x250_as", 300, 250);
        new h("160x600_as", 160, 600);
        new h("smart_banner", -1, -2);
        i = new h("fluid", -3, -4);
        f31985j = new h("invalid", 0, 0);
        new h("50x50_mb", 50, 50);
    }

    public h(String str, int i10, int i11) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            x.n(a5.a.f(i10, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i10).length() + 26)));
            throw null;
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            x.n(a5.a.f(i11, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i11).length() + 27)));
            throw null;
        }
        this.f31986a = i10;
        this.f31987b = i11;
        this.f31988c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f31986a != hVar.f31986a || this.f31987b != hVar.f31987b || !this.f31988c.equals(hVar.f31988c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f31988c.hashCode();
    }

    public final String toString() {
        return this.f31988c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        La:
            r1 = -2
            if (r7 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L14:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r2 = r2 + 1
            int r3 = r3.length()
            int r3 = r3 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r3 + 3
            r2.<init>(r3)
            java.lang.String r3 = "x"
            java.lang.String r4 = "_as"
            java.lang.String r0 = a5.a.l(r2, r0, r3, r1, r4)
            r5.<init>(r0, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.h.<init>(int, int):void");
    }
}
