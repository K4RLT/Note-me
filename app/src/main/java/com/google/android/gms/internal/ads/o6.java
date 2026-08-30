package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o6 implements e3, n80 {

    /* renamed from: w, reason: collision with root package name */
    public static final o6 f8989w;

    /* renamed from: x, reason: collision with root package name */
    public static final o6 f8990x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8991u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8992v;

    static {
        int i = 0;
        f8989w = new o6(i, true);
        f8990x = new o6(i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r9.h(8) == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o6(com.google.android.gms.internal.ads.h41 r8, com.google.android.gms.internal.ads.q31 r9) {
        /*
            r7 = this;
            r0 = 5
            r7.f8991u = r0
            r7.<init>()
            int r0 = r9.f9730a
            java.nio.ByteBuffer r9 = r9.f9731b
            r1 = 6
            r2 = 0
            r3 = 3
            r4 = 1
            if (r0 == r1) goto L12
            if (r0 != r3) goto L14
        L12:
            r0 = r4
            goto L15
        L14:
            r0 = r2
        L15:
            com.google.android.gms.internal.ads.b80.l(r0)
            r0 = 4
            int r1 = r9.remaining()
            int r0 = java.lang.Math.min(r0, r1)
            byte[] r1 = new byte[r0]
            java.nio.ByteBuffer r9 = r9.asReadOnlyBuffer()
            r9.get(r1)
            com.google.android.gms.internal.ads.tk0 r9 = new com.google.android.gms.internal.ads.tk0
            r9.<init>(r1, r0)
            boolean r0 = r8.f6588a
            if (r0 != 0) goto Laa
            boolean r0 = r9.g()
            if (r0 == 0) goto L3a
            goto L95
        L3a:
            r0 = 2
            int r1 = r9.h(r0)
            boolean r5 = r9.g()
            boolean r6 = r8.f6589b
            if (r6 != 0) goto La4
            if (r5 != 0) goto L4b
        L49:
            r2 = r4
            goto L95
        L4b:
            if (r1 == r3) goto L4f
            if (r1 != 0) goto L51
        L4f:
            r5 = r4
            goto L55
        L51:
            boolean r5 = r9.g()
        L55:
            r9.e()
            boolean r6 = r8.f6591d
            if (r6 == 0) goto L9e
            boolean r6 = r9.g()
            if (r6 == 0) goto L70
            boolean r6 = r8.e
            if (r6 == 0) goto L6a
            r9.e()
            goto L70
        L6a:
            com.google.android.gms.internal.ads.e31 r8 = new com.google.android.gms.internal.ads.e31
            r8.<init>()
            throw r8
        L70:
            boolean r6 = r8.f6590c
            if (r6 != 0) goto L98
            if (r1 == r3) goto L79
            r9.e()
        L79:
            int r8 = r8.f6592f
            r9.f(r8)
            if (r1 == r0) goto L87
            if (r1 == 0) goto L87
            if (r5 != 0) goto L87
            r9.f(r3)
        L87:
            if (r1 == r3) goto L49
            if (r1 != 0) goto L8c
            goto L49
        L8c:
            r8 = 8
            int r8 = r9.h(r8)
            if (r8 == 0) goto L95
            goto L49
        L95:
            r7.f8992v = r2
            return
        L98:
            com.google.android.gms.internal.ads.e31 r8 = new com.google.android.gms.internal.ads.e31
            r8.<init>()
            throw r8
        L9e:
            com.google.android.gms.internal.ads.e31 r8 = new com.google.android.gms.internal.ads.e31
            r8.<init>()
            throw r8
        La4:
            com.google.android.gms.internal.ads.e31 r8 = new com.google.android.gms.internal.ads.e31
            r8.<init>()
            throw r8
        Laa:
            com.google.android.gms.internal.ads.e31 r8 = new com.google.android.gms.internal.ads.e31
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o6.<init>(com.google.android.gms.internal.ads.h41, com.google.android.gms.internal.ads.q31):void");
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        k80 k80Var = (k80) obj;
        switch (this.f8991u) {
            case 1:
                k80Var.w(this.f8992v);
                return;
            default:
                k80Var.z(this.f8992v);
                return;
        }
    }

    public String toString() {
        switch (this.f8991u) {
            case 0:
                boolean z3 = !this.f8992v;
                StringBuilder sb2 = new StringBuilder(String.valueOf(z3).length() + 33);
                sb2.append("IncorrectFragmentation{expected=");
                sb2.append(z3);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o6(int i, boolean z3) {
        this.f8991u = i;
        this.f8992v = z3;
    }

    public /* synthetic */ o6(int i) {
        this.f8991u = i;
    }
}
