package t;
import b1.y;
import b2.f1;
import c.f;
import f0.d;
import j.i0;
import q.d;
import r0.a1;
import r0.o1;
import t.m1;
import v1.t;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import u7.m3;

/* loaded from: classes.dex */
public final class m1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25468u;

    /* renamed from: v, reason: collision with root package name */
    public int f25469v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25470w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f25471x;

    /* renamed from: y, reason: collision with root package name */
    public Object f25472y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(kotlin.jvm.internal.y yVar, m3 m3Var, int i, Context context, te.c cVar) {
        super(2, cVar);
        this.f25468u = 9;
        this.f25470w = yVar;
        this.f25472y = m3Var;
        this.f25469v = i;
        this.f25471x = context;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [df.q, ve.i] */
    /* JADX WARN: Type inference failed for: r1v7, types: [df.p, ve.i] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25468u) {
            case 0:
                m1 m1Var = new m1((l0) this.f25472y, (z1) this.f25471x, cVar, 0);
                m1Var.f25470w = obj;
                return m1Var;
            case 1:
                m1 m1Var2 = new m1((z1) this.f25471x, (df.p) this.f25472y, cVar);
                m1Var2.f25470w = obj;
                return m1Var2;
            case 2:
                return new m1((df.q) this.f25470w, (c1) this.f25472y, (t) this.f25471x, cVar);
            case 3:
                m1 m1Var3 = new m1((pf.d1) this.f25472y, (df.p) this.f25471x, cVar);
                m1Var3.f25470w = obj;
                return m1Var3;
            case 4:
                m1 m1Var4 = new m1((sf.h) this.f25472y, (tf.e) this.f25471x, cVar, 4);
                m1Var4.f25470w = obj;
                return m1Var4;
            case 5:
                m1 m1Var5 = new m1((sf.k) this.f25472y, (sf.h) this.f25471x, cVar, 5);
                m1Var5.f25470w = obj;
                return m1Var5;
            case 6:
                return new m1((y) this.f25470w, (Uri) this.f25472y, (Context) this.f25471x, cVar, 6);
            case 7:
                m1 m1Var6 = new m1((u7.a1) this.f25471x, cVar, 7);
                m1Var6.f25470w = obj;
                return m1Var6;
            case 8:
                return new m1((ArrayList) this.f25470w, (Context) this.f25472y, (o7.b) this.f25471x, cVar, 8);
            case 9:
                return new m1((kotlin.jvm.internal.y) this.f25470w, (m3) this.f25472y, this.f25469v, (Context) this.f25471x, cVar);
            case 10:
                return new m1((m3) this.f25470w, (String) this.f25472y, (String) this.f25471x, cVar, 10);
            case 11:
                return new m1((f1) this.f25470w, (String) this.f25472y, (Context) this.f25471x, cVar, 11);
            case 12:
                return new m1((nd.o) this.f25470w, (pe.o) this.f25472y, (Context) this.f25471x, cVar, 12);
            case 13:
                return new m1((i0) this.f25470w, (pe.o) this.f25472y, (Context) this.f25471x, cVar, 13);
            case 14:
                return new m1((vd.l) this.f25470w, (te.g) this.f25472y, (vd.l0) this.f25471x, cVar, 14);
            case 15:
                return new m1((kotlin.jvm.internal.v) this.f25470w, (d) this.f25472y, (a1) this.f25471x, cVar, 15);
            default:
                m1 m1Var7 = new m1((v7.d) this.f25471x, cVar, 16);
                m1Var7.f25470w = obj;
                return m1Var7;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25468u) {
            case 0:
                return ((m1) create((x1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((m1) create((f1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 7:
                return ((m1) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 8:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 9:
                m1 m1Var = (m1) create((pf.z) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                m1Var.invokeSuspend(zVar);
                return zVar;
            case 10:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 11:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 12:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 13:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 14:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 15:
                return ((m1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((m1) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:146|(1:147)|(1:(1:(1:(3:152|153|154)(2:155|156))(4:157|158|153|154))(1:160))(3:175|176|(2:178|179))|161|162|163|164|165|(2:167|168)|158|153|154) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03d6, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03d8, code lost:
    
        r0.printStackTrace();
        f7.f("scrap", r0.getClass().getSimpleName());
        x7.d();
        r0 = pf.l0.f22767a;
        r0 = uf.n.f27235a;
        r4 = new b8.y6(9, r2, r13 == true ? 1 : 0);
        r29.f25469v = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03fa, code lost:
    
        if (pf.b0.J(r0, r4, r29) == r9) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Type inference failed for: r0v13, types: [df.q, ve.i] */
    /* JADX WARN: Type inference failed for: r12v4, types: [df.p, ve.i] */
    /* JADX WARN: Type inference failed for: r3v41, types: [j6.i, java.lang.Object] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, te.c cVar, int i) {
        super(2, cVar);
        this.f25468u = i;
        this.f25470w = obj;
        this.f25472y = obj2;
        this.f25471x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Object obj, Object obj2, te.c cVar, int i) {
        super(2, cVar);
        this.f25468u = i;
        this.f25472y = obj;
        this.f25471x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f25468u = i;
        this.f25471x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(df.q qVar, c1 c1Var, t tVar, te.c cVar) {
        super(2, cVar);
        this.f25468u = 2;
        this.f25470w = (ve.i) qVar;
        this.f25472y = c1Var;
        this.f25471x = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(pf.d1 d1Var, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.f25468u = 3;
        this.f25472y = d1Var;
        this.f25471x = (ve.i) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(z1 z1Var, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.f25468u = 1;
        this.f25471x = z1Var;
        this.f25472y = pVar;
    }
}
