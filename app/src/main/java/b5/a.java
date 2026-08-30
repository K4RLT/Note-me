package b5;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import b8.ca;
import b8.d1;
import b8.k0;
import b8.l2;
import c0.d;
import c0.h;
import c2.b2;
import c2.e2;
import c2.k1;
import c2.u0;
import c3.x;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.gx0;
import df.p;
import g5.o0;
import i0.m;
import i0.n;
import i5.c0;
import i5.q;
import j7.f;
import j7.l;
import k0.j1;
import kotlin.jvm.internal.y;
import m2.g;
import pf.z;
import r0.u1;
import rf.t;
import sf.l0;
import te.c;
import v1.w;
import ve.i;

/* loaded from: classes.dex */
public final class a extends i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1709u;

    /* renamed from: v, reason: collision with root package name */
    public int f1710v;

    /* renamed from: w, reason: collision with root package name */
    public Object f1711w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1712x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(p pVar, q qVar, c cVar) {
        super(2, cVar);
        this.f1709u = 28;
        this.f1711w = (i) pVar;
        this.f1712x = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [df.p, ve.i] */
    @Override // ve.a
    public final c create(Object obj, c cVar) {
        switch (this.f1709u) {
            case 0:
                return new a((b) this.f1711w, (Uri) this.f1712x, cVar, 0);
            case 1:
                return new a((Context) this.f1711w, (k0) this.f1712x, cVar, 1);
            case 2:
                a aVar = new a((d1) this.f1712x, cVar, 2);
                aVar.f1711w = obj;
                return aVar;
            case 3:
                return new a((String) this.f1711w, (d1) this.f1712x, cVar, 3);
            case 4:
                return new a((f) this.f1711w, (String) this.f1712x, cVar, 4);
            case 5:
                return new a((l) this.f1711w, (String) this.f1712x, cVar, 5);
            case 6:
                return new a((l) this.f1711w, (ca) this.f1712x, cVar, 6);
            case 7:
                a aVar2 = new a(2, cVar);
                aVar2.f1712x = obj;
                return aVar2;
            case 8:
                return new a((Context) this.f1711w, (ca) this.f1712x, cVar, 8);
            case 9:
                a aVar3 = new a(this.f1710v, (String) this.f1712x, cVar);
                aVar3.f1711w = obj;
                return aVar3;
            case 10:
                return new a((w) this.f1711w, (d) this.f1712x, cVar, 10);
            case 11:
                a aVar4 = new a((u0) this.f1712x, cVar, 11);
                aVar4.f1711w = obj;
                return aVar4;
            case 12:
                return new a((u1) this.f1711w, (View) this.f1712x, cVar, 12);
            case 13:
                return new a((l0) this.f1711w, (e2) this.f1712x, cVar, 13);
            case 14:
                a aVar5 = new a((x) this.f1712x, cVar, 14);
                aVar5.f1711w = obj;
                return aVar5;
            case 15:
                return new a((c5.a) this.f1711w, (e5.a) this.f1712x, cVar, 15);
            case 16:
                return new a((gx0) this.f1711w, (String) this.f1712x, cVar, 16);
            case 17:
                return new a((d0.f) this.f1711w, (h) this.f1712x, cVar, 17);
            case 18:
                return new a((w) this.f1711w, (j1) this.f1712x, cVar, 18);
            case 19:
                a aVar6 = new a((df.l) this.f1712x, cVar, 19);
                aVar6.f1711w = obj;
                return aVar6;
            case 20:
                return new a((o0) this.f1711w, (df.a) this.f1712x, cVar, 20);
            case gl.zzm /* 21 */:
                a aVar7 = new a((g6.c) this.f1712x, cVar, 21);
                aVar7.f1711w = obj;
                return aVar7;
            case 22:
                return new a((i0.c) this.f1711w, (m) this.f1712x, cVar, 22);
            case 23:
                return new a((pf.d1) this.f1711w, (i0.h) this.f1712x, cVar, 23);
            case 24:
                return new a((n) this.f1711w, (l2) this.f1712x, cVar, 24);
            case 25:
                return new a((i2.c) this.f1711w, (Runnable) this.f1712x, cVar, 25);
            case 26:
                return new a((p) this.f1711w, (c0) this.f1712x, cVar, 26);
            case 27:
                return new a((p) this.f1711w, (y) this.f1712x, cVar, 27);
            case 28:
                return new a((p) this.f1711w, (q) this.f1712x, cVar);
            default:
                return new a((k1) this.f1711w, (g) this.f1712x, cVar, 29);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1709u) {
            case 0:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 7:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 8:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 9:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 10:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 11:
                ((a) create((b2) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 12:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 13:
                ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 14:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 15:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 16:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 17:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 18:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 19:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 20:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case gl.zzm /* 21 */:
                return ((a) create((t) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 22:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 23:
                ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 24:
                ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            case 25:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 26:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 27:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            case 28:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((a) create((z) obj, (c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x016e, code lost:
    
        if (r15 == r0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d8, code lost:
    
        if (r0.y.u(getContext()).R(new r0.x0(r15), r14) == r0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0814, code lost:
    
        if (r0 == null) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        if (pf.b0.j(500, r14) == r0) goto L93;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0189  */
    /* JADX WARN: Type inference failed for: r15v211, types: [df.p, ve.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x03fe -> B:208:0x0402). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0195 -> B:68:0x0199). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 2356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, c cVar) {
        super(i, cVar);
        this.f1709u = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, String str, c cVar) {
        super(2, cVar);
        this.f1709u = 9;
        this.f1712x = str;
        this.f1710v = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, c cVar, int i) {
        super(2, cVar);
        this.f1709u = i;
        this.f1711w = obj;
        this.f1712x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, c cVar, int i) {
        super(2, cVar);
        this.f1709u = i;
        this.f1712x = obj;
    }
}
