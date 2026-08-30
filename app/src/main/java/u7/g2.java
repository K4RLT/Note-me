package u7;
import u7.g2;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g2 extends ve.i implements df.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ List C;
    public final /* synthetic */ y0 D;
    public final /* synthetic */ m3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ df.p I;

    /* renamed from: u, reason: collision with root package name */
    public File f26216u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f26217v;

    /* renamed from: w, reason: collision with root package name */
    public Iterator f26218w;

    /* renamed from: x, reason: collision with root package name */
    public int f26219x;

    /* renamed from: y, reason: collision with root package name */
    public int f26220y;

    /* renamed from: z, reason: collision with root package name */
    public int f26221z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context, List list, y0 y0Var, m3 m3Var, int i, int i10, int i11, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.B = context;
        this.C = list;
        this.D = y0Var;
        this.E = m3Var;
        this.F = i;
        this.G = i10;
        this.H = i11;
        this.I = pVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        g2 g2Var = new g2(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, cVar);
        g2Var.A = obj;
        return g2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bf -> B:11:0x00c0). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.g2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
