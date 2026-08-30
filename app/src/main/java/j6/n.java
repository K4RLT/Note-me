package j6;
import f.a;
import m.d;
import n.b;
import n.c;
import n.e;
import n.g;
import n.k;
import n.l;
import n.m;
import n.n;
import n.p;
import q.q;
import r.i;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import androidx.lifecycle.o0;
import androidx.lifecycle.r0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.work.impl.WorkDatabase_Impl;
import b6.u;
import c4.w;
import c4.z;
import com.daren.scraply.data.local.ScraplyDatabase;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.consent_sdk.d7;
import com.google.android.gms.internal.consent_sdk.e7;
import com.google.android.gms.internal.consent_sdk.p0;
import com.google.android.gms.internal.consent_sdk.w2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fh;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gg;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.nq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.oq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.qq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.rq;
import com.google.android.gms.internal.mlkit_vision_digital_ink.sq;
import com.google.mlkit.vision.digitalink.common.downloading.DigitalInkManifestParser$Pack;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p.s0;
import p.t0;
import q.x;
import v1.t;
import wa.g8;

/* loaded from: classes.dex */
public final class n implements e7 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18937u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18938v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18939w;

    /* renamed from: x, reason: collision with root package name */
    public Object f18940x;

    /* renamed from: y, reason: collision with root package name */
    public Object f18941y;

    public n(Typeface typeface, d4.b bVar) {
        int i;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        this.f18937u = 1;
        this.f18941y = typeface;
        this.f18938v = bVar;
        this.f18940x = new w(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i14 = a10 + bVar.f15724u;
            i = ((ByteBuffer) bVar.f15727x).getInt(((ByteBuffer) bVar.f15727x).getInt(i14) + i14);
        } else {
            i = 0;
        }
        this.f18939w = new char[i * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i15 = a11 + bVar.f15724u;
            i10 = ((ByteBuffer) bVar.f15727x).getInt(((ByteBuffer) bVar.f15727x).getInt(i15) + i15);
        } else {
            i10 = 0;
        }
        for (int i16 = 0; i16 < i10; i16++) {
            z zVar = new z(this, i16);
            d4.a b10 = zVar.b();
            int a12 = b10.a(4);
            if (a12 != 0) {
                i11 = ((ByteBuffer) b10.f15727x).getInt(a12 + b10.f15724u);
            } else {
                i11 = 0;
            }
            Character.toChars(i11, (char[]) this.f18939w, i16 * 2);
            d4.a b11 = zVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i17 = a13 + b11.f15724u;
                i12 = ((ByteBuffer) b11.f15727x).getInt(((ByteBuffer) b11.f15727x).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                w wVar = (w) this.f18940x;
                d4.a b12 = zVar.b();
                int a14 = b12.a(16);
                if (a14 != 0) {
                    int i18 = a14 + b12.f15724u;
                    i13 = ((ByteBuffer) b12.f15727x).getInt(((ByteBuffer) b12.f15727x).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                wVar.a(zVar, 0, i13 - 1);
            } else {
                x.n("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public static final fh z(DigitalInkManifestParser$Pack digitalInkManifestParser$Pack) {
        gg u9 = fh.u();
        String str = digitalInkManifestParser$Pack.getDownloadUrls().get(0);
        u9.b();
        fh.B((fh) u9.f14430v, str);
        long compressedSize = digitalInkManifestParser$Pack.getCompressedSize();
        u9.b();
        fh.x((fh) u9.f14430v, compressedSize);
        String sha1Checksum = digitalInkManifestParser$Pack.getSha1Checksum();
        u9.b();
        fh.z((fh) u9.f14430v, sha1Checksum);
        pq w10 = qq.w();
        nq w11 = oq.w();
        rq t3 = sq.t();
        t3.b();
        sq.w((sq) t3.f14430v);
        sq sqVar = (sq) t3.i();
        w11.b();
        oq.B((oq) w11.f14430v, sqVar);
        w10.b();
        qq.z((qq) w10.f14430v, (oq) w11.i());
        qq qqVar = (qq) w10.i();
        u9.b();
        fh.y((fh) u9.f14430v, qqVar);
        String name = digitalInkManifestParser$Pack.getName();
        u9.b();
        fh.A((fh) u9.f14430v, name);
        return (fh) u9.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(o7.b r28, java.lang.String r29, ve.c r30) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a(o7.b, java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r20, ve.c r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof m7.b
            if (r2 == 0) goto L17
            r2 = r1
            m7.b r2 = (m7.b) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.B = r3
            goto L1c
        L17:
            m7.b r2 = new m7.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f20628z
            int r3 = r2.B
            r4 = 2
            r5 = 1
            r6 = 0
            ue.a r7 = ue.a.f27192u
            if (r3 == 0) goto L4c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L31
            java.lang.String r2 = r2.f20623u
            pe.a.e(r1)
            return r2
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r1)
            r1 = 0
            return r1
        L38:
            long r8 = r2.f20627y
            java.lang.String r3 = r2.f20626x
            java.lang.String r5 = r2.f20625w
            j7.q r10 = r2.f20624v
            java.lang.String r11 = r2.f20623u
            pe.a.e(r1)
            r18 = r3
            r17 = r5
            r3 = r11
        L4a:
            r13 = r8
            goto L82
        L4c:
            pe.a.e(r1)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = a.i()
            java.lang.Object r3 = r0.f18941y
            r10 = r3
            j7.q r10 = (j7.q) r10
            r2.f20623u = r1
            r2.f20624v = r10
            r2.f20625w = r1
            r3 = r20
            r2.f20626x = r3
            r2.f20627y = r8
            r2.B = r5
            r10.getClass()
            j7.m r5 = new j7.m
            r11 = 2
            r5.<init>(r10, r6, r11)
            java.lang.Object r5 = wa.g8.a(r5, r2)
            if (r5 != r7) goto L7a
            goto Lae
        L7a:
            r17 = r1
            r18 = r3
            r3 = r17
            r1 = r5
            goto L4a
        L82:
            java.lang.Number r1 = (java.lang.Number) r1
            int r12 = r1.intValue()
            k7.i r11 = new k7.i
            r15 = r13
            r11.<init>(r12, r13, r15, r17, r18)
            r2.f20623u = r3
            r2.f20624v = r6
            r2.f20625w = r6
            r2.f20626x = r6
            r2.f20627y = r13
            r2.B = r4
            r10.getClass()
            g5.w r1 = new g5.w
            r4 = 5
            r1.<init>(r10, r11, r6, r4)
            java.lang.Object r1 = wa.g8.a(r1, r2)
            if (r1 != r7) goto Laa
            goto Lac
        Laa:
            pe.z r1 = pe.z.f22715a
        Lac:
            if (r1 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.b(java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r9 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r8, ve.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof m7.c
            if (r0 == 0) goto L13
            r0 = r9
            m7.c r0 = (m7.c) r0
            int r1 = r0.f20632x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20632x = r1
            goto L18
        L13:
            m7.c r0 = new m7.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f20630v
            int r1 = r0.f20632x
            pe.z r2 = pe.z.f22715a
            r3 = 0
            r4 = 2
            r5 = 1
            ue.a r6 = ue.a.f27192u
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L34
            if (r1 != r4) goto L2d
            pe.a.e(r9)
            return r2
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L34:
            java.lang.String r8 = r0.f20629u
            pe.a.e(r9)
            goto L59
        L3a:
            pe.a.e(r9)
            java.lang.Object r9 = r7.f18939w
            j7.l r9 = (j7.l) r9
            r0.f20629u = r8
            r0.f20632x = r5
            r9.getClass()
            j7.g r1 = new j7.g
            r5 = 2
            r1.<init>(r9, r8, r3, r5)
            java.lang.Object r9 = wa.g8.a(r1, r0)
            if (r9 != r6) goto L55
            goto L56
        L55:
            r9 = r2
        L56:
            if (r9 != r6) goto L59
            goto L74
        L59:
            java.lang.Object r9 = r7.f18940x
            j7.f r9 = (j7.f) r9
            r0.f20629u = r3
            r0.f20632x = r4
            r9.getClass()
            j7.a r1 = new j7.a
            r4 = 1
            r1.<init>(r9, r8, r3, r4)
            java.lang.Object r8 = wa.g8.a(r1, r0)
            if (r8 != r6) goto L71
            goto L72
        L71:
            r8 = r2
        L72:
            if (r8 != r6) goto L75
        L74:
            return r6
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c(java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (e(r9, r0) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r10 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r10 == r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r9, ve.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof m7.d
            if (r0 == 0) goto L13
            r0 = r10
            m7.d r0 = (m7.d) r0
            int r1 = r0.f20636x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20636x = r1
            goto L18
        L13:
            m7.d r0 = new m7.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f20634v
            int r1 = r0.f20636x
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            ue.a r6 = ue.a.f27192u
            if (r1 == 0) goto L41
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2e
            pe.a.e(r10)
            goto L95
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            r9 = 0
            return r9
        L35:
            java.lang.String r9 = r0.f20633u
            pe.a.e(r10)
            goto L7f
        L3b:
            java.lang.String r9 = r0.f20633u
            pe.a.e(r10)
            goto L5c
        L41:
            pe.a.e(r10)
            java.lang.Object r10 = r8.f18939w
            j7.l r10 = (j7.l) r10
            r0.f20633u = r9
            r0.f20636x = r5
            r10.getClass()
            j7.g r1 = new j7.g
            r7 = 1
            r1.<init>(r10, r9, r2, r7)
            java.lang.Object r10 = wa.g8.a(r1, r0)
            if (r10 != r6) goto L5c
            goto L94
        L5c:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 <= 0) goto L67
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L67:
            java.lang.Object r10 = r8.f18941y
            j7.q r10 = (j7.q) r10
            r0.f20633u = r9
            r0.f20636x = r4
            r10.getClass()
            j7.m r1 = new j7.m
            r4 = 0
            r1.<init>(r10, r2, r4)
            java.lang.Object r10 = wa.g8.a(r1, r0)
            if (r10 != r6) goto L7f
            goto L94
        L7f:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 > r5) goto L8a
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L8a:
            r0.f20633u = r2
            r0.f20636x = r3
            java.lang.Object r9 = r8.e(r9, r0)
            if (r9 != r6) goto L95
        L94:
            return r6
        L95:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.d(java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        if (r12 != r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r11 == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        if (r12 == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        if (r11 == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0069, code lost:
    
        if (r12 == r7) goto L56;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0028. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0123 -> B:12:0x0126). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r11, ve.c r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e(java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public void f(v1.k kVar, boolean z3) {
        v1.z zVar = (v1.z) this.f18941y;
        Object r12 = kVar.f27327a;
        Collection collection = (Collection) r12;
        int size = collection.size();
        for (int i = 0; i < size; i++) {
            if (((t) r12.get(i)).f()) {
                o(kVar);
                return;
            }
        }
        z1.x xVar = (z1.x) this.f18938v;
        if (xVar != null) {
            v1.i(kVar, xVar.W(0L), new k0.w(this, 21, zVar), false);
            if (((v1.x) this.f18939w) == v1.x.f27367v) {
                if (z3) {
                    int size2 = collection.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((t) r12.get(i10)).a();
                    }
                }
                mf mfVar = kVar.f27328b;
                if (mfVar != null) {
                    mfVar.f8336u = !zVar.f27374c;
                    return;
                }
                return;
            }
            return;
        }
        x.o("layoutCoordinates not set");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (r1 == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r1 == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (r1 == r11) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(ve.c r21) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.g(ve.c):java.lang.Object");
    }

    public q h(q qVar, q qVar2) {
        n nVar = this;
        if (((q) nVar.f18941y) == null) {
            nVar.f18941y = qVar.c();
        }
        q qVar3 = (q) nVar.f18941y;
        if (qVar3 != null) {
            int b10 = qVar3.b();
            int i = 0;
            while (true) {
                q qVar4 = (q) nVar.f18941y;
                if (i < b10) {
                    if (qVar4 != null) {
                        k6.i iVar = (k6.i) nVar.f18938v;
                        float a10 = qVar.a(i);
                        float a11 = qVar2.a(i);
                        je.e eVar = (je.e) iVar.f19569v;
                        double b11 = eVar.b(a11);
                        double d2 = t0.f22259a;
                        float f10 = eVar.f19178a * eVar.f19179b;
                        qVar4.e(i, (Math.signum(a11) * ((float) (Math.exp((d2 / (d2 - 1.0d)) * b11) * f10))) + a10);
                        i++;
                        nVar = this;
                        b10 = b10;
                    } else {
                        kotlin.jvm.internal.l.h("targetVector");
                        throw null;
                    }
                } else {
                    if (qVar4 != null) {
                        return qVar4;
                    }
                    kotlin.jvm.internal.l.h("targetVector");
                    throw null;
                }
            }
        } else {
            kotlin.jvm.internal.l.h("targetVector");
            throw null;
        }
    }

    public q i(long j10, q qVar, q qVar2) {
        float f10;
        if (((q) this.f18940x) == null) {
            this.f18940x = qVar.c();
        }
        q qVar3 = (q) this.f18940x;
        if (qVar3 != null) {
            int b10 = qVar3.b();
            int i = 0;
            while (true) {
                q qVar4 = (q) this.f18940x;
                if (i < b10) {
                    if (qVar4 != null) {
                        k6.i iVar = (k6.i) this.f18938v;
                        qVar.getClass();
                        long j11 = j10 / 1000000;
                        s0 a10 = ((je.e) iVar.f19569v).a(qVar2.a(i));
                        long j12 = a10.f22251c;
                        if (j12 > 0) {
                            f10 = ((float) j11) / ((float) j12);
                        } else {
                            f10 = 1.0f;
                        }
                        qVar4.e(i, (((Math.signum(a10.f22249a) * c.a(f10).f22101b) * a10.f22250b) / ((float) j12)) * 1000.0f);
                        i++;
                    } else {
                        kotlin.jvm.internal.l.h("velocityVector");
                        throw null;
                    }
                } else {
                    if (qVar4 != null) {
                        return qVar4;
                    }
                    kotlin.jvm.internal.l.h("velocityVector");
                    throw null;
                }
            }
        } else {
            kotlin.jvm.internal.l.h("velocityVector");
            throw null;
        }
    }

    public u0 j(kotlin.jvm.internal.e eVar, String str) {
        u0 u0Var;
        u0 a10;
        synchronized (((y4.c) this.f18941y)) {
            try {
                y0 y0Var = (y0) this.f18938v;
                y0Var.getClass();
                u0Var = (u0) ((LinkedHashMap) y0Var.f1090a).get(str);
                if (eVar.d(u0Var)) {
                    w0 w0Var = (w0) this.f18939w;
                    if (w0Var instanceof r0) {
                        r0 r0Var = (r0) w0Var;
                        u0Var.getClass();
                        y yVar = r0Var.f1067d;
                        if (yVar != null) {
                            i0.m mVar = r0Var.e;
                            mVar.getClass();
                            o0.a(u0Var, mVar, yVar);
                        }
                    }
                    u0Var.getClass();
                } else {
                    w4.c cVar = new w4.c((w4.b) this.f18940x);
                    cVar.f27707a.put(y0.f1089b, str);
                    w0 w0Var2 = (w0) this.f18939w;
                    try {
                        try {
                            a10 = w0Var2.b(eVar, cVar);
                        } catch (AbstractMethodError unused) {
                            Class cls = eVar.f19779u;
                            cls.getClass();
                            a10 = w0Var2.a(cls);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = eVar.f19779u;
                        cls2.getClass();
                        a10 = w0Var2.c(cls2, cVar);
                    }
                    u0Var = a10;
                    y0 y0Var2 = (y0) this.f18938v;
                    y0Var2.getClass();
                    u0Var.getClass();
                    u0 u0Var2 = (u0) ((LinkedHashMap) y0Var2.f1090a).put(str, u0Var);
                    if (u0Var2 != null) {
                        u0Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[LOOP:0: B:11:0x0059->B:13:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable k(java.lang.String r14, ve.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof m7.g
            if (r0 == 0) goto L13
            r0 = r15
            m7.g r0 = (m7.g) r0
            int r1 = r0.f20648w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20648w = r1
            goto L18
        L13:
            m7.g r0 = new m7.g
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f20646u
            int r1 = r0.f20648w
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            pe.a.e(r15)
            goto L48
        L25:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r14)
            r14 = 0
            return r14
        L2c:
            pe.a.e(r15)
            java.lang.Object r15 = r13.f18940x
            j7.f r15 = (j7.f) r15
            r0.f20648w = r2
            r15.getClass()
            j7.a r1 = new j7.a
            r2 = 0
            r3 = 2
            r1.<init>(r15, r14, r2, r3)
            java.lang.Object r15 = wa.g8.a(r1, r0)
            ue.a r14 = ue.a.f27192u
            if (r15 != r14) goto L48
            return r14
        L48:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = qe.d(r15, r0)
            r14.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        L59:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r15.next()
            k7.c r0 = (k7.c) r0
            o7.a r1 = new o7.a
            java.lang.String r2 = r0.f19594a
            java.lang.String r3 = r0.f19595b
            int r4 = r0.f19596c
            int r5 = r0.f19597d
            java.lang.String r6 = r0.e
            int r7 = r0.f19598f
            float r8 = r0.f19599g
            float r9 = r0.f19600h
            float r10 = r0.i
            float r11 = r0.f19601j
            java.lang.String r12 = r0.f19602k
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.add(r1)
            goto L59
        L84:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.k(java.lang.String, ve.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[LOOP:0: B:11:0x005c->B:13:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable l(int r13, java.lang.String r14, ve.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof m7.h
            if (r0 == 0) goto L13
            r0 = r15
            m7.h r0 = (m7.h) r0
            int r1 = r0.f20651w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20651w = r1
            goto L18
        L13:
            m7.h r0 = new m7.h
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f20649u
            int r1 = r0.f20651w
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            pe.a.e(r15)
            goto L4b
        L25:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r13)
            r13 = 0
            return r13
        L2c:
            pe.a.e(r15)
            java.lang.Object r15 = r12.f18940x
            r4 = r15
            j7.f r4 = (j7.f) r4
            r0.f20651w = r2
            r4.getClass()
            j7.b r3 = new j7.b
            r7 = 0
            r8 = 0
            r6 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r15 = wa.g8.a(r3, r0)
            ue.a r13 = ue.a.f27192u
            if (r15 != r13) goto L4b
            return r13
        L4b:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = qe.d(r15, r14)
            r13.<init>(r14)
            java.util.Iterator r14 = r15.iterator()
        L5c:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L87
            java.lang.Object r15 = r14.next()
            k7.c r15 = (k7.c) r15
            o7.a r0 = new o7.a
            java.lang.String r1 = r15.f19594a
            java.lang.String r2 = r15.f19595b
            int r3 = r15.f19596c
            int r4 = r15.f19597d
            java.lang.String r5 = r15.e
            int r6 = r15.f19598f
            float r7 = r15.f19599g
            float r8 = r15.f19600h
            float r9 = r15.i
            float r10 = r15.f19601j
            java.lang.String r11 = r15.f19602k
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.add(r0)
            goto L5c
        L87:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.l(int, java.lang.String, ve.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0062, code lost:
    
        if (r15 == r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e0 -> B:11:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(int r13, java.lang.String r14, ve.c r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.m(int, java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010e A[Catch: Exception -> 0x0187, TryCatch #0 {Exception -> 0x0187, blocks: (B:12:0x00f9, B:14:0x010e, B:15:0x0111, B:17:0x0118), top: B:11:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0118 A[Catch: Exception -> 0x0187, TRY_LEAVE, TryCatch #0 {Exception -> 0x0187, blocks: (B:12:0x00f9, B:14:0x010e, B:15:0x0111, B:17:0x0118), top: B:11:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.util.List r29, ve.c r30) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.n.n(java.util.List, ve.c):java.lang.Object");
    }

    public void o(v1.k kVar) {
        if (((v1.x) this.f18939w) == v1.x.f27367v) {
            z1.x xVar = (z1.x) this.f18938v;
            if (xVar != null) {
                v1.i(kVar, xVar.W(0L), new v1.y((v1.z) this.f18941y, 1), true);
            } else {
                x.o("layoutCoordinates not set");
                return;
            }
        }
        this.f18939w = v1.x.f27368w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r2 == r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(o7.b r25, ve.c r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.Object r3 = r0.f18939w
            j7.l r3 = (j7.l) r3
            boolean r4 = r2 instanceof m7.n
            if (r4 == 0) goto L1d
            r4 = r2
            m7.n r4 = (m7.n) r4
            int r5 = r4.f20673x
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.f20673x = r5
            goto L22
        L1d:
            m7.n r4 = new m7.n
            r4.<init>(r0, r2)
        L22:
            java.lang.Object r2 = r4.f20671v
            int r5 = r4.f20673x
            r6 = 2
            r7 = 1
            pe.z r8 = pe.z.f22715a
            ue.a r9 = ue.a.f27192u
            if (r5 == 0) goto L43
            if (r5 == r7) goto L3d
            if (r5 != r6) goto L36
            pe.a.e(r2)
            return r8
        L36:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r1)
            r1 = 0
            return r1
        L3d:
            o7.b r1 = r4.f20670u
            pe.a.e(r2)
            goto L53
        L43:
            pe.a.e(r2)
            java.lang.String r2 = r1.f21848a
            r4.f20670u = r1
            r4.f20673x = r7
            java.lang.Object r2 = r3.a(r2, r4)
            if (r2 != r9) goto L53
            goto L8d
        L53:
            r10 = r2
            k7.f r10 = (k7.f) r10
            if (r10 == 0) goto L8e
            java.lang.String r12 = r1.f21849b
            int r13 = r1.f21850c
            float r14 = r1.f21851d
            float r15 = r1.e
            float r1 = r1.f21852f
            long r21 = java.lang.System.currentTimeMillis()
            r23 = 4033(0xfc1, float:5.651E-42)
            r11 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r1
            k7.f r1 = k7.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23)
            r2 = 0
            r4.f20670u = r2
            r4.f20673x = r6
            r3.getClass()
            j7.j r5 = new j7.j
            r6 = 0
            r5.<init>(r3, r1, r2, r6)
            java.lang.Object r1 = wa.g8.a(r5, r4)
            if (r1 != r9) goto L8a
            goto L8b
        L8a:
            r1 = r8
        L8b:
            if (r1 != r9) goto L8e
        L8d:
            return r9
        L8e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.p(o7.b, ve.c):java.lang.Object");
    }

    public Object q(o7.a aVar, ve.i iVar) {
        j7.f fVar = (j7.f) this.f18940x;
        k7.c cVar = new k7.c(aVar.f21839a, aVar.f21840b, aVar.f21841c, aVar.f21842d, aVar.e, aVar.f21843f, aVar.f21844g, aVar.f21845h, aVar.i, aVar.f21846j, aVar.f21847k, System.currentTimeMillis());
        fVar.getClass();
        Object a10 = g8.a(new g5.w(fVar, cVar, null, 2), iVar);
        pe.z zVar = pe.z.f22715a;
        ue.a aVar2 = ue.a.f27192u;
        if (a10 != aVar2) {
            a10 = zVar;
        }
        if (a10 == aVar2) {
            return a10;
        }
        return zVar;
    }

    public com.google.android.gms.internal.measurement.n r(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVar = com.google.android.gms.internal.measurement.n.f13848h;
        Iterator w10 = dVar.w();
        while (w10.hasNext()) {
            nVar = ((e) this.f18939w).k(this, dVar.p(((Integer) w10.next()).intValue()));
            if (nVar instanceof com.google.android.gms.internal.measurement.h) {
                break;
            }
        }
        return nVar;
    }

    public com.google.android.gms.internal.measurement.n s(com.google.android.gms.internal.measurement.n nVar) {
        return ((e) this.f18939w).k(this, nVar);
    }

    public com.google.android.gms.internal.measurement.n t(String str) {
        n nVar = this;
        do {
            HashMap hashMap = (HashMap) nVar.f18940x;
            if (hashMap.containsKey(str)) {
                return (com.google.android.gms.internal.measurement.n) hashMap.get(str);
            }
            nVar = (n) nVar.f18938v;
        } while (nVar != null);
        x.n(a5.a.g(str, " is not defined"));
        return null;
    }

    public n u() {
        return new n(this, (e) this.f18939w);
    }

    public nd.o v() {
        return new nd.o((p0) ((d7) this.f18938v).zzb(), ((com.google.android.gms.internal.consent_sdk.f) this.f18939w).zzb(), (com.google.android.gms.internal.consent_sdk.g) ((d7) this.f18940x).zzb(), (com.google.android.gms.internal.consent_sdk.y) ((d7) this.f18941y).zzb());
    }

    public void w(String str, com.google.android.gms.internal.measurement.n nVar) {
        if (!((HashMap) this.f18941y).containsKey(str)) {
            HashMap hashMap = (HashMap) this.f18940x;
            if (nVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, nVar);
            }
        }
    }

    public boolean x(String str) {
        n nVar = this;
        while (!((HashMap) nVar.f18940x).containsKey(str)) {
            nVar = (n) nVar.f18938v;
            if (nVar == null) {
                return false;
            }
        }
        return true;
    }

    public void y(String str, com.google.android.gms.internal.measurement.n nVar) {
        HashMap hashMap;
        n nVar2 = this;
        while (true) {
            hashMap = (HashMap) nVar2.f18940x;
            n nVar3 = (n) nVar2.f18938v;
            if (hashMap.containsKey(str) || nVar3 == null || !nVar3.x(str)) {
                break;
            } else {
                nVar2 = nVar3;
            }
        }
        if (!((HashMap) nVar2.f18941y).containsKey(str)) {
            if (nVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, nVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f18937u) {
            case 2:
                return v();
            default:
                com.google.android.gms.internal.consent_sdk.g gVar = (com.google.android.gms.internal.consent_sdk.g) ((d7) this.f18938v).zzb();
                lw zzb = ((u) this.f18939w).zzb();
                return new w2(gVar, zzb, (com.google.android.gms.internal.consent_sdk.y) ((d7) this.f18941y).zzb());
        }
    }

    public /* synthetic */ n(d7 d7Var, e7 e7Var, d7 d7Var2, d7 d7Var3, int i) {
        this.f18937u = i;
        this.f18938v = d7Var;
        this.f18939w = e7Var;
        this.f18940x = d7Var2;
        this.f18941y = d7Var3;
    }

    public n(Context context) {
        this.f18937u = 6;
        this.f18940x = new HashMap();
        this.f18941y = new HashMap();
        if (Log.isLoggable("DIRecoDownload", 4)) {
            Log.i("DIRecoDownload", "DigitalInkRecognitionFileDependencyManager()");
        }
        this.f18938v = context;
        this.f18939w = new com.google.mlkit.vision.digitalink.common.downloading.a(context);
    }

    public n(Context context, ScraplyDatabase scraplyDatabase) {
        this.f18937u = 7;
        this.f18938v = context;
        this.f18939w = scraplyDatabase.y();
        this.f18940x = scraplyDatabase.x();
        this.f18941y = scraplyDatabase.z();
    }

    public n(n nVar, e eVar) {
        this.f18937u = 4;
        this.f18940x = new HashMap();
        this.f18941y = new HashMap();
        this.f18938v = nVar;
        this.f18939w = eVar;
    }

    public n(WorkDatabase_Impl workDatabase_Impl) {
        this.f18937u = 0;
        this.f18938v = workDatabase_Impl;
        this.f18939w = new b(workDatabase_Impl, 4);
        this.f18940x = new h(workDatabase_Impl, 2);
        this.f18941y = new h(workDatabase_Impl, 3);
    }

    public n(y0 y0Var, w0 w0Var, w4.b bVar) {
        this.f18937u = 11;
        y0Var.getClass();
        bVar.getClass();
        this.f18938v = y0Var;
        this.f18939w = w0Var;
        this.f18940x = bVar;
        this.f18941y = new Object();
    }

    public n(v1.z zVar) {
        this.f18937u = 10;
        this.f18941y = zVar;
        this.f18939w = v1.x.f27366u;
    }

    public /* synthetic */ n(int i) {
        this.f18937u = i;
    }

    public n(k6.i iVar) {
        this.f18937u = 8;
        this.f18938v = iVar;
    }
}