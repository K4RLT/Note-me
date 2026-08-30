package u7;
import b1.y;
import q.d;
import u7.x5;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x5 extends ve.i implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ m3 C;
    public final /* synthetic */ Context D;
    public final /* synthetic */ y E;
    public final /* synthetic */ y F;

    /* renamed from: u, reason: collision with root package name */
    public d f27032u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f27033v;

    /* renamed from: w, reason: collision with root package name */
    public int f27034w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f27035x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f27036y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f27037z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(y yVar, String str, int i, List list, m3 m3Var, Context context, y yVar2, y yVar3, te.c cVar) {
        super(2, cVar);
        this.f27036y = yVar;
        this.f27037z = str;
        this.A = i;
        this.B = list;
        this.C = m3Var;
        this.D = context;
        this.E = yVar2;
        this.F = yVar3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        x5 x5Var = new x5(this.f27036y, this.f27037z, this.A, this.B, this.C, this.D, this.E, this.F, cVar);
        x5Var.f27035x = obj;
        return x5Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x5) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (d.c(r2, r11, r12, r17) == r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (d.c(r2, r11, r12, r17) == r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cb A[LOOP:0: B:8:0x00c9->B:9:0x00cb, LOOP_END] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.x5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
