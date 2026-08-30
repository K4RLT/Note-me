package com.google.android.gms.internal.ads;
import a5.a;
import q.x;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mu0 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8424a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8426c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8427d;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r8 != 78) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6.length != 8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        com.google.android.gms.internal.ads.b80.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5.equals("auxiliary.tracks.length") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5.equals("auxiliary.tracks.offset") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mu0(java.lang.String r5, byte[] r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1949883051: goto L5e;
                case -269399509: goto L41;
                case 1011693540: goto L28;
                case 1098277265: goto L1f;
                case 2002123038: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L75
        Le:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            if (r8 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            com.google.android.gms.internal.ads.b80.l(r1)
            goto L75
        L1f:
            java.lang.String r0 = "auxiliary.tracks.offset"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            goto L30
        L28:
            java.lang.String r0 = "auxiliary.tracks.length"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
        L30:
            r0 = 78
            if (r8 != r0) goto L3c
            int r8 = r6.length
            r3 = 8
            if (r8 != r3) goto L3b
            r8 = r0
            goto L3d
        L3b:
            r8 = r0
        L3c:
            r1 = r2
        L3d:
            com.google.android.gms.internal.ads.b80.l(r1)
            goto L75
        L41:
            java.lang.String r0 = "auxiliary.tracks.interleaved"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            r0 = 75
            if (r8 != r0) goto L59
            int r8 = r6.length
            if (r8 != r1) goto L58
            r8 = r6[r2]
            if (r8 == 0) goto L56
            if (r8 != r1) goto L58
        L56:
            r8 = r0
            goto L5a
        L58:
            r8 = r0
        L59:
            r1 = r2
        L5a:
            com.google.android.gms.internal.ads.b80.l(r1)
            goto L75
        L5e:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            r0 = 23
            if (r8 != r0) goto L71
            int r8 = r6.length
            r3 = 4
            if (r8 != r3) goto L70
            r8 = r0
            goto L72
        L70:
            r8 = r0
        L71:
            r1 = r2
        L72:
            com.google.android.gms.internal.ads.b80.l(r1)
        L75:
            r4.f8424a = r5
            r4.f8425b = r6
            r4.f8426c = r7
            r4.f8427d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu0.<init>(java.lang.String, byte[], int, int):void");
    }

    public final ArrayList b() {
        b80.L("Metadata is not an auxiliary tracks map", this.f8424a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f8425b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b10; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2] & 255));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mu0.class == obj.getClass()) {
            mu0 mu0Var = (mu0) obj;
            if (this.f8424a.equals(mu0Var.f8424a) && Arrays.equals(this.f8425b, mu0Var.f8425b) && this.f8426c == mu0Var.f8426c && this.f8427d == mu0Var.f8427d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f8425b) + ((this.f8424a.hashCode() + 527) * 31)) * 31) + this.f8426c) * 31) + this.f8427d;
    }

    public final String toString() {
        String sb2;
        boolean z3;
        boolean z9;
        String str = this.f8424a;
        byte[] bArr = this.f8425b;
        int i = this.f8427d;
        if (i != 0) {
            if (i != 1) {
                if (i != 23) {
                    if (i != 67) {
                        if (i != 75) {
                            if (i == 78) {
                                sb2 = String.valueOf(new xk0(bArr).j());
                            }
                            String str2 = bq0.f4860a;
                            sb2 = r61.f10130f.f().g(bArr, bArr.length);
                        } else {
                            sb2 = String.valueOf(bArr[0] & 255);
                        }
                    } else {
                        int length = bArr.length;
                        if (length >= 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            sb2 = String.valueOf(ct.y(bArr[0], bArr[1], bArr[2], bArr[3]));
                        } else {
                            x.n(ay0.B("array too small: %s < %s", Integer.valueOf(length), 4));
                            return null;
                        }
                    }
                } else {
                    int length2 = bArr.length;
                    if (length2 >= 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        sb2 = String.valueOf(Float.intBitsToFloat(ct.y(bArr[0], bArr[1], bArr[2], bArr[3])));
                    } else {
                        x.n(ay0.B("array too small: %s < %s", Integer.valueOf(length2), 4));
                        return null;
                    }
                }
            } else {
                String str3 = bq0.f4860a;
                sb2 = new String(bArr, StandardCharsets.UTF_8);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList b10 = b();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("track types = ");
                ct.t(sb3, b10.iterator(), ",");
                sb2 = sb3.toString();
            }
            String str22 = bq0.f4860a;
            sb2 = r61.f10130f.f().g(bArr, bArr.length);
        }
        return a.l(new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(sb2).length()), "mdta: key=", str, ", value=", sb2);
    }
}
