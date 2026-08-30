package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class ix0 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f7242h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f7243a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7244b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7245c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7246d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final j6.s f7247f;

    /* renamed from: g, reason: collision with root package name */
    public final hx0 f7248g;

    public ix0(Context context, String str, String str2, String str3) {
        if (j6.s.f18979x == null) {
            j6.s.f18979x = new j6.s(context);
        }
        this.f7247f = j6.s.f18979x;
        this.f7248g = hx0.d(context);
        this.f7243a = str;
        this.f7244b = str.concat("_3p");
        this.f7245c = str2;
        this.f7246d = str2.concat("_3p");
        this.e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.f3 a(java.lang.String r17, java.lang.String r18, long r19, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = r0.f7244b
            r3 = 0
            j6.s r4 = r0.f7247f
            if (r1 == 0) goto L3e
            java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L41
            java.lang.String r5 = com.google.android.gms.internal.ads.ix0.f7242h
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L41
            java.lang.Object r5 = r4.f18982w
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r5 = r5.getString(r2, r3)
            java.lang.Object r6 = r4.f18982w
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.lang.String r7 = "paid_3p_hash_key"
            java.lang.String r6 = r6.getString(r7, r3)
            if (r5 == 0) goto L3e
            if (r6 == 0) goto L3e
            r7 = r18
            java.lang.String r6 = r0.e(r1, r7, r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L39
            goto L49
        L39:
            com.google.android.gms.internal.ads.f3 r1 = r16.b(r17, r18)
            return r1
        L3e:
            r7 = r18
            goto L49
        L41:
            com.google.android.gms.internal.ads.f3 r1 = new com.google.android.gms.internal.ads.f3
            r2 = 5
            r3 = 0
            r1.<init>(r2, r3)
            return r1
        L49:
            if (r1 == 0) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = 0
        L4e:
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto Lb4
            java.lang.String r6 = r0.f7245c
            java.lang.String r10 = r0.f7246d
            if (r5 == 0) goto L60
            r11 = r10
            goto L61
        L60:
            r11 = r6
        L61:
            java.lang.Object r12 = r4.f18982w
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            r13 = -1
            long r11 = r12.getLong(r11, r13)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L70
            goto L8c
        L70:
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r15 >= 0) goto L81
            if (r5 == 0) goto L78
            r11 = r10
            goto L79
        L78:
            r11 = r6
        L79:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.j(r8, r11)
            goto L8c
        L81:
            long r11 = r11 + r19
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L8c
            com.google.android.gms.internal.ads.f3 r1 = r16.b(r17, r18)
            return r1
        L8c:
            if (r5 == 0) goto L8f
            goto L91
        L8f:
            java.lang.String r2 = r0.f7243a
        L91:
            java.lang.Object r8 = r4.f18982w
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r2 = r8.getString(r2, r3)
            if (r2 != 0) goto La2
            if (r21 != 0) goto La2
            com.google.android.gms.internal.ads.f3 r1 = r16.b(r17, r18)
            return r1
        La2:
            com.google.android.gms.internal.ads.f3 r1 = new com.google.android.gms.internal.ads.f3
            if (r5 == 0) goto La7
            r6 = r10
        La7:
            java.lang.Object r3 = r4.f18982w
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            long r3 = r3.getLong(r6, r13)
            r5 = 5
            r1.<init>(r2, r3, r5)
            return r1
        Lb4:
            java.lang.String r1 = r0.e
            java.lang.String r2 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r1 = r1.concat(r2)
            q.x.o(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix0.a(java.lang.String, java.lang.String, long, boolean):com.google.android.gms.internal.ads.f3");
    }

    public final f3 b(String str, String str2) {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f7247f.j(uuid, "paid_3p_hash_key");
        return d(e(str, str2, uuid), true);
    }

    public final void c(boolean z3) {
        String str;
        String str2;
        if (z3) {
            str = this.f7246d;
        } else {
            str = this.f7245c;
        }
        j6.s sVar = this.f7247f;
        sVar.p(str);
        if (z3) {
            str2 = this.f7244b;
        } else {
            str2 = this.f7243a;
        }
        sVar.p(str2);
    }

    public final f3 d(String str, boolean z3) {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            if (z3) {
                str2 = this.f7246d;
            } else {
                str2 = this.f7245c;
            }
            Long valueOf = Long.valueOf(currentTimeMillis);
            j6.s sVar = this.f7247f;
            sVar.j(valueOf, str2);
            if (z3) {
                str3 = this.f7244b;
            } else {
                str3 = this.f7243a;
            }
            sVar.j(str, str3);
            return new f3(str, currentTimeMillis, 5);
        }
        q.x.o(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        return null;
    }

    public final String e(String str, String str2, String str3) {
        String str4;
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(p.a.o(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        if (str2 != null) {
            str4 = "not null";
        } else {
            str4 = "null";
        }
        StringBuilder sb2 = new StringBuilder("not null".length() + str4.length() + 120);
        g3.a.t(sb2, this.e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb2.append("not null");
        throw new IllegalArgumentException(sb2.toString());
    }
}
