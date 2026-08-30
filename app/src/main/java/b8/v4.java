package b8;
import b8.v4;
import u7.m3;

import android.content.Context;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class v4 extends ve.i implements df.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2872u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f2873v;

    /* renamed from: w, reason: collision with root package name */
    public int f2874w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m3 f2875x;

    /* renamed from: y, reason: collision with root package name */
    public int f2876y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2877z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(List list, Context context, df.p pVar, int i, m3 m3Var, int i10, int i11, te.c cVar) {
        super(2, cVar);
        this.A = list;
        this.f2873v = context;
        this.B = pVar;
        this.f2874w = i;
        this.f2875x = m3Var;
        this.f2876y = i10;
        this.f2877z = i11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2872u) {
            case 0:
                String str = (String) this.A;
                return new v4(this.f2877z, this.f2873v, (File) this.B, str, cVar, this.f2875x);
            case 1:
                return new v4((List) this.A, this.f2873v, (df.p) this.B, this.f2874w, this.f2875x, this.f2876y, this.f2877z, cVar);
            default:
                return new v4((w7.u4) this.A, this.f2873v, this.f2875x, this.f2876y, this.f2877z, (w7.k0) this.B, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2872u) {
            case 0:
                return ((v4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                v4 v4Var = (v4) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                v4Var.invokeSuspend(zVar2);
                return zVar2;
            default:
                return ((v4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c0  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.v4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(int i, Context context, File file, String str, te.c cVar, m3 m3Var) {
        super(2, cVar);
        this.f2875x = m3Var;
        this.A = str;
        this.B = file;
        this.f2877z = i;
        this.f2873v = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(w7.u4 u4Var, Context context, m3 m3Var, int i, int i10, w7.k0 k0Var, te.c cVar) {
        super(2, cVar);
        this.A = u4Var;
        this.f2873v = context;
        this.f2875x = m3Var;
        this.f2876y = i;
        this.f2877z = i10;
        this.B = k0Var;
    }
}
