package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final f3 f6842a;

    /* renamed from: b, reason: collision with root package name */
    public final f3 f6843b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6844c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6845d;
    public final boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6846f;

    public hn0(f3 f3Var, f3 f3Var2, boolean z3, boolean z9, boolean z10) {
        this.f6842a = f3Var;
        this.f6843b = f3Var2;
        this.f6844c = z3;
        this.f6845d = z9;
        this.f6846f = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r7 <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r1.putString("paidv1_id_android", r6);
        r1.putLong("paidv1_creation_time_android", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.V3)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        r4 = r9.f6843b;
        r5 = (java.lang.String) r4.f5900w;
        r6 = r4.f5899v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r6 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r1.putString("paidv2_id_android", r5);
        r1.putLong("paidv2_creation_time_android", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r9.f6844c);
        r1.putBoolean("paidv2_user_option_android", r9.f6845d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.X3)).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.W3)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.U3)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r5 = r9.f6842a;
        r6 = (java.lang.String) r5.f5900w;
        r7 = r5.f5899v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r6 == null) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.pn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Object r10) {
        /*
            r9 = this;
            android.os.Bundle r10 = (android.os.Bundle) r10
            boolean r0 = r9.e
            if (r0 == 0) goto L8
            goto La9
        L8:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.b80.d(r0, r10)
            r2 = 0
            boolean r4 = r9.f6846f
            if (r4 != 0) goto L26
            com.google.android.gms.internal.ads.nl r5 = com.google.android.gms.internal.ads.sl.U3
            g9.r r6 = g9.r.e
            com.google.android.gms.internal.ads.ql r6 = r6.f17698c
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L3a
        L26:
            if (r4 == 0) goto L52
            com.google.android.gms.internal.ads.nl r5 = com.google.android.gms.internal.ads.sl.W3
            g9.r r6 = g9.r.e
            com.google.android.gms.internal.ads.ql r6 = r6.f17698c
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L52
        L3a:
            com.google.android.gms.internal.ads.f3 r5 = r9.f6842a
            java.lang.Object r6 = r5.f5900w
            java.lang.String r6 = (java.lang.String) r6
            long r7 = r5.f5899v
            if (r6 == 0) goto L52
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 <= 0) goto L52
            java.lang.String r5 = "paidv1_id_android"
            r1.putString(r5, r6)
            java.lang.String r5 = "paidv1_creation_time_android"
            r1.putLong(r5, r7)
        L52:
            if (r4 != 0) goto L66
            com.google.android.gms.internal.ads.nl r5 = com.google.android.gms.internal.ads.sl.V3
            g9.r r6 = g9.r.e
            com.google.android.gms.internal.ads.ql r6 = r6.f17698c
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L7a
        L66:
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.nl r4 = com.google.android.gms.internal.ads.sl.X3
            g9.r r5 = g9.r.e
            com.google.android.gms.internal.ads.ql r5 = r5.f17698c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto La0
        L7a:
            com.google.android.gms.internal.ads.f3 r4 = r9.f6843b
            java.lang.Object r5 = r4.f5900w
            java.lang.String r5 = (java.lang.String) r5
            long r6 = r4.f5899v
            if (r5 == 0) goto L92
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L92
            java.lang.String r2 = "paidv2_id_android"
            r1.putString(r2, r5)
            java.lang.String r2 = "paidv2_creation_time_android"
            r1.putLong(r2, r6)
        L92:
            boolean r2 = r9.f6844c
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r9.f6845d
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        La0:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto La9
            r10.putBundle(r0, r1)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hn0.l(java.lang.Object):void");
    }

    public hn0(boolean z3) {
        this.f6846f = z3;
    }
}
