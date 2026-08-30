package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import r0.t;
import r6.e;
import r9.a;

import com.google.android.gms.internal.ads.rm1;
import com.google.android.gms.internal.ads.wd0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ko implements ro {

    /* renamed from: a, reason: collision with root package name */
    public final km f14568a;

    /* renamed from: b, reason: collision with root package name */
    public final jm f14569b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14570c;

    public ko(jm jmVar, km kmVar) {
        jm jmVar2 = cn.f14162a;
        this.f14569b = jmVar;
        this.f14570c = kmVar instanceof kn;
        this.f14568a = kmVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final Object a() {
        km kmVar = this.f14568a;
        if (kmVar instanceof nn) {
            return ((nn) kmVar).i();
        }
        return ((hn) ((nn) kmVar).q(5, null)).k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final void b(Object obj) {
        this.f14569b.getClass();
        yo yoVar = ((nn) obj).zzc;
        if (yoVar.e) {
            yoVar.e = false;
        }
        jm jmVar = cn.f14162a;
        ((kn) obj).zza.d();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final boolean c(Object obj) {
        return ((kn) obj).zza.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final void e(Object obj, Object obj2) {
        so.s(obj, obj2);
        if (this.f14570c) {
            jm jmVar = cn.f14162a;
            so.r(obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final void f(Object obj, s5 s5Var) {
        ym ymVar = (ym) s5Var.f14961v;
        Iterator c10 = ((kn) obj).zza.c();
        while (c10.hasNext()) {
            Map.Entry entry = (Map.Entry) c10.next();
            ln lnVar = (ln) entry.getKey();
            if (lnVar.f14605v.f14377u == hp.C) {
                int i = lnVar.f14604u;
                Object value = entry.getValue();
                if (value instanceof tm) {
                    ymVar.t(i, (tm) value);
                } else {
                    ymVar.s(i, (km) value);
                }
            } else {
                x.o("Found invalid MessageSet item.");
                return;
            }
        }
        yo yoVar = ((nn) obj).zzc;
        for (int i10 = 0; i10 < yoVar.f15294a; i10++) {
            int i11 = yoVar.f15295b[i10] >>> 3;
            Object obj2 = yoVar.f15296c[i10];
            if (obj2 instanceof tm) {
                ymVar.t(i11, (tm) obj2);
            } else {
                ymVar.s(i11, (km) obj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final boolean g(nn nnVar, nn nnVar2) {
        if (!nnVar.zzc.equals(nnVar2.zzc)) {
            return false;
        }
        if (this.f14570c) {
            return ((kn) nnVar).zza.equals(((kn) nnVar2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final int h(nn nnVar) {
        int hashCode = nnVar.zzc.hashCode();
        if (this.f14570c) {
            return ((kn) nnVar).zza.f14195a.hashCode() + (hashCode * 53);
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final void i(Object obj, androidx.datastore.preferences.protobuf.i iVar, bn bnVar) {
        boolean I0;
        this.f14569b.getClass();
        yo g8 = jm.g(obj);
        dn t3 = ((kn) obj).t();
        while (iVar.Z0() != Integer.MAX_VALUE) {
            try {
                int i = iVar.f734v;
                jm jmVar = cn.f14162a;
                km kmVar = this.f14568a;
                if (i != 11) {
                    if ((i & 7) == 2) {
                        mn a10 = bnVar.a(i >>> 3, kmVar);
                        if (a10 != null) {
                            t3.e(a10.f14674d, iVar.f1(a10.f14673c.getClass(), bnVar));
                        } else {
                            I0 = jm.n(0, iVar, g8);
                        }
                    } else {
                        I0 = iVar.I0();
                    }
                    if (!I0) {
                        break;
                    }
                } else {
                    mn mnVar = null;
                    tm tmVar = null;
                    int i10 = 0;
                    while (iVar.Z0() != Integer.MAX_VALUE) {
                        int i11 = iVar.f734v;
                        if (i11 == 16) {
                            iVar.S0(0);
                            i10 = ((rm1) iVar.f737y).L();
                            mnVar = bnVar.a(i10, kmVar);
                        } else if (i11 == 26) {
                            if (mnVar != null) {
                                t3.e(mnVar.f14674d, iVar.f1(mnVar.f14673c.getClass(), bnVar));
                            } else {
                                tmVar = iVar.c1();
                            }
                        } else if (i11 == 12 || !iVar.I0()) {
                            break;
                        }
                    }
                    if (iVar.f734v == 12) {
                        if (tmVar != null) {
                            if (mnVar != null) {
                                hn hnVar = (hn) mnVar.f14673c.q(5, null);
                                um j10 = rm1.j(((sm) tmVar).f14978w, ((sm) tmVar).d());
                                hnVar.g(j10, bnVar);
                                t3.e(mnVar.f14674d, hnVar.k());
                                j10.a0(0);
                            } else {
                                g8.c((i10 << 3) | 2, tmVar);
                            }
                        }
                    } else {
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                }
            } finally {
                ((nn) obj).zzc = g8;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final int j(km kmVar) {
        yo yoVar = ((nn) kmVar).zzc;
        int i = yoVar.f15297d;
        if (i == -1) {
            i = 0;
            for (int i10 = 0; i10 < yoVar.f15294a; i10++) {
                int i11 = yoVar.f15295b[i10] >>> 3;
                tm tmVar = (tm) yoVar.f15296c[i10];
                int c10 = ym.c(8);
                int c11 = ym.c(i11) + ym.c(16);
                int c12 = ym.c(24);
                int d2 = tmVar.d();
                i += c10 + c10 + c11 + wd0.v(d2, d2, c12);
            }
            yoVar.f15297d = i;
        }
        if (this.f14570c) {
            to toVar = ((kn) kmVar).zza.f14195a;
            int i12 = toVar.f15015v;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                i13 += dn.j(toVar.c(i14));
            }
            Iterator it = toVar.a().iterator();
            while (it.hasNext()) {
                i13 += dn.j((Map.Entry) it.next());
            }
            return i + i13;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[EDGE_INSN: B:37:0x00b7->B:38:0x00b7 BREAK  A[LOOP:1: B:20:0x0067->B:28:0x0092], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.android.gms.internal.mlkit_vision_digital_ink.pm r21) {
        /*
            r16 = this;
            r1 = r18
            r3 = r20
            r5 = r21
            r0 = r17
            com.google.android.gms.internal.mlkit_vision_digital_ink.nn r0 = (com.google.android.gms.internal.mlkit_vision_digital_ink.nn) r0
            com.google.android.gms.internal.mlkit_vision_digital_ink.yo r2 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_digital_ink.yo r4 = com.google.android.gms.internal.mlkit_vision_digital_ink.yo.f15293f
            if (r2 != r4) goto L16
            com.google.android.gms.internal.mlkit_vision_digital_ink.yo r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.yo.b()
            r0.zzc = r2
        L16:
            r4 = r2
            r0 = r17
            com.google.android.gms.internal.mlkit_vision_digital_ink.kn r0 = (com.google.android.gms.internal.mlkit_vision_digital_ink.kn) r0
            com.google.android.gms.internal.mlkit_vision_digital_ink.dn r6 = t()
            r0 = r19
            r2 = 0
        L22:
            if (r0 >= r3) goto Lc2
            r8 = r2
            int r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.y(r1, r0, r5)
            int r0 = r5.f14797a
            com.google.android.gms.internal.mlkit_vision_digital_ink.bn r9 = r5.f14800d
            r10 = 11
            r11 = r16
            com.google.android.gms.internal.mlkit_vision_digital_ink.km r12 = r11.f14568a
            r13 = 2
            if (r0 == r10) goto L65
            r10 = r0 & 7
            if (r10 != r13) goto L60
            int r8 = r0 >>> 3
            com.google.android.gms.internal.mlkit_vision_digital_ink.mn r8 = a(r8, r12)
            if (r8 == 0) goto L5b
            com.google.android.gms.internal.mlkit_vision_digital_ink.nn r0 = r8.f14673c
            com.google.android.gms.internal.mlkit_vision_digital_ink.oo r9 = com.google.android.gms.internal.mlkit_vision_digital_ink.oo.f14756c
            java.lang.Class r0 = r0.getClass()
            com.google.android.gms.internal.mlkit_vision_digital_ink.ro r0 = a(r0)
            int r0 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.p(r0, r1, r2, r3, r5)
            java.lang.Object r2 = r5.f14799c
            com.google.android.gms.internal.mlkit_vision_digital_ink.ln r9 = r8.f14674d
            e(r9, r2)
        L59:
            r2 = r8
            goto L22
        L5b:
            int r0 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.x(r0, r1, r2, r3, r4, r5)
            goto L59
        L60:
            int r0 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.E(r0, r1, r2, r3, r5)
            goto L59
        L65:
            r0 = 0
            r10 = 0
        L67:
            if (r2 >= r3) goto Lb7
            int r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.y(r1, r2, r5)
            int r14 = r5.f14797a
            int r15 = r14 >>> 3
            r7 = r14 & 7
            if (r15 == r13) goto La1
            r13 = 3
            if (r15 == r13) goto L79
            goto Lae
        L79:
            if (r8 == 0) goto L94
            com.google.android.gms.internal.mlkit_vision_digital_ink.nn r7 = r8.f14673c
            com.google.android.gms.internal.mlkit_vision_digital_ink.oo r13 = com.google.android.gms.internal.mlkit_vision_digital_ink.oo.f14756c
            java.lang.Class r7 = r7.getClass()
            com.google.android.gms.internal.mlkit_vision_digital_ink.ro r7 = r13.a(r7)
            int r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.p(r7, r1, r2, r3, r5)
            java.lang.Object r7 = r5.f14799c
            com.google.android.gms.internal.mlkit_vision_digital_ink.ln r13 = r8.f14674d
            e(r13, r7)
        L92:
            r13 = 2
            goto L67
        L94:
            r13 = 2
            if (r7 != r13) goto Lae
            int r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.b(r1, r2, r5)
            java.lang.Object r7 = r5.f14799c
            r10 = r7
            com.google.android.gms.internal.mlkit_vision_digital_ink.tm r10 = (com.google.android.gms.internal.mlkit_vision_digital_ink.tm) r10
            goto L92
        La1:
            if (r7 != 0) goto Lae
            int r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.y(r1, r2, r5)
            int r0 = r5.f14797a
            com.google.android.gms.internal.mlkit_vision_digital_ink.mn r8 = a(r0, r12)
            goto L92
        Lae:
            r7 = 12
            if (r14 == r7) goto Lb7
            int r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.E(r14, r1, r2, r3, r5)
            goto L92
        Lb7:
            if (r10 == 0) goto Lc0
            int r0 = r0 << 3
            r13 = 2
            r0 = r0 | r13
            r4.c(r0, r10)
        Lc0:
            r0 = r2
            goto L59
        Lc2:
            r11 = r16
            if (r0 != r3) goto Lc7
            return
        Lc7:
            java.lang.String r0 = "Failed to parse the message."
            androidx.datastore.preferences.protobuf.s1.u(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.ko.k(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_digital_ink.pm):void");
    }
}
