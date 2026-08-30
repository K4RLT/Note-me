package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ob {

    /* renamed from: a, reason: collision with root package name */
    public long f9071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9072b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9073c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9074d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9075f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9076g;

    /* renamed from: h, reason: collision with root package name */
    public final List f9077h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ob(java.lang.String r14, com.google.android.gms.internal.ads.xa r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f12528b
            long r3 = r15.f12529c
            long r5 = r15.f12530d
            long r7 = r15.e
            long r9 = r15.f12531f
            java.util.List r0 = r15.f12533h
            if (r0 == 0) goto L12
        Le:
            r1 = r14
            r11 = r0
            r0 = r13
            goto L46
        L12:
            java.util.Map r15 = r15.f12532g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L25:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.ab r11 = new com.google.android.gms.internal.ads.ab
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L25
        L46:
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ob.<init>(java.lang.String, com.google.android.gms.internal.ads.xa):void");
    }

    public static ob a(pb pbVar) {
        List arrayList;
        if (rb.h(pbVar) == 538247942) {
            String l10 = rb.l(pbVar);
            String l11 = rb.l(pbVar);
            long j10 = rb.j(pbVar);
            long j11 = rb.j(pbVar);
            long j12 = rb.j(pbVar);
            long j13 = rb.j(pbVar);
            int h3 = rb.h(pbVar);
            if (h3 >= 0) {
                if (h3 == 0) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i = 0; i < h3; i++) {
                    list.add(new ab(rb.l(pbVar).intern(), rb.l(pbVar).intern()));
                }
                return new ob(l10, l11, j10, j11, j12, j13, list);
            }
            q.x.p(a5.a.f(h3, "readHeaderList size=", new StringBuilder(String.valueOf(h3).length() + 20)));
            return null;
        }
        throw new IOException();
    }

    public ob(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f9072b = str;
        this.f9073c = true == "".equals(str2) ? null : str2;
        this.f9074d = j10;
        this.e = j11;
        this.f9075f = j12;
        this.f9076g = j13;
        this.f9077h = list;
    }
}
