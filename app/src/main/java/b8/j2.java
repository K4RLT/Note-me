package b8;
import b8.j2;
import j7.l;
import r2.b;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class j2 extends ve.i implements df.p {
    public float A;
    public int B;
    public final /* synthetic */ l C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ int F;
    public final /* synthetic */ m1 G;
    public final /* synthetic */ List H;
    public final /* synthetic */ Context I;

    /* renamed from: u, reason: collision with root package name */
    public l f2239u;

    /* renamed from: v, reason: collision with root package name */
    public String f2240v;

    /* renamed from: w, reason: collision with root package name */
    public String f2241w;

    /* renamed from: x, reason: collision with root package name */
    public int f2242x;

    /* renamed from: y, reason: collision with root package name */
    public float f2243y;

    /* renamed from: z, reason: collision with root package name */
    public float f2244z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l lVar, String str, String str2, int i, m1 m1Var, List list, Context context, te.c cVar) {
        super(2, cVar);
        this.C = lVar;
        this.D = str;
        this.E = str2;
        this.F = i;
        this.G = m1Var;
        this.H = list;
        this.I = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new j2(this.C, this.D, this.E, this.F, this.G, this.H, this.I, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (b(r9, r22) == r8) goto L21;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.j2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
