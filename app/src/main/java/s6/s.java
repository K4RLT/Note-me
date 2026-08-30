package s6;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import pf.z;
import r0.a1;
import u7.m3;

/* loaded from: classes.dex */
public final class s extends ve.i implements df.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24984u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f24985v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f24986w;

    /* renamed from: x, reason: collision with root package name */
    public int f24987x;

    /* renamed from: y, reason: collision with root package name */
    public Serializable f24988y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f24989z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ArrayList arrayList, Context context, m3 m3Var, int i, o7.b bVar, Uri uri, te.c cVar) {
        super(2, cVar);
        this.f24988y = arrayList;
        this.f24986w = context;
        this.f24989z = m3Var;
        this.f24987x = i;
        this.A = bVar;
        this.B = uri;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f24984u) {
            case 0:
                return new s((r) this.f24989z, this.f24986w, (o) this.A, (a1) this.B, cVar);
            default:
                return new s((ArrayList) this.f24988y, this.f24986w, (m3) this.f24989z, this.f24987x, (o7.b) this.A, (Uri) this.B, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f24984u) {
            case 0:
                return ((s) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((s) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:90)|96|97|98|(3:104|(1:107)|106)(1:100)|101|(3:103|80|1e5)|94|95) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (pf.b0.J(r0, r2, r14) != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0126, code lost:
    
        if (pf.b0.J(r0, r2, r14) != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0192, code lost:
    
        if (r2 == r10) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019b, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: all -> 0x002b, TryCatch #6 {all -> 0x002b, blocks: (B:16:0x0026, B:17:0x002e, B:18:0x0064, B:19:0x0078, B:21:0x007e, B:23:0x0094, B:30:0x00a9, B:50:0x00be, B:51:0x00d2, B:47:0x00ba, B:48:0x00bd, B:53:0x00d3, B:54:0x00e7, B:56:0x00e8, B:60:0x0033, B:61:0x0048, B:65:0x003a, B:44:0x00b8, B:26:0x009e, B:29:0x00a6, B:38:0x00b4, B:39:0x00b7), top: B:4:0x0010, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x020e -> B:82:0x0161). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01d8 -> B:75:0x01d9). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, Context context, o oVar, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f24989z = rVar;
        this.f24986w = context;
        this.A = oVar;
        this.B = a1Var;
    }
}
