package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12470b;

    /* renamed from: c, reason: collision with root package name */
    public final h3 f12471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12472d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r5.equals("cens") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5.equals("cenc") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r5.equals("cbcs") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r5.equals("cbc1") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x6(boolean r4, java.lang.String r5, int r6, byte[] r7, int r8, int r9, byte[] r10) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r10 != 0) goto Ld
            r0 = r1
        Ld:
            r0 = r0 ^ r2
            com.google.android.gms.internal.ads.b80.l(r0)
            r3.f12469a = r4
            r3.f12470b = r5
            r3.f12472d = r6
            r3.e = r10
            com.google.android.gms.internal.ads.h3 r4 = new com.google.android.gms.internal.ads.h3
            if (r5 != 0) goto L1e
            goto L6c
        L1e:
            int r6 = r5.hashCode()
            switch(r6) {
                case 3046605: goto L41;
                case 3046671: goto L38;
                case 3049879: goto L2f;
                case 3049895: goto L26;
                default: goto L25;
            }
        L25:
            goto L4b
        L26:
            java.lang.String r6 = "cens"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4b
            goto L6c
        L2f:
            java.lang.String r6 = "cenc"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4b
            goto L6c
        L38:
            java.lang.String r6 = "cbcs"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4b
            goto L49
        L41:
            java.lang.String r6 = "cbc1"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4b
        L49:
            r1 = 2
            goto L6c
        L4b:
            int r6 = r5.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r6 = r6 + 68
            r10.<init>(r6)
            java.lang.String r6 = "Unsupported protection scheme type '"
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = "'. Assuming AES-CTR crypto mode."
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r6 = "TrackEncryptionBox"
            com.google.android.gms.internal.ads.x21.F(r6, r5)
        L6c:
            r4.<init>(r1, r8, r9, r7)
            r3.f12471c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x6.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
