package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ad0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final o60 f4461b;

    public /* synthetic */ ad0(o60 o60Var, int i) {
        this.f4460a = i;
        this.f4461b = o60Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.wr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            r4 = this;
            int r0 = r4.f4460a
            switch(r0) {
                case 0: goto L94;
                case 1: goto L81;
                case 2: goto L24;
                case 3: goto L17;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.wx r0 = com.google.android.gms.internal.ads.xx.f12651a
            com.google.android.gms.internal.ads.lo1.b(r0)
            com.google.android.gms.internal.ads.o60 r1 = r4.f4461b
            com.google.android.gms.internal.ads.aq0 r1 = r1.a()
            com.google.android.gms.internal.ads.pl0 r2 = new com.google.android.gms.internal.ads.pl0
            r3 = 1
            r2.<init>(r0, r1, r3)
            return r2
        L17:
            com.google.android.gms.internal.ads.o60 r0 = r4.f4461b
            com.google.android.gms.internal.ads.aq0 r0 = r0.a()
            com.google.android.gms.internal.ads.hl0 r1 = new com.google.android.gms.internal.ads.hl0
            r2 = 2
            r1.<init>(r2, r0)
            return r1
        L24:
            com.google.android.gms.internal.ads.o60 r0 = r4.f4461b
            com.google.android.gms.internal.ads.aq0 r0 = r0.a()
            g9.z2 r0 = r0.f4581d
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10778i8
            g9.r r2 = g9.r.e
            com.google.android.gms.internal.ads.ql r2 = r2.f17698c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6d
            java.lang.String r1 = r0.R
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L58
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L58
            r2.<init>(r1)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = r2.getString(r3)     // Catch: org.json.JSONException -> L58
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L58
            if (r2 != 0) goto L58
            goto L7d
        L58:
            g9.o0 r0 = r0.M
            if (r0 == 0) goto L6d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6d
            java.lang.String r0 = r0.f17685u     // Catch: org.json.JSONException -> L6d
            r1.<init>(r0)     // Catch: org.json.JSONException -> L6d
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L6d
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L6d
            if (r0 == 0) goto L7d
        L6d:
            g9.p r0 = g9.p.f17688g
            java.util.Random r0 = r0.e
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L7d:
            com.google.android.gms.internal.ads.lo1.b(r1)
            return r1
        L81:
            com.google.android.gms.internal.ads.o60 r0 = r4.f4461b
            com.google.android.gms.internal.ads.aq0 r0 = r0.a()
            b8.u4 r0 = r0.f4591p
            int r0 = r0.f2825v
            r1 = 3
            if (r0 != r1) goto L91
            java.lang.String r0 = "rewarded_interstitial"
            goto L93
        L91:
            java.lang.String r0 = "rewarded"
        L93:
            return r0
        L94:
            com.google.android.gms.internal.ads.o60 r0 = r4.f4461b
            com.google.android.gms.internal.ads.aq0 r0 = r0.a()
            b8.u4 r0 = r0.f4591p
            int r0 = r0.f2825v
            r1 = 3
            if (r0 != r1) goto La4
            com.google.android.gms.internal.ads.kj r0 = com.google.android.gms.internal.ads.kj.REWARDED_INTERSTITIAL
            goto La6
        La4:
            com.google.android.gms.internal.ads.kj r0 = com.google.android.gms.internal.ads.kj.REWARD_BASED_VIDEO_AD
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ad0.zzb():java.lang.Object");
    }
}
